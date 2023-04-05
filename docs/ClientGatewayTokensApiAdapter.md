# ClientGatewayTokensApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteClientGatewayToken**](ClientGatewayTokensApiAdapter.md#deleteClientGatewayToken) | **DELETE** /api/v1/client_gateway_tokens/{id} | Deletes a client
[**editClientGatewayToken**](ClientGatewayTokensApiAdapter.md#editClientGatewayToken) | **GET** /api/v1/client_gateway_tokens/{id}/edit | Shows a client for editting
[**getClientGatewayTokens**](ClientGatewayTokensApiAdapter.md#getClientGatewayTokens) | **GET** /api/v1/client_gateway_tokens | List of client tokens
[**getClientGatewayTokensCreate**](ClientGatewayTokensApiAdapter.md#getClientGatewayTokensCreate) | **GET** /api/v1/client_gateway_tokens/create | Gets a new blank client object
[**showClientGatewayToken**](ClientGatewayTokensApiAdapter.md#showClientGatewayToken) | **GET** /api/v1/client_gateway_tokens/{id} | Shows a client
[**storeClientGatewayToken**](ClientGatewayTokensApiAdapter.md#storeClientGatewayToken) | **POST** /api/v1/client_gateway_tokens | Adds a client
[**updateClientGatewayToken**](ClientGatewayTokensApiAdapter.md#updateClientGatewayToken) | **PUT** /api/v1/client_gateway_tokens/{id} | Updates a client


<a name="deleteClientGatewayToken"></a>
# **deleteClientGatewayToken**
> deleteClientGatewayToken(X_API_TOKEN, xRequestedWith, id, include)

Deletes a client

Handles the deletion of a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientGatewayTokensApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The ClientGatewayToken Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteClientGatewayToken(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling ClientGatewayTokensApiAdapter#deleteClientGatewayToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientGatewayTokensApiAdapter#deleteClientGatewayToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The ClientGatewayToken Hashed ID |
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

<a name="editClientGatewayToken"></a>
# **editClientGatewayToken**
> ClientGatewayToken editClientGatewayToken(X_API_TOKEN, xRequestedWith, id, include)

Shows a client for editting

Displays a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientGatewayTokensApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The ClientGatewayToken Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : ClientGatewayToken = apiInstance.editClientGatewayToken(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientGatewayTokensApiAdapter#editClientGatewayToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientGatewayTokensApiAdapter#editClientGatewayToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The ClientGatewayToken Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**ClientGatewayToken**](ClientGatewayToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientGatewayTokens"></a>
# **getClientGatewayTokens**
> ClientGatewayToken getClientGatewayTokens(X_API_TOKEN, xRequestedWith, include, index)

List of client tokens

Lists client_gateway_tokens, search and filters allow fine grained lists to be generated.      Query parameters can be added to performed more fine grained filtering of the client_gateway_tokens, these are handled by the ClientGatewayTokenFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientGatewayTokensApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : ClientGatewayToken = apiInstance.getClientGatewayTokens(X_API_TOKEN, xRequestedWith, include, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientGatewayTokensApiAdapter#getClientGatewayTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientGatewayTokensApiAdapter#getClientGatewayTokens")
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

[**ClientGatewayToken**](ClientGatewayToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientGatewayTokensCreate"></a>
# **getClientGatewayTokensCreate**
> ClientGatewayToken getClientGatewayTokensCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank client object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientGatewayTokensApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : ClientGatewayToken = apiInstance.getClientGatewayTokensCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientGatewayTokensApiAdapter#getClientGatewayTokensCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientGatewayTokensApiAdapter#getClientGatewayTokensCreate")
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

[**ClientGatewayToken**](ClientGatewayToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showClientGatewayToken"></a>
# **showClientGatewayToken**
> ClientGatewayToken showClientGatewayToken(X_API_TOKEN, xRequestedWith, id, include)

Shows a client

Displays a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientGatewayTokensApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The ClientGatewayToken Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : ClientGatewayToken = apiInstance.showClientGatewayToken(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientGatewayTokensApiAdapter#showClientGatewayToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientGatewayTokensApiAdapter#showClientGatewayToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The ClientGatewayToken Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**ClientGatewayToken**](ClientGatewayToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeClientGatewayToken"></a>
# **storeClientGatewayToken**
> ClientGatewayToken storeClientGatewayToken(X_API_TOKEN, xRequestedWith, include)

Adds a client

Adds an client to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientGatewayTokensApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : ClientGatewayToken = apiInstance.storeClientGatewayToken(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientGatewayTokensApiAdapter#storeClientGatewayToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientGatewayTokensApiAdapter#storeClientGatewayToken")
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

[**ClientGatewayToken**](ClientGatewayToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateClientGatewayToken"></a>
# **updateClientGatewayToken**
> ClientGatewayToken updateClientGatewayToken(X_API_TOKEN, xRequestedWith, id, include)

Updates a client

Handles the updating of a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientGatewayTokensApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The ClientGatewayToken Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : ClientGatewayToken = apiInstance.updateClientGatewayToken(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientGatewayTokensApiAdapter#updateClientGatewayToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientGatewayTokensApiAdapter#updateClientGatewayToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The ClientGatewayToken Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**ClientGatewayToken**](ClientGatewayToken.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

