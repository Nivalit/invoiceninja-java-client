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
 * @param startDate The start date of the statement period - format Y-m-d
 * @param endDate The start date of the statement period - format Y-m-d
 * @param clientId The hashed ID of the client
 * @param showPaymentsTable Flag which determines if the payments table is shown
 * @param showAgingTable Flag which determines if the aging table is shown
 */


data class ClientStatementRequest (

    /* The start date of the statement period - format Y-m-d */
    @Json(name = "start_date")
    val startDate: kotlin.String? = null,

    /* The start date of the statement period - format Y-m-d */
    @Json(name = "end_date")
    val endDate: kotlin.String? = null,

    /* The hashed ID of the client */
    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    /* Flag which determines if the payments table is shown */
    @Json(name = "show_payments_table")
    val showPaymentsTable: kotlin.Boolean? = null,

    /* Flag which determines if the aging table is shown */
    @Json(name = "show_aging_table")
    val showAgingTable: kotlin.Boolean? = null

)
