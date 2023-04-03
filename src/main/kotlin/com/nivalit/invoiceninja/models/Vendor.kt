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

import com.nivalit.invoiceninja.models.CompanySettings
import com.nivalit.invoiceninja.models.VendorContact

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id The hashed id of the vendor
 * @param userId The hashed id of the user who created the vendor
 * @param assignedUserId The hashed id of the assigned user to this vendor
 * @param companyId The hashed id of the company
 * @param clientId The hashed id of the client
 * @param contacts 
 * @param name The vendor name
 * @param website The website of the vendor
 * @param privateNotes The private notes of the vendor
 * @param industryId The industry id of the vendor
 * @param sizeId ________
 * @param address1 ________
 * @param address2 ________
 * @param city ________
 * @param state ________
 * @param postalCode ________
 * @param phone The client phone number
 * @param countryId ________
 * @param currencyId ________
 * @param customValue1 ________
 * @param customValue2 ________
 * @param customValue3 ________
 * @param customValue4 ________
 * @param vatNumber ________
 * @param idNumber ________
 * @param number ________
 * @param isDeleted ________
 * @param lastLogin Timestamp
 * @param createdAt Timestamp
 * @param updatedAt Timestamp
 * @param settings 
 */


data class Vendor (

    /* The hashed id of the vendor */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The hashed id of the user who created the vendor */
    @Json(name = "user_id")
    val userId: kotlin.String? = null,

    /* The hashed id of the assigned user to this vendor */
    @Json(name = "assigned_user_id")
    val assignedUserId: kotlin.String? = null,

    /* The hashed id of the company */
    @Json(name = "company_id")
    val companyId: kotlin.String? = null,

    /* The hashed id of the client */
    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    @Json(name = "contacts")
    val contacts: kotlin.collections.List<VendorContact>? = null,

    /* The vendor name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* The website of the vendor */
    @Json(name = "website")
    val website: kotlin.String? = null,

    /* The private notes of the vendor */
    @Json(name = "private_notes")
    val privateNotes: kotlin.String? = null,

    /* The industry id of the vendor */
    @Json(name = "industry_id")
    val industryId: kotlin.String? = null,

    /* ________ */
    @Json(name = "size_id")
    val sizeId: kotlin.String? = null,

    /* ________ */
    @Json(name = "address1")
    val address1: kotlin.String? = null,

    /* ________ */
    @Json(name = "address2")
    val address2: kotlin.String? = null,

    /* ________ */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* ________ */
    @Json(name = "state")
    val state: kotlin.String? = null,

    /* ________ */
    @Json(name = "postal_code")
    val postalCode: kotlin.String? = null,

    /* The client phone number */
    @Json(name = "phone")
    val phone: kotlin.String? = null,

    /* ________ */
    @Json(name = "country_id")
    val countryId: kotlin.String? = null,

    /* ________ */
    @Json(name = "currency_id")
    val currencyId: kotlin.String? = null,

    /* ________ */
    @Json(name = "custom_value1")
    val customValue1: kotlin.String? = null,

    /* ________ */
    @Json(name = "custom_value2")
    val customValue2: kotlin.String? = null,

    /* ________ */
    @Json(name = "custom_value3")
    val customValue3: kotlin.String? = null,

    /* ________ */
    @Json(name = "custom_value4")
    val customValue4: kotlin.String? = null,

    /* ________ */
    @Json(name = "vat_number")
    val vatNumber: kotlin.String? = null,

    /* ________ */
    @Json(name = "id_number")
    val idNumber: kotlin.String? = null,

    /* ________ */
    @Json(name = "number")
    val number: kotlin.String? = null,

    /* ________ */
    @Json(name = "is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Timestamp */
    @Json(name = "last_login")
    val lastLogin: java.math.BigDecimal? = null,

    /* Timestamp */
    @Json(name = "created_at")
    val createdAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @Json(name = "updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    @Json(name = "settings")
    val settings: CompanySettings? = null

)

