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
 * @param id The design hashed id
 * @param name The design name
 * @param design The design HTML
 * @param isCustom Flag to determine if the design is a custom user design
 * @param isActive Flag to determine if the design is available for use
 * @param isDeleted Flag to determine if the design is deleted
 * @param createdAt Timestamp
 * @param updatedAt Timestamp
 * @param deletedAt Timestamp
 */


data class Design (

    /* The design hashed id */
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    /* The design name */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The design HTML */
    @field:JsonProperty("design")
    val design: kotlin.String? = null,

    /* Flag to determine if the design is a custom user design */
    @field:JsonProperty("is_custom")
    val isCustom: kotlin.Boolean? = null,

    /* Flag to determine if the design is available for use */
    @field:JsonProperty("is_active")
    val isActive: kotlin.Boolean? = null,

    /* Flag to determine if the design is deleted */
    @field:JsonProperty("is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Timestamp */
    @field:JsonProperty("created_at")
    val createdAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @field:JsonProperty("updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @field:JsonProperty("deleted_at")
    val deletedAt: java.math.BigDecimal? = null

)

