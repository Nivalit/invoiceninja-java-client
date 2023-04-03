# QuotesApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionQuote**](QuotesApi.md#actionQuote) | **GET** /api/v1/quotes/{id}/{action} | Performs a custom action on an Quote
[**bulkQuotes**](QuotesApi.md#bulkQuotes) | **POST** /api/v1/quotes/bulk | Bulk quote actions
[**deleteQuote**](QuotesApi.md#deleteQuote) | **DELETE** /api/v1/quotes/{id} | Delete quote
[**downloadCredit**](QuotesApi.md#downloadCredit) | **GET** /api/v1/credit/{invitation_key}/download | Download quote PDF
[**downloadQuote**](QuotesApi.md#downloadQuote) | **GET** /api/v1/quote/{invitation_key}/download | Download quote PDF
[**editQuote**](QuotesApi.md#editQuote) | **GET** /api/v1/quotes/{id}/edit | Edit quote
[**getQuotes**](QuotesApi.md#getQuotes) | **GET** /api/v1/quotes | List quotes
[**getQuotesCreate**](QuotesApi.md#getQuotesCreate) | **GET** /api/v1/quotes/create | Blank quote
[**showQuote**](QuotesApi.md#showQuote) | **GET** /api/v1/quotes/{id} | Show quote
[**storeQuote**](QuotesApi.md#storeQuote) | **POST** /api/v1/quotes | Create quote
[**updateQuote**](QuotesApi.md#updateQuote) | **PUT** /api/v1/quotes/{id} | Update quote
[**uploadQuote**](QuotesApi.md#uploadQuote) | **PUT** /api/v1/quotes/{id}/upload | Upload a quote document


<a name="actionQuote"></a>
# **actionQuote**
> Quote actionQuote(X_API_TOKEN, xRequestedWith, id, action, include)

Performs a custom action on an Quote

Performs a custom action on an Quote.      The current range of actions are as follows     - clone_to_quote     - history     - delivery_note     - mark_paid     - download     - archive     - delete     - convert     - convert_to_invoice     - email

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Quote Hashed ID
val action : kotlin.String = clone_to_quote // kotlin.String | The action string to be performed
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Quote = apiInstance.actionQuote(X_API_TOKEN, xRequestedWith, id, action, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#actionQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#actionQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Quote Hashed ID |
 **action** | **kotlin.String**| The action string to be performed |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bulkQuotes"></a>
# **bulkQuotes**
> Quote bulkQuotes(X_API_TOKEN, xRequestedWith, requestBody, index)

Bulk quote actions



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Hashed ids
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : Quote = apiInstance.bulkQuotes(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#bulkQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#bulkQuotes")
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

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuote"></a>
# **deleteQuote**
> deleteQuote(X_API_TOKEN, xRequestedWith, id, include)

Delete quote

Handles the deletion of an Quote by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Quote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteQuote(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#deleteQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#deleteQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Quote Hashed ID |
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

<a name="downloadCredit"></a>
# **downloadCredit**
> downloadCredit(X_API_TOKEN, xRequestedWith, invitationKey, include)

Download quote PDF

Downloads a specific quote

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val invitationKey : kotlin.String = D2J234DFA // kotlin.String | The Credit Invitation Key
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.downloadCredit(X_API_TOKEN, xRequestedWith, invitationKey, include)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#downloadCredit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#downloadCredit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **invitationKey** | **kotlin.String**| The Credit Invitation Key |
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

<a name="downloadQuote"></a>
# **downloadQuote**
> downloadQuote(X_API_TOKEN, xRequestedWith, invitationKey, include)

Download quote PDF

Downloads a specific quote

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val invitationKey : kotlin.String = D2J234DFA // kotlin.String | The Quote Invitation Key
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.downloadQuote(X_API_TOKEN, xRequestedWith, invitationKey, include)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#downloadQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#downloadQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **invitationKey** | **kotlin.String**| The Quote Invitation Key |
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

<a name="editQuote"></a>
# **editQuote**
> Quote editQuote(X_API_TOKEN, xRequestedWith, id, include)

Edit quote

Displays an Quote by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Quote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Quote = apiInstance.editQuote(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#editQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#editQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Quote Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuotes"></a>
# **getQuotes**
> Quote getQuotes(X_API_TOKEN, xRequestedWith, include, status, clientId, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, filter, clientStatus, number, sort)

List quotes

Lists quotes, search and filters allow fine grained lists to be generated.      *      *      Query parameters can be added to performed more fine grained filtering of the quotes, these are handled by the QuoteFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val status : kotlin.String = ?status=archived,deleted // kotlin.String | Filter the entity based on their status. ie active / archived / deleted. Format is a comma separated string with any of the following options:   - active - archived - deleted 
val clientId : kotlin.String = ?client_id={client_id} // kotlin.String | Filters the entity list by client_id. Suitable when you only want the entities of a specific client. 
val createdAt : kotlin.Int = ?created_at=2022-01-10 // kotlin.Int | Filters the entity list by the created at timestamp. Parameter value can be a datetime string or unix timestamp 
val updatedAt : kotlin.Int = ?updated_at=2022-01-10 // kotlin.Int | Filters the entity list by the updated at timestamp. Parameter value can be a datetime string or unix timestamp 
val isDeleted : kotlin.Boolean = ?is_deleted=true // kotlin.Boolean | Filters the entity list by entities that have been deleted. 
val filterDeletedClients : kotlin.String = ?filter_deleted_clients=true // kotlin.String | Filters the entity list and only returns entities for clients that have not been deleted 
val vendorId : kotlin.String = ?vendor_id={vendor_id} // kotlin.String | Filters the entity list by an associated vendor 
val filter : kotlin.String = ?filter=bob // kotlin.String | Searches across a range of columns including:   - number   - custom_value1   - custom_value2   - custom_value3   - custom_value4 
val clientStatus : kotlin.String = ?client_status=paid,unpaid // kotlin.String | A comma separated list of quote status strings. Valid options include:   - all - draft   - sent   - approved - expired - upcoming 
val number : kotlin.String = ?number=Q-001 // kotlin.String | Search quote by quote number 
val sort : kotlin.String = id|desc number|desc balance|asc // kotlin.String | Returns the list sorted by column in ascending or descending order.
try {
    val result : Quote = apiInstance.getQuotes(X_API_TOKEN, xRequestedWith, include, status, clientId, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, filter, clientStatus, number, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuotes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]
 **status** | **kotlin.String**| Filter the entity based on their status. ie active / archived / deleted. Format is a comma separated string with any of the following options:   - active - archived - deleted  | [optional]
 **clientId** | **kotlin.String**| Filters the entity list by client_id. Suitable when you only want the entities of a specific client.  | [optional]
 **createdAt** | **kotlin.Int**| Filters the entity list by the created at timestamp. Parameter value can be a datetime string or unix timestamp  | [optional]
 **updatedAt** | **kotlin.Int**| Filters the entity list by the updated at timestamp. Parameter value can be a datetime string or unix timestamp  | [optional]
 **isDeleted** | **kotlin.Boolean**| Filters the entity list by entities that have been deleted.  | [optional]
 **filterDeletedClients** | **kotlin.String**| Filters the entity list and only returns entities for clients that have not been deleted  | [optional]
 **vendorId** | **kotlin.String**| Filters the entity list by an associated vendor  | [optional]
 **filter** | **kotlin.String**| Searches across a range of columns including:   - number   - custom_value1   - custom_value2   - custom_value3   - custom_value4  | [optional]
 **clientStatus** | **kotlin.String**| A comma separated list of quote status strings. Valid options include:   - all - draft   - sent   - approved - expired - upcoming  | [optional]
 **number** | **kotlin.String**| Search quote by quote number  | [optional]
 **sort** | **kotlin.String**| Returns the list sorted by column in ascending or descending order. | [optional]

### Return type

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuotesCreate"></a>
# **getQuotesCreate**
> Quote getQuotesCreate(X_API_TOKEN, xRequestedWith, include)

Blank quote

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Quote = apiInstance.getQuotesCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuotesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuotesCreate")
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

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showQuote"></a>
# **showQuote**
> Quote showQuote(X_API_TOKEN, xRequestedWith, id, include)

Show quote

Displays an Quote by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Quote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Quote = apiInstance.showQuote(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#showQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#showQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Quote Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeQuote"></a>
# **storeQuote**
> Quote storeQuote(X_API_TOKEN, xRequestedWith, include)

Create quote

Adds an Quote to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Quote = apiInstance.storeQuote(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#storeQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#storeQuote")
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

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateQuote"></a>
# **updateQuote**
> Quote updateQuote(X_API_TOKEN, xRequestedWith, id, include)

Update quote

Handles the updating of an Quote by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Quote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Quote = apiInstance.updateQuote(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#updateQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#updateQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Quote Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadQuote"></a>
# **uploadQuote**
> Quote uploadQuote(X_API_TOKEN, xRequestedWith, id, include)

Upload a quote document

Handles the uploading of a document to a quote

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = QuotesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Quote Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Quote = apiInstance.uploadQuote(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#uploadQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#uploadQuote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Quote Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Quote**](Quote.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

