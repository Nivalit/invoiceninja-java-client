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
 * @param id The expense hashed id
 * @param userId The user hashed id
 * @param assignedUserId The assigned user hashed id
 * @param companyId The company hashed id
 * @param clientId The client hashed id
 * @param invoiceId The related invoice hashed id
 * @param bankId The bank id related to this expense
 * @param invoiceCurrencyId The currency id of the related invoice
 * @param expenseCurrencyId The currency id of the expense
 * @param invoiceCategoryId The invoice category id
 * @param paymentTypeId The payment type id
 * @param recurringExpenseId The related recurring expense this expense was created from
 * @param privateNotes The private notes of the expense
 * @param publicNotes The public notes of the expense
 * @param transactionReference The transaction references of the expense
 * @param transcationId The transaction id of the expense
 * @param customValue1 A custom value
 * @param customValue2 A custom value
 * @param customValue3 A custom value
 * @param customValue4 A custom value
 * @param taxName1 Tax name
 * @param taxName2 Tax name
 * @param taxRate1 Tax rate
 * @param taxRate2 Tax rate
 * @param taxName3 Tax name
 * @param taxRate3 Tax rate
 * @param amount The total expense amont
 * @param foreignAmount The total foreign amount of the expense
 * @param exchangeRate The exchange rate at the time of the expense
 * @param date The expense date formate Y-m-d
 * @param paymentDate The date of payment for the expense, format Y-m-d
 * @param shouldBeInvoiced Flag whether the expense should be invoiced
 * @param isDeleted Boolean determining whether the expense has been deleted
 * @param invoiceDocuments Passing the expense documents over to the invoice
 * @param updatedAt Timestamp
 * @param archivedAt Timestamp
 */


data class Expense (

    /* The expense hashed id */
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    /* The user hashed id */
    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    /* The assigned user hashed id */
    @field:JsonProperty("assigned_user_id")
    val assignedUserId: kotlin.String? = null,

    /* The company hashed id */
    @field:JsonProperty("company_id")
    val companyId: kotlin.String? = null,

    /* The client hashed id */
    @field:JsonProperty("client_id")
    val clientId: kotlin.String? = null,

    /* The related invoice hashed id */
    @field:JsonProperty("invoice_id")
    val invoiceId: kotlin.String? = null,

    /* The bank id related to this expense */
    @field:JsonProperty("bank_id")
    val bankId: kotlin.String? = null,

    /* The currency id of the related invoice */
    @field:JsonProperty("invoice_currency_id")
    val invoiceCurrencyId: kotlin.String? = null,

    /* The currency id of the expense */
    @field:JsonProperty("expense_currency_id")
    val expenseCurrencyId: kotlin.String? = null,

    /* The invoice category id */
    @field:JsonProperty("invoice_category_id")
    val invoiceCategoryId: kotlin.String? = null,

    /* The payment type id */
    @field:JsonProperty("payment_type_id")
    val paymentTypeId: kotlin.String? = null,

    /* The related recurring expense this expense was created from */
    @field:JsonProperty("recurring_expense_id")
    val recurringExpenseId: kotlin.String? = null,

    /* The private notes of the expense */
    @field:JsonProperty("private_notes")
    val privateNotes: kotlin.String? = null,

    /* The public notes of the expense */
    @field:JsonProperty("public_notes")
    val publicNotes: kotlin.String? = null,

    /* The transaction references of the expense */
    @field:JsonProperty("transaction_reference")
    val transactionReference: kotlin.String? = null,

    /* The transaction id of the expense */
    @field:JsonProperty("transcation_id")
    val transcationId: kotlin.String? = null,

    /* A custom value */
    @field:JsonProperty("custom_value1")
    val customValue1: kotlin.String? = null,

    /* A custom value */
    @field:JsonProperty("custom_value2")
    val customValue2: kotlin.String? = null,

    /* A custom value */
    @field:JsonProperty("custom_value3")
    val customValue3: kotlin.String? = null,

    /* A custom value */
    @field:JsonProperty("custom_value4")
    val customValue4: kotlin.String? = null,

    /* Tax name */
    @field:JsonProperty("tax_name1")
    val taxName1: kotlin.String? = null,

    /* Tax name */
    @field:JsonProperty("tax_name2")
    val taxName2: kotlin.String? = null,

    /* Tax rate */
    @field:JsonProperty("tax_rate1")
    val taxRate1: kotlin.Float? = null,

    /* Tax rate */
    @field:JsonProperty("tax_rate2")
    val taxRate2: kotlin.Float? = null,

    /* Tax name */
    @field:JsonProperty("tax_name3")
    val taxName3: kotlin.String? = null,

    /* Tax rate */
    @field:JsonProperty("tax_rate3")
    val taxRate3: kotlin.Float? = null,

    /* The total expense amont */
    @field:JsonProperty("amount")
    val amount: kotlin.Float? = null,

    /* The total foreign amount of the expense */
    @field:JsonProperty("foreign_amount")
    val foreignAmount: kotlin.Float? = null,

    /* The exchange rate at the time of the expense */
    @field:JsonProperty("exchange_rate")
    val exchangeRate: kotlin.Float? = null,

    /* The expense date formate Y-m-d */
    @field:JsonProperty("date")
    val date: kotlin.String? = null,

    /* The date of payment for the expense, format Y-m-d */
    @field:JsonProperty("payment_date")
    val paymentDate: kotlin.String? = null,

    /* Flag whether the expense should be invoiced */
    @field:JsonProperty("should_be_invoiced")
    val shouldBeInvoiced: kotlin.Boolean? = null,

    /* Boolean determining whether the expense has been deleted */
    @field:JsonProperty("is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Passing the expense documents over to the invoice */
    @field:JsonProperty("invoice_documents")
    val invoiceDocuments: kotlin.Boolean? = null,

    /* Timestamp */
    @field:JsonProperty("updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @field:JsonProperty("archived_at")
    val archivedAt: java.math.BigDecimal? = null

)

