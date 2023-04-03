# SubscriptionsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkSubscriptions**](SubscriptionsApi.md#bulkSubscriptions) | **POST** /api/v1/subscriptions/bulk | Performs bulk actions on an array of subscriptions
[**deleteSubscription**](SubscriptionsApi.md#deleteSubscription) | **DELETE** /api/v1/subscriptions/{id} | Deletes a subscriptions
[**editSubscription**](SubscriptionsApi.md#editSubscription) | **GET** /api/v1/subscriptions/{id}/edit | Shows an subscriptions for editting
[**getSubscriptions**](SubscriptionsApi.md#getSubscriptions) | **GET** /api/v1/subscriptions | Gets a list of subscriptions
[**getSubscriptionsCreate**](SubscriptionsApi.md#getSubscriptionsCreate) | **GET** /api/v1/subscriptions/create | Gets a new blank subscriptions object
[**showSubscription**](SubscriptionsApi.md#showSubscription) | **GET** /api/v1/subscriptions/{id} | Shows an subscriptions
[**storeSubscription**](SubscriptionsApi.md#storeSubscription) | **POST** /api/v1/subscriptions | Adds a subscriptions
[**updateSubscription**](SubscriptionsApi.md#updateSubscription) | **PUT** /api/v1/subscriptions/{id} | Updates an subscriptions


<a name="bulkSubscriptions"></a>
# **bulkSubscriptions**
> Subscription bulkSubscriptions(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of subscriptions



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SubscriptionsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | User credentials
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : Subscription = apiInstance.bulkSubscriptions(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#bulkSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#bulkSubscriptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| User credentials |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSubscription"></a>
# **deleteSubscription**
> deleteSubscription(X_API_TOKEN, xRequestedWith, id, include)

Deletes a subscriptions

Handles the deletion of an subscriptions by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SubscriptionsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Subscription Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteSubscription(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#deleteSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#deleteSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Subscription Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editSubscription"></a>
# **editSubscription**
> Subscription editSubscription(X_API_TOKEN, xRequestedWith, id, include)

Shows an subscriptions for editting

Displays an subscriptions by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SubscriptionsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Subscription Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Subscription = apiInstance.editSubscription(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#editSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#editSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Subscription Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscriptions"></a>
# **getSubscriptions**
> Subscription getSubscriptions(X_API_TOKEN, xRequestedWith, include)

Gets a list of subscriptions

Lists subscriptions.

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SubscriptionsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Subscription = apiInstance.getSubscriptions(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#getSubscriptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#getSubscriptions")
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

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubscriptionsCreate"></a>
# **getSubscriptionsCreate**
> Subscription getSubscriptionsCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank subscriptions object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SubscriptionsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Subscription = apiInstance.getSubscriptionsCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#getSubscriptionsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#getSubscriptionsCreate")
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

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showSubscription"></a>
# **showSubscription**
> Subscription showSubscription(X_API_TOKEN, xRequestedWith, id, include)

Shows an subscriptions

Displays an subscriptions by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SubscriptionsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Subscription Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Subscription = apiInstance.showSubscription(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#showSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#showSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Subscription Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeSubscription"></a>
# **storeSubscription**
> Subscription storeSubscription(X_API_TOKEN, xRequestedWith, include)

Adds a subscriptions

Adds an subscriptions to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SubscriptionsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Subscription = apiInstance.storeSubscription(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#storeSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#storeSubscription")
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

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSubscription"></a>
# **updateSubscription**
> Subscription updateSubscription(X_API_TOKEN, xRequestedWith, id, include)

Updates an subscriptions

Handles the updating of an subscriptions by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = SubscriptionsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Subscription Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Subscription = apiInstance.updateSubscription(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#updateSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#updateSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Subscription Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

