# ProductsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkProducts**](ProductsApi.md#bulkProducts) | **POST** /api/v1/products/bulk | Bulk product actions
[**deleteProduct**](ProductsApi.md#deleteProduct) | **DELETE** /api/v1/products/{id} | Delete product
[**editProduct**](ProductsApi.md#editProduct) | **GET** /api/v1/products/{id}/edit | Edit product
[**getProducts**](ProductsApi.md#getProducts) | **GET** /api/v1/products | List products
[**getProductsCreate**](ProductsApi.md#getProductsCreate) | **GET** /api/v1/products/create | Blank product
[**showProduct**](ProductsApi.md#showProduct) | **GET** /api/v1/products/{id} | Show product
[**storeProduct**](ProductsApi.md#storeProduct) | **POST** /api/v1/products | Create Product
[**updateProduct**](ProductsApi.md#updateProduct) | **PUT** /api/v1/products/{id} | Update product
[**uploadProduct**](ProductsApi.md#uploadProduct) | **PUT** /api/v1/products/{id}/upload | Add product document


<a name="bulkProducts"></a>
# **bulkProducts**
> Product bulkProducts(X_API_TOKEN, xRequestedWith, requestBody, index)

Bulk product actions

Archive / Restore / Delete in bulk

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Hashed IDs
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : Product = apiInstance.bulkProducts(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#bulkProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#bulkProducts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Hashed IDs |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**Product**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(X_API_TOKEN, xRequestedWith, id, include)

Delete product

Handles the deletion of a product by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Product Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteProduct(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#deleteProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#deleteProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Product Hashed ID |
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

<a name="editProduct"></a>
# **editProduct**
> Product editProduct(X_API_TOKEN, xRequestedWith, id, include)

Edit product

Displays an Product by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Product Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Product = apiInstance.editProduct(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#editProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#editProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Product Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Product**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> Product getProducts(X_API_TOKEN, xRequestedWith, include, status, clientId, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, filter, productKey, sort)

List products

Lists products, search and filters allow fine grained lists to be generated.     Query parameters can be added to perform fine grained filtering of the products list, these are handled by the ProductFilters class which defines the methods available 

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
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
val filter : kotlin.String = bob // kotlin.String | Filter by product name
val productKey : kotlin.String = bob // kotlin.String | Filter by product key
val sort : kotlin.String = id|desc product_key|desc // kotlin.String | Returns the list sorted by column in ascending or descending order.
try {
    val result : Product = apiInstance.getProducts(X_API_TOKEN, xRequestedWith, include, status, clientId, createdAt, updatedAt, isDeleted, filterDeletedClients, vendorId, filter, productKey, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#getProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#getProducts")
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
 **filter** | **kotlin.String**| Filter by product name | [optional]
 **productKey** | **kotlin.String**| Filter by product key | [optional]
 **sort** | **kotlin.String**| Returns the list sorted by column in ascending or descending order. | [optional]

### Return type

[**Product**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductsCreate"></a>
# **getProductsCreate**
> Product getProductsCreate(X_API_TOKEN, xRequestedWith, include)

Blank product

Returns a blank product object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Product = apiInstance.getProductsCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#getProductsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#getProductsCreate")
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

[**Product**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showProduct"></a>
# **showProduct**
> Product showProduct(X_API_TOKEN, xRequestedWith, id, include)

Show product

Displays a product by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Product Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Product = apiInstance.showProduct(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#showProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#showProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Product Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Product**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeProduct"></a>
# **storeProduct**
> Product storeProduct(X_API_TOKEN, xRequestedWith, include)

Create Product

Adds a product to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Product = apiInstance.storeProduct(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#storeProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#storeProduct")
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

[**Product**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProduct"></a>
# **updateProduct**
> Product updateProduct(X_API_TOKEN, xRequestedWith, id, include)

Update product

Handles the updating of a product by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Product Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Product = apiInstance.updateProduct(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#updateProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#updateProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Product Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Product**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadProduct"></a>
# **uploadProduct**
> Product uploadProduct(X_API_TOKEN, xRequestedWith, id, include, method, documents)

Add product document

Handles the uploading of a document to a product

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ProductsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Product Hashed ID
val include : kotlin.String = activities // kotlin.String | Include child relationships of the Client Object.
val method : kotlin.String = method_example // kotlin.String | 
val documents : kotlin.collections.List<kotlin.Any> =  // kotlin.collections.List<kotlin.Any> | 
try {
    val result : Product = apiInstance.uploadProduct(X_API_TOKEN, xRequestedWith, id, include, method, documents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#uploadProduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#uploadProduct")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Product Hashed ID |
 **include** | **kotlin.String**| Include child relationships of the Client Object. | [optional]
 **method** | **kotlin.String**|  | [optional]
 **documents** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)|  | [optional]

### Return type

[**Product**](Product.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

