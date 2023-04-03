# TokensApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkTokens**](TokensApi.md#bulkTokens) | **POST** /api/v1/tokens/bulk | Performs bulk actions on an array of tokens
[**deleteToken**](TokensApi.md#deleteToken) | **DELETE** /api/v1/tokens/{id} | Deletes a token
[**editToken**](TokensApi.md#editToken) | **GET** /api/v1/tokens/{id}/edit | Shows a token for editting
[**getTokens**](TokensApi.md#getTokens) | **GET** /api/v1/tokens | Gets a list of company tokens
[**getTokensCreate**](TokensApi.md#getTokensCreate) | **GET** /api/v1/tokens/create | Gets a new blank token object
[**showToken**](TokensApi.md#showToken) | **GET** /api/v1/tokens/{id} | Shows a token
[**storeToken**](TokensApi.md#storeToken) | **POST** /api/v1/tokens | Adds a token
[**updateToken**](TokensApi.md#updateToken) | **PUT** /api/v1/tokens/{id} | Updates a token


<a name="bulkTokens"></a>
# **bulkTokens**
> CompanyToken bulkTokens(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of tokens



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TokensApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Token ids
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : CompanyToken = apiInstance.bulkTokens(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#bulkTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#bulkTokens")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Token ids |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**CompanyToken**](CompanyToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(X_API_TOKEN, xRequestedWith, id, include)

Deletes a token

Handles the deletion of a token by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TokensApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Token Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteToken(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#deleteToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#deleteToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Token Hashed ID |
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

<a name="editToken"></a>
# **editToken**
> CompanyToken editToken(X_API_TOKEN, xRequestedWith, id, include)

Shows a token for editting

Displays a token by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TokensApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Token Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyToken = apiInstance.editToken(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#editToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#editToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Token Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyToken**](CompanyToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokens"></a>
# **getTokens**
> CompanyToken getTokens(X_API_TOKEN, xRequestedWith, include, index)

Gets a list of company tokens

Lists company tokens.      *      *   Query parameters can be added to performed more fine grained filtering of the tokens, these are handled by the TokenFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TokensApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : CompanyToken = apiInstance.getTokens(X_API_TOKEN, xRequestedWith, include, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#getTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#getTokens")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**CompanyToken**](CompanyToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokensCreate"></a>
# **getTokensCreate**
> CompanyToken getTokensCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank token object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TokensApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyToken = apiInstance.getTokensCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#getTokensCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#getTokensCreate")
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

[**CompanyToken**](CompanyToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showToken"></a>
# **showToken**
> CompanyToken showToken(X_API_TOKEN, xRequestedWith, id, include)

Shows a token

Displays a token by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TokensApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Token Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyToken = apiInstance.showToken(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#showToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#showToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Token Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyToken**](CompanyToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeToken"></a>
# **storeToken**
> CompanyToken storeToken(X_API_TOKEN, xRequestedWith, include)

Adds a token

Adds an token to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TokensApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyToken = apiInstance.storeToken(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#storeToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#storeToken")
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

[**CompanyToken**](CompanyToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateToken"></a>
# **updateToken**
> CompanyToken updateToken(X_API_TOKEN, xRequestedWith, id, include)

Updates a token

Handles the updating of a token by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TokensApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Token Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyToken = apiInstance.updateToken(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TokensApi#updateToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TokensApi#updateToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Token Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**CompanyToken**](CompanyToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

