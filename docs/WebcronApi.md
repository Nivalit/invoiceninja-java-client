# WebcronApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webcron**](WebcronApi.md#webcron) | **GET** /api/v1/webcron | Executes the task scheduler via a webcron service


<a name="webcron"></a>
# **webcron**
> webcron(xRequestedWith)

Executes the task scheduler via a webcron service

Executes the task scheduler via a webcron service

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = WebcronApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.webcron(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling WebcronApi#webcron")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebcronApi#webcron")
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

