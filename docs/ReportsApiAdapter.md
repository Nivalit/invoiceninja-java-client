# ReportsApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClientReport**](ReportsApiAdapter.md#getClientReport) | **POST** /api/v1/reports/clients | Client reports
[**getContactReport**](ReportsApiAdapter.md#getContactReport) | **POST** /api/v1/reports/contacts | Contact reports
[**getCreditReport**](ReportsApiAdapter.md#getCreditReport) | **POST** /api/v1/reports/credit | Credit reports
[**getDocumentReport**](ReportsApiAdapter.md#getDocumentReport) | **POST** /api/v1/reports/documents | Document reports
[**getExpenseReport**](ReportsApiAdapter.md#getExpenseReport) | **POST** /api/v1/reports/expense | Expense reports
[**getInvoiceItemReport**](ReportsApiAdapter.md#getInvoiceItemReport) | **POST** /api/v1/reports/invoice_items | Invoice item reports
[**getInvoiceReport**](ReportsApiAdapter.md#getInvoiceReport) | **POST** /api/v1/reports/invoices | Invoice reports
[**getPaymentReport**](ReportsApiAdapter.md#getPaymentReport) | **POST** /api/v1/reports/payments | Payment reports
[**getProductReport**](ReportsApiAdapter.md#getProductReport) | **POST** /api/v1/reports/products | Product reports
[**getProductSalesReport**](ReportsApiAdapter.md#getProductSalesReport) | **POST** /api/v1/reports/product_sales | Product Salesreports
[**getProfitLossReport**](ReportsApiAdapter.md#getProfitLossReport) | **POST** /api/v1/reports/profitloss | Profit loss reports
[**getQuoteItemReport**](ReportsApiAdapter.md#getQuoteItemReport) | **POST** /api/v1/reports/quote_items | Quote item reports
[**getQuoteReport**](ReportsApiAdapter.md#getQuoteReport) | **POST** /api/v1/reports/quotes | Quote reports
[**getRecurringInvoiceReport**](ReportsApiAdapter.md#getRecurringInvoiceReport) | **POST** /api/v1/reports/recurring_invoices | Recurring Invoice reports
[**getTaskReport**](ReportsApiAdapter.md#getTaskReport) | **POST** /api/v1/reports/tasks | Task reports


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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getClientReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getClientReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getClientReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getContactReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getContactReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getContactReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getCreditReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getCreditReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getCreditReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getDocumentReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getDocumentReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getDocumentReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getExpenseReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getExpenseReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getExpenseReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getInvoiceItemReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getInvoiceItemReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getInvoiceItemReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getInvoiceReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getInvoiceReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getInvoiceReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getPaymentReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getPaymentReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getPaymentReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getProductReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getProductReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getProductReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getProductSalesReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getProductSalesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getProductSalesReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getProfitLossReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getProfitLossReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getProfitLossReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getQuoteItemReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getQuoteItemReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getQuoteItemReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getQuoteReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getQuoteReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getQuoteReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getRecurringInvoiceReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getRecurringInvoiceReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getRecurringInvoiceReport")
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

val apiInstance = ReportsApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val genericReportSchema : GenericReportSchema =  // GenericReportSchema | 
try {
    apiInstance.getTaskReport(xRequestedWith, genericReportSchema)
} catch (e: ClientException) {
    println("4xx response calling ReportsApiAdapter#getTaskReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApiAdapter#getTaskReport")
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

