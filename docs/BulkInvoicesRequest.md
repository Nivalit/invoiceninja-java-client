
# BulkInvoicesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **kotlin.String** | The action to be performed, options include:   - &#x60;bulk_download&#x60;     Bulk download an array of invoice PDFs (These are sent to the admin via email.)   - &#x60;download&#x60;     Download a single PDF. (Returns a single PDF object)   - &#x60;bulk_print&#x60;     Merges an array of Invoice PDFs for easy one click printing.   - &#x60;auto_bill&#x60;     Attempts to automatically bill the invoices with the payment method on file.   - &#x60;clone_to_invoice&#x60;     Returns a clone of the invoice.   - &#x60;clone_to_quote&#x60;     Returns a quote cloned using the properties of the given invoice.   - &#x60;mark_paid&#x60;     Marks an array of invoices as paid.   - &#x60;mark_sent&#x60;     Marks an array of invoices as sent.   - &#x60;restore&#x60;     Restores an array of invoices   - &#x60;delete&#x60;     Deletes an array of invoices   - &#x60;archive&#x60;     Archives an array of invoices   - &#x60;cancel&#x60;     Cancels an array of invoices   - &#x60;email&#x60;     Emails an array of invoices   - &#x60;send_email&#x60;     Emails an array of invoices. Requires additional properties to be sent. &#x60;email_type&#x60;  | 
**ids** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 



