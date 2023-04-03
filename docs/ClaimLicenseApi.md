# ClaimLicenseApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClaimLicense**](ClaimLicenseApi.md#getClaimLicense) | **GET** /api/v1/claim_license | Attempts to claim a white label license


<a name="getClaimLicense"></a>
# **getClaimLicense**
> getClaimLicense(xRequestedWith, licenseKey, productId)

Attempts to claim a white label license

Attempts to claim a white label license

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClaimLicenseApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val licenseKey : kotlin.String = d87sh-s755s-s7d76-sdsd8 // kotlin.String | The license hash
val productId : kotlin.String = 1 // kotlin.String | The ID of the product purchased.
try {
    apiInstance.getClaimLicense(xRequestedWith, licenseKey, productId)
} catch (e: ClientException) {
    println("4xx response calling ClaimLicenseApi#getClaimLicense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClaimLicenseApi#getClaimLicense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **licenseKey** | **kotlin.String**| The license hash |
 **productId** | **kotlin.String**| The ID of the product purchased. |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

