# YodleeApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**yodleeRefreshWebhook**](YodleeApi.md#yodleeRefreshWebhook) | **POST** /api/v1/yodlee/refresh | Yodlee Webhook


<a name="yodleeRefreshWebhook"></a>
# **yodleeRefreshWebhook**
> Credit yodleeRefreshWebhook(X_API_TOKEN, xRequestedWith)

Yodlee Webhook

Webhook endpoint for Yodlee. Used to notify the system that a data point can be updated.

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = YodleeApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    val result : Credit = apiInstance.yodleeRefreshWebhook(X_API_TOKEN, xRequestedWith)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YodleeApi#yodleeRefreshWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YodleeApi#yodleeRefreshWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |

### Return type

[**Credit**](Credit.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

