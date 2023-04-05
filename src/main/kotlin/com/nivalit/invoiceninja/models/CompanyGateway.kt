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

import com.nivalit.invoiceninja.models.FeesAndLimits

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id The hashed id of the company gateway
 * @param companyId The company hashed id
 * @param gatewayKey The gateway key (hash)
 * @param acceptedCreditCards Bitmask representation of cards
 * @param requireBillingAddress Determines if the the billing address is required prior to payment.
 * @param requireShippingAddress Determines if the the billing address is required prior to payment.
 * @param config The configuration map for the gateway
 * @param updateDetails Determines if the client details should be updated.
 * @param feesAndLimits A mapped collection of the fees and limits for the configured gateway
 */


data class CompanyGateway (

    /* The hashed id of the company gateway */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The company hashed id */
    @Json(name = "company_id")
    val companyId: kotlin.String? = null,

    /* The gateway key (hash) */
    @Json(name = "gateway_key")
    val gatewayKey: kotlin.String? = null,

    /* Bitmask representation of cards */
    @Json(name = "accepted_credit_cards")
    val acceptedCreditCards: kotlin.Int? = null,

    /* Determines if the the billing address is required prior to payment. */
    @Json(name = "require_billing_address")
    val requireBillingAddress: kotlin.Boolean? = null,

    /* Determines if the the billing address is required prior to payment. */
    @Json(name = "require_shipping_address")
    val requireShippingAddress: kotlin.Boolean? = null,

    /* The configuration map for the gateway */
    @Json(name = "config")
    val config: kotlin.String? = null,

    /* Determines if the client details should be updated. */
    @Json(name = "update_details")
    val updateDetails: kotlin.Boolean? = null,

    /* A mapped collection of the fees and limits for the configured gateway */
    @Json(name = "fees_and_limits")
    val feesAndLimits: kotlin.collections.List<FeesAndLimits>? = null

)
