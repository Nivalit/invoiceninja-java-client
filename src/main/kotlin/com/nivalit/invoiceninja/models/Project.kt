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
 * @param id The project hashed id
 * @param userId The user hashed id
 * @param name The name of the project
 * @param taskRate The default rate per task for the project
 * @param budgetedHours The number of budgeted hours for the project
 * @param isDeleted A flag indicating if the project is deleted
 * @param color The color associated with the project
 * @param companyId The hashed id of the company
 * @param assignedUserId The assigned user identifier associated with the project
 * @param clientId The client identifier associated with the project
 * @param dueDate The due date for the project
 * @param privateNotes Private notes associated with the project
 * @param customValue1 Custom value field 1
 * @param customValue2 Custom value field 2
 * @param customValue3 Custom value field 3
 * @param customValue4 Custom value field 4
 * @param createdAt The timestamp of the project creation
 * @param updatedAt The timestamp of the last project update
 * @param archivedAt The timestamp of the project deletion
 * @param publicNotes Public notes associated with the project
 * @param number The project number
 */


data class Project (

    /* The project hashed id */
    @field:JsonProperty("id")
    val id: kotlin.String,

    /* The user hashed id */
    @field:JsonProperty("user_id")
    val userId: kotlin.String,

    /* The name of the project */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* The default rate per task for the project */
    @field:JsonProperty("task_rate")
    val taskRate: kotlin.Float,

    /* The number of budgeted hours for the project */
    @field:JsonProperty("budgeted_hours")
    val budgetedHours: kotlin.Float,

    /* A flag indicating if the project is deleted */
    @field:JsonProperty("is_deleted")
    val isDeleted: kotlin.Boolean,

    /* The color associated with the project */
    @field:JsonProperty("color")
    val color: kotlin.String,

    /* The hashed id of the company */
    @field:JsonProperty("company_id")
    val companyId: kotlin.String,

    /* The assigned user identifier associated with the project */
    @field:JsonProperty("assigned_user_id")
    val assignedUserId: kotlin.String? = null,

    /* The client identifier associated with the project */
    @field:JsonProperty("client_id")
    val clientId: kotlin.String? = null,

    /* The due date for the project */
    @field:JsonProperty("due_date")
    val dueDate: java.time.LocalDate? = null,

    /* Private notes associated with the project */
    @field:JsonProperty("private_notes")
    val privateNotes: kotlin.String? = null,

    /* Custom value field 1 */
    @field:JsonProperty("custom_value1")
    val customValue1: kotlin.String? = null,

    /* Custom value field 2 */
    @field:JsonProperty("custom_value2")
    val customValue2: kotlin.String? = null,

    /* Custom value field 3 */
    @field:JsonProperty("custom_value3")
    val customValue3: kotlin.String? = null,

    /* Custom value field 4 */
    @field:JsonProperty("custom_value4")
    val customValue4: kotlin.String? = null,

    /* The timestamp of the project creation */
    @field:JsonProperty("created_at")
    val createdAt: java.math.BigDecimal? = null,

    /* The timestamp of the last project update */
    @field:JsonProperty("updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    /* The timestamp of the project deletion */
    @field:JsonProperty("archived_at")
    val archivedAt: java.math.BigDecimal? = null,

    /* Public notes associated with the project */
    @field:JsonProperty("public_notes")
    val publicNotes: kotlin.String? = null,

    /* The project number */
    @field:JsonProperty("number")
    val number: kotlin.String? = null

)

