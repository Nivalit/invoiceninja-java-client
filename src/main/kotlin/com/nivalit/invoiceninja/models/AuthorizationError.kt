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

import com.nivalit.invoiceninja.models.ValidationErrorErrors

import com.squareup.moshi.Json

/**
 * 
 *
 * @param message Insufficient permissions for this resource.
 * @param errors 
 */


data class AuthorizationError (

    /* Insufficient permissions for this resource. */
    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "errors")
    val errors: ValidationErrorErrors? = null

)

