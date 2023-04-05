
# Subscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Unique identifier for the subscription |  [optional]
**userId** | **kotlin.String** | Unique identifier for the user associated with the subscription |  [optional]
**productId** | **kotlin.String** | Unique identifier for the product associated with the subscription |  [optional]
**companyId** | **kotlin.String** | Unique identifier for the company associated with the subscription |  [optional]
**recurringInvoiceId** | **kotlin.String** | Unique identifier for the recurring invoice associated with the subscription |  [optional]
**isRecurring** | **kotlin.Boolean** | Indicates whether the subscription is recurring |  [optional]
**frequencyId** | **kotlin.String** | integer const representation of the frequency |  [optional]
**autoBill** | **kotlin.String** | enum setting |  [optional]
**promoCode** | **kotlin.String** | Promotional code applied to the subscription |  [optional]
**promoDiscount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Discount percentage or amount applied to the subscription |  [optional]
**isAmountDiscount** | **kotlin.Boolean** | Indicates whether the discount is a fixed amount |  [optional]
**allowCancellation** | **kotlin.Boolean** | Indicates whether the subscription can be cancelled |  [optional]
**perSeatEnabled** | **kotlin.Boolean** | Indicates whether the subscription pricing is per seat |  [optional]
**currencyId** | **kotlin.String** | Unique identifier for the currency used in the subscription |  [optional]
**maxSeatsLimit** | **kotlin.Int** | Maximum number of seats allowed for the subscription |  [optional]
**trialEnabled** | **kotlin.Boolean** | Indicates whether the subscription has a trial period |  [optional]
**trialDuration** | **kotlin.Int** | Duration of the trial period in days |  [optional]
**allowQueryOverrides** | **kotlin.Boolean** | Indicates whether query overrides are allowed for the subscription |  [optional]
**allowPlanChanges** | **kotlin.Boolean** | Indicates whether plan changes are allowed for the subscription |  [optional]
**refundPeriod** | **kotlin.Int** | Number of days within which refunds can be requested |  [optional]
**webhookConfiguration** | **kotlin.String** | Webhook configuration for the subscription |  [optional]
**isDeleted** | **kotlin.Boolean** | Indicates whether the subscription has been deleted |  [optional]
**archivedAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp |  [optional]
**createdAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp |  [optional]
**updatedAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp |  [optional]



