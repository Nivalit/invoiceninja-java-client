# TemplatesApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShowTemplate**](TemplatesApiAdapter.md#getShowTemplate) | **POST** /api/v1/templates | Returns a entity template with the template variables replaced with the Entities


<a name="getShowTemplate"></a>
# **getShowTemplate**
> Template getShowTemplate(xRequestedWith, getShowTemplateRequest)

Returns a entity template with the template variables replaced with the Entities

Returns a entity template with the template variables replaced with the Entities

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TemplatesApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val getShowTemplateRequest : GetShowTemplateRequest =  // GetShowTemplateRequest | The template subject and body
try {
    val result : Template = apiInstance.getShowTemplate(xRequestedWith, getShowTemplateRequest)
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

