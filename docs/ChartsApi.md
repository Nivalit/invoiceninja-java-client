# ChartsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChartTotals**](ChartsApi.md#getChartTotals) | **POST** /api/v1/charts/totals | Get chart data


<a name="getChartTotals"></a>
# **getChartTotals**
> getChartTotals(X_API_TOKEN, xRequestedWith, include, index, rows)

Get chart data

Get chart data

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ChartsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
val rows : java.math.BigDecimal = 50 // java.math.BigDecimal | The chart
try {
    apiInstance.getChartTotals(X_API_TOKEN, xRequestedWith, include, index, rows)
} catch (e: ClientException) {
    println("4xx response calling ChartsApi#getChartTotals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChartsApi#getChartTotals")
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
 **rows** | **java.math.BigDecimal**| The chart | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

