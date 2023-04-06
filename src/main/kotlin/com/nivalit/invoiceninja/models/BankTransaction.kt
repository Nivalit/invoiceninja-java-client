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
 * @param id The bank integration hashed id
 * @param companyId The company hashed id
 * @param userId The user hashed id
 * @param transactionId The id of the transaction rule
 * @param amount The transaction amount
 * @param currencyId The currency ID of the currency
 * @param accountType The account type
 * @param description The description of the transaction
 * @param categoryId The category id
 * @param categoryType The category description
 * @param baseType Either CREDIT or DEBIT
 * @param date The date of the transaction
 * @param bankAccountId The ID number of the bank account
 */


data class BankTransaction (

    /* The bank integration hashed id */
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    /* The company hashed id */
    @field:JsonProperty("company_id")
    val companyId: kotlin.String? = null,

    /* The user hashed id */
    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    /* The id of the transaction rule */
    @field:JsonProperty("transaction_id")
    val transactionId: kotlin.Int? = null,

    /* The transaction amount */
    @field:JsonProperty("amount")
    val amount: java.math.BigDecimal? = null,

    /* The currency ID of the currency */
    @field:JsonProperty("currency_id")
    val currencyId: kotlin.String? = null,

    /* The account type */
    @field:JsonProperty("account_type")
    val accountType: kotlin.String? = null,

    /* The description of the transaction */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The category id */
    @field:JsonProperty("category_id")
    val categoryId: kotlin.String? = null,

    /* The category description */
    @field:JsonProperty("category_type")
    val categoryType: kotlin.String? = null,

    /* Either CREDIT or DEBIT */
    @field:JsonProperty("base_type")
    val baseType: kotlin.String? = null,

    /* The date of the transaction */
    @field:JsonProperty("date")
    val date: kotlin.String? = null,

    /* The ID number of the bank account */
    @field:JsonProperty("bank_account_id")
    val bankAccountId: kotlin.String? = null

)

