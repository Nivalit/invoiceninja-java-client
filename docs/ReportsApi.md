# ReportsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClientReport**](ReportsApi.md#getClientReport) | **POST** /api/v1/reports/clients | Client reports
[**getContactReport**](ReportsApi.md#getContactReport) | **POST** /api/v1/reports/contacts | Contact reports
[**getCreditReport**](ReportsApi.md#getCreditReport) | **POST** /api/v1/reports/credit | Credit reports
[**getDocumentReport**](ReportsApi.md#getDocumentReport) | **POST** /api/v1/reports/documents | Document reports
[**getExpenseReport**](ReportsApi.md#getExpenseReport) | **POST** /api/v1/reports/expense | Expense reports
[**getInvoiceItemReport**](ReportsApi.md#getInvoiceItemReport) | **POST** /api/v1/reports/invoice_items | Invoice item reports
[**getInvoiceReport**](ReportsApi.md#getInvoiceReport) | **POST** /api/v1/reports/invoices | Invoice reports
[**getPaymentReport**](ReportsApi.md#getPaymentReport) | **POST** /api/v1/reports/payments | Payment reports
[**getProductReport**](ReportsApi.md#getProductReport) | **POST** /api/v1/reports/products | Product reports
[**getProductSalesReport**](ReportsApi.md#getProductSalesReport) | **POST** /api/v1/reports/product_sales | Product Salesreports
[**getProfitLossReport**](ReportsApi.md#getProfitLossReport) | **POST** /api/v1/reports/profitloss | Profit loss reports
[**getQuoteItemReport**](ReportsApi.md#getQuoteItemReport) | **POST** /api/v1/reports/quote_items | Quote item reports
[**getQuoteReport**](ReportsApi.md#getQuoteReport) | **POST** /api/v1/reports/quotes | Quote reports
[**getRecurringInvoiceReport**](ReportsApi.md#getRecurringInvoiceReport) | **POST** /api/v1/reports/recurring_invoices | Recurring Invoice reports
[**getTaskReport**](ReportsApi.md#getTaskReport) | **POST** /api/v1/reports/tasks | Task reports


<a name="getClientReport"></a>
# **getClientReport**
> getClientReport(xRequestedWith, genericReportSchema)

Client reports

Export client reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getClientReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getClientReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getClientReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactReport"></a>
# **getContactReport**
> getContactReport(xRequestedWith, genericReportSchema)

Contact reports

Export contact reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getContactReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getContactReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getContactReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCreditReport"></a>
# **getCreditReport**
> getCreditReport(xRequestedWith, genericReportSchema)

Credit reports

Export credit reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getCreditReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getCreditReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getCreditReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentReport"></a>
# **getDocumentReport**
> getDocumentReport(xRequestedWith, genericReportSchema)

Document reports

Export document reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getDocumentReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getDocumentReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getDocumentReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExpenseReport"></a>
# **getExpenseReport**
> getExpenseReport(xRequestedWith, genericReportSchema)

Expense reports

Export expense reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getExpenseReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getExpenseReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getExpenseReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInvoiceItemReport"></a>
# **getInvoiceItemReport**
> getInvoiceItemReport(xRequestedWith, genericReportSchema)

Invoice item reports

Export invoice item reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getInvoiceItemReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getInvoiceItemReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getInvoiceItemReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInvoiceReport"></a>
# **getInvoiceReport**
> getInvoiceReport(xRequestedWith, genericReportSchema)

Invoice reports

Export invoice reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getInvoiceReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getInvoiceReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getInvoiceReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentReport"></a>
# **getPaymentReport**
> getPaymentReport(xRequestedWith, genericReportSchema)

Payment reports

Export payment reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getPaymentReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getPaymentReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getPaymentReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductReport"></a>
# **getProductReport**
> getProductReport(xRequestedWith, genericReportSchema)

Product reports

Export product reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getProductReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getProductReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getProductReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProductSalesReport"></a>
# **getProductSalesReport**
> getProductSalesReport(xRequestedWith, genericReportSchema)

Product Salesreports

Export product sales reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getProductSalesReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getProductSalesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getProductSalesReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProfitLossReport"></a>
# **getProfitLossReport**
> getProfitLossReport(xRequestedWith, genericReportSchema)

Profit loss reports

Profit loss report

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getProfitLossReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getProfitLossReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getProfitLossReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuoteItemReport"></a>
# **getQuoteItemReport**
> getQuoteItemReport(xRequestedWith, genericReportSchema)

Quote item reports

Export Quote item reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getQuoteItemReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getQuoteItemReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getQuoteItemReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuoteReport"></a>
# **getQuoteReport**
> getQuoteReport(xRequestedWith, genericReportSchema)

Quote reports

Export quote reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getQuoteReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getQuoteReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getQuoteReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecurringInvoiceReport"></a>
# **getRecurringInvoiceReport**
> getRecurringInvoiceReport(xRequestedWith, genericReportSchema)

Recurring Invoice reports

Export recurring invoice reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getRecurringInvoiceReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getRecurringInvoiceReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getRecurringInvoiceReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskReport"></a>
# **getTaskReport**
> getTaskReport(xRequestedWith, genericReportSchema)

Task reports

Export task reports

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ReportsApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getTaskReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getTaskReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getTaskReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **genericReportSchema** | [**GenericReportSchema**](GenericReportSchema.md)|  |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

