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
 * @param name The task status name
 * @param createdAt Timestamp
 * @param isDeleted A boolean flag determining if the task status has been deleted
 * @param updatedAt Timestamp
 * @param archivedAt Timestamp
 */


data class TaskStatus (

    /* The task status name */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* Timestamp */
    @field:JsonProperty("created_at")
    val createdAt: java.math.BigDecimal? = null,

    /* A boolean flag determining if the task status has been deleted */
    @field:JsonProperty("is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Timestamp */
    @field:JsonProperty("updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @field:JsonProperty("archived_at")
    val archivedAt: java.math.BigDecimal? = null

)

