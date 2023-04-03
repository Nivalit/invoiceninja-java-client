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

import com.nivalit.invoiceninja.models.CompanySettings

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id The hashed id of the recurring quote
 * @param userId The user hashed id
 * @param assignedUserId The assigned user hashed id
 * @param companyId The company hashed id
 * @param clientId The client hashed id
 * @param statusId The quote status variable
 * @param frequencyId The recurring quote frequency
 * @param remainingCycles The number of quotes left to be generated
 * @param number The recurringquote number - is a unique alpha numeric number per quote per company
 * @param poNumber The purchase order associated with this recurring quote
 * @param terms The quote terms
 * @param publicNotes The public notes of the quote
 * @param privateNotes The private notes of the quote
 * @param footer The quote footer notes
 * @param customValue1 A custom field value
 * @param customValue2 A custom field value
 * @param customValue3 A custom field value
 * @param customValue4 A custom field value
 * @param taxName1 The tax name
 * @param taxName2 The tax name
 * @param taxRate1 The tax rate
 * @param taxRate2 The tax rate
 * @param taxName3 The tax name
 * @param taxRate3 The tax rate
 * @param totalTaxes The total taxes for the quote
 * @param lineItems An array of objects which define the line items of the quote
 * @param amount The quote amount
 * @param balance The quote balance
 * @param paidToDate The amount paid on the quote to date
 * @param discount The quote discount, can be an amount or a percentage
 * @param partial The deposit/partial amount
 * @param isAmountDiscount Flag determining if the discount is an amount or a percentage
 * @param isDeleted Defines if the quote has been deleted
 * @param usesInclusiveTaxes Defines the type of taxes used as either inclusive or exclusive
 * @param date The quote Date
 * @param lastSentDate The last date the quote was sent out
 * @param nextSendDate The Next date for a reminder to be sent
 * @param partialDueDate The due date for the deposit/partial amount
 * @param dueDate The due date of the quote
 * @param settings 
 * @param lastViewed Timestamp
 * @param updatedAt Timestamp
 * @param archivedAt Timestamp
 * @param customSurcharge1 First Custom Surcharge
 * @param customSurcharge2 Second Custom Surcharge
 * @param customSurcharge3 Third Custom Surcharge
 * @param customSurcharge4 Fourth Custom Surcharge
 * @param customSurchargeTax1 Toggles charging taxes on custom surcharge amounts
 * @param customSurchargeTax2 Toggles charging taxes on custom surcharge amounts
 * @param customSurchargeTax3 Toggles charging taxes on custom surcharge amounts
 * @param customSurchargeTax4 Toggles charging taxes on custom surcharge amounts
 */


data class RecurringQuote (

    /* The hashed id of the recurring quote */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The user hashed id */
    @Json(name = "user_id")
    val userId: kotlin.String? = null,

    /* The assigned user hashed id */
    @Json(name = "assigned_user_id")
    val assignedUserId: kotlin.String? = null,

    /* The company hashed id */
    @Json(name = "company_id")
    val companyId: kotlin.String? = null,

    /* The client hashed id */
    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    /* The quote status variable */
    @Json(name = "status_id")
    val statusId: kotlin.String? = null,

    /* The recurring quote frequency */
    @Json(name = "frequency_id")
    val frequencyId: java.math.BigDecimal? = null,

    /* The number of quotes left to be generated */
    @Json(name = "remaining_cycles")
    val remainingCycles: java.math.BigDecimal? = null,

    /* The recurringquote number - is a unique alpha numeric number per quote per company */
    @Json(name = "number")
    val number: kotlin.String? = null,

    /* The purchase order associated with this recurring quote */
    @Json(name = "po_number")
    val poNumber: kotlin.String? = null,

    /* The quote terms */
    @Json(name = "terms")
    val terms: kotlin.String? = null,

    /* The public notes of the quote */
    @Json(name = "public_notes")
    val publicNotes: kotlin.String? = null,

    /* The private notes of the quote */
    @Json(name = "private_notes")
    val privateNotes: kotlin.String? = null,

    /* The quote footer notes */
    @Json(name = "footer")
    val footer: kotlin.String? = null,

    /* A custom field value */
    @Json(name = "custom_value1")
    val customValue1: kotlin.String? = null,

    /* A custom field value */
    @Json(name = "custom_value2")
    val customValue2: kotlin.String? = null,

    /* A custom field value */
    @Json(name = "custom_value3")
    val customValue3: kotlin.String? = null,

    /* A custom field value */
    @Json(name = "custom_value4")
    val customValue4: kotlin.String? = null,

    /* The tax name */
    @Json(name = "tax_name1")
    val taxName1: kotlin.String? = null,

    /* The tax name */
    @Json(name = "tax_name2")
    val taxName2: kotlin.String? = null,

    /* The tax rate */
    @Json(name = "tax_rate1")
    val taxRate1: kotlin.Float? = null,

    /* The tax rate */
    @Json(name = "tax_rate2")
    val taxRate2: kotlin.Float? = null,

    /* The tax name */
    @Json(name = "tax_name3")
    val taxName3: kotlin.String? = null,

    /* The tax rate */
    @Json(name = "tax_rate3")
    val taxRate3: kotlin.Float? = null,

    /* The total taxes for the quote */
    @Json(name = "total_taxes")
    val totalTaxes: kotlin.Float? = null,

    /* An array of objects which define the line items of the quote */
    @Json(name = "line_items")
    val lineItems: kotlin.Any? = null,

    /* The quote amount */
    @Json(name = "amount")
    val amount: kotlin.Float? = null,

    /* The quote balance */
    @Json(name = "balance")
    val balance: kotlin.Float? = null,

    /* The amount paid on the quote to date */
    @Json(name = "paid_to_date")
    val paidToDate: kotlin.Float? = null,

    /* The quote discount, can be an amount or a percentage */
    @Json(name = "discount")
    val discount: kotlin.Float? = null,

    /* The deposit/partial amount */
    @Json(name = "partial")
    val partial: kotlin.Float? = null,

    /* Flag determining if the discount is an amount or a percentage */
    @Json(name = "is_amount_discount")
    val isAmountDiscount: kotlin.Boolean? = null,

    /* Defines if the quote has been deleted */
    @Json(name = "is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Defines the type of taxes used as either inclusive or exclusive */
    @Json(name = "uses_inclusive_taxes")
    val usesInclusiveTaxes: kotlin.Boolean? = null,

    /* The quote Date */
    @Json(name = "date")
    val date: java.time.LocalDate? = null,

    /* The last date the quote was sent out */
    @Json(name = "last_sent_date")
    val lastSentDate: java.time.LocalDate? = null,

    /* The Next date for a reminder to be sent */
    @Json(name = "next_send_date")
    val nextSendDate: java.time.LocalDate? = null,

    /* The due date for the deposit/partial amount */
    @Json(name = "partial_due_date")
    val partialDueDate: java.time.LocalDate? = null,

    /* The due date of the quote */
    @Json(name = "due_date")
    val dueDate: java.time.LocalDate? = null,

    @Json(name = "settings")
    val settings: CompanySettings? = null,

    /* Timestamp */
    @Json(name = "last_viewed")
    val lastViewed: java.math.BigDecimal? = null,

    /* Timestamp */
    @Json(name = "updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @Json(name = "archived_at")
    val archivedAt: java.math.BigDecimal? = null,

    /* First Custom Surcharge */
    @Json(name = "custom_surcharge1")
    val customSurcharge1: kotlin.Float? = null,

    /* Second Custom Surcharge */
    @Json(name = "custom_surcharge2")
    val customSurcharge2: kotlin.Float? = null,

    /* Third Custom Surcharge */
    @Json(name = "custom_surcharge3")
    val customSurcharge3: kotlin.Float? = null,

    /* Fourth Custom Surcharge */
    @Json(name = "custom_surcharge4")
    val customSurcharge4: kotlin.Float? = null,

    /* Toggles charging taxes on custom surcharge amounts */
    @Json(name = "custom_surcharge_tax1")
    val customSurchargeTax1: kotlin.Boolean? = null,

    /* Toggles charging taxes on custom surcharge amounts */
    @Json(name = "custom_surcharge_tax2")
    val customSurchargeTax2: kotlin.Boolean? = null,

    /* Toggles charging taxes on custom surcharge amounts */
    @Json(name = "custom_surcharge_tax3")
    val customSurchargeTax3: kotlin.Boolean? = null,

    /* Toggles charging taxes on custom surcharge amounts */
    @Json(name = "custom_surcharge_tax4")
    val customSurchargeTax4: kotlin.Boolean? = null

)

