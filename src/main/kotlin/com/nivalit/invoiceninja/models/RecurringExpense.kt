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
 * @param id The hashed id of the recurring expense
 * @param userId The hashed id of the user who created the recurring expense
 * @param assignedUserId The hashed id of the user assigned to this recurring expense
 * @param companyId The hashed id of the company
 * @param clientId The hashed id of the client
 * @param invoiceId The hashed id of the invoice
 * @param bankId The id of the bank associated with this recurring expense
 * @param invoiceCurrencyId The currency id of the invoice associated with this recurring expense
 * @param expenseCurrencyId The currency id of the expense associated with this recurring expense
 * @param invoiceCategoryId The category id of the invoice
 * @param paymentTypeId The payment type id
 * @param privateNotes The recurring expense private notes
 * @param publicNotes The recurring expense public notes
 * @param transactionReference The recurring expense transaction reference
 * @param transcationId The transaction id of the recurring expense
 * @param customValue1 Custom value field
 * @param customValue2 Custom value field
 * @param customValue3 Custom value field
 * @param customValue4 Custom value field
 * @param taxName1 The tax name
 * @param taxName2 The tax name
 * @param taxRate1 The tax rate
 * @param taxRate2 The tax rate
 * @param taxName3 The tax name
 * @param taxRate3 The tax rate
 * @param amount The total amount of the recurring expense
 * @param frequencyId The frequency this recurring expense fires
 * @param remainingCycles The number of remaining cycles for this recurring expense
 * @param foreignAmount The foreign currency amount of the recurring expense
 * @param exchangeRate The exchange rate for the expernse
 * @param date The date of the expense
 * @param paymentDate The date the expense was paid
 * @param shouldBeInvoiced Boolean flag determining if the expense should be invoiced
 * @param isDeleted Boolean flag determining if the recurring expense is deleted
 * @param lastSentDate The Date it was sent last
 * @param nextSendDate The next send date
 * @param invoiceDocuments Boolean flag determining if the documents associated with this expense should be passed onto the invoice if it is converted to an invoice
 * @param updatedAt Timestamp
 * @param archivedAt Timestamp
 */


data class RecurringExpense (

    /* The hashed id of the recurring expense */
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    /* The hashed id of the user who created the recurring expense */
    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    /* The hashed id of the user assigned to this recurring expense */
    @field:JsonProperty("assigned_user_id")
    val assignedUserId: kotlin.String? = null,

    /* The hashed id of the company */
    @field:JsonProperty("company_id")
    val companyId: kotlin.String? = null,

    /* The hashed id of the client */
    @field:JsonProperty("client_id")
    val clientId: kotlin.String? = null,

    /* The hashed id of the invoice */
    @field:JsonProperty("invoice_id")
    val invoiceId: kotlin.String? = null,

    /* The id of the bank associated with this recurring expense */
    @field:JsonProperty("bank_id")
    val bankId: kotlin.String? = null,

    /* The currency id of the invoice associated with this recurring expense */
    @field:JsonProperty("invoice_currency_id")
    val invoiceCurrencyId: kotlin.String? = null,

    /* The currency id of the expense associated with this recurring expense */
    @field:JsonProperty("expense_currency_id")
    val expenseCurrencyId: kotlin.String? = null,

    /* The category id of the invoice */
    @field:JsonProperty("invoice_category_id")
    val invoiceCategoryId: kotlin.String? = null,

    /* The payment type id */
    @field:JsonProperty("payment_type_id")
    val paymentTypeId: kotlin.String? = null,

    /* The recurring expense private notes */
    @field:JsonProperty("private_notes")
    val privateNotes: kotlin.String? = null,

    /* The recurring expense public notes */
    @field:JsonProperty("public_notes")
    val publicNotes: kotlin.String? = null,

    /* The recurring expense transaction reference */
    @field:JsonProperty("transaction_reference")
    val transactionReference: kotlin.String? = null,

    /* The transaction id of the recurring expense */
    @field:JsonProperty("transcation_id")
    val transcationId: kotlin.String? = null,

    /* Custom value field */
    @field:JsonProperty("custom_value1")
    val customValue1: kotlin.String? = null,

    /* Custom value field */
    @field:JsonProperty("custom_value2")
    val customValue2: kotlin.String? = null,

    /* Custom value field */
    @field:JsonProperty("custom_value3")
    val customValue3: kotlin.String? = null,

    /* Custom value field */
    @field:JsonProperty("custom_value4")
    val customValue4: kotlin.String? = null,

    /* The tax name */
    @field:JsonProperty("tax_name1")
    val taxName1: kotlin.String? = null,

    /* The tax name */
    @field:JsonProperty("tax_name2")
    val taxName2: kotlin.String? = null,

    /* The tax rate */
    @field:JsonProperty("tax_rate1")
    val taxRate1: kotlin.Float? = null,

    /* The tax rate */
    @field:JsonProperty("tax_rate2")
    val taxRate2: kotlin.Float? = null,

    /* The tax name */
    @field:JsonProperty("tax_name3")
    val taxName3: kotlin.String? = null,

    /* The tax rate */
    @field:JsonProperty("tax_rate3")
    val taxRate3: kotlin.Float? = null,

    /* The total amount of the recurring expense */
    @field:JsonProperty("amount")
    val amount: kotlin.Float? = null,

    /* The frequency this recurring expense fires */
    @field:JsonProperty("frequency_id")
    val frequencyId: java.math.BigDecimal? = null,

    /* The number of remaining cycles for this recurring expense */
    @field:JsonProperty("remaining_cycles")
    val remainingCycles: java.math.BigDecimal? = null,

    /* The foreign currency amount of the recurring expense */
    @field:JsonProperty("foreign_amount")
    val foreignAmount: kotlin.Float? = null,

    /* The exchange rate for the expernse */
    @field:JsonProperty("exchange_rate")
    val exchangeRate: kotlin.Float? = null,

    /* The date of the expense */
    @field:JsonProperty("date")
    val date: kotlin.String? = null,

    /* The date the expense was paid */
    @field:JsonProperty("payment_date")
    val paymentDate: kotlin.String? = null,

    /* Boolean flag determining if the expense should be invoiced */
    @field:JsonProperty("should_be_invoiced")
    val shouldBeInvoiced: kotlin.Boolean? = null,

    /* Boolean flag determining if the recurring expense is deleted */
    @field:JsonProperty("is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* The Date it was sent last */
    @field:JsonProperty("last_sent_date")
    val lastSentDate: java.time.LocalDate? = null,

    /* The next send date */
    @field:JsonProperty("next_send_date")
    val nextSendDate: java.time.LocalDate? = null,

    /* Boolean flag determining if the documents associated with this expense should be passed onto the invoice if it is converted to an invoice */
    @field:JsonProperty("invoice_documents")
    val invoiceDocuments: kotlin.Boolean? = null,

    /* Timestamp */
    @field:JsonProperty("updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @field:JsonProperty("archived_at")
    val archivedAt: java.math.BigDecimal? = null

)

