# ExportApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExport**](ExportApiAdapter.md#getExport) | **POST** /api/v1/export | Export data from the system


<a name="getExport"></a>
# **getExport**
> getExport(xRequestedWith)

Export data from the system

Export data from the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExportApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.getExport(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling ExportApiAdapter#getExport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExportApiAdapter#getExport")
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

