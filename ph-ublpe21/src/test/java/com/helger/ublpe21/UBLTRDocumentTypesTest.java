/**
 * Copyright (C) 2014-2018 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.ublpe21;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Test class for class {@link UBL21PEDocumentTypes}.
 *
 * @author Philip Helger
 */
public final class UBLTRDocumentTypesTest
{
  @Test
  public void testGetAllNamespaces ()
  {
    for (final String sNamespace : UBL21PEDocumentTypes.getAllLocalNames ())
    {
      assertNotNull (UBL21PEDocumentTypes.getDocumentTypeOfLocalName (sNamespace));
      assertNotNull (UBL21PEDocumentTypes.getImplementationClassOfLocalName (sNamespace));
      assertNotNull (UBL21PEDocumentTypes.getSchemaOfLocalName (sNamespace));
    }
    assertNull (UBL21PEDocumentTypes.getDocumentTypeOfLocalName ("any"));
    assertNull (UBL21PEDocumentTypes.getImplementationClassOfLocalName ("any"));
    assertNull (UBL21PEDocumentTypes.getSchemaOfLocalName ("any"));
    assertNull (UBL21PEDocumentTypes.getDocumentTypeOfLocalName (null));
    assertNull (UBL21PEDocumentTypes.getImplementationClassOfLocalName (null));
    assertNull (UBL21PEDocumentTypes.getSchemaOfLocalName (null));
  }

  @Test
  public void testGetSchemaOfImplementationClass ()
  {
    assertNull (UBL21PEDocumentTypes.getDocumentTypeOfImplementationClass (null));
    assertNull (UBL21PEDocumentTypes.getSchemaOfImplementationClass (null));
    assertNull (UBL21PEDocumentTypes.getSchemaOfImplementationClass (String.class));
    for (final EUBL21PEDocumentType eDocType : EUBL21PEDocumentType.values ())
    {
      assertSame (eDocType,
                  UBL21PEDocumentTypes.getDocumentTypeOfImplementationClass (eDocType.getImplementationClass ()));
      assertSame (eDocType.getSchema (),
                  UBL21PEDocumentTypes.getSchemaOfImplementationClass (eDocType.getImplementationClass ()));
      assertNotNull (eDocType.getValidator (null));
    }
  }
}
