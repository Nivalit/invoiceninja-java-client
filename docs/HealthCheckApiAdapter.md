# HealthCheckApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHealthCheck**](HealthCheckApiAdapter.md#getHealthCheck) | **GET** /api/v1/health_check | Attempts to get a health check from the API


<a name="getHealthCheck"></a>
# **getHealthCheck**
> getHealthCheck(xRequestedWith)

Attempts to get a health check from the API

Attempts to get a health check from the API

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = HealthCheckApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.getHealthCheck(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling HealthCheckApiAdapter#getHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HealthCheckApiAdapter#getHealthCheck")
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

