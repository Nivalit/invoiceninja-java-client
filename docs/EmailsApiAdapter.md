# EmailsApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEmailTemplate**](EmailsApiAdapter.md#sendEmailTemplate) | **POST** /api/v1/emails | Sends an email for an entity


<a name="sendEmailTemplate"></a>
# **sendEmailTemplate**
> Template sendEmailTemplate(xRequestedWith, sendEmailTemplateRequest)

Sends an email for an entity

Sends an email for an entity

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = EmailsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val sendEmailTemplateRequest : SendEmailTemplateRequest =  // SendEmailTemplateRequest | The template subject and body
try {
    val result : Template = apiInstance.sendEmailTemplate(xRequestedWith, sendEmailTemplateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailsApiAdapter#sendEmailTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailsApiAdapter#sendEmailTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **sendEmailTemplateRequest** | [**SendEmailTemplateRequest**](SendEmailTemplateRequest.md)| The template subject and body |

### Return type

[**Template**](Template.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

