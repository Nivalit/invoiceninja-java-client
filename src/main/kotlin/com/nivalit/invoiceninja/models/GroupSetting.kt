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
 * @param id The group setting hashed id
 * @param userId The user hashed id
 * @param companyId The company hashed id
 * @param name The name of the group
 * @param settings The settings object
 */


data class GroupSetting (

    /* The group setting hashed id */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The user hashed id */
    @Json(name = "user_id")
    val userId: kotlin.String? = null,

    /* The company hashed id */
    @Json(name = "company_id")
    val companyId: kotlin.String? = null,

    /* The name of the group */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The settings object */
    @Json(name = "settings")
    val settings: kotlin.Any? = null

)
