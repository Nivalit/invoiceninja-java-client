# PurchaseOrdersApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionPurchaseOrder**](PurchaseOrdersApiAdapter.md#actionPurchaseOrder) | **GET** /api/v1/purchase_orders/{id}/{action} | Custom purchase order actions
[**bulkPurchaseOrderss**](PurchaseOrdersApiAdapter.md#bulkPurchaseOrderss) | **POST** /api/v1/purchase_orders/bulk | Bulk purchase order action
[**deletePurchaseOrder**](PurchaseOrdersApiAdapter.md#deletePurchaseOrder) | **DELETE** /api/v1/purchase_order/{id} | Delete purchase order
[**downloadPurchaseOrder**](PurchaseOrdersApiAdapter.md#downloadPurchaseOrder) | **GET** /api/v1/purchase_order/{invitation_key}/download | Download a purchase order PDF
[**editPurchaseOrder**](PurchaseOrdersApiAdapter.md#editPurchaseOrder) | **GET** /api/v1/purchase_orders/{id}/edit | Edit purchase order
[**getPurchaseOrderCreate**](PurchaseOrdersApiAdapter.md#getPurchaseOrderCreate) | **GET** /api/v1/purchase_orders/create | Blank purchase order
[**getPurchaseOrders**](PurchaseOrdersApiAdapter.md#getPurchaseOrders) | **GET** /api/v1/purchase_orders | List purchase orders
[**showPurchaseOrder**](PurchaseOrdersApiAdapter.md#showPurchaseOrder) | **GET** /api/v1/purchase_orders/{id} | Show purchase order
[**storePurchaseOrder**](PurchaseOrdersApiAdapter.md#storePurchaseOrder) | **POST** /api/v1/purchase_orders | Create purchase order
[**updatePurchaseOrder**](PurchaseOrdersApiAdapter.md#updatePurchaseOrder) | **PUT** /api/v1/purchase_order/{id} | Update purchase order
[**uploadPurchaseOrder**](PurchaseOrdersApiAdapter.md#uploadPurchaseOrder) | **PUT** /api/v1/purchase_orders/{id}/upload | Uploads a purchase order document


<a name="actionPurchaseOrder"></a>
# **actionPurchaseOrder**
> Invoice actionPurchaseOrder(X_API_TOKEN, xRequestedWith, id, action, include)

Custom purchase order actions

Performs a custom action on an purchase order.      *      *        The current range of actions are as follows      *        - mark_paid      *        - download      *        - archive      *        - delete      *        - email

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Purchase Order Hashed ID
val action : kotlin.String = clone_to_quote // kotlin.String | The action string to be performed
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.actionPurchaseOrder(X_API_TOKEN, xRequestedWith, id, action, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#actionPurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#actionPurchaseOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Purchase Order Hashed ID |
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

<a name="bulkPurchaseOrderss"></a>
# **bulkPurchaseOrderss**
> bulkPurchaseOrderss(X_API_TOKEN, xRequestedWith, requestBody, index)

Bulk purchase order action



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Purchase Order IDS
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    apiInstance.bulkPurchaseOrderss(X_API_TOKEN, xRequestedWith, requestBody, index)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#bulkPurchaseOrderss")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#bulkPurchaseOrderss")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Purchase Order IDS |
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

<a name="deletePurchaseOrder"></a>
# **deletePurchaseOrder**
> deletePurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)

Delete purchase order

Handles the deletion of an purchase orders by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The purhcase order Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deletePurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#deletePurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#deletePurchaseOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The purhcase order Hashed ID |
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

<a name="downloadPurchaseOrder"></a>
# **downloadPurchaseOrder**
> downloadPurchaseOrder(X_API_TOKEN, xRequestedWith, invitationKey, include)

Download a purchase order PDF

Downloads a specific purchase order

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val invitationKey : kotlin.String = D2J234DFA // kotlin.String | The Purchase Order Invitation Key
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.downloadPurchaseOrder(X_API_TOKEN, xRequestedWith, invitationKey, include)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#downloadPurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#downloadPurchaseOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **invitationKey** | **kotlin.String**| The Purchase Order Invitation Key |
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

<a name="editPurchaseOrder"></a>
# **editPurchaseOrder**
> Invoice editPurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)

Edit purchase order

Displays an purchase order by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The purchase order Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.editPurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#editPurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#editPurchaseOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The purchase order Hashed ID |
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

<a name="getPurchaseOrderCreate"></a>
# **getPurchaseOrderCreate**
> Credit getPurchaseOrderCreate(X_API_TOKEN, xRequestedWith, include)

Blank purchase order

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Credit = apiInstance.getPurchaseOrderCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#getPurchaseOrderCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#getPurchaseOrderCreate")
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

[**Credit**](Credit.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPurchaseOrders"></a>
# **getPurchaseOrders**
> Credit getPurchaseOrders(X_API_TOKEN, xRequestedWith, include)

List purchase orders

Lists purchase orders, search and filters allow fine grained lists to be generated.      *      *      Query parameters can be added to performed more fine grained filtering of the purchase orders, these are handled by the PurchaseOrderFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Credit = apiInstance.getPurchaseOrders(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#getPurchaseOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#getPurchaseOrders")
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

[**Credit**](Credit.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showPurchaseOrder"></a>
# **showPurchaseOrder**
> Credit showPurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)

Show purchase order

Displays an purchase order by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Purchase order Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Credit = apiInstance.showPurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#showPurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#showPurchaseOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Purchase order Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Credit**](Credit.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storePurchaseOrder"></a>
# **storePurchaseOrder**
> Credit storePurchaseOrder(X_API_TOKEN, xRequestedWith, include)

Create purchase order

Adds an purchase order to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Credit = apiInstance.storePurchaseOrder(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#storePurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#storePurchaseOrder")
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

[**Credit**](Credit.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePurchaseOrder"></a>
# **updatePurchaseOrder**
> Credit updatePurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)

Update purchase order

Handles the updating of an purchase order by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The purchase order Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Credit = apiInstance.updatePurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#updatePurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#updatePurchaseOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The purchase order Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Credit**](Credit.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadPurchaseOrder"></a>
# **uploadPurchaseOrder**
> Vendor uploadPurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)

Uploads a purchase order document

Handles the uploading of a document to a purchase_order

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = PurchaseOrdersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Purchase Order Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Vendor = apiInstance.uploadPurchaseOrder(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PurchaseOrdersApiAdapter#uploadPurchaseOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PurchaseOrdersApiAdapter#uploadPurchaseOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Purchase Order Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**Vendor**](Vendor.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

