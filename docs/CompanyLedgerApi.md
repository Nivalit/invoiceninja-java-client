# CompanyLedgerApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyLedger**](CompanyLedgerApi.md#getCompanyLedger) | **GET** /api/v1/company_ledger | Gets a list of company_ledger


<a name="getCompanyLedger"></a>
# **getCompanyLedger**
> CompanyLedger getCompanyLedger(X_API_TOKEN, xRequestedWith, include)

Gets a list of company_ledger

Lists the company_ledger.

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyLedgerApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : CompanyLedger = apiInstance.getCompanyLedger(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyLedgerApi#getCompanyLedger")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyLedgerApi#getCompanyLedger")
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

[**CompanyLedger**](CompanyLedger.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

