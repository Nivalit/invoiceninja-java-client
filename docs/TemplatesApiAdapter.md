# TemplatesApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShowTemplate**](TemplatesApiAdapter.md#getShowTemplate) | **POST** /api/v1/templates | Returns a entity template with the template variables replaced with the Entities


<a name="getShowTemplate"></a>
# **getShowTemplate**
> Template getShowTemplate(X_API_TOKEN, xRequestedWith, getShowTemplateRequest)

Returns a entity template with the template variables replaced with the Entities

Returns a entity template with the template variables replaced with the Entities

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TemplatesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val getShowTemplateRequest : GetShowTemplateRequest =  // GetShowTemplateRequest | The template subject and body
try {
    val result : Template = apiInstance.getShowTemplate(X_API_TOKEN, xRequestedWith, getShowTemplateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApiAdapter#getShowTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApiAdapter#getShowTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **getShowTemplateRequest** | [**GetShowTemplateRequest**](GetShowTemplateRequest.md)| The template subject and body |

### Return type

[**Template**](Template.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

