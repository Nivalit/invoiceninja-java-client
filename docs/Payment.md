
# Payment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The payment hashed id |  [optional]
**clientId** | **kotlin.String** | The client hashed id |  [optional]
**invitationId** | **kotlin.String** | The invitation hashed id |  [optional]
**clientContactId** | **kotlin.String** | The client contact hashed id |  [optional]
**userId** | **kotlin.String** | The user hashed id |  [optional]
**typeId** | **kotlin.String** | The Payment Type ID |  [optional]
**date** | **kotlin.String** | The Payment date |  [optional]
**transactionReference** | **kotlin.String** | The transaction reference as defined by the payment gateway |  [optional]
**assignedUserId** | **kotlin.String** | The assigned user hashed id |  [optional]
**privateNotes** | **kotlin.String** | The private notes of the payment |  [optional]
**isManual** | **kotlin.Boolean** | Flags whether the payment was made manually or processed via a gateway |  [optional]
**isDeleted** | **kotlin.Boolean** | Defines if the payment has been deleted |  [optional]
**amount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The amount of this payment |  [optional]
**refunded** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The refunded amount of this payment |  [optional]
**updatedAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp |  [optional]
**archivedAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp |  [optional]
**companyGatewayId** | **kotlin.String** | The company gateway id |  [optional]
**paymentables** | [**Paymentable**](Paymentable.md) |  |  [optional]
**invoices** | [**kotlin.collections.List&lt;InvoicePaymentable&gt;**](InvoicePaymentable.md) |  |  [optional]
**credits** | [**kotlin.collections.List&lt;CreditPaymentable&gt;**](CreditPaymentable.md) |  |  [optional]
**number** | **kotlin.String** | The payment number - is a unique alpha numeric number per payment per company |  [optional]



