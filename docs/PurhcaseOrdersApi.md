# PurhcaseOrdersApi

All URIs are relative to *https://ninja.test*

Method | HTTP request | Description
------------- | ------------- | -------------
[**storePurchaseOrder**](PurhcaseOrdersApi.md#storePurchaseOrder) | **POST** /api/v1/purchase_orders | Adds a purchase order


<a name="storePurchaseOrder"></a>
# **storePurchaseOrder**
> Credit storePurchaseOrder(xApiToken, xRequestedWith, include)

Adds a purchase order

Adds an purchase order to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurhcaseOrdersApi()
val xApiToken : kotlin.String = HcRvs0oCvYbY5g3RzgBZrSBOChCiq8u4AL0ieuFN5gn4wUV14t0clVhfPc5OX99q // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = clients,invoices // kotlin.String | Includes child relationships in the response, format is comma separated
try {
    val result : Credit = apiInstance.storePurchaseOrder(xApiToken, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurhcaseOrdersApi#storePurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurhcaseOrdersApi#storePurchaseOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiToken** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated | [optional]

### Return type

[**Credit**](Credit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

