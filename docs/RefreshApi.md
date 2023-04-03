# RefreshApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1RefreshPost**](RefreshApi.md#apiV1RefreshPost) | **POST** /api/v1/refresh | Refresh data by timestamp


<a name="apiV1RefreshPost"></a>
# **apiV1RefreshPost**
> CompanyUser apiV1RefreshPost(updatedAt, X_API_TOKEN, xRequestedWith, include, includeStatic, clearCache)

Refresh data by timestamp

Refreshes the dataset.    This endpoint can be used if you only need to access the most recent data from a certain point in time. operationId: refresh 

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RefreshApi()
val updatedAt : java.math.BigDecimal = 1676173763 // java.math.BigDecimal | The unix timestamp from which the refreshed data should be sent from, if no value is passed the system will assume you require all data.
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val includeStatic : kotlin.String = include_static=true // kotlin.String | Returns static variables
val clearCache : kotlin.String = clear_cache=true // kotlin.String | Clears the static cache
try {
    val result : CompanyUser = apiInstance.apiV1RefreshPost(updatedAt, X_API_TOKEN, xRequestedWith, include, includeStatic, clearCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefreshApi#apiV1RefreshPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefreshApi#apiV1RefreshPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updatedAt** | **java.math.BigDecimal**| The unix timestamp from which the refreshed data should be sent from, if no value is passed the system will assume you require all data. |
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]
 **includeStatic** | **kotlin.String**| Returns static variables | [optional]
 **clearCache** | **kotlin.String**| Clears the static cache | [optional]

### Return type

[**CompanyUser**](CompanyUser.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

