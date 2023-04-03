# UpdateApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**selfUpdate**](UpdateApi.md#selfUpdate) | **POST** /api/v1/self-update | Performs a system update


<a name="selfUpdate"></a>
# **selfUpdate**
> selfUpdate(X_API_TOKEN, xRequestedWith, X_API_PASSWORD, include)

Performs a system update

Performs a system update

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UpdateApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val X_API_PASSWORD : kotlin.String = supersecretpassword // kotlin.String | The login password when challenged on certain protected routes
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.selfUpdate(X_API_TOKEN, xRequestedWith, X_API_PASSWORD, include)
} catch (e: ClientException) {
    println("4xx response calling UpdateApi#selfUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UpdateApi#selfUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **X_API_PASSWORD** | **kotlin.String**| The login password when challenged on certain protected routes | [optional]
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

