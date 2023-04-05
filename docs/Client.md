
# Client

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier of the client |  [optional]
**userId** | **kotlin.String** | The unique identifier of the user who created the client |  [optional]
**companyId** | **kotlin.String** | The unique identifier of the company the client belongs to |  [optional]
**contacts** | [**kotlin.collections.List&lt;ClientContact&gt;**](ClientContact.md) |  |  [optional]
**name** | **kotlin.String** | The name of the client company or organization |  [optional]
**website** | **kotlin.String** | The website URL of the client company or organization |  [optional]
**privateNotes** | **kotlin.String** | Notes that are only visible to the user who created the client |  [optional]
**clientHash** | **kotlin.String** | A unique hash value for the client |  [optional]
**industryId** | **kotlin.String** | The unique identifier of the industry the client operates in |  [optional]
**sizeId** | **kotlin.String** | The unique identifier for the size category of the client company or organization |  [optional]
**address1** | **kotlin.String** | First line of the client&#39;s address |  [optional]
**address2** | **kotlin.String** | Second line of the client&#39;s address, if needed |  [optional]
**city** | **kotlin.String** | The city the client is located in |  [optional]
**state** | **kotlin.String** | The state, province, or locality the client is located in |  [optional]
**postalCode** | **kotlin.String** | The postal code or ZIP code of the client |  [optional]
**phone** | **kotlin.String** | The client&#39;s phone number |  [optional]
**countryId** | **kotlin.String** | The unique identifier of the client&#39;s country |  [optional]
**customValue1** | **kotlin.String** | A custom field for storing additional information |  [optional]
**customValue2** | **kotlin.String** | A custom field for storing additional information |  [optional]
**customValue3** | **kotlin.String** | A custom field for storing additional information |  [optional]
**customValue4** | **kotlin.String** | A custom field for storing additional information |  [optional]
**vatNumber** | **kotlin.String** | The client&#39;s VAT (Value Added Tax) number, if applicable |  [optional]
**idNumber** | **kotlin.String** | A unique identification number for the client, such as a tax ID or business registration number |  [optional]
**number** | **kotlin.String** | A system-assigned unique number for the client, typically used for invoicing purposes |  [optional]
**shippingAddress1** | **kotlin.String** | First line of the client&#39;s shipping address |  [optional]
**shippingAddress2** | **kotlin.String** | Second line of the client&#39;s shipping address, if needed |  [optional]
**shippingCity** | **kotlin.String** | The city of the client&#39;s shipping address |  [optional]
**shippingState** | **kotlin.String** | The state, province, or locality of the client&#39;s shipping address |  [optional]
**shippingPostalCode** | **kotlin.String** | The postal code or ZIP code of the client&#39;s shipping address |  [optional]
**shippingCountryId** | **kotlin.String** | The unique identifier of the country for the client&#39;s shipping address |  [optional]
**isDeleted** | **kotlin.Boolean** | A boolean value indicating whether the client has been deleted or not |  [optional]
**balance** | **kotlin.Float** | The outstanding balance the client owes |  [optional]
**paidToDate** | **kotlin.Float** | The total amount the client has paid to date |  [optional]
**creditBalance** | **kotlin.Float** | The available credit balance for the client to use on future purchases |  [optional]
**lastLogin** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The timestamp of the client&#39;s last login |  [optional]
**createdAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The timestamp when the client was created |  [optional]
**updatedAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The timestamp when the client was last updated |  [optional]
**settings** | [**CompanySettings**](CompanySettings.md) |  |  [optional]



