# PaymentTermsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkPaymentTerms**](PaymentTermsApi.md#bulkPaymentTerms) | **POST** /api/v1/payment_terms/bulk | Performs bulk actions on an array of payment terms
[**editPaymentTerms**](PaymentTermsApi.md#editPaymentTerms) | **GET** /api/v1/payment_terms/{id}/edit | Shows an Payment Term for editting
[**getPaymentTerms**](PaymentTermsApi.md#getPaymentTerms) | **GET** /api/v1/payment_terms | Gets a list of payment terms
[**getPaymentTermsCreate**](PaymentTermsApi.md#getPaymentTermsCreate) | **GET** /api/v1/payment_terms/create | Gets a new blank PaymentTerm object
[**showPaymentTerm**](PaymentTermsApi.md#showPaymentTerm) | **GET** /api/v1/payment_terms/{id} | Shows a Payment Term
[**storePaymentTerm**](PaymentTermsApi.md#storePaymentTerm) | **POST** /api/v1/payment_terms | Adds a Payment
[**updatePaymentTerm**](PaymentTermsApi.md#updatePaymentTerm) | **PUT** /api/v1/payment_terms/{id} | Updates a Payment Term


<a name="bulkPaymentTerms"></a>
# **bulkPaymentTerms**
> PaymentTerm bulkPaymentTerms(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of payment terms



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PaymentTermsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Payment Ter,s
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : PaymentTerm = apiInstance.bulkPaymentTerms(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#bulkPaymentTerms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#bulkPaymentTerms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Payment Ter,s |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**PaymentTerm**](PaymentTerm.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editPaymentTerms"></a>
# **editPaymentTerms**
> PaymentTerm editPaymentTerms(X_API_TOKEN, xRequestedWith, id, include)

Shows an Payment Term for editting

Displays an Payment Term by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PaymentTermsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Payment Term Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : PaymentTerm = apiInstance.editPaymentTerms(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#editPaymentTerms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#editPaymentTerms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Payment Term Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**PaymentTerm**](PaymentTerm.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentTerms"></a>
# **getPaymentTerms**
> PaymentTerm getPaymentTerms(X_API_TOKEN, xRequestedWith, include, index)

Gets a list of payment terms

Lists payment terms

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PaymentTermsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : PaymentTerm = apiInstance.getPaymentTerms(X_API_TOKEN, xRequestedWith, include, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#getPaymentTerms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#getPaymentTerms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**PaymentTerm**](PaymentTerm.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentTermsCreate"></a>
# **getPaymentTermsCreate**
> Payment getPaymentTermsCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank PaymentTerm object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PaymentTermsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Payment = apiInstance.getPaymentTermsCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#getPaymentTermsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#getPaymentTermsCreate")
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

[**Payment**](Payment.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showPaymentTerm"></a>
# **showPaymentTerm**
> PaymentTerm showPaymentTerm(X_API_TOKEN, xRequestedWith, id, include)

Shows a Payment Term

Displays an Payment Term by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PaymentTermsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Payment Term Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : PaymentTerm = apiInstance.showPaymentTerm(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#showPaymentTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#showPaymentTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Payment Term Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**PaymentTerm**](PaymentTerm.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storePaymentTerm"></a>
# **storePaymentTerm**
> PaymentTerm storePaymentTerm(X_API_TOKEN, xRequestedWith, paymentTerm, include)

Adds a Payment

Adds a Payment Term to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PaymentTermsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val paymentTerm : PaymentTerm =  // PaymentTerm | The payment_terms request
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : PaymentTerm = apiInstance.storePaymentTerm(X_API_TOKEN, xRequestedWith, paymentTerm, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#storePaymentTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#storePaymentTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **paymentTerm** | [**PaymentTerm**](PaymentTerm.md)| The payment_terms request |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**PaymentTerm**](PaymentTerm.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePaymentTerm"></a>
# **updatePaymentTerm**
> PaymentTerm updatePaymentTerm(X_API_TOKEN, xRequestedWith, id, include)

Updates a Payment Term

Handles the updating of an Payment Termby id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PaymentTermsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Payment Term Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : PaymentTerm = apiInstance.updatePaymentTerm(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#updatePaymentTerm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#updatePaymentTerm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Payment Term Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**PaymentTerm**](PaymentTerm.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

