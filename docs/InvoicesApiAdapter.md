# InvoicesApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionInvoice**](InvoicesApiAdapter.md#actionInvoice) | **GET** /api/v1/invoices/{id}/{action} | Custom invoice action
[**bulkInvoices**](InvoicesApiAdapter.md#bulkInvoices) | **POST** /api/v1/invoices/bulk | Bulk invoice actions
[**deleteInvoice**](InvoicesApiAdapter.md#deleteInvoice) | **DELETE** /api/v1/invoices/{id} | Delete invoice
[**deliveryNote**](InvoicesApiAdapter.md#deliveryNote) | **GET** /api/v1/invoices/{id}/delivery_note | Download delivery note
[**downloadInvoice**](InvoicesApiAdapter.md#downloadInvoice) | **GET** /api/v1/invoice/{invitation_key}/download | Download invoice PDF
[**editInvoice**](InvoicesApiAdapter.md#editInvoice) | **GET** /api/v1/invoices/{id}/edit | Edit invoice
[**getInvoices**](InvoicesApiAdapter.md#getInvoices) | **GET** /api/v1/invoices | List invoices
[**getInvoicesCreate**](InvoicesApiAdapter.md#getInvoicesCreate) | **GET** /api/v1/invoices/create | Blank invoice
[**showInvoice**](InvoicesApiAdapter.md#showInvoice) | **GET** /api/v1/invoices/{id} | Show invoice
[**storeInvoice**](InvoicesApiAdapter.md#storeInvoice) | **POST** /api/v1/invoices | Create invoice
[**updateInvoice**](InvoicesApiAdapter.md#updateInvoice) | **PUT** /api/v1/invoices/{id} | Update invoice
[**uploadInvoice**](InvoicesApiAdapter.md#uploadInvoice) | **POST** /api/v1/invoices/{id}/upload | Add invoice document


<a name="actionInvoice"></a>
# **actionInvoice**
> Invoice actionInvoice(X_API_TOKEN, xRequestedWith, id, action, include)

Custom invoice action

Performs a custom action on an invoice.   The current range of actions are as follows   - clone_to_invoice   - clone_to_quote   - history   - delivery_note   - mark_paid   - download   - archive   - delete   - email 

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Invoice Hashed ID
val action : kotlin.String = clone_to_quote // kotlin.String | The action string to be performed
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.actionInvoice(X_API_TOKEN, xRequestedWith, id, action, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#actionInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#actionInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Invoice Hashed ID |
 **action** | **kotlin.String**| The action string to be performed |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Invoice**](Invoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bulkInvoices"></a>
# **bulkInvoices**
> bulkInvoices(X_API_TOKEN, xRequestedWith, bulkInvoicesRequest, index)

Bulk invoice actions

There are multiple actions that are available including: 

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val bulkInvoicesRequest : BulkInvoicesRequest =  // BulkInvoicesRequest | Bulk action details
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    apiInstance.bulkInvoices(X_API_TOKEN, xRequestedWith, bulkInvoicesRequest, index)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#bulkInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#bulkInvoices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **bulkInvoicesRequest** | [**BulkInvoicesRequest**](BulkInvoicesRequest.md)| Bulk action details |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInvoice"></a>
# **deleteInvoice**
> deleteInvoice(X_API_TOKEN, xRequestedWith, id, include)

Delete invoice

Handles the deletion of an invoice by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Invoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteInvoice(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#deleteInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#deleteInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Invoice Hashed ID |
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

<a name="deliveryNote"></a>
# **deliveryNote**
> deliveryNote(X_API_TOKEN, xRequestedWith, id, include)

Download delivery note

Downloads a specific invoice delivery notes

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Invoice Hahsed Id
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deliveryNote(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#deliveryNote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#deliveryNote")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Invoice Hahsed Id |
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

<a name="downloadInvoice"></a>
# **downloadInvoice**
> downloadInvoice(X_API_TOKEN, xRequestedWith, invitationKey, include)

Download invoice PDF

Downloads a specific invoice

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val invitationKey : kotlin.String = D2J234DFA // kotlin.String | The Invoice Invitation Key
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.downloadInvoice(X_API_TOKEN, xRequestedWith, invitationKey, include)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#downloadInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#downloadInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **invitationKey** | **kotlin.String**| The Invoice Invitation Key |
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

<a name="editInvoice"></a>
# **editInvoice**
> Invoice editInvoice(X_API_TOKEN, xRequestedWith, id, include)

Edit invoice

Displays an invoice by id for editting

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Invoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.editInvoice(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#editInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#editInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Invoice Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Invoice**](Invoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoices"></a>
# **getInvoices**
> Invoice getInvoices(X_API_TOKEN, xRequestedWith, include, status, clientId, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, clientStatus, number, filter, withoutDeletedClients, overdue, payable, sort, privateNotes)

List invoices

Lists invoices with the option to chain multiple query parameters allowing fine grained filtering of the list.   

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
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
val clientStatus : kotlin.String = ?client_status=paid,unpaid // kotlin.String | A comma separated list of invoice status strings. Valid options include:   - all - paid   - unpaid   - overdue 
val number : kotlin.String = ?number=INV-001 // kotlin.String | Search invoices by invoice number 
val filter : kotlin.String = ?filter=bob // kotlin.String | Searches across a range of columns including:   - number   - po_number   - date   - amount   - balance   - custom_value1   - custom_value2   - custom_value3   - custom_value4 
val withoutDeletedClients : kotlin.String = ?without_deleted_clients= // kotlin.String | Returns the invoice list without the invoices of deleted clients. 
val overdue : kotlin.String = ?over_due= // kotlin.String | Returns the list of invoices that are overdue 
val payable : kotlin.String = ?payable={client_id} // kotlin.String | Returns the invoice list that are payable for a defined client. Please note, you must pass the client_id as the value for this query parameter 
val sort : kotlin.String = id|desc number|desc balance|asc // kotlin.String | Returns the list sorted by column in ascending or descending order.
val privateNotes : kotlin.String = ?private_notes=super secret // kotlin.String | Searches on the private_notes field of the invoices 
try {
    val result : Invoice = apiInstance.getInvoices(X_API_TOKEN, xRequestedWith, include, status, clientId, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, clientStatus, number, filter, withoutDeletedClients, overdue, payable, sort, privateNotes)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#getInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#getInvoices")
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
 **clientStatus** | **kotlin.String**| A comma separated list of invoice status strings. Valid options include:   - all - paid   - unpaid   - overdue  | [optional]
 **number** | **kotlin.String**| Search invoices by invoice number  | [optional]
 **filter** | **kotlin.String**| Searches across a range of columns including:   - number   - po_number   - date   - amount   - balance   - custom_value1   - custom_value2   - custom_value3   - custom_value4  | [optional]
 **withoutDeletedClients** | **kotlin.String**| Returns the invoice list without the invoices of deleted clients.  | [optional]
 **overdue** | **kotlin.String**| Returns the list of invoices that are overdue  | [optional]
 **payable** | **kotlin.String**| Returns the invoice list that are payable for a defined client. Please note, you must pass the client_id as the value for this query parameter  | [optional]
 **sort** | **kotlin.String**| Returns the list sorted by column in ascending or descending order. | [optional]
 **privateNotes** | **kotlin.String**| Searches on the private_notes field of the invoices  | [optional]

### Return type

[**Invoice**](Invoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoicesCreate"></a>
# **getInvoicesCreate**
> Invoice getInvoicesCreate(X_API_TOKEN, xRequestedWith, include)

Blank invoice

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.getInvoicesCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#getInvoicesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#getInvoicesCreate")
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

[**Invoice**](Invoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showInvoice"></a>
# **showInvoice**
> Invoice showInvoice(X_API_TOKEN, xRequestedWith, id, include)

Show invoice

Displays an invoice by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Invoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.showInvoice(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#showInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#showInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Invoice Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Invoice**](Invoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeInvoice"></a>
# **storeInvoice**
> Invoice storeInvoice(X_API_TOKEN, xRequestedWith, fillableInvoice, include)

Create invoice

Adds a invoice to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val fillableInvoice : FillableInvoice =  // FillableInvoice | 
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.storeInvoice(X_API_TOKEN, xRequestedWith, fillableInvoice, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#storeInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#storeInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **fillableInvoice** | [**FillableInvoice**](FillableInvoice.md)|  |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Invoice**](Invoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInvoice"></a>
# **updateInvoice**
> Invoice updateInvoice(X_API_TOKEN, xRequestedWith, id, include)

Update invoice

Handles the updating of an invoice by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Invoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.updateInvoice(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#updateInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#updateInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Invoice Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Invoice**](Invoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadInvoice"></a>
# **uploadInvoice**
> Invoice uploadInvoice(X_API_TOKEN, xRequestedWith, id, include, method, documents)

Add invoice document

Handles the uploading of a document to a invoice

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = InvoicesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Invoice Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val method : kotlin.String = method_example // kotlin.String | 
val documents : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | 
try {
    val result : Invoice = apiInstance.uploadInvoice(X_API_TOKEN, xRequestedWith, id, include, method, documents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApiAdapter#uploadInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApiAdapter#uploadInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Invoice Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]
 **method** | **kotlin.String**|  | [optional]
 **documents** | **kotlin.collections.List&lt;java.io.File&gt;**|  | [optional]

### Return type

[**Invoice**](Invoice.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

