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

import javax.annotation.Nonnull;
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.commons.annotation.PresentForCodeCoverage;

import oasis.names.specification.ubl.schema.xsd.applicationresponse_21.ApplicationResponseType;
import oasis.names.specification.ubl.schema.xsd.creditnote_21.CreditNoteType;
import oasis.names.specification.ubl.schema.xsd.debitnote_21.DebitNoteType;
import oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType;
import sunat.names.specification.ubl.peru.schema.xsd.summarydocuments_1.SummaryDocumentsType;
import sunat.names.specification.ubl.peru.schema.xsd.voideddocuments_1.VoidedDocumentsType;

/**
 * Read all UBLPE document types.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public final class UBL21PEReader
{
  @PresentForCodeCoverage
  private static final UBL21PEReader s_aInstance = new UBL21PEReader();

  private UBL21PEReader()
  {}

  /**
   * Create a reader builder for ApplicationResponseType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static UBL21PEReaderBuilder<ApplicationResponseType> applicationResponse ()
  {
    return UBL21PEReaderBuilder.create (ApplicationResponseType.class);
  }

  /**
   * Create a reader builder for CreditNoteType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static UBL21PEReaderBuilder<CreditNoteType> creditNote ()
  {
    return UBL21PEReaderBuilder.create (CreditNoteType.class);
  }

  /**
   * Create a reader builder for DebitNoteType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static UBL21PEReaderBuilder<DebitNoteType> debitNote ()
  {
    return UBL21PEReaderBuilder.create (DebitNoteType.class);
  }

  /**
   * Create a reader builder for InvoiceType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static UBL21PEReaderBuilder<InvoiceType> invoice ()
  {
    return UBL21PEReaderBuilder.create (InvoiceType.class);
  }

  /**
   * Create a reader builder for SummaryDocumentsType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static UBL21PEReaderBuilder<SummaryDocumentsType> summaryDocuments ()
  {
    return UBL21PEReaderBuilder.create (SummaryDocumentsType.class);
  }

  /**
   * Create a reader builder for VoidedDocumentsType.
   *
   * @return The builder and never <code>null</code>
   */
  @Nonnull
  public static UBL21PEReaderBuilder<VoidedDocumentsType> voidedDocuments ()
  {
    return UBL21PEReaderBuilder.create (VoidedDocumentsType.class);
  }
}
