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
 * @param id The hashed id of the vendor contact
 * @param userId The hashed id of the user id
 * @param companyId The hashed id of the company
 * @param vendorId The hashed id of the vendor
 * @param firstName The first name of the contact
 * @param lastName The last name of the contact
 * @param phone The contacts phone number
 * @param customValue1 A custom value
 * @param customValue2 A custom value
 * @param customValue3 A custom value
 * @param customValue4 A custom value
 * @param email The contact email address
 * @param isPrimary Boolean flag determining if the contact is the primary contact for the vendor
 * @param createdAt Timestamp
 * @param updatedAt Timestamp
 * @param deletedAt Timestamp
 */


data class VendorContact (

    /* The hashed id of the vendor contact */
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    /* The hashed id of the user id */
    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    /* The hashed id of the company */
    @field:JsonProperty("company_id")
    val companyId: kotlin.String? = null,

    /* The hashed id of the vendor */
    @field:JsonProperty("vendor_id")
    val vendorId: kotlin.String? = null,

    /* The first name of the contact */
    @field:JsonProperty("first_name")
    val firstName: kotlin.String? = null,

    /* The last name of the contact */
    @field:JsonProperty("last_name")
    val lastName: kotlin.String? = null,

    /* The contacts phone number */
    @field:JsonProperty("phone")
    val phone: kotlin.String? = null,

    /* A custom value */
    @field:JsonProperty("custom_value1")
    val customValue1: kotlin.String? = null,

    /* A custom value */
    @field:JsonProperty("custom_value2")
    val customValue2: kotlin.String? = null,

    /* A custom value */
    @field:JsonProperty("custom_value3")
    val customValue3: kotlin.String? = null,

    /* A custom value */
    @field:JsonProperty("custom_value4")
    val customValue4: kotlin.String? = null,

    /* The contact email address */
    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    /* Boolean flag determining if the contact is the primary contact for the vendor */
    @field:JsonProperty("is_primary")
    val isPrimary: kotlin.Boolean? = null,

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

