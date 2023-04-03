# OneTimeTokenApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oneTimeToken**](OneTimeTokenApi.md#oneTimeToken) | **POST** /api/v1/one_time_token | Attempts to create a one time token


<a name="oneTimeToken"></a>
# **oneTimeToken**
> oneTimeToken(xRequestedWith)

Attempts to create a one time token

Attempts to create a one time token

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = OneTimeTokenApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.oneTimeToken(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling OneTimeTokenApi#oneTimeToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OneTimeTokenApi#oneTimeToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

