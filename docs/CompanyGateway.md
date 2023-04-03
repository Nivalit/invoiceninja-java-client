
# CompanyGateway

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The hashed id of the company gateway |  [optional]
**companyId** | **kotlin.String** | The company hashed id |  [optional]
**gatewayKey** | **kotlin.String** | The gateway key (hash) |  [optional]
**acceptedCreditCards** | **kotlin.Int** | Bitmask representation of cards |  [optional]
**requireBillingAddress** | **kotlin.Boolean** | Determines if the the billing address is required prior to payment. |  [optional]
**requireShippingAddress** | **kotlin.Boolean** | Determines if the the billing address is required prior to payment. |  [optional]
**config** | **kotlin.String** | The configuration map for the gateway |  [optional]
**updateDetails** | **kotlin.Boolean** | Determines if the client details should be updated. |  [optional]
**feesAndLimits** | [**kotlin.collections.List&lt;FeesAndLimits&gt;**](FeesAndLimits.md) | A mapped collection of the fees and limits for the configured gateway |  [optional]



