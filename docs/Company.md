
# Company

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique hashed identifier for the company |  [optional]
**sizeId** | **kotlin.String** | The unique identifier representing the company&#39;s size category |  [optional]
**industryId** | **kotlin.String** | The unique identifier representing the company&#39;s industry category |  [optional]
**slackWebhookUrl** | **kotlin.String** | The URL for the company&#39;s Slack webhook notifications |  [optional]
**googleAnalyticsKey** | **kotlin.String** | The company&#39;s Google Analytics tracking ID |  [optional]
**portalMode** | **kotlin.String** | The mode determining how client-facing URLs are structured (e.g., subdomain, domain, or iframe) |  [optional]
**subdomain** | **kotlin.String** | The subdomain prefix for the company&#39;s domain (e.g., &#39;acme&#39; in acme.domain.com) |  [optional]
**portalDomain** | **kotlin.String** | The fully qualified domain used for client-facing URLs |  [optional]
**enabledTaxRates** | **kotlin.Int** | The number of tax rates used per entity |  [optional]
**fillProducts** | **kotlin.Boolean** | A flag determining whether to auto-fill product descriptions based on the product key |  [optional]
**convertProducts** | **kotlin.Boolean** | A flag determining whether to convert products between different types or units |  [optional]
**updateProducts** | **kotlin.Boolean** | A flag determining whether to update product descriptions when the description changes |  [optional]
**showProductDetails** | **kotlin.Boolean** | A flag determining whether to display product details in the user interface |  [optional]
**customFields** | [**kotlin.Any**](.md) | A mapping of custom fields for various objects within the company |  [optional]
**enableProductCost** | **kotlin.Boolean** | A flag determining whether to show or hide the product cost field in the user interface |  [optional]
**enableProductQuantity** | **kotlin.Boolean** | A flag determining whether to show or hide the product quantity field in the user interface |  [optional]
**defaultQuantity** | **kotlin.Boolean** | A flag determining whether to use a default quantity for products |  [optional]
**customSurchargeTaxes1** | **kotlin.Boolean** | A flag determining whether to apply taxes on custom surcharge amounts for the first custom surcharge field |  [optional]
**customSurchargeTaxes2** | **kotlin.Boolean** | A flag determining whether to apply taxes on custom surcharge amounts for the second custom surcharge field |  [optional]
**customSurchargeTaxes3** | **kotlin.Boolean** | A flag determining whether to apply taxes on custom surcharge amounts for the third custom surcharge field |  [optional]
**customSurchargeTaxes4** | [**kotlin.Any**](.md) | A flag determining whether to apply taxes on custom surcharge amounts for the fourth custom |  [optional]
**logo** | [**java.io.File**](java.io.File.md) | The company logo file in binary format |  [optional]
**settings** | [**CompanySettings**](CompanySettings.md) |  |  [optional]



