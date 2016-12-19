package com.helger.ubl21.supplementary.tools;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Nonnull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.collection.ext.CommonsArrayList;
import com.helger.commons.collection.ext.CommonsHashMap;
import com.helger.commons.collection.ext.ICommonsList;
import com.helger.commons.collection.ext.ICommonsMap;
import com.helger.commons.collection.impl.NonBlockingStack;
import com.helger.commons.string.StringHelper;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.TaxSchemeType;
import oasis.names.specification.ubl.schema.xsd.order_21.OrderType;

public class MainFindOccurrances
{
  private static boolean _isSystemClass (final Class <?> aMemberClass)
  {
    final Package aPackage = aMemberClass.getPackage ();
    if (aPackage == null)
      return true;
    final String sPackageName = aPackage.getName ();
    return sPackageName.startsWith ("java.");
  }

  // Cache for all fields of a class (incl. all fields of all super-classes)
  private static ICommonsMap <Class <?>, ICommonsList <Field>> s_aAllFields = new CommonsHashMap<> ();

  /**
   * Get all fields of the specified class and all super classes.
   *
   * @param aClass
   *        Base class
   * @param aList
   *        List to be filled
   */
  private static void _getAllFields (@Nonnull final Class <?> aClass, @Nonnull final ICommonsList <Field> aList)
  {
    aList.addAll (aClass.getDeclaredFields ());

    final Class <?> aSuperClass = aClass.getSuperclass ();
    if (aSuperClass != null && !_isSystemClass (aSuperClass))
      _getAllFields (aSuperClass, aList);
  }

  /**
   * Get all fields of the specified class and all its super classes. This
   * method uses a cache to avoid retrieving the data over and over again.
   *
   * @param aClass
   *        The class to get all fields from
   * @return Never <code>null</code> but maybe empty.
   */
  @Nonnull
  private static ICommonsList <Field> getAllFields (@Nonnull final Class <?> aClass)
  {
    ICommonsList <Field> ret = s_aAllFields.get (aClass);
    if (ret == null)
    {
      ret = new CommonsArrayList<> ();
      _getAllFields (aClass, ret);
      s_aAllFields.put (aClass, ret);
    }
    return ret;
  }

  /**
   * Create an XML name from the passed field. It uses the {@link XmlElement},
   * {@link XmlAttribute} and {@link XmlValue} annotations to differentiate.
   *
   * @param aField
   *        Source field
   * @return Never <code>null</code>.
   */
  @Nonnull
  public static String _getXMLName (final Field aField)
  {
    final XmlElement aElement = aField.getAnnotation (XmlElement.class);
    if (aElement != null)
      return "/" + aElement.name ();
    final XmlAttribute aAttr = aField.getAnnotation (XmlAttribute.class);
    if (aAttr != null)
      return "/@" + aAttr.name ();
    if (aField.getAnnotation (XmlValue.class) != null)
      return "/value()";
    throw new IllegalStateException ("Field is neither XML element nor attribute nor value: " + aField);
  }

  private static final class PerClassData
  {
    private static final class MemberData
    {
      private final Class <?> m_aClass;
      private final String m_sXMLName;

      public MemberData (@Nonnull final Field aField, @Nonnull final Class <?> aClass)
      {
        m_aClass = aClass;
        m_sXMLName = _getXMLName (aField);
      }
    }

    ICommonsList <Field> m_aMatches = new CommonsArrayList<> ();
    ICommonsList <MemberData> m_aMembers = new CommonsArrayList<> ();
  }

  private static ICommonsMap <Class <?>, PerClassData> s_aClassCache = new CommonsHashMap<> ();

  private static final class StackElement
  {
    final Class <?> m_aClass;
    final String m_sXMLName;

    public StackElement (@Nonnull final Class <?> aClass, @Nonnull final String sXMLName)
    {
      m_aClass = aClass;
      m_sXMLName = ValueEnforcer.notEmpty (sXMLName, "XMLName");
    }
  }

  private static void _findAll (final Class <?> aStartClass,
                                final Class <?> aFindClass,
                                @Nonnull @Nonempty final String sXMLName,
                                @Nonnull final NonBlockingStack <StackElement> aStack)
  {
    aStack.push (new StackElement (aStartClass, sXMLName));

    PerClassData aPerClassData = s_aClassCache.get (aStartClass);
    if (aPerClassData == null)
    {
      aPerClassData = new PerClassData ();
      // Already put in map to avoid endless recursion if a type contains itself
      s_aClassCache.put (aStartClass, aPerClassData);

      for (final Field aField : getAllFields (aStartClass))
      {
        Class <?> aMemberClass = aField.getType ();
        if (List.class.isAssignableFrom (aMemberClass))
        {
          final Type aGenericFieldType = aField.getGenericType ();
          aMemberClass = (Class <?>) ((ParameterizedType) aGenericFieldType).getActualTypeArguments ()[0];
        }

        if (false)
          System.out.println ("  " + aField.getName () + " - " + aMemberClass.getName ());

        // Matching class?
        if (aMemberClass.equals (aFindClass))
          aPerClassData.m_aMatches.add (aField);

        // Recurse down
        if (!_isSystemClass (aMemberClass))
          aPerClassData.m_aMembers.add (new PerClassData.MemberData (aField, aMemberClass));
      }
    }

    for (final PerClassData.MemberData aMemberData : aPerClassData.m_aMembers)
      if (aStack.containsNone (x -> x.m_aClass.equals (aMemberData.m_aClass)))
        _findAll (aMemberData.m_aClass, aFindClass, aMemberData.m_sXMLName, aStack);

    if (aPerClassData.m_aMatches.isNotEmpty ())
    {
      final String sPrefix = StringHelper.getImplodedMapped (aStack, x -> x.m_sXMLName);
      for (final Field aField : aPerClassData.m_aMatches)
        System.out.println (sPrefix + _getXMLName (aField));
    }

    aStack.pop ();
  }

  public static void findAll (final Class <?> aStartClass, final Class <?> aFindClass)
  {
    final NonBlockingStack <StackElement> aStack = new NonBlockingStack<> ();
    _findAll (aStartClass, aFindClass, StringHelper.trimEnd (aStartClass.getSimpleName (), "Type"), aStack);
  }

  public static void main (final String [] args)
  {
    findAll (OrderType.class, TaxSchemeType.class);
  }
}