# CompanyUserApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateCompanyUser**](CompanyUserApi.md#updateCompanyUser) | **POST** /api/v1/company_users | Update a company user record


<a name="updateCompanyUser"></a>
# **updateCompanyUser**
> CompanyUser updateCompanyUser(xRequestedWith)

Update a company user record

Attempts to update a company user record. A company user can modify only their settings fields. Full access for Admin users

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = CompanyUserApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    val result : CompanyUser = apiInstance.updateCompanyUser(xRequestedWith)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyUserApi#updateCompanyUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyUserApi#updateCompanyUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |

### Return type

[**CompanyUser**](CompanyUser.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

