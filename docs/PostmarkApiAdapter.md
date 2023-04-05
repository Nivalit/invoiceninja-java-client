# PostmarkApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmApplePurchase**](PostmarkApiAdapter.md#confirmApplePurchase) | **POST** /api/v1/apple/confirm_purchase | Processing webhooks from Apple for in app purchases
[**postmarkWebhook**](PostmarkApiAdapter.md#postmarkWebhook) | **POST** /api/v1/postmark_webhook | Processing webhooks from PostMark
[**processAppleWebhook**](PostmarkApiAdapter.md#processAppleWebhook) | **POST** /api/v1/apple/process_webhook | Processing event webhooks from Apple for in purchase / subscription status update


<a name="confirmApplePurchase"></a>
# **confirmApplePurchase**
> confirmApplePurchase(X_API_TOKEN, xRequestedWith, include)

Processing webhooks from Apple for in app purchases

Adds an credit to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PostmarkApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.confirmApplePurchase(X_API_TOKEN, xRequestedWith, include)
} catch (e: ClientException) {
    println("4xx response calling PostmarkApiAdapter#confirmApplePurchase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostmarkApiAdapter#confirmApplePurchase")
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postmarkWebhook"></a>
# **postmarkWebhook**
> Credit postmarkWebhook(X_API_TOKEN, xRequestedWith, include)

Processing webhooks from PostMark

Adds an credit to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PostmarkApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Credit = apiInstance.postmarkWebhook(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostmarkApiAdapter#postmarkWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostmarkApiAdapter#postmarkWebhook")
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

[**Credit**](Credit.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="processAppleWebhook"></a>
# **processAppleWebhook**
> processAppleWebhook(X_API_TOKEN, xRequestedWith, include)

Processing event webhooks from Apple for in purchase / subscription status update

Adds an credit to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PostmarkApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.processAppleWebhook(X_API_TOKEN, xRequestedWith, include)
} catch (e: ClientException) {
    println("4xx response calling PostmarkApiAdapter#processAppleWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostmarkApiAdapter#processAppleWebhook")
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

