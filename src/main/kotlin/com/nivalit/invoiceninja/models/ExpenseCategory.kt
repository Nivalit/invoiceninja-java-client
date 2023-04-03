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
 * @param id The expense hashed id
 * @param name The expense category name
 * @param userId The user hashed id
 * @param isDeleted Flag determining whether the expense category has been deleted
 * @param updatedAt The updated at timestamp
 * @param createdAt The created at timestamp
 */


data class ExpenseCategory (

    /* The expense hashed id */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The expense category name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The user hashed id */
    @Json(name = "user_id")
    val userId: kotlin.String? = null,

    /* Flag determining whether the expense category has been deleted */
    @Json(name = "is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* The updated at timestamp */
    @Json(name = "updated_at")
    val updatedAt: kotlin.Int? = null,

    /* The created at timestamp */
    @Json(name = "created_at")
    val createdAt: kotlin.Int? = null

)

