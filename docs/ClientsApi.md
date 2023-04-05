# ClientsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkClients**](ClientsApi.md#bulkClients) | **POST** /api/v1/clients/bulk | Bulk client actions
[**clientStatement**](ClientsApi.md#clientStatement) | **POST** /api/v1/client_statement | Client statement PDF
[**deleteClient**](ClientsApi.md#deleteClient) | **DELETE** /api/v1/clients/{id} | Delete client
[**editClient**](ClientsApi.md#editClient) | **GET** /api/v1/clients/{id}/edit | Edit Client
[**getClients**](ClientsApi.md#getClients) | **GET** /api/v1/clients | List clients
[**getClientsCreate**](ClientsApi.md#getClientsCreate) | **GET** /api/v1/clients/create | Blank Client
[**mergeClient**](ClientsApi.md#mergeClient) | **POST** /api/v1/clients/{id}/{mergeable_client_hashed_id}/merge | Merge client
[**purgeClient**](ClientsApi.md#purgeClient) | **POST** /api/v1/clients/{id}/purge | Purge client
[**showClient**](ClientsApi.md#showClient) | **GET** /api/v1/clients/{id} | Show client
[**storeClient**](ClientsApi.md#storeClient) | **POST** /api/v1/clients | Create client
[**updateClient**](ClientsApi.md#updateClient) | **PUT** /api/v1/clients/{id} | Update client
[**uploadClient**](ClientsApi.md#uploadClient) | **PUT** /api/v1/clients/{id}/upload | Add client document


<a name="bulkClients"></a>
# **bulkClients**
> Client bulkClients(X_API_TOKEN, xRequestedWith, requestBody, index)

Bulk client actions

Archive / Restore / Delete in bulk

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | User credentials
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : Client = apiInstance.bulkClients(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#bulkClients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#bulkClients")
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

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clientStatement"></a>
# **clientStatement**
> Client clientStatement(X_API_TOKEN, xRequestedWith, clientStatementRequest, include)

Client statement PDF

Return a PDF of the client statement

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val clientStatementRequest : ClientStatementRequest =  // ClientStatementRequest | Statment Options
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Client = apiInstance.clientStatement(X_API_TOKEN, xRequestedWith, clientStatementRequest, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#clientStatement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#clientStatement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **clientStatementRequest** | [**ClientStatementRequest**](ClientStatementRequest.md)| Statment Options |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClient"></a>
# **deleteClient**
> deleteClient(X_API_TOKEN, xRequestedWith, id, include)

Delete client

Handles the deletion of a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Client Hashed ID
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
try {
    apiInstance.deleteClient(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#deleteClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#deleteClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Client Hashed ID |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editClient"></a>
# **editClient**
> Client editClient(X_API_TOKEN, xRequestedWith, id, include)

Edit Client

Displays a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Client Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Client = apiInstance.editClient(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#editClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#editClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Client Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClients"></a>
# **getClients**
> ClientArrayWrapped getClients(X_API_TOKEN, xRequestedWith, include, index, status, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, name, balance, betweenBalance, email, idNumber, number, filter, sort)

List clients

Lists clients. Fine grained filtering is also available using query parameters. 

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
val status : kotlin.String = ?status=archived,deleted // kotlin.String | Filter the entity based on their status. ie active / archived / deleted. Format is a comma separated string with any of the following options:   - active - archived - deleted 
val createdAt : kotlin.Int = ?created_at=2022-01-10 // kotlin.Int | Filters the entity list by the created at timestamp. Parameter value can be a datetime string or unix timestamp 
val updatedAt : kotlin.Int = ?updated_at=2022-01-10 // kotlin.Int | Filters the entity list by the updated at timestamp. Parameter value can be a datetime string or unix timestamp 
val isDeleted : kotlin.Boolean = ?is_deleted=true // kotlin.Boolean | Filters the entity list by entities that have been deleted. 
val filterDeletedClients : kotlin.String = ?filter_deleted_clients=true // kotlin.String | Filters the entity list and only returns entities for clients that have not been deleted 
val vendorId : kotlin.String = ?vendor_id={vendor_id} // kotlin.String | Filters the entity list by an associated vendor 
val name : kotlin.String = bob // kotlin.String | Filter by client name
val balance : kotlin.String = lt:10 // kotlin.String | Filter by client balance, format uses an operator and value separated by a colon. lt,lte, gt, gte, eq
val betweenBalance : kotlin.String = 10:100 // kotlin.String | Filter between client balances, format uses two values separated by a colon
val email : kotlin.String = bob@gmail.com // kotlin.String | Filter by client email
val idNumber : kotlin.String = a1039883 // kotlin.String | Filter by client id_number
val number : kotlin.String = a1039883 // kotlin.String | Filter by client number
val filter : kotlin.String = a1039883 // kotlin.String | Filters clients on columns - name, id_number, contact.first_name contact.last_name, contact.email, custom_value1-4
val sort : kotlin.String = id|desc name|desc balance|asc // kotlin.String | Returns the list sorted by column in ascending or descending order.
try {
    val result : ClientArrayWrapped = apiInstance.getClients(X_API_TOKEN, xRequestedWith, include, index, status, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, name, balance, betweenBalance, email, idNumber, number, filter, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#getClients")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#getClients")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]
 **status** | **kotlin.String**| Filter the entity based on their status. ie active / archived / deleted. Format is a comma separated string with any of the following options:   - active - archived - deleted  | [optional]
 **createdAt** | **kotlin.Int**| Filters the entity list by the created at timestamp. Parameter value can be a datetime string or unix timestamp  | [optional]
 **updatedAt** | **kotlin.Int**| Filters the entity list by the updated at timestamp. Parameter value can be a datetime string or unix timestamp  | [optional]
 **isDeleted** | **kotlin.Boolean**| Filters the entity list by entities that have been deleted.  | [optional]
 **filterDeletedClients** | **kotlin.String**| Filters the entity list and only returns entities for clients that have not been deleted  | [optional]
 **vendorId** | **kotlin.String**| Filters the entity list by an associated vendor  | [optional]
 **name** | **kotlin.String**| Filter by client name | [optional]
 **balance** | **kotlin.String**| Filter by client balance, format uses an operator and value separated by a colon. lt,lte, gt, gte, eq | [optional]
 **betweenBalance** | **kotlin.String**| Filter between client balances, format uses two values separated by a colon | [optional]
 **email** | **kotlin.String**| Filter by client email | [optional]
 **idNumber** | **kotlin.String**| Filter by client id_number | [optional]
 **number** | **kotlin.String**| Filter by client number | [optional]
 **filter** | **kotlin.String**| Filters clients on columns - name, id_number, contact.first_name contact.last_name, contact.email, custom_value1-4 | [optional]
 **sort** | **kotlin.String**| Returns the list sorted by column in ascending or descending order. | [optional]

### Return type

[**ClientArrayWrapped**](ClientArrayWrapped.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClientsCreate"></a>
# **getClientsCreate**
> Client getClientsCreate(X_API_TOKEN, xRequestedWith, include)

Blank Client

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
try {
    val result : Client = apiInstance.getClientsCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#getClientsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#getClientsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]

### Return type

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mergeClient"></a>
# **mergeClient**
> mergeClient(X_API_TOKEN, xRequestedWith, id, mergeableClientHashedId, include)

Merge client

Handles merging 2 clients

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Client Hashed ID
val mergeableClientHashedId : kotlin.String = D2J234DFA // kotlin.String | The Mergeable Client Hashed ID
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
try {
    apiInstance.mergeClient(X_API_TOKEN, xRequestedWith, id, mergeableClientHashedId, include)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#mergeClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#mergeClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Client Hashed ID |
 **mergeableClientHashedId** | **kotlin.String**| The Mergeable Client Hashed ID |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="purgeClient"></a>
# **purgeClient**
> purgeClient(X_API_TOKEN, xRequestedWith, id, include)

Purge client

Handles purging a client

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Client Hashed ID
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
try {
    apiInstance.purgeClient(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#purgeClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#purgeClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Client Hashed ID |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showClient"></a>
# **showClient**
> Client showClient(X_API_TOKEN, xRequestedWith, id, include)

Show client

Displays a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Client Hashed ID
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
try {
    val result : Client = apiInstance.showClient(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#showClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#showClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Client Hashed ID |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]

### Return type

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeClient"></a>
# **storeClient**
> ClientWrapped storeClient(X_API_TOKEN, xRequestedWith, client, include)

Create client

Adds a client to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val client : Client =  // Client | A request body for creating new client
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
try {
    val result : ClientWrapped = apiInstance.storeClient(X_API_TOKEN, xRequestedWith, client, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#storeClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#storeClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **client** | [**Client**](Client.md)| A request body for creating new client |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]

### Return type

[**ClientWrapped**](ClientWrapped.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClient"></a>
# **updateClient**
> Client updateClient(X_API_TOKEN, xRequestedWith, id, include)

Update client

Handles the updating of a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Client Hashed ID
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
try {
    val result : Client = apiInstance.updateClient(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#updateClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#updateClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Client Hashed ID |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]

### Return type

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadClient"></a>
# **uploadClient**
> Client uploadClient(X_API_TOKEN, xRequestedWith, id, include, method, documents)

Add client document

Handles the uploading of a document to a client, please note due to a quirk in REST you will need to use a _method parameter with value of POST

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ClientsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Client Hashed ID
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
val method : kotlin.String = method_example // kotlin.String | 
val documents : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | 
try {
    val result : Client = apiInstance.uploadClient(X_API_TOKEN, xRequestedWith, id, include, method, documents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClientsApi#uploadClient")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientsApi#uploadClient")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Client Hashed ID |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]
 **method** | **kotlin.String**|  | [optional]
 **documents** | **kotlin.collections.List&lt;java.io.File&gt;**|  | [optional]

### Return type

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

