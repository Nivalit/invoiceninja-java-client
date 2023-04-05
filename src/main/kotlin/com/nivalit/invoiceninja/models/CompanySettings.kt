/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.nivalit.invoiceninja.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param timezoneId The timezone id
 * @param dateFormatId The date format id
 * @param militaryTime Toggles 12/24 hour time
 * @param languageId The language id
 * @param showCurrencyCode Toggles whether the currency symbol or code is shown
 * @param currencyId The default currency id
 * @param paymentTerms -1 sets no payment term, 0 sets payment due immediately, positive integers indicates payment terms in days
 * @param companyGatewayIds A commad separate list of available gateways
 * @param customValue1 A Custom Label
 * @param customValue2 A Custom Label
 * @param customValue3 A Custom Label
 * @param customValue4 A Custom Label
 * @param defaultTaskRate The default task rate
 * @param sendReminders Toggles whether reminders are sent
 * @param enableClientPortalTasks Show/hide the tasks panel in the client portal
 * @param emailStyle options include plain,light,dark,custom
 * @param replyToEmail The reply to email address
 * @param bccEmail A comma separate list of BCC emails
 * @param pdfEmailAttachment Toggles whether to attach PDF as attachment
 * @param ublEmailAttachment Toggles whether to attach UBL as attachment
 * @param emailStyleCustom The custom template
 * @param counterNumberApplied enum when the invoice number counter is set, ie when_saved, when_sent, when_paid
 * @param quoteNumberApplied enum when the quote number counter is set, ie when_saved, when_sent
 * @param customMessageDashboard A custom message which is displayed on the dashboard
 * @param customMessageUnpaidInvoice A custom message which is displayed in the client portal when a client is viewing a unpaid invoice.
 * @param customMessagePaidInvoice A custom message which is displayed in the client portal when a client is viewing a paid invoice.
 * @param customMessageUnapprovedQuote A custom message which is displayed in the client portal when a client is viewing a unapproved quote.
 * @param lockInvoices Toggles whether invoices are locked once sent and cannot be modified further
 * @param autoArchiveInvoice Toggles whether a invoice is archived immediately following payment
 * @param autoArchiveQuote Toggles whether a quote is archived after being converted to a invoice
 * @param autoConvertQuote Toggles whether a quote is converted to a invoice when approved
 * @param inclusiveTaxes Boolean flag determining whether inclusive or exclusive taxes are used
 * @param translations JSON payload of customized translations
 * @param taskNumberPattern Allows customisation of the task number pattern
 * @param taskNumberCounter The incrementing counter for tasks
 * @param reminderSendTime Time from UTC +0 when the email will be sent to the client
 * @param expenseNumberPattern Allows customisation of the expense number pattern
 * @param expenseNumberCounter The incrementing counter for expenses
 * @param vendorNumberPattern Allows customisation of the vendor number pattern
 * @param vendorNumberCounter The incrementing counter for vendors
 * @param ticketNumberPattern Allows customisation of the ticket number pattern
 * @param ticketNumberCounter The incrementing counter for tickets
 * @param paymentNumberPattern Allows customisation of the payment number pattern
 * @param paymentNumberCounter The incrementing counter for payments
 * @param invoiceNumberPattern Allows customisation of the invoice number pattern
 * @param invoiceNumberCounter The incrementing counter for invoices
 * @param quoteNumberPattern Allows customisation of the quote number pattern
 * @param quoteNumberCounter The incrementing counter for quotes
 * @param clientNumberPattern Allows customisation of the client number pattern
 * @param clientNumberCounter The incrementing counter for clients
 * @param creditNumberPattern Allows customisation of the credit number pattern
 * @param creditNumberCounter The incrementing counter for credits
 * @param recurringInvoiceNumberPrefix This string is prepended to the recurring invoice number
 * @param resetCounterFrequencyId CONSTANT which is used to apply the frequency which the counters are reset
 * @param resetCounterDate The explicit date which is used to reset counters
 * @param counterPadding Pads the counter with leading zeros
 * @param sharedInvoiceQuoteCounter Flags whether to share the counter for invoices and quotes
 * @param updateProducts Determines if client fields are updated from third party APIs
 * @param convertProducts 
 * @param fillProducts Automatically fill products based on product_key
 * @param invoiceTerms The default invoice terms
 * @param quoteTerms The default quote terms
 * @param invoiceTaxes Taxes can be applied to the invoice
 * @param invoiceDesignId The default design id (invoice, quote etc)
 * @param quoteDesignId The default design id (invoice, quote etc)
 * @param invoiceFooter The default invoice footer
 * @param invoiceLabels JSON string of invoice labels
 * @param taxRate1 The tax rate (float)
 * @param taxName1 The tax name
 * @param taxRate2 The tax rate (float)
 * @param taxName2 The tax name
 * @param taxRate3 The tax rate (float)
 * @param taxName3 The tax name
 * @param paymentTypeId The default payment type id
 * @param customFields JSON string of custom fields
 * @param emailFooter The default email footer
 * @param emailSendingMethod The email driver to use to send email, options include default, gmail
 * @param gmailSendingUserId The hashed_id of the user account to send email from
 * @param emailSubjectInvoice 
 * @param emailSubjectQuote 
 * @param emailSubjectPayment 
 * @param emailTemplateInvoice The full template for invoice emails
 * @param emailTemplateQuote The full template for quote emails
 * @param emailTemplatePayment The full template for payment emails
 * @param emailSubjectReminder1 Email subject for Reminder
 * @param emailSubjectReminder2 Email subject for Reminder
 * @param emailSubjectReminder3 Email subject for Reminder
 * @param emailSubjectReminderEndless Email subject for endless reminders
 * @param emailTemplateReminder1 The full template for Reminder 1
 * @param emailTemplateReminder2 The full template for Reminder 2
 * @param emailTemplateReminder3 The full template for Reminder 3
 * @param emailTemplateReminderEndless The full template for enless reminders
 * @param enablePortalPassword Toggles whether a password is required to log into the client portal
 * @param showAcceptInvoiceTerms Toggles whether the terms dialogue is shown to the client
 * @param showAcceptQuoteTerms Toggles whether the terms dialogue is shown to the client
 * @param requireInvoiceSignature Toggles whether a invoice signature is required
 * @param requireQuoteSignature Toggles whether a quote signature is required
 * @param name The company name
 * @param companyLogo The company logo file
 * @param website The company website URL
 * @param address1 The company address line 1
 * @param address2 The company address line 2
 * @param city The company city
 * @param state The company state
 * @param postalCode The company zip/postal code
 * @param phone The company phone
 * @param email The company email
 * @param countryId The country ID
 * @param vatNumber The company VAT/TAX ID number
 * @param pageSize The default page size
 * @param fontSize The font size
 * @param primaryFont The primary font
 * @param secondaryFont The secondary font
 * @param hidePaidToDate Flags whether to hide the paid to date field
 * @param embedDocuments Toggled whether to embed documents in the PDF
 * @param allPagesHeader The header for the PDF
 * @param allPagesFooter The footer for the PDF
 * @param documentEmailAttachment Toggles whether to attach documents in the email
 * @param enableClientPortalPassword Toggles password protection of the client portal
 * @param enableEmailMarkup Toggles the use of markdown in emails
 * @param enableClientPortalDashboard Toggles whether the client dashboard is shown in the client portal
 * @param enableClientPortal Toggles whether the entire client portal is displayed to the client, or only the context
 * @param emailTemplateStatement The body of the email for statements
 * @param emailSubjectStatement The subject of the email for statements
 * @param signatureOnPdf Toggles whether the signature (if available) is displayed on the PDF
 * @param quoteFooter The default quote footer
 * @param emailSubjectCustom1 Custom reminder template subject
 * @param emailSubjectCustom2 Custom reminder template subject
 * @param emailSubjectCustom3 Custom reminder template subject
 * @param emailTemplateCustom1 Custom reminder template body
 * @param emailTemplateCustom2 Custom reminder template body
 * @param emailTemplateCustom3 Custom reminder template body
 * @param enableReminder1 Toggles whether this reminder is enabled
 * @param enableReminder2 Toggles whether this reminder is enabled
 * @param enableReminder3 Toggles whether this reminder is enabled
 * @param numDaysReminder1 The Reminder interval
 * @param numDaysReminder2 The Reminder interval
 * @param numDaysReminder3 The Reminder interval
 * @param scheduleReminder1 (enum: after_invoice_date, before_due_date, after_due_date)
 * @param scheduleReminder2 (enum: after_invoice_date, before_due_date, after_due_date)
 * @param scheduleReminder3 (enum: after_invoice_date, before_due_date, after_due_date)
 * @param lateFeeAmount1 The late fee amount for reminder 1
 * @param lateFeeAmount2 The late fee amount for reminder 2
 * @param lateFeeAmount3 The late fee amount for reminder 2
 * @param endlessReminderFrequencyId The frequency id of the endless reminder
 * @param clientOnlinePaymentNotification Determines if a client should receive the notification for a online payment
 * @param clientManualPaymentNotification Determines if a client should receive the notification for a manually entered payment
 */


data class CompanySettings (

    /* The timezone id */
    @Json(name = "timezone_id")
    val timezoneId: kotlin.String? = null,

    /* The date format id */
    @Json(name = "date_format_id")
    val dateFormatId: kotlin.String? = null,

    /* Toggles 12/24 hour time */
    @Json(name = "military_time")
    val militaryTime: kotlin.Boolean? = null,

    /* The language id */
    @Json(name = "language_id")
    val languageId: kotlin.String? = null,

    /* Toggles whether the currency symbol or code is shown */
    @Json(name = "show_currency_code")
    val showCurrencyCode: kotlin.Boolean? = null,

    /* The default currency id */
    @Json(name = "currency_id")
    val currencyId: kotlin.String? = null,

    /* -1 sets no payment term, 0 sets payment due immediately, positive integers indicates payment terms in days */
    @Json(name = "payment_terms")
    val paymentTerms: kotlin.Int? = null,

    /* A commad separate list of available gateways */
    @Json(name = "company_gateway_ids")
    val companyGatewayIds: kotlin.String? = null,

    /* A Custom Label */
    @Json(name = "custom_value1")
    val customValue1: kotlin.String? = null,

    /* A Custom Label */
    @Json(name = "custom_value2")
    val customValue2: kotlin.String? = null,

    /* A Custom Label */
    @Json(name = "custom_value3")
    val customValue3: kotlin.String? = null,

    /* A Custom Label */
    @Json(name = "custom_value4")
    val customValue4: kotlin.String? = null,

    /* The default task rate */
    @Json(name = "default_task_rate")
    val defaultTaskRate: kotlin.Float? = null,

    /* Toggles whether reminders are sent */
    @Json(name = "send_reminders")
    val sendReminders: kotlin.Boolean? = null,

    /* Show/hide the tasks panel in the client portal */
    @Json(name = "enable_client_portal_tasks")
    val enableClientPortalTasks: kotlin.Boolean? = null,

    /* options include plain,light,dark,custom */
    @Json(name = "email_style")
    val emailStyle: kotlin.String? = null,

    /* The reply to email address */
    @Json(name = "reply_to_email")
    val replyToEmail: kotlin.String? = null,

    /* A comma separate list of BCC emails */
    @Json(name = "bcc_email")
    val bccEmail: kotlin.String? = null,

    /* Toggles whether to attach PDF as attachment */
    @Json(name = "pdf_email_attachment")
    val pdfEmailAttachment: kotlin.Boolean? = null,

    /* Toggles whether to attach UBL as attachment */
    @Json(name = "ubl_email_attachment")
    val ublEmailAttachment: kotlin.Boolean? = null,

    /* The custom template */
    @Json(name = "email_style_custom")
    val emailStyleCustom: kotlin.String? = null,

    /* enum when the invoice number counter is set, ie when_saved, when_sent, when_paid */
    @Json(name = "counter_number_applied")
    val counterNumberApplied: kotlin.String? = null,

    /* enum when the quote number counter is set, ie when_saved, when_sent */
    @Json(name = "quote_number_applied")
    val quoteNumberApplied: kotlin.String? = null,

    /* A custom message which is displayed on the dashboard */
    @Json(name = "custom_message_dashboard")
    val customMessageDashboard: kotlin.String? = null,

    /* A custom message which is displayed in the client portal when a client is viewing a unpaid invoice. */
    @Json(name = "custom_message_unpaid_invoice")
    val customMessageUnpaidInvoice: kotlin.String? = null,

    /* A custom message which is displayed in the client portal when a client is viewing a paid invoice. */
    @Json(name = "custom_message_paid_invoice")
    val customMessagePaidInvoice: kotlin.String? = null,

    /* A custom message which is displayed in the client portal when a client is viewing a unapproved quote. */
    @Json(name = "custom_message_unapproved_quote")
    val customMessageUnapprovedQuote: kotlin.String? = null,

    /* Toggles whether invoices are locked once sent and cannot be modified further */
    @Json(name = "lock_invoices")
    val lockInvoices: kotlin.Boolean? = null,

    /* Toggles whether a invoice is archived immediately following payment */
    @Json(name = "auto_archive_invoice")
    val autoArchiveInvoice: kotlin.Boolean? = null,

    /* Toggles whether a quote is archived after being converted to a invoice */
    @Json(name = "auto_archive_quote")
    val autoArchiveQuote: kotlin.Boolean? = null,

    /* Toggles whether a quote is converted to a invoice when approved */
    @Json(name = "auto_convert_quote")
    val autoConvertQuote: kotlin.Boolean? = null,

    /* Boolean flag determining whether inclusive or exclusive taxes are used */
    @Json(name = "inclusive_taxes")
    val inclusiveTaxes: kotlin.Boolean? = null,

    /* JSON payload of customized translations */
    @Json(name = "translations")
    val translations: kotlin.Any? = null,

    /* Allows customisation of the task number pattern */
    @Json(name = "task_number_pattern")
    val taskNumberPattern: kotlin.String? = null,

    /* The incrementing counter for tasks */
    @Json(name = "task_number_counter")
    val taskNumberCounter: kotlin.Int? = null,

    /* Time from UTC +0 when the email will be sent to the client */
    @Json(name = "reminder_send_time")
    val reminderSendTime: kotlin.Int? = null,

    /* Allows customisation of the expense number pattern */
    @Json(name = "expense_number_pattern")
    val expenseNumberPattern: kotlin.String? = null,

    /* The incrementing counter for expenses */
    @Json(name = "expense_number_counter")
    val expenseNumberCounter: kotlin.Int? = null,

    /* Allows customisation of the vendor number pattern */
    @Json(name = "vendor_number_pattern")
    val vendorNumberPattern: kotlin.String? = null,

    /* The incrementing counter for vendors */
    @Json(name = "vendor_number_counter")
    val vendorNumberCounter: kotlin.Int? = null,

    /* Allows customisation of the ticket number pattern */
    @Json(name = "ticket_number_pattern")
    val ticketNumberPattern: kotlin.String? = null,

    /* The incrementing counter for tickets */
    @Json(name = "ticket_number_counter")
    val ticketNumberCounter: kotlin.Int? = null,

    /* Allows customisation of the payment number pattern */
    @Json(name = "payment_number_pattern")
    val paymentNumberPattern: kotlin.String? = null,

    /* The incrementing counter for payments */
    @Json(name = "payment_number_counter")
    val paymentNumberCounter: kotlin.Int? = null,

    /* Allows customisation of the invoice number pattern */
    @Json(name = "invoice_number_pattern")
    val invoiceNumberPattern: kotlin.String? = null,

    /* The incrementing counter for invoices */
    @Json(name = "invoice_number_counter")
    val invoiceNumberCounter: kotlin.Int? = null,

    /* Allows customisation of the quote number pattern */
    @Json(name = "quote_number_pattern")
    val quoteNumberPattern: kotlin.String? = null,

    /* The incrementing counter for quotes */
    @Json(name = "quote_number_counter")
    val quoteNumberCounter: kotlin.Int? = null,

    /* Allows customisation of the client number pattern */
    @Json(name = "client_number_pattern")
    val clientNumberPattern: kotlin.String? = null,

    /* The incrementing counter for clients */
    @Json(name = "client_number_counter")
    val clientNumberCounter: kotlin.Int? = null,

    /* Allows customisation of the credit number pattern */
    @Json(name = "credit_number_pattern")
    val creditNumberPattern: kotlin.String? = null,

    /* The incrementing counter for credits */
    @Json(name = "credit_number_counter")
    val creditNumberCounter: kotlin.Int? = null,

    /* This string is prepended to the recurring invoice number */
    @Json(name = "recurring_invoice_number_prefix")
    val recurringInvoiceNumberPrefix: kotlin.String? = null,

    /* CONSTANT which is used to apply the frequency which the counters are reset */
    @Json(name = "reset_counter_frequency_id")
    val resetCounterFrequencyId: kotlin.String? = null,

    /* The explicit date which is used to reset counters */
    @Json(name = "reset_counter_date")
    val resetCounterDate: kotlin.String? = null,

    /* Pads the counter with leading zeros */
    @Json(name = "counter_padding")
    val counterPadding: kotlin.Int? = null,

    /* Flags whether to share the counter for invoices and quotes */
    @Json(name = "shared_invoice_quote_counter")
    val sharedInvoiceQuoteCounter: kotlin.Boolean? = null,

    /* Determines if client fields are updated from third party APIs */
    @Json(name = "update_products")
    val updateProducts: kotlin.Boolean? = null,

    /*  */
    @Json(name = "convert_products")
    val convertProducts: kotlin.Boolean? = null,

    /* Automatically fill products based on product_key */
    @Json(name = "fill_products")
    val fillProducts: kotlin.Boolean? = null,

    /* The default invoice terms */
    @Json(name = "invoice_terms")
    val invoiceTerms: kotlin.String? = null,

    /* The default quote terms */
    @Json(name = "quote_terms")
    val quoteTerms: kotlin.String? = null,

    /* Taxes can be applied to the invoice */
    @Json(name = "invoice_taxes")
    val invoiceTaxes: java.math.BigDecimal? = null,

    /* The default design id (invoice, quote etc) */
    @Json(name = "invoice_design_id")
    val invoiceDesignId: kotlin.String? = null,

    /* The default design id (invoice, quote etc) */
    @Json(name = "quote_design_id")
    val quoteDesignId: kotlin.String? = null,

    /* The default invoice footer */
    @Json(name = "invoice_footer")
    val invoiceFooter: kotlin.String? = null,

    /* JSON string of invoice labels */
    @Json(name = "invoice_labels")
    val invoiceLabels: kotlin.String? = null,

    /* The tax rate (float) */
    @Json(name = "tax_rate1")
    val taxRate1: java.math.BigDecimal? = null,

    /* The tax name */
    @Json(name = "tax_name1")
    val taxName1: kotlin.String? = null,

    /* The tax rate (float) */
    @Json(name = "tax_rate2")
    val taxRate2: java.math.BigDecimal? = null,

    /* The tax name */
    @Json(name = "tax_name2")
    val taxName2: kotlin.String? = null,

    /* The tax rate (float) */
    @Json(name = "tax_rate3")
    val taxRate3: java.math.BigDecimal? = null,

    /* The tax name */
    @Json(name = "tax_name3")
    val taxName3: kotlin.String? = null,

    /* The default payment type id */
    @Json(name = "payment_type_id")
    val paymentTypeId: kotlin.String? = null,

    /* JSON string of custom fields */
    @Json(name = "custom_fields")
    val customFields: kotlin.String? = null,

    /* The default email footer */
    @Json(name = "email_footer")
    val emailFooter: kotlin.String? = null,

    /* The email driver to use to send email, options include default, gmail */
    @Json(name = "email_sending_method")
    val emailSendingMethod: kotlin.String? = null,

    /* The hashed_id of the user account to send email from */
    @Json(name = "gmail_sending_user_id")
    val gmailSendingUserId: kotlin.String? = null,

    /*  */
    @Json(name = "email_subject_invoice")
    val emailSubjectInvoice: kotlin.String? = null,

    /*  */
    @Json(name = "email_subject_quote")
    val emailSubjectQuote: kotlin.String? = null,

    /*  */
    @Json(name = "email_subject_payment")
    val emailSubjectPayment: kotlin.String? = null,

    /* The full template for invoice emails */
    @Json(name = "email_template_invoice")
    val emailTemplateInvoice: kotlin.String? = null,

    /* The full template for quote emails */
    @Json(name = "email_template_quote")
    val emailTemplateQuote: kotlin.String? = null,

    /* The full template for payment emails */
    @Json(name = "email_template_payment")
    val emailTemplatePayment: kotlin.String? = null,

    /* Email subject for Reminder */
    @Json(name = "email_subject_reminder1")
    val emailSubjectReminder1: kotlin.String? = null,

    /* Email subject for Reminder */
    @Json(name = "email_subject_reminder2")
    val emailSubjectReminder2: kotlin.String? = null,

    /* Email subject for Reminder */
    @Json(name = "email_subject_reminder3")
    val emailSubjectReminder3: kotlin.String? = null,

    /* Email subject for endless reminders */
    @Json(name = "email_subject_reminder_endless")
    val emailSubjectReminderEndless: kotlin.String? = null,

    /* The full template for Reminder 1 */
    @Json(name = "email_template_reminder1")
    val emailTemplateReminder1: kotlin.String? = null,

    /* The full template for Reminder 2 */
    @Json(name = "email_template_reminder2")
    val emailTemplateReminder2: kotlin.String? = null,

    /* The full template for Reminder 3 */
    @Json(name = "email_template_reminder3")
    val emailTemplateReminder3: kotlin.String? = null,

    /* The full template for enless reminders */
    @Json(name = "email_template_reminder_endless")
    val emailTemplateReminderEndless: kotlin.String? = null,

    /* Toggles whether a password is required to log into the client portal */
    @Json(name = "enable_portal_password")
    val enablePortalPassword: kotlin.Boolean? = null,

    /* Toggles whether the terms dialogue is shown to the client */
    @Json(name = "show_accept_invoice_terms")
    val showAcceptInvoiceTerms: kotlin.Boolean? = null,

    /* Toggles whether the terms dialogue is shown to the client */
    @Json(name = "show_accept_quote_terms")
    val showAcceptQuoteTerms: kotlin.Boolean? = null,

    /* Toggles whether a invoice signature is required */
    @Json(name = "require_invoice_signature")
    val requireInvoiceSignature: kotlin.Boolean? = null,

    /* Toggles whether a quote signature is required */
    @Json(name = "require_quote_signature")
    val requireQuoteSignature: kotlin.Boolean? = null,

    /* The company name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The company logo file */
    @Json(name = "company_logo")
    val companyLogo: kotlin.Any? = null,

    /* The company website URL */
    @Json(name = "website")
    val website: kotlin.String? = null,

    /* The company address line 1 */
    @Json(name = "address1")
    val address1: kotlin.String? = null,

    /* The company address line 2 */
    @Json(name = "address2")
    val address2: kotlin.String? = null,

    /* The company city */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* The company state */
    @Json(name = "state")
    val state: kotlin.String? = null,

    /* The company zip/postal code */
    @Json(name = "postal_code")
    val postalCode: kotlin.String? = null,

    /* The company phone */
    @Json(name = "phone")
    val phone: kotlin.String? = null,

    /* The company email */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* The country ID */
    @Json(name = "country_id")
    val countryId: kotlin.String? = null,

    /* The company VAT/TAX ID number */
    @Json(name = "vat_number")
    val vatNumber: kotlin.String? = null,

    /* The default page size */
    @Json(name = "page_size")
    val pageSize: kotlin.String? = null,

    /* The font size */
    @Json(name = "font_size")
    val fontSize: java.math.BigDecimal? = null,

    /* The primary font */
    @Json(name = "primary_font")
    val primaryFont: kotlin.String? = null,

    /* The secondary font */
    @Json(name = "secondary_font")
    val secondaryFont: kotlin.String? = null,

    /* Flags whether to hide the paid to date field */
    @Json(name = "hide_paid_to_date")
    val hidePaidToDate: kotlin.Boolean? = null,

    /* Toggled whether to embed documents in the PDF */
    @Json(name = "embed_documents")
    val embedDocuments: kotlin.Boolean? = null,

    /* The header for the PDF */
    @Json(name = "all_pages_header")
    val allPagesHeader: kotlin.Boolean? = null,

    /* The footer for the PDF */
    @Json(name = "all_pages_footer")
    val allPagesFooter: kotlin.Boolean? = null,

    /* Toggles whether to attach documents in the email */
    @Json(name = "document_email_attachment")
    val documentEmailAttachment: kotlin.Boolean? = null,

    /* Toggles password protection of the client portal */
    @Json(name = "enable_client_portal_password")
    val enableClientPortalPassword: kotlin.Boolean? = null,

    /* Toggles the use of markdown in emails */
    @Json(name = "enable_email_markup")
    val enableEmailMarkup: kotlin.Boolean? = null,

    /* Toggles whether the client dashboard is shown in the client portal */
    @Json(name = "enable_client_portal_dashboard")
    val enableClientPortalDashboard: kotlin.Boolean? = null,

    /* Toggles whether the entire client portal is displayed to the client, or only the context */
    @Json(name = "enable_client_portal")
    val enableClientPortal: kotlin.Boolean? = null,

    /* The body of the email for statements */
    @Json(name = "email_template_statement")
    val emailTemplateStatement: kotlin.String? = null,

    /* The subject of the email for statements */
    @Json(name = "email_subject_statement")
    val emailSubjectStatement: kotlin.String? = null,

    /* Toggles whether the signature (if available) is displayed on the PDF */
    @Json(name = "signature_on_pdf")
    val signatureOnPdf: kotlin.Boolean? = null,

    /* The default quote footer */
    @Json(name = "quote_footer")
    val quoteFooter: kotlin.String? = null,

    /* Custom reminder template subject */
    @Json(name = "email_subject_custom1")
    val emailSubjectCustom1: kotlin.String? = null,

    /* Custom reminder template subject */
    @Json(name = "email_subject_custom2")
    val emailSubjectCustom2: kotlin.String? = null,

    /* Custom reminder template subject */
    @Json(name = "email_subject_custom3")
    val emailSubjectCustom3: kotlin.String? = null,

    /* Custom reminder template body */
    @Json(name = "email_template_custom1")
    val emailTemplateCustom1: kotlin.String? = null,

    /* Custom reminder template body */
    @Json(name = "email_template_custom2")
    val emailTemplateCustom2: kotlin.String? = null,

    /* Custom reminder template body */
    @Json(name = "email_template_custom3")
    val emailTemplateCustom3: kotlin.String? = null,

    /* Toggles whether this reminder is enabled */
    @Json(name = "enable_reminder1")
    val enableReminder1: kotlin.Boolean? = null,

    /* Toggles whether this reminder is enabled */
    @Json(name = "enable_reminder2")
    val enableReminder2: kotlin.Boolean? = null,

    /* Toggles whether this reminder is enabled */
    @Json(name = "enable_reminder3")
    val enableReminder3: kotlin.Boolean? = null,

    /* The Reminder interval */
    @Json(name = "num_days_reminder1")
    val numDaysReminder1: java.math.BigDecimal? = null,

    /* The Reminder interval */
    @Json(name = "num_days_reminder2")
    val numDaysReminder2: java.math.BigDecimal? = null,

    /* The Reminder interval */
    @Json(name = "num_days_reminder3")
    val numDaysReminder3: java.math.BigDecimal? = null,

    /* (enum: after_invoice_date, before_due_date, after_due_date) */
    @Json(name = "schedule_reminder1")
    val scheduleReminder1: kotlin.String? = null,

    /* (enum: after_invoice_date, before_due_date, after_due_date) */
    @Json(name = "schedule_reminder2")
    val scheduleReminder2: kotlin.String? = null,

    /* (enum: after_invoice_date, before_due_date, after_due_date) */
    @Json(name = "schedule_reminder3")
    val scheduleReminder3: kotlin.String? = null,

    /* The late fee amount for reminder 1 */
    @Json(name = "late_fee_amount1")
    val lateFeeAmount1: java.math.BigDecimal? = null,

    /* The late fee amount for reminder 2 */
    @Json(name = "late_fee_amount2")
    val lateFeeAmount2: java.math.BigDecimal? = null,

    /* The late fee amount for reminder 2 */
    @Json(name = "late_fee_amount3")
    val lateFeeAmount3: java.math.BigDecimal? = null,

    /* The frequency id of the endless reminder */
    @Json(name = "endless_reminder_frequency_id")
    val endlessReminderFrequencyId: kotlin.String? = null,

    /* Determines if a client should receive the notification for a online payment */
    @Json(name = "client_online_payment_notification")
    val clientOnlinePaymentNotification: kotlin.Boolean? = null,

    /* Determines if a client should receive the notification for a manually entered payment */
    @Json(name = "client_manual_payment_notification")
    val clientManualPaymentNotification: kotlin.Boolean? = null

)
