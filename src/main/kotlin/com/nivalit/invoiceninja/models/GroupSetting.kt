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
 * @param id The group setting hashed id
 * @param userId The user hashed id
 * @param companyId The company hashed id
 * @param name The name of the group
 * @param settings The settings object
 */


data class GroupSetting (

    /* The group setting hashed id */
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    /* The user hashed id */
    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    /* The company hashed id */
    @field:JsonProperty("company_id")
    val companyId: kotlin.String? = null,

    /* The name of the group */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The settings object */
    @field:JsonProperty("settings")
    val settings: kotlin.Any? = null

)

