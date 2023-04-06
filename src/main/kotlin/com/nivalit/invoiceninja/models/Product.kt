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
 * @param id The hashed product ID.
 * @param companyId The hashed ID of the company that owns this product.
 * @param userId The hashed ID of the user that created this product.
 * @param assignedUserId The hashed ID of the user assigned to this product.
 * @param projectId The hashed ID of the project that this product is associated with.
 * @param vendorId The hashed ID of the vendor that this product is associated with.
 * @param customValue1 Custom value field 1.
 * @param customValue2 Custom value field 2.
 * @param customValue3 Custom value field 3.
 * @param customValue4 Custom value field 4.
 * @param productKey The product key.
 * @param notes Notes about the product.
 * @param cost The cost of the product.
 * @param price The price of the product.
 * @param quantity The quantity of the product.
 * @param taxName1 The name of tax 1.
 * @param taxRate1 The rate of tax 1.
 * @param taxName2 The name of tax 2.
 * @param taxRate2 The rate of tax 2.
 * @param taxName3 The name of tax 3.
 * @param taxRate3 The rate of tax 3.
 * @param archivedAt The timestamp when the product was archived.
 * @param createdAt The timestamp when the product was created.
 * @param updatedAt Timestamp
 * @param isDeleted Boolean flag determining if the product has been deleted
 * @param inStockQuantity The quantity of the product that is currently in stock
 * @param stockNotification Indicates whether stock notifications are enabled for this product
 * @param stockNotificationThreshold The minimum quantity threshold for which stock notifications will be triggered
 * @param maxQuantity The maximum quantity that can be ordered for this product
 * @param productImage The URL of the product image
 */


data class Product (

    /* The hashed product ID. */
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    /* The hashed ID of the company that owns this product. */
    @field:JsonProperty("company_id")
    val companyId: kotlin.String? = null,

    /* The hashed ID of the user that created this product. */
    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    /* The hashed ID of the user assigned to this product. */
    @field:JsonProperty("assigned_user_id")
    val assignedUserId: kotlin.String? = null,

    /* The hashed ID of the project that this product is associated with. */
    @field:JsonProperty("project_id")
    val projectId: kotlin.String? = null,

    /* The hashed ID of the vendor that this product is associated with. */
    @field:JsonProperty("vendor_id")
    val vendorId: kotlin.String? = null,

    /* Custom value field 1. */
    @field:JsonProperty("custom_value1")
    val customValue1: kotlin.String? = null,

    /* Custom value field 2. */
    @field:JsonProperty("custom_value2")
    val customValue2: kotlin.String? = null,

    /* Custom value field 3. */
    @field:JsonProperty("custom_value3")
    val customValue3: kotlin.String? = null,

    /* Custom value field 4. */
    @field:JsonProperty("custom_value4")
    val customValue4: kotlin.String? = null,

    /* The product key. */
    @field:JsonProperty("product_key")
    val productKey: kotlin.String? = null,

    /* Notes about the product. */
    @field:JsonProperty("notes")
    val notes: kotlin.String? = null,

    /* The cost of the product. */
    @field:JsonProperty("cost")
    val cost: kotlin.Float? = null,

    /* The price of the product. */
    @field:JsonProperty("price")
    val price: kotlin.Float? = null,

    /* The quantity of the product. */
    @field:JsonProperty("quantity")
    val quantity: kotlin.Float? = null,

    /* The name of tax 1. */
    @field:JsonProperty("tax_name1")
    val taxName1: kotlin.String? = null,

    /* The rate of tax 1. */
    @field:JsonProperty("tax_rate1")
    val taxRate1: kotlin.Float? = null,

    /* The name of tax 2. */
    @field:JsonProperty("tax_name2")
    val taxName2: kotlin.String? = null,

    /* The rate of tax 2. */
    @field:JsonProperty("tax_rate2")
    val taxRate2: kotlin.Float? = null,

    /* The name of tax 3. */
    @field:JsonProperty("tax_name3")
    val taxName3: kotlin.String? = null,

    /* The rate of tax 3. */
    @field:JsonProperty("tax_rate3")
    val taxRate3: kotlin.Float? = null,

    /* The timestamp when the product was archived. */
    @field:JsonProperty("archived_at")
    val archivedAt: kotlin.Int? = null,

    /* The timestamp when the product was created. */
    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int? = null,

    /* Timestamp */
    @field:JsonProperty("updated_at")
    val updatedAt: kotlin.Int? = null,

    /* Boolean flag determining if the product has been deleted */
    @field:JsonProperty("is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    /* The quantity of the product that is currently in stock */
    @field:JsonProperty("in_stock_quantity")
    val inStockQuantity: kotlin.Int? = 0,

    /* Indicates whether stock notifications are enabled for this product */
    @field:JsonProperty("stock_notification")
    val stockNotification: kotlin.Boolean? = true,

    /* The minimum quantity threshold for which stock notifications will be triggered */
    @field:JsonProperty("stock_notification_threshold")
    val stockNotificationThreshold: kotlin.Int? = 0,

    /* The maximum quantity that can be ordered for this product */
    @field:JsonProperty("max_quantity")
    val maxQuantity: kotlin.Int? = null,

    /* The URL of the product image */
    @field:JsonProperty("product_image")
    val productImage: kotlin.String? = null

)

