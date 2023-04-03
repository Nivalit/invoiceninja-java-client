# RecurringInvoicesApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionRecurringInvoice**](RecurringInvoicesApi.md#actionRecurringInvoice) | **GET** /api/v1/recurring_invoices/{id}/{action} | Custom recurring invoice action
[**bulkRecurringInvoices**](RecurringInvoicesApi.md#bulkRecurringInvoices) | **POST** /api/v1/recurring_invoices/bulk | Bulk recurring invoice actions
[**deleteRecurringInvoice**](RecurringInvoicesApi.md#deleteRecurringInvoice) | **DELETE** /api/v1/recurring_invoices/{id} | Delete recurring invoice
[**downloadRecurringInvoice**](RecurringInvoicesApi.md#downloadRecurringInvoice) | **GET** /api/v1/recurring_invoice/{invitation_key}/download | Download recurring invoice PDF
[**editRecurringInvoice**](RecurringInvoicesApi.md#editRecurringInvoice) | **GET** /api/v1/recurring_invoices/{id}/edit | Edit recurring invoice
[**getRecurringInvoices**](RecurringInvoicesApi.md#getRecurringInvoices) | **GET** /api/v1/recurring_invoices | List recurring invoices
[**getRecurringInvoicesCreate**](RecurringInvoicesApi.md#getRecurringInvoicesCreate) | **GET** /api/v1/recurring_invoices/create | Blank recurring invoice
[**showRecurringInvoice**](RecurringInvoicesApi.md#showRecurringInvoice) | **GET** /api/v1/recurring_invoices/{id} | Show recurring invoice
[**storeRecurringInvoice**](RecurringInvoicesApi.md#storeRecurringInvoice) | **POST** /api/v1/recurring_invoices | Create recurring invoice
[**updateRecurringInvoice**](RecurringInvoicesApi.md#updateRecurringInvoice) | **PUT** /api/v1/recurring_invoices/{id} | Update recurring invoice
[**uploadRecurringInvoice**](RecurringInvoicesApi.md#uploadRecurringInvoice) | **PUT** /api/v1/recurring_invoices/{id}/upload | Add recurring invoice document


<a name="actionRecurringInvoice"></a>
# **actionRecurringInvoice**
> RecurringInvoice actionRecurringInvoice(X_API_TOKEN, xRequestedWith, id, action, include)

Custom recurring invoice action

Performs a custom action on an RecurringInvoice.      The current range of actions are as follows     - clone_to_RecurringInvoice     - clone_to_quote     - history     - delivery_note     - mark_paid     - download     - archive     - delete     - email

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringInvoice Hashed ID
val action : kotlin.String = clone_to_quote // kotlin.String | The action string to be performed
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringInvoice = apiInstance.actionRecurringInvoice(X_API_TOKEN, xRequestedWith, id, action, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#actionRecurringInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#actionRecurringInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringInvoice Hashed ID |
 **action** | **kotlin.String**| The action string to be performed |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bulkRecurringInvoices"></a>
# **bulkRecurringInvoices**
> RecurringInvoice bulkRecurringInvoices(X_API_TOKEN, xRequestedWith, bulkRecurringInvoicesRequest, index)

Bulk recurring invoice actions

There are multiple actions that are available including: 

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val bulkRecurringInvoicesRequest : BulkRecurringInvoicesRequest =  // BulkRecurringInvoicesRequest | Bulk action details
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : RecurringInvoice = apiInstance.bulkRecurringInvoices(X_API_TOKEN, xRequestedWith, bulkRecurringInvoicesRequest, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#bulkRecurringInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#bulkRecurringInvoices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **bulkRecurringInvoicesRequest** | [**BulkRecurringInvoicesRequest**](BulkRecurringInvoicesRequest.md)| Bulk action details |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRecurringInvoice"></a>
# **deleteRecurringInvoice**
> deleteRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)

Delete recurring invoice

Handles the deletion of an RecurringInvoice by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringInvoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#deleteRecurringInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#deleteRecurringInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringInvoice Hashed ID |
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

<a name="downloadRecurringInvoice"></a>
# **downloadRecurringInvoice**
> downloadRecurringInvoice(X_API_TOKEN, xRequestedWith, invitationKey, include)

Download recurring invoice PDF

Downloads a specific invoice

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val invitationKey : kotlin.String = D2J234DFA // kotlin.String | The Recurring Invoice Invitation Key
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.downloadRecurringInvoice(X_API_TOKEN, xRequestedWith, invitationKey, include)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#downloadRecurringInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#downloadRecurringInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **invitationKey** | **kotlin.String**| The Recurring Invoice Invitation Key |
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

<a name="editRecurringInvoice"></a>
# **editRecurringInvoice**
> RecurringInvoice editRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)

Edit recurring invoice

Displays an RecurringInvoice by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringInvoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringInvoice = apiInstance.editRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#editRecurringInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#editRecurringInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringInvoice Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecurringInvoices"></a>
# **getRecurringInvoices**
> RecurringInvoice getRecurringInvoices(X_API_TOKEN, xRequestedWith, include, clientId, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, filter, clientStatus, sort)

List recurring invoices

Lists invoices with the option to chain multiple query parameters allowing fine grained filtering of the list.   

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val clientId : kotlin.String = ?client_id={client_id} // kotlin.String | Filters the entity list by client_id. Suitable when you only want the entities of a specific client. 
val createdAt : kotlin.Int = ?created_at=2022-01-10 // kotlin.Int | Filters the entity list by the created at timestamp. Parameter value can be a datetime string or unix timestamp 
val updatedAt : kotlin.Int = ?updated_at=2022-01-10 // kotlin.Int | Filters the entity list by the updated at timestamp. Parameter value can be a datetime string or unix timestamp 
val isDeleted : kotlin.Boolean = ?is_deleted=true // kotlin.Boolean | Filters the entity list by entities that have been deleted. 
val filterDeletedClients : kotlin.String = ?filter_deleted_clients=true // kotlin.String | Filters the entity list and only returns entities for clients that have not been deleted 
val vendorId : kotlin.String = ?vendor_id={vendor_id} // kotlin.String | Filters the entity list by an associated vendor 
val filter : kotlin.String = ?filter=bob // kotlin.String | Searches across a range of columns including:   - custom_value1   - custom_value2   - custom_value3   - custom_value4 
val clientStatus : kotlin.String = ?client_status=active,paused // kotlin.String | A comma separated list of invoice status strings. Valid options include:   - all - active   - paused   - completed 
val sort : kotlin.String = id|desc number|desc balance|asc // kotlin.String | Returns the list sorted by column in ascending or descending order.
try {
    val result : RecurringInvoice = apiInstance.getRecurringInvoices(X_API_TOKEN, xRequestedWith, include, clientId, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, filter, clientStatus, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#getRecurringInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#getRecurringInvoices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]
 **clientId** | **kotlin.String**| Filters the entity list by client_id. Suitable when you only want the entities of a specific client.  | [optional]
 **createdAt** | **kotlin.Int**| Filters the entity list by the created at timestamp. Parameter value can be a datetime string or unix timestamp  | [optional]
 **updatedAt** | **kotlin.Int**| Filters the entity list by the updated at timestamp. Parameter value can be a datetime string or unix timestamp  | [optional]
 **isDeleted** | **kotlin.Boolean**| Filters the entity list by entities that have been deleted.  | [optional]
 **filterDeletedClients** | **kotlin.String**| Filters the entity list and only returns entities for clients that have not been deleted  | [optional]
 **vendorId** | **kotlin.String**| Filters the entity list by an associated vendor  | [optional]
 **filter** | **kotlin.String**| Searches across a range of columns including:   - custom_value1   - custom_value2   - custom_value3   - custom_value4  | [optional]
 **clientStatus** | **kotlin.String**| A comma separated list of invoice status strings. Valid options include:   - all - active   - paused   - completed  | [optional]
 **sort** | **kotlin.String**| Returns the list sorted by column in ascending or descending order. | [optional]

### Return type

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecurringInvoicesCreate"></a>
# **getRecurringInvoicesCreate**
> RecurringInvoice getRecurringInvoicesCreate(X_API_TOKEN, xRequestedWith, include)

Blank recurring invoice

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringInvoice = apiInstance.getRecurringInvoicesCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#getRecurringInvoicesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#getRecurringInvoicesCreate")
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

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showRecurringInvoice"></a>
# **showRecurringInvoice**
> RecurringInvoice showRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)

Show recurring invoice

Displays an RecurringInvoice by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringInvoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringInvoice = apiInstance.showRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#showRecurringInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#showRecurringInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringInvoice Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeRecurringInvoice"></a>
# **storeRecurringInvoice**
> RecurringInvoice storeRecurringInvoice(X_API_TOKEN, xRequestedWith, include)

Create recurring invoice

Adds a Recurring Invoice to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringInvoice = apiInstance.storeRecurringInvoice(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#storeRecurringInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#storeRecurringInvoice")
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

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRecurringInvoice"></a>
# **updateRecurringInvoice**
> RecurringInvoice updateRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)

Update recurring invoice

Handles the updating of an RecurringInvoice by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringInvoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringInvoice = apiInstance.updateRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#updateRecurringInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#updateRecurringInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringInvoice Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadRecurringInvoice"></a>
# **uploadRecurringInvoice**
> RecurringInvoice uploadRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)

Add recurring invoice document

Handles the uploading of a document to a recurring_invoice

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringInvoicesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringInvoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringInvoice = apiInstance.uploadRecurringInvoice(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringInvoicesApi#uploadRecurringInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringInvoicesApi#uploadRecurringInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringInvoice Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringInvoice**](RecurringInvoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

