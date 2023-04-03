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
 * @param id The hashed if of the contact
 * @param userId The hashed id of the user who created the contact
 * @param companyId The hashed id of the company
 * @param clientId The hashed id of the client
 * @param firstName The first name of the contact
 * @param lastName The last name of the contact
 * @param phone The phone number of the contact
 * @param customValue1 A Custom field value
 * @param customValue2 A Custom field value
 * @param customValue3 A Custom field value
 * @param customValue4 A Custom field value
 * @param email The email of the contact
 * @param acceptedTermsVersion The terms of service which the contact has accpeted
 * @param password The hashed password of the contact
 * @param confirmationCode The confirmation code used to authenticate the contacts email address
 * @param token A uuid based token.
 * @param isPrimary Defines is this contact is the primary contact for the client
 * @param confirmed Boolean value confirms the user has confirmed their account.
 * @param isLocked Boolean value defines if the contact has been locked out.
 * @param sendEmail Boolean value determines is this contact should receive emails
 * @param failedLogins The number of failed logins the contact has had
 * @param emailVerifiedAt The date which the contact confirmed their email
 * @param lastLogin Timestamp
 * @param createdAt Timestamp
 * @param updatedAt Timestamp
 * @param deletedAt Timestamp
 */


data class ClientContact (

    /* The hashed if of the contact */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The hashed id of the user who created the contact */
    @Json(name = "user_id")
    val userId: kotlin.String? = null,

    /* The hashed id of the company */
    @Json(name = "company_id")
    val companyId: kotlin.String? = null,

    /* The hashed id of the client */
    @Json(name = "client_id")
    val clientId: kotlin.String? = null,

    /* The first name of the contact */
    @Json(name = "first_name")
    val firstName: kotlin.String? = null,

    /* The last name of the contact */
    @Json(name = "last_name")
    val lastName: kotlin.String? = null,

    /* The phone number of the contact */
    @Json(name = "phone")
    val phone: kotlin.String? = null,

    /* A Custom field value */
    @Json(name = "custom_value1")
    val customValue1: kotlin.String? = null,

    /* A Custom field value */
    @Json(name = "custom_value2")
    val customValue2: kotlin.String? = null,

    /* A Custom field value */
    @Json(name = "custom_value3")
    val customValue3: kotlin.String? = null,

    /* A Custom field value */
    @Json(name = "custom_value4")
    val customValue4: kotlin.String? = null,

    /* The email of the contact */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* The terms of service which the contact has accpeted */
    @Json(name = "accepted_terms_version")
    val acceptedTermsVersion: kotlin.String? = null,

    /* The hashed password of the contact */
    @Json(name = "password")
    val password: kotlin.String? = null,

    /* The confirmation code used to authenticate the contacts email address */
    @Json(name = "confirmation-code")
    val confirmationCode: kotlin.String? = null,

    /* A uuid based token. */
    @Json(name = "token")
    val token: kotlin.String? = null,

    /* Defines is this contact is the primary contact for the client */
    @Json(name = "is_primary")
    val isPrimary: kotlin.Boolean? = null,

    /* Boolean value confirms the user has confirmed their account. */
    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean? = null,

    /* Boolean value defines if the contact has been locked out. */
    @Json(name = "is_locked")
    val isLocked: kotlin.Boolean? = null,

    /* Boolean value determines is this contact should receive emails */
    @Json(name = "send_email")
    val sendEmail: kotlin.Boolean? = null,

    /* The number of failed logins the contact has had */
    @Json(name = "failed_logins")
    val failedLogins: java.math.BigDecimal? = null,

    /* The date which the contact confirmed their email */
    @Json(name = "email_verified_at")
    val emailVerifiedAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @Json(name = "last_login")
    val lastLogin: java.math.BigDecimal? = null,

    /* Timestamp */
    @Json(name = "created_at")
    val createdAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @Json(name = "updated_at")
    val updatedAt: java.math.BigDecimal? = null,

    /* Timestamp */
    @Json(name = "deleted_at")
    val deletedAt: java.math.BigDecimal? = null

)

