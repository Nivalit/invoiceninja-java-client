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
import com.nivalit.invoiceninja.models.InvoiceItem

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id The unique hashed ID of the credit
 * @param userId The unique hashed ID of the user associated with the credit
 * @param assignedUserId The unique hashed ID of the assigned user responsible for the credit
 * @param companyId The unique hashed ID of the company associated with the credit
 * @param clientId The unique hashed ID of the client associated with the credit
 * @param statusId The ID representing the current status of the credit
 * @param invoiceId The unique hashed ID of the linked invoice to which the credit is applied
 * @param number The unique alphanumeric credit number per company
 * @param poNumber The purchase order number referred to by the credit
 * @param terms The terms associated with the credit
 * @param publicNotes Public notes for the credit
 * @param privateNotes Private notes for internal use, not visible to the client
 * @param footer The footer text for the credit
 * @param customValue1 Custom value 1 for additional credit information
 * @param customValue2 Custom value 2 for additional credit information
 * @param customValue3 Custom value 3 for additional credit information
 * @param customValue4 Custom value 4 for additional credit information
 * @param taxName1 The name of the first tax applied to the credit
 * @param taxName2 The name of the second tax applied to the credit
 * @param taxRate1 The rate of the first tax applied to the credit
 * @param taxRate2 The rate of the second tax applied to the credit
 * @param taxName3 The name of the third tax applied to the credit
 * @param taxRate3 The rate of the third tax applied to the credit
 * @param totalTaxes The total amount of taxes for the credit
 * @param lineItems An array of objects which define the line items of the credit
 * @param amount The total amount of the credit
 * @param balance The outstanding balance of the credit
 * @param paidToDate The total amount paid to date for the credit
 * @param discount The discount applied to the credit
 * @param partial The partial amount applied to the credit
 * @param isAmountDiscount Indicates whether the discount applied is a fixed amount or a percentage
 * @param isDeleted Indicates whether the credit has been deleted
 * @param usesInclusiveTaxes Indicates whether the tax rates applied to the credit are inclusive or exclusive
 * @param date The date the credit was issued
 * @param lastSentDate The date the credit was last sent out
 * @param nextSendDate The next scheduled date for sending a credit reminder
 * @param partialDueDate The due date for the partial amount of the credit
 * @param dueDate The due date for the total amount of the credit
 * @param settings 
 * @param lastViewed The timestamp of the last time the credit was viewed
 * @param updatedAt The timestamp of the last time the credit was updated
 * @param archivedAt The timestamp of the last time the credit was archived
 * @param customSurcharge1 First custom surcharge amount
 * @param customSurcharge2 Second Custom Surcharge
 * @param customSurcharge3 Third Custom Surcharge
 * @param customSurcharge4 Fourth Custom Surcharge
 * @param customSurchargeTax1 Toggles charging taxes on custom surcharge amounts
 * @param customSurchargeTax2 Toggles charging taxes on custom surcharge amounts
 * @param customSurchargeTax3 Toggles charging taxes on custom surcharge amounts
 * @param customSurchargeTax4 Toggles charging taxes on custom surcharge amounts
 */


data class Credit (

    /* The unique hashed ID of the credit */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The unique hashed ID of the user associated with the credit */
    @Json(name = "user_id")
    val userId: kotlin.String? = null,

    /* The unique hashed ID of the assigned user responsible for the credit */
    @Json(name = "assigned_user_id")
    val assignedUserId: kotlin.String? = null,

    /* The unique hashed ID of the company associated with the credit */
    @Json(name = "company_id")
    val companyId: kotlin.String? = null,

    /* The unique hashed ID of the client associated with the credit */
    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    /* The ID representing the current status of the credit */
    @Json(name = "status_id")
    val statusId: kotlin.String? = null,

    /* The unique hashed ID of the linked invoice to which the credit is applied */
    @Json(name = "invoice_id")
    val invoiceId: kotlin.String? = null,

    /* The unique alphanumeric credit number per company */
    @Json(name = "number")
    val number: kotlin.String? = null,

    /* The purchase order number referred to by the credit */
    @Json(name = "po_number")
    val poNumber: kotlin.String? = null,

    /* The terms associated with the credit */
    @Json(name = "terms")
    val terms: kotlin.String? = null,

    /* Public notes for the credit */
    @Json(name = "public_notes")
    val publicNotes: kotlin.String? = null,

    /* Private notes for internal use, not visible to the client */
    @Json(name = "private_notes")
    val privateNotes: kotlin.String? = null,

    /* The footer text for the credit */
    @Json(name = "footer")
    val footer: kotlin.String? = null,

    /* Custom value 1 for additional credit information */
    @Json(name = "custom_value1")
    val customValue1: kotlin.String? = null,

    /* Custom value 2 for additional credit information */
    @Json(name = "custom_value2")
    val customValue2: kotlin.String? = null,

    /* Custom value 3 for additional credit information */
    @Json(name = "custom_value3")
    val customValue3: kotlin.String? = null,

    /* Custom value 4 for additional credit information */
    @Json(name = "custom_value4")
    val customValue4: kotlin.String? = null,

    /* The name of the first tax applied to the credit */
    @Json(name = "tax_name1")
    val taxName1: kotlin.String? = null,

    /* The name of the second tax applied to the credit */
    @Json(name = "tax_name2")
    val taxName2: kotlin.String? = null,

    /* The rate of the first tax applied to the credit */
    @Json(name = "tax_rate1")
    val taxRate1: kotlin.Float? = null,

    /* The rate of the second tax applied to the credit */
    @Json(name = "tax_rate2")
    val taxRate2: kotlin.Float? = null,

    /* The name of the third tax applied to the credit */
    @Json(name = "tax_name3")
    val taxName3: kotlin.String? = null,

    /* The rate of the third tax applied to the credit */
    @Json(name = "tax_rate3")
    val taxRate3: kotlin.Float? = null,

    /* The total amount of taxes for the credit */
    @Json(name = "total_taxes")
    val totalTaxes: kotlin.Float? = null,

    /* An array of objects which define the line items of the credit */
    @Json(name = "line_items")
    val lineItems: kotlin.collections.List<InvoiceItem>? = null,

    /* The total amount of the credit */
    @Json(name = "amount")
    val amount: kotlin.Float? = null,

    /* The outstanding balance of the credit */
    @Json(name = "balance")
    val balance: kotlin.Float? = null,

    /* The total amount paid to date for the credit */
    @Json(name = "paid_to_date")
    val paidToDate: kotlin.Float? = null,

    /* The discount applied to the credit */
    @Json(name = "discount")
    val discount: kotlin.Float? = null,

    /* The partial amount applied to the credit */
    @Json(name = "partial")
    val partial: kotlin.Float? = null,

    /* Indicates whether the discount applied is a fixed amount or a percentage */
    @Json(name = "is_amount_discount")
    val isAmountDiscount: kotlin.Boolean? = null,

    /* Indicates whether the credit has been deleted */
    @Json(name = "is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Indicates whether the tax rates applied to the credit are inclusive or exclusive */
    @Json(name = "uses_inclusive_taxes")
    val usesInclusiveTaxes: kotlin.Boolean? = null,

    /* The date the credit was issued */
    @Json(name = "date")
    val date: java.time.LocalDate? = null,

    /* The date the credit was last sent out */
    @Json(name = "last_sent_date")
    val lastSentDate: java.time.LocalDate? = null,

    /* The next scheduled date for sending a credit reminder */
    @Json(name = "next_send_date")
    val nextSendDate: java.time.LocalDate? = null,

    /* The due date for the partial amount of the credit */
    @Json(name = "partial_due_date")
    val partialDueDate: java.time.LocalDate? = null,

    /* The due date for the total amount of the credit */
    @Json(name = "due_date")
    val dueDate: java.time.LocalDate? = null,

    @Json(name = "settings")
    val settings: CompanySettings? = null,

    /* The timestamp of the last time the credit was viewed */
    @Json(name = "last_viewed")
    val lastViewed: java.math.BigDecimal? = null,

    /* The timestamp of the last time the credit was updated */
    @Json(name = "updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    /* The timestamp of the last time the credit was archived */
    @Json(name = "archived_at")
    val archivedAt: java.math.BigDecimal? = null,

    /* First custom surcharge amount */
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
