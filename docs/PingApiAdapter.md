# PingApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPing**](PingApiAdapter.md#getPing) | **GET** /api/v1/ping | Attempts to ping the API


<a name="getPing"></a>
# **getPing**
> getPing(xRequestedWith)

Attempts to ping the API

Attempts to ping the API

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PingApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.getPing(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling PingApiAdapter#getPing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PingApiAdapter#getPing")
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
 - **Accept**: Not defined

