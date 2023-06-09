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
 * @param message Something terrible went wrong
 * @param code The HTTP error code, ie 5xx 4xx
 */


data class Error (

    /* Something terrible went wrong */
    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    /* The HTTP error code, ie 5xx 4xx */
    @field:JsonProperty("code")
    val code: kotlin.Int? = null

)

