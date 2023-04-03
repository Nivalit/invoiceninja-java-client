# LogoutApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogout**](LogoutApi.md#getLogout) | **POST** /api/v1/logout | Gets a list of logout


<a name="getLogout"></a>
# **getLogout**
> getLogout(X_API_TOKEN, xRequestedWith, include, index)

Gets a list of logout

Lists all logout

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = LogoutApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    apiInstance.getLogout(X_API_TOKEN, xRequestedWith, include, index)
} catch (e: ClientException) {
    println("4xx response calling LogoutApi#getLogout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogoutApi#getLogout")
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

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

