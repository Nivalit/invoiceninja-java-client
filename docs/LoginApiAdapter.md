# LoginApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postLogin**](LoginApiAdapter.md#postLogin) | **POST** /api/v1/login | Attempts authentication


<a name="postLogin"></a>
# **postLogin**
> Client postLogin(X_API_TOKEN, xRequestedWith, postLoginRequest, X_API_SECRET, include, includeStatic, clearCache)

Attempts authentication

Returns a CompanyUser object on success

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = LoginApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val postLoginRequest : PostLoginRequest =  // PostLoginRequest | User credentials
val X_API_SECRET : kotlin.String = password // kotlin.String | The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route.
val include : kotlin.String = user // kotlin.String | Include child relations of the CompanyUser object, format is comma separated. **Note** it is possible to chain multiple includes together, ie. include=account,token
val includeStatic : kotlin.String = include_static=true // kotlin.String | Returns static variables
val clearCache : kotlin.String = clear_cache=true // kotlin.String | Clears the static cache
try {
    val result : Client = apiInstance.postLogin(X_API_TOKEN, xRequestedWith, postLoginRequest, X_API_SECRET, include, includeStatic, clearCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoginApiAdapter#postLogin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoginApiAdapter#postLogin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **postLoginRequest** | [**PostLoginRequest**](PostLoginRequest.md)| User credentials |
 **X_API_SECRET** | **kotlin.String**| The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. | [optional]
 **include** | **kotlin.String**| Include child relations of the CompanyUser object, format is comma separated. **Note** it is possible to chain multiple includes together, ie. include&#x3D;account,token | [optional]
 **includeStatic** | **kotlin.String**| Returns static variables | [optional]
 **clearCache** | **kotlin.String**| Clears the static cache | [optional]

### Return type

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

