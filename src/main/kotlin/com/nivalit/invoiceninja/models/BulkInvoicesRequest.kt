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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param action The action to be performed, options include:   - `bulk_download`     Bulk download an array of invoice PDFs (These are sent to the admin via email.)   - `download`     Download a single PDF. (Returns a single PDF object)   - `bulk_print`     Merges an array of Invoice PDFs for easy one click printing.   - `auto_bill`     Attempts to automatically bill the invoices with the payment method on file.   - `clone_to_invoice`     Returns a clone of the invoice.   - `clone_to_quote`     Returns a quote cloned using the properties of the given invoice.   - `mark_paid`     Marks an array of invoices as paid.   - `mark_sent`     Marks an array of invoices as sent.   - `restore`     Restores an array of invoices   - `delete`     Deletes an array of invoices   - `archive`     Archives an array of invoices   - `cancel`     Cancels an array of invoices   - `email`     Emails an array of invoices   - `send_email`     Emails an array of invoices. Requires additional properties to be sent. `email_type` 
 * @param ids 
 */


data class BulkInvoicesRequest (

    /* The action to be performed, options include:   - `bulk_download`     Bulk download an array of invoice PDFs (These are sent to the admin via email.)   - `download`     Download a single PDF. (Returns a single PDF object)   - `bulk_print`     Merges an array of Invoice PDFs for easy one click printing.   - `auto_bill`     Attempts to automatically bill the invoices with the payment method on file.   - `clone_to_invoice`     Returns a clone of the invoice.   - `clone_to_quote`     Returns a quote cloned using the properties of the given invoice.   - `mark_paid`     Marks an array of invoices as paid.   - `mark_sent`     Marks an array of invoices as sent.   - `restore`     Restores an array of invoices   - `delete`     Deletes an array of invoices   - `archive`     Archives an array of invoices   - `cancel`     Cancels an array of invoices   - `email`     Emails an array of invoices   - `send_email`     Emails an array of invoices. Requires additional properties to be sent. `email_type`  */
    @field:JsonProperty("action")
    val action: kotlin.String,

    @field:JsonProperty("ids")
    val ids: kotlin.collections.List<kotlin.String>

)

