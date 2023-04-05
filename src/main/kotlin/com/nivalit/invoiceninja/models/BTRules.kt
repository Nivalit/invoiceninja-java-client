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
 * @param dataKey The key to search
 * @param `operator` The operator flag of the search
 * @param `value` The value to search for
 */


data class BTRules (

    /* The key to search */
    @Json(name = "data_key")
    val dataKey: kotlin.String? = null,

    /* The operator flag of the search */
    @Json(name = "operator")
    val `operator`: kotlin.String? = null,

    /* The value to search for */
    @Json(name = "value")
    val `value`: kotlin.String? = null

)
