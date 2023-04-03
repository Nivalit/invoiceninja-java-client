# SignupApi

All URIs are relative to *https://ninja.test*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postSignup**](SignupApi.md#postSignup) | **POST** /api/v1/signup | Attempts a new account signup


<a name="postSignup"></a>
# **postSignup**
> CompanyUser postSignup(xRequestedWith, tokenName, postSignupRequest)

Attempts a new account signup

Attempts a new account signup and returns a CompanyUser object on success

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SignupApi()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val tokenName : kotlin.String = Daves iOS Device // kotlin.String | A custom name for the user company token
val postSignupRequest : PostSignupRequest =  // PostSignupRequest | Signup credentials
try {
    val result : CompanyUser = apiInstance.postSignup(xRequestedWith, tokenName, postSignupRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignupApi#postSignup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignupApi#postSignup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **tokenName** | **kotlin.String**| A custom name for the user company token |
 **postSignupRequest** | [**PostSignupRequest**](PostSignupRequest.md)| Signup credentials |

### Return type

[**CompanyUser**](CompanyUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

