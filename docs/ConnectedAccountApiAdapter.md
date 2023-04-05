# ConnectedAccountApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectedAccount**](ConnectedAccountApiAdapter.md#connectedAccount) | **POST** /api/v1/connected_account | Connect an oauth user to an existing user


<a name="connectedAccount"></a>
# **connectedAccount**
> User connectedAccount(X_API_TOKEN, xRequestedWith, include, includeStatic, clearCache)

Connect an oauth user to an existing user

Refreshes the dataset

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ConnectedAccountApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val includeStatic : kotlin.String = include_static=true // kotlin.String | Returns static variables
val clearCache : kotlin.String = clear_cache=true // kotlin.String | Clears the static cache
try {
    val result : User = apiInstance.connectedAccount(X_API_TOKEN, xRequestedWith, include, includeStatic, clearCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConnectedAccountApiAdapter#connectedAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConnectedAccountApiAdapter#connectedAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]
 **includeStatic** | **kotlin.String**| Returns static variables | [optional]
 **clearCache** | **kotlin.String**| Clears the static cache | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

