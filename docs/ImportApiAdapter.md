# ImportApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getImportJson**](ImportApiAdapter.md#getImportJson) | **POST** /api/v1/import_json | Import data from the system


<a name="getImportJson"></a>
# **getImportJson**
> getImportJson(xRequestedWith)

Import data from the system

Import data from the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ImportApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.getImportJson(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling ImportApiAdapter#getImportJson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImportApiAdapter#getImportJson")
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

