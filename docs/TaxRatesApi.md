# TaxRatesApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkTaxRates**](TaxRatesApi.md#bulkTaxRates) | **POST** /api/v1/tax_rates/bulk | Performs bulk actions on an array of TaxRates
[**deleteTaxRate**](TaxRatesApi.md#deleteTaxRate) | **DELETE** /api/v1/tax_rates/{id} | Deletes a TaxRate
[**editTaxRate**](TaxRatesApi.md#editTaxRate) | **GET** /api/v1/tax_rates/{id}/edit | Shows a Tax Rate for editting
[**getTaxRateCreate**](TaxRatesApi.md#getTaxRateCreate) | **GET** /api/v1/tax_rates/create | Gets a new blank Tax Rate object
[**getTaxRates**](TaxRatesApi.md#getTaxRates) | **GET** /api/v1/tax_rates | Gets a list of tax_rates
[**showTaxRate**](TaxRatesApi.md#showTaxRate) | **GET** /api/v1/tax_rates/{id} | Shows a Tax Rate
[**updateTaxRate**](TaxRatesApi.md#updateTaxRate) | **PUT** /api/v1/tax_rates/{id} | Updates a tax rate


<a name="bulkTaxRates"></a>
# **bulkTaxRates**
> Webhook bulkTaxRates(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of TaxRates



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaxRatesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Tax Rates
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : Webhook = apiInstance.bulkTaxRates(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#bulkTaxRates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#bulkTaxRates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Tax Rates |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**Webhook**](Webhook.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTaxRate"></a>
# **deleteTaxRate**
> deleteTaxRate(X_API_TOKEN, xRequestedWith, id)

Deletes a TaxRate

Handles the deletion of an TaxRate by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaxRatesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The TaxRate Hashed ID
try {
    apiInstance.deleteTaxRate(X_API_TOKEN, xRequestedWith, id)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#deleteTaxRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#deleteTaxRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The TaxRate Hashed ID |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editTaxRate"></a>
# **editTaxRate**
> TaxRate editTaxRate(X_API_TOKEN, xRequestedWith, id)

Shows a Tax Rate for editting

Displays a Tax Rate by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaxRatesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The TaxRate Hashed ID
try {
    val result : TaxRate = apiInstance.editTaxRate(X_API_TOKEN, xRequestedWith, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#editTaxRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#editTaxRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The TaxRate Hashed ID |

### Return type

[**TaxRate**](TaxRate.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaxRateCreate"></a>
# **getTaxRateCreate**
> TaxRate getTaxRateCreate(X_API_TOKEN, xRequestedWith)

Gets a new blank Tax Rate object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaxRatesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    val result : TaxRate = apiInstance.getTaxRateCreate(X_API_TOKEN, xRequestedWith)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#getTaxRateCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#getTaxRateCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |

### Return type

[**TaxRate**](TaxRate.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaxRates"></a>
# **getTaxRates**
> TaxRate getTaxRates(index)

Gets a list of tax_rates

Lists tax rates

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaxRatesApi()
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : TaxRate = apiInstance.getTaxRates(index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#getTaxRates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#getTaxRates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**TaxRate**](TaxRate.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showTaxRate"></a>
# **showTaxRate**
> TaxRate showTaxRate(X_API_TOKEN, xRequestedWith, id)

Shows a Tax Rate

Displays an TaxRate by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaxRatesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The TaxRate Hashed ID
try {
    val result : TaxRate = apiInstance.showTaxRate(X_API_TOKEN, xRequestedWith, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#showTaxRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#showTaxRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The TaxRate Hashed ID |

### Return type

[**TaxRate**](TaxRate.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTaxRate"></a>
# **updateTaxRate**
> TaxRate updateTaxRate(X_API_TOKEN, xRequestedWith, id)

Updates a tax rate

Handles the updating of a tax rate by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaxRatesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The TaxRate Hashed ID
try {
    val result : TaxRate = apiInstance.updateTaxRate(X_API_TOKEN, xRequestedWith, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#updateTaxRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#updateTaxRate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The TaxRate Hashed ID |

### Return type

[**TaxRate**](TaxRate.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

