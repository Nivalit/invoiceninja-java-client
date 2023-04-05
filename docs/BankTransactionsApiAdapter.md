# BankTransactionsApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkBankTransactions**](BankTransactionsApiAdapter.md#bulkBankTransactions) | **POST** /api/v1/bank_transations/bulk | Performs bulk actions on an array of bank_transations
[**deleteBankTransaction**](BankTransactionsApiAdapter.md#deleteBankTransaction) | **DELETE** /api/v1/bank_transactions/{id} | Deletes a bank_transaction
[**editBankTransaction**](BankTransactionsApiAdapter.md#editBankTransaction) | **GET** /api/v1/bank_transactions/{id}/edit | Shows a bank_transaction for editing
[**getBankTransactions**](BankTransactionsApiAdapter.md#getBankTransactions) | **GET** /api/v1/bank_transactions | Gets a list of bank_transactions
[**getBankTransactionsCreate**](BankTransactionsApiAdapter.md#getBankTransactionsCreate) | **GET** /api/v1/bank_transactions/create | Gets a new blank bank_transaction object
[**matchBankTransactions**](BankTransactionsApiAdapter.md#matchBankTransactions) | **POST** /api/v1/bank_transations/match | Performs match actions on an array of bank_transactions
[**showBankTransaction**](BankTransactionsApiAdapter.md#showBankTransaction) | **GET** /api/v1/bank_transactions/{id} | Shows a bank_transaction
[**storeBankTransaction**](BankTransactionsApiAdapter.md#storeBankTransaction) | **POST** /api/v1/bank_transactions | Adds a bank_transaction
[**updateBankTransaction**](BankTransactionsApiAdapter.md#updateBankTransaction) | **PUT** /api/v1/bank_transactions/{id} | Updates a bank_transaction


<a name="bulkBankTransactions"></a>
# **bulkBankTransactions**
> bulkBankTransactions(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of bank_transations



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Action paramters
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    apiInstance.bulkBankTransactions(X_API_TOKEN, xRequestedWith, requestBody, index)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#bulkBankTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#bulkBankTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Action paramters |
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

<a name="deleteBankTransaction"></a>
# **deleteBankTransaction**
> deleteBankTransaction(X_API_TOKEN, xRequestedWith, id, include)

Deletes a bank_transaction

Handles the deletion of a bank_transaction by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The BankTransaction Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteBankTransaction(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#deleteBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#deleteBankTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The BankTransaction Hashed ID |
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

<a name="editBankTransaction"></a>
# **editBankTransaction**
> BankTransaction editBankTransaction(X_API_TOKEN, xRequestedWith, id, include)

Shows a bank_transaction for editing

Displays a bank_transaction by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The BankTransaction Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransaction = apiInstance.editBankTransaction(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#editBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#editBankTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The BankTransaction Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankTransaction**](BankTransaction.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankTransactions"></a>
# **getBankTransactions**
> BankTransaction getBankTransactions(X_API_TOKEN, xRequestedWith, include, index, rows)

Gets a list of bank_transactions

Lists all bank integrations

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
val rows : java.math.BigDecimal = 50 // java.math.BigDecimal | The number of bank integrations to return
try {
    val result : BankTransaction = apiInstance.getBankTransactions(X_API_TOKEN, xRequestedWith, include, index, rows)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#getBankTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#getBankTransactions")
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
 **rows** | **java.math.BigDecimal**| The number of bank integrations to return | [optional]

### Return type

[**BankTransaction**](BankTransaction.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankTransactionsCreate"></a>
# **getBankTransactionsCreate**
> BankTransaction getBankTransactionsCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank bank_transaction object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransaction = apiInstance.getBankTransactionsCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#getBankTransactionsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#getBankTransactionsCreate")
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

[**BankTransaction**](BankTransaction.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="matchBankTransactions"></a>
# **matchBankTransactions**
> matchBankTransactions(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs match actions on an array of bank_transactions



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Action paramters
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    apiInstance.matchBankTransactions(X_API_TOKEN, xRequestedWith, requestBody, index)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#matchBankTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#matchBankTransactions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Action paramters |
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

<a name="showBankTransaction"></a>
# **showBankTransaction**
> BankTransaction showBankTransaction(X_API_TOKEN, xRequestedWith, id, include)

Shows a bank_transaction

Displays a bank_transaction by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The BankTransaction Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransaction = apiInstance.showBankTransaction(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#showBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#showBankTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The BankTransaction Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankTransaction**](BankTransaction.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeBankTransaction"></a>
# **storeBankTransaction**
> BankTransaction storeBankTransaction(X_API_TOKEN, xRequestedWith, include)

Adds a bank_transaction

Adds an bank_transaction to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransaction = apiInstance.storeBankTransaction(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#storeBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#storeBankTransaction")
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

[**BankTransaction**](BankTransaction.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBankTransaction"></a>
# **updateBankTransaction**
> BankTransaction updateBankTransaction(X_API_TOKEN, xRequestedWith, id, include)

Updates a bank_transaction

Handles the updating of a bank_transaction by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionsApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The BankTransaction Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransaction = apiInstance.updateBankTransaction(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionsApiAdapter#updateBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionsApiAdapter#updateBankTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The BankTransaction Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankTransaction**](BankTransaction.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

