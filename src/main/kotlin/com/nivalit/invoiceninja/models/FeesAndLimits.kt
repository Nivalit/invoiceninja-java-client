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
 * @param minLimit The minimum amount accepted for this gateway
 * @param maxLimit The maximum amount accepted for this gateway
 * @param feeAmount The gateway fee amount
 * @param feePercent The gateway fee percentage
 * @param feeTaxName1 Fee tax name
 * @param feeTaxName2 Fee tax name
 * @param feeTaxName3 Fee tax name
 * @param feeTaxRate1 The tax rate
 * @param feeTaxRate2 The tax rate
 * @param feeTaxRate3 The tax rate
 * @param feeCap If set the fee amount will be no higher than this amount
 * @param adjustFeePercent Adjusts the fee to match the exact gateway fee.
 */


data class FeesAndLimits (

    /* The minimum amount accepted for this gateway */
    @Json(name = "min_limit")
    val minLimit: kotlin.String? = null,

    /* The maximum amount accepted for this gateway */
    @Json(name = "max_limit")
    val maxLimit: kotlin.String? = null,

    /* The gateway fee amount */
    @Json(name = "fee_amount")
    val feeAmount: kotlin.Float? = null,

    /* The gateway fee percentage */
    @Json(name = "fee_percent")
    val feePercent: kotlin.Float? = null,

    /* Fee tax name */
    @Json(name = "fee_tax_name1")
    val feeTaxName1: kotlin.String? = null,

    /* Fee tax name */
    @Json(name = "fee_tax_name2")
    val feeTaxName2: kotlin.String? = null,

    /* Fee tax name */
    @Json(name = "fee_tax_name3")
    val feeTaxName3: kotlin.String? = null,

    /* The tax rate */
    @Json(name = "fee_tax_rate1")
    val feeTaxRate1: kotlin.Float? = null,

    /* The tax rate */
    @Json(name = "fee_tax_rate2")
    val feeTaxRate2: kotlin.Float? = null,

    /* The tax rate */
    @Json(name = "fee_tax_rate3")
    val feeTaxRate3: kotlin.Float? = null,

    /* If set the fee amount will be no higher than this amount */
    @Json(name = "fee_cap")
    val feeCap: kotlin.Float? = null,

    /* Adjusts the fee to match the exact gateway fee. */
    @Json(name = "adjust_fee_percent")
    val adjustFeePercent: kotlin.Boolean? = null

)

