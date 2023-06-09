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

import com.nivalit.invoiceninja.models.ClientContact
import com.nivalit.invoiceninja.models.CompanySettings

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param id The unique identifier of the client
 * @param userId The unique identifier of the user who created the client
 * @param companyId The unique identifier of the company the client belongs to
 * @param contacts 
 * @param name The name of the client company or organization
 * @param website The website URL of the client company or organization
 * @param privateNotes Notes that are only visible to the user who created the client
 * @param clientHash A unique hash value for the client
 * @param industryId The unique identifier of the industry the client operates in
 * @param sizeId The unique identifier for the size category of the client company or organization
 * @param address1 First line of the client's address
 * @param address2 Second line of the client's address, if needed
 * @param city The city the client is located in
 * @param state The state, province, or locality the client is located in
 * @param postalCode The postal code or ZIP code of the client
 * @param phone The client's phone number
 * @param countryId The unique identifier of the client's country
 * @param customValue1 A custom field for storing additional information
 * @param customValue2 A custom field for storing additional information
 * @param customValue3 A custom field for storing additional information
 * @param customValue4 A custom field for storing additional information
 * @param vatNumber The client's VAT (Value Added Tax) number, if applicable
 * @param idNumber A unique identification number for the client, such as a tax ID or business registration number
 * @param number A system-assigned unique number for the client, typically used for invoicing purposes
 * @param shippingAddress1 First line of the client's shipping address
 * @param shippingAddress2 Second line of the client's shipping address, if needed
 * @param shippingCity The city of the client's shipping address
 * @param shippingState The state, province, or locality of the client's shipping address
 * @param shippingPostalCode The postal code or ZIP code of the client's shipping address
 * @param shippingCountryId The unique identifier of the country for the client's shipping address
 * @param isDeleted A boolean value indicating whether the client has been deleted or not
 * @param balance The outstanding balance the client owes
 * @param paidToDate The total amount the client has paid to date
 * @param creditBalance The available credit balance for the client to use on future purchases
 * @param lastLogin The timestamp of the client's last login
 * @param createdAt The timestamp when the client was created
 * @param updatedAt The timestamp when the client was last updated
 * @param settings 
 */


data class Client (

    /* The unique identifier of the client */
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    /* The unique identifier of the user who created the client */
    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    /* The unique identifier of the company the client belongs to */
    @field:JsonProperty("company_id")
    val companyId: kotlin.String? = null,

    @field:JsonProperty("contacts")
    val contacts: kotlin.collections.List<ClientContact>? = null,

    /* The name of the client company or organization */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The website URL of the client company or organization */
    @field:JsonProperty("website")
    val website: kotlin.String? = null,

    /* Notes that are only visible to the user who created the client */
    @field:JsonProperty("private_notes")
    val privateNotes: kotlin.String? = null,

    /* A unique hash value for the client */
    @field:JsonProperty("client_hash")
    val clientHash: kotlin.String? = null,

    /* The unique identifier of the industry the client operates in */
    @field:JsonProperty("industry_id")
    val industryId: kotlin.String? = null,

    /* The unique identifier for the size category of the client company or organization */
    @field:JsonProperty("size_id")
    val sizeId: kotlin.String? = null,

    /* First line of the client's address */
    @field:JsonProperty("address1")
    val address1: kotlin.String? = null,

    /* Second line of the client's address, if needed */
    @field:JsonProperty("address2")
    val address2: kotlin.String? = null,

    /* The city the client is located in */
    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    /* The state, province, or locality the client is located in */
    @field:JsonProperty("state")
    val state: kotlin.String? = null,

    /* The postal code or ZIP code of the client */
    @field:JsonProperty("postal_code")
    val postalCode: kotlin.String? = null,

    /* The client's phone number */
    @field:JsonProperty("phone")
    val phone: kotlin.String? = null,

    /* The unique identifier of the client's country */
    @field:JsonProperty("country_id")
    val countryId: kotlin.String? = null,

    /* A custom field for storing additional information */
    @field:JsonProperty("custom_value1")
    val customValue1: kotlin.String? = null,

    /* A custom field for storing additional information */
    @field:JsonProperty("custom_value2")
    val customValue2: kotlin.String? = null,

    /* A custom field for storing additional information */
    @field:JsonProperty("custom_value3")
    val customValue3: kotlin.String? = null,

    /* A custom field for storing additional information */
    @field:JsonProperty("custom_value4")
    val customValue4: kotlin.String? = null,

    /* The client's VAT (Value Added Tax) number, if applicable */
    @field:JsonProperty("vat_number")
    val vatNumber: kotlin.String? = null,

    /* A unique identification number for the client, such as a tax ID or business registration number */
    @field:JsonProperty("id_number")
    val idNumber: kotlin.String? = null,

    /* A system-assigned unique number for the client, typically used for invoicing purposes */
    @field:JsonProperty("number")
    val number: kotlin.String? = null,

    /* First line of the client's shipping address */
    @field:JsonProperty("shipping_address1")
    val shippingAddress1: kotlin.String? = null,

    /* Second line of the client's shipping address, if needed */
    @field:JsonProperty("shipping_address2")
    val shippingAddress2: kotlin.String? = null,

    /* The city of the client's shipping address */
    @field:JsonProperty("shipping_city")
    val shippingCity: kotlin.String? = null,

    /* The state, province, or locality of the client's shipping address */
    @field:JsonProperty("shipping_state")
    val shippingState: kotlin.String? = null,

    /* The postal code or ZIP code of the client's shipping address */
    @field:JsonProperty("shipping_postal_code")
    val shippingPostalCode: kotlin.String? = null,

    /* The unique identifier of the country for the client's shipping address */
    @field:JsonProperty("shipping_country_id")
    val shippingCountryId: kotlin.String? = null,

    /* A boolean value indicating whether the client has been deleted or not */
    @field:JsonProperty("is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* The outstanding balance the client owes */
    @field:JsonProperty("balance")
    val balance: kotlin.Float? = null,

    /* The total amount the client has paid to date */
    @field:JsonProperty("paid_to_date")
    val paidToDate: kotlin.Float? = null,

    /* The available credit balance for the client to use on future purchases */
    @field:JsonProperty("credit_balance")
    val creditBalance: kotlin.Float? = null,

    /* The timestamp of the client's last login */
    @field:JsonProperty("last_login")
    val lastLogin: java.math.BigDecimal? = null,

    /* The timestamp when the client was created */
    @field:JsonProperty("created_at")
    val createdAt: java.math.BigDecimal? = null,

    /* The timestamp when the client was last updated */
    @field:JsonProperty("updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    @field:JsonProperty("settings")
    val settings: CompanySettings? = null

)

