# RecurringQuotesApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionRecurringQuote**](RecurringQuotesApi.md#actionRecurringQuote) | **GET** /api/v1/recurring_quotes/{id}/{action} | Performs a custom action on an RecurringQuote
[**bulkRecurringQuotes**](RecurringQuotesApi.md#bulkRecurringQuotes) | **POST** /api/v1/recurring_quotes/bulk | Performs bulk actions on an array of recurring_quotes
[**deleteRecurringQuote**](RecurringQuotesApi.md#deleteRecurringQuote) | **DELETE** /api/v1/recurring_quotes/{id} | Deletes a RecurringQuote
[**editRecurringQuote**](RecurringQuotesApi.md#editRecurringQuote) | **GET** /api/v1/recurring_quotes/{id}/edit | Shows an RecurringQuote for editting
[**getRecurringQuotes**](RecurringQuotesApi.md#getRecurringQuotes) | **GET** /api/v1/recurring_quotes | Gets a list of recurring_quotes
[**getRecurringQuotesCreate**](RecurringQuotesApi.md#getRecurringQuotesCreate) | **GET** /api/v1/recurring_quotes/create | Gets a new blank RecurringQuote object
[**showRecurringQuote**](RecurringQuotesApi.md#showRecurringQuote) | **GET** /api/v1/recurring_quotes/{id} | Shows an RecurringQuote
[**storeRecurringQuote**](RecurringQuotesApi.md#storeRecurringQuote) | **POST** /api/v1/recurring_quotes | Adds a RecurringQuote
[**updateRecurringQuote**](RecurringQuotesApi.md#updateRecurringQuote) | **PUT** /api/v1/recurring_quotes/{id} | Updates an RecurringQuote


<a name="actionRecurringQuote"></a>
# **actionRecurringQuote**
> RecurringQuote actionRecurringQuote(X_API_TOKEN, xRequestedWith, id, action, include)

Performs a custom action on an RecurringQuote

Performs a custom action on an RecurringQuote.      The current range of actions are as follows     - clone_to_RecurringQuote     - clone_to_quote     - history     - delivery_note     - mark_paid     - download     - archive     - delete     - email

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringQuote Hashed ID
val action : kotlin.String = clone_to_quote // kotlin.String | The action string to be performed
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringQuote = apiInstance.actionRecurringQuote(X_API_TOKEN, xRequestedWith, id, action, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#actionRecurringQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#actionRecurringQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringQuote Hashed ID |
 **action** | **kotlin.String**| The action string to be performed |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringQuote**](RecurringQuote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bulkRecurringQuotes"></a>
# **bulkRecurringQuotes**
> RecurringQuote bulkRecurringQuotes(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of recurring_quotes



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Hashed ids
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : RecurringQuote = apiInstance.bulkRecurringQuotes(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#bulkRecurringQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#bulkRecurringQuotes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Hashed ids |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**RecurringQuote**](RecurringQuote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRecurringQuote"></a>
# **deleteRecurringQuote**
> deleteRecurringQuote(X_API_TOKEN, xRequestedWith, id, include)

Deletes a RecurringQuote

Handles the deletion of an RecurringQuote by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringQuote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteRecurringQuote(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#deleteRecurringQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#deleteRecurringQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringQuote Hashed ID |
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

<a name="editRecurringQuote"></a>
# **editRecurringQuote**
> RecurringQuote editRecurringQuote(X_API_TOKEN, xRequestedWith, id, include)

Shows an RecurringQuote for editting

Displays an RecurringQuote by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringQuote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringQuote = apiInstance.editRecurringQuote(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#editRecurringQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#editRecurringQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringQuote Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringQuote**](RecurringQuote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecurringQuotes"></a>
# **getRecurringQuotes**
> RecurringQuote getRecurringQuotes(X_API_TOKEN, xRequestedWith, include)

Gets a list of recurring_quotes

Lists recurring_quotes, search and filters allow fine grained lists to be generated.          Query parameters can be added to performed more fine grained filtering of the recurring_quotes, these are handled by the RecurringQuoteFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringQuote = apiInstance.getRecurringQuotes(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#getRecurringQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#getRecurringQuotes")
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

[**RecurringQuote**](RecurringQuote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecurringQuotesCreate"></a>
# **getRecurringQuotesCreate**
> RecurringQuote getRecurringQuotesCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank RecurringQuote object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringQuote = apiInstance.getRecurringQuotesCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#getRecurringQuotesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#getRecurringQuotesCreate")
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

[**RecurringQuote**](RecurringQuote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showRecurringQuote"></a>
# **showRecurringQuote**
> RecurringQuote showRecurringQuote(X_API_TOKEN, xRequestedWith, id, include)

Shows an RecurringQuote

Displays an RecurringQuote by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringQuote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringQuote = apiInstance.showRecurringQuote(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#showRecurringQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#showRecurringQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringQuote Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringQuote**](RecurringQuote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeRecurringQuote"></a>
# **storeRecurringQuote**
> RecurringQuote storeRecurringQuote(X_API_TOKEN, xRequestedWith, include)

Adds a RecurringQuote

Adds an RecurringQuote to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringQuote = apiInstance.storeRecurringQuote(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#storeRecurringQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#storeRecurringQuote")
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

[**RecurringQuote**](RecurringQuote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRecurringQuote"></a>
# **updateRecurringQuote**
> RecurringQuote updateRecurringQuote(X_API_TOKEN, xRequestedWith, id, include)

Updates an RecurringQuote

Handles the updating of an RecurringQuote by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringQuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringQuote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringQuote = apiInstance.updateRecurringQuote(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringQuotesApi#updateRecurringQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringQuotesApi#updateRecurringQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringQuote Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringQuote**](RecurringQuote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

