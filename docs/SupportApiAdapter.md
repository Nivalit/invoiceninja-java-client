# SupportApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**supportMessage**](SupportApiAdapter.md#supportMessage) | **POST** /api/v1/support/messages/send | Sends a support message to Invoice Ninja team


<a name="supportMessage"></a>
# **supportMessage**
> kotlin.collections.List&lt;kotlin.String&gt; supportMessage(X_API_TOKEN, xRequestedWith, body)

Sends a support message to Invoice Ninja team

Allows a user to send a support message to the Invoice Ninja Team

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SupportApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val body : kotlin.String = body_example // kotlin.String | The message
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.supportMessage(X_API_TOKEN, xRequestedWith, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportApiAdapter#supportMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportApiAdapter#supportMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **body** | **kotlin.String**| The message |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

