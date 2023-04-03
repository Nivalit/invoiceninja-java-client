# CompanyGatewaysApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCompanyGateways**](CompanyGatewaysApi.md#bulkCompanyGateways) | **POST** /api/v1/company_gateways/bulk | Performs bulk actions on an array of company_gateways
[**deleteCompanyGateway**](CompanyGatewaysApi.md#deleteCompanyGateway) | **DELETE** /api/v1/company_gateways/{id} | Deletes a CompanyGateway
[**editCompanyGateway**](CompanyGatewaysApi.md#editCompanyGateway) | **GET** /api/v1/company_gateways/{id}/edit | Shows an CompanyGateway for editting
[**getCompanyGateways**](CompanyGatewaysApi.md#getCompanyGateways) | **GET** /api/v1/company_gateways | Gets a list of company_gateways
[**getCompanyGatewaysCreate**](CompanyGatewaysApi.md#getCompanyGatewaysCreate) | **GET** /api/v1/company_gateways/create | Gets a new blank CompanyGateway object
[**showCompanyGateway**](CompanyGatewaysApi.md#showCompanyGateway) | **GET** /api/v1/company_gateways/{id} | Shows an CompanyGateway
[**storeCompanyGateway**](CompanyGatewaysApi.md#storeCompanyGateway) | **POST** /api/v1/company_gateways | Adds a CompanyGateway
[**updateCompanyGateway**](CompanyGatewaysApi.md#updateCompanyGateway) | **PUT** /api/v1/company_gateways/{id} | Updates an CompanyGateway


<a name="bulkCompanyGateways"></a>
# **bulkCompanyGateways**
> CompanyGateway bulkCompanyGateways(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of company_gateways



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyGatewaysApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Array of company gateway IDs
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : CompanyGateway = apiInstance.bulkCompanyGateways(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyGatewaysApi#bulkCompanyGateways")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyGatewaysApi#bulkCompanyGateways")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Array of company gateway IDs |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**CompanyGateway**](CompanyGateway.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCompanyGateway"></a>
# **deleteCompanyGateway**
> deleteCompanyGateway(X_API_TOKEN, xRequestedWith, id, include)

Deletes a CompanyGateway

Handles the deletion of an CompanyGateway by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyGatewaysApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The CompanyGateway Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteCompanyGateway(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling CompanyGatewaysApi#deleteCompanyGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyGatewaysApi#deleteCompanyGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The CompanyGateway Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editCompanyGateway"></a>
# **editCompanyGateway**
> CompanyGateway editCompanyGateway(X_API_TOKEN, xRequestedWith, id, include)

Shows an CompanyGateway for editting

Displays an CompanyGateway by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyGatewaysApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The CompanyGateway Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyGateway = apiInstance.editCompanyGateway(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyGatewaysApi#editCompanyGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyGatewaysApi#editCompanyGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The CompanyGateway Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyGateway**](CompanyGateway.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompanyGateways"></a>
# **getCompanyGateways**
> CompanyGateway getCompanyGateways(X_API_TOKEN, xRequestedWith, include)

Gets a list of company_gateways

Lists company_gateways, search and filters allow fine grained lists to be generated.          Query parameters can be added to performed more fine grained filtering of the company_gateways, these are handled by the CompanyGatewayFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyGatewaysApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyGateway = apiInstance.getCompanyGateways(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyGatewaysApi#getCompanyGateways")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyGatewaysApi#getCompanyGateways")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyGateway**](CompanyGateway.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompanyGatewaysCreate"></a>
# **getCompanyGatewaysCreate**
> CompanyGateway getCompanyGatewaysCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank CompanyGateway object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyGatewaysApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyGateway = apiInstance.getCompanyGatewaysCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyGatewaysApi#getCompanyGatewaysCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyGatewaysApi#getCompanyGatewaysCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyGateway**](CompanyGateway.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showCompanyGateway"></a>
# **showCompanyGateway**
> CompanyGateway showCompanyGateway(X_API_TOKEN, xRequestedWith, id, include)

Shows an CompanyGateway

Displays an CompanyGateway by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyGatewaysApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The CompanyGateway Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyGateway = apiInstance.showCompanyGateway(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyGatewaysApi#showCompanyGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyGatewaysApi#showCompanyGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The CompanyGateway Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyGateway**](CompanyGateway.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeCompanyGateway"></a>
# **storeCompanyGateway**
> CompanyGateway storeCompanyGateway(X_API_TOKEN, xRequestedWith, include)

Adds a CompanyGateway

Adds an CompanyGateway to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyGatewaysApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyGateway = apiInstance.storeCompanyGateway(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyGatewaysApi#storeCompanyGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyGatewaysApi#storeCompanyGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyGateway**](CompanyGateway.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCompanyGateway"></a>
# **updateCompanyGateway**
> CompanyGateway updateCompanyGateway(X_API_TOKEN, xRequestedWith, id, include)

Updates an CompanyGateway

Handles the updating of an CompanyGateway by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyGatewaysApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The CompanyGateway Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyGateway = apiInstance.updateCompanyGateway(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyGatewaysApi#updateCompanyGateway")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyGatewaysApi#updateCompanyGateway")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The CompanyGateway Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyGateway**](CompanyGateway.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

