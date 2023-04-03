# ImportsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preimport**](ImportsApi.md#preimport) | **POST** /api/v1/preimport | Pre Import checks - returns a reference to the job and the headers of the CSV


<a name="preimport"></a>
# **preimport**
> preimport(X_API_TOKEN, xRequestedWith, include)

Pre Import checks - returns a reference to the job and the headers of the CSV

Pre Import checks - returns a reference to the job and the headers of the CSV

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ImportsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.preimport(X_API_TOKEN, xRequestedWith, include)
} catch (e: ClientException) {
    println("4xx response calling ImportsApi#preimport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImportsApi#preimport")
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

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

