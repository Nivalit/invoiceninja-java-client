# PreviewApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPreview**](PreviewApi.md#getPreview) | **POST** /api/v1/preview | Returns a pdf preview
[**getPreviewPurchaseOrder**](PreviewApi.md#getPreviewPurchaseOrder) | **POST** /api/v1/preview/purchase_order | Returns a pdf preview for purchase order


<a name="getPreview"></a>
# **getPreview**
> getPreview(xRequestedWith)

Returns a pdf preview

Returns a pdf preview.

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PreviewApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.getPreview(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling PreviewApi#getPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PreviewApi#getPreview")
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

<a name="getPreviewPurchaseOrder"></a>
# **getPreviewPurchaseOrder**
> getPreviewPurchaseOrder(xRequestedWith)

Returns a pdf preview for purchase order

Returns a pdf preview for purchase order.

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PreviewApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.getPreviewPurchaseOrder(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling PreviewApi#getPreviewPurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PreviewApi#getPreviewPurchaseOrder")
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

