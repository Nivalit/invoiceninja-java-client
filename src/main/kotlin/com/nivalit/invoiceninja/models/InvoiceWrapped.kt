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

import com.nivalit.invoiceninja.models.Invoice

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param `data` 
 */


data class InvoiceWrapped (

    @field:JsonProperty("data")
    val `data`: Invoice? = null

)
