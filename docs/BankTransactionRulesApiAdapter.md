# BankTransactionRulesApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkBankTransactionRules**](BankTransactionRulesApiAdapter.md#bulkBankTransactionRules) | **POST** /api/v1/bank_transation_rules/bulk | Performs bulk actions on an array of bank_transation rules
[**deleteBankTransactionRule**](BankTransactionRulesApiAdapter.md#deleteBankTransactionRule) | **DELETE** /api/v1/bank_transaction_rules/{id} | Deletes a bank_transaction rule
[**editBankTransactionRule**](BankTransactionRulesApiAdapter.md#editBankTransactionRule) | **GET** /api/v1/bank_transaction_rules/{id}/edit | Shows a bank_transaction for editing
[**getBankTransactionRules**](BankTransactionRulesApiAdapter.md#getBankTransactionRules) | **GET** /api/v1/bank_transaction_rules | Gets a list of bank_transaction_rules
[**getBankTransactionRulesCreate**](BankTransactionRulesApiAdapter.md#getBankTransactionRulesCreate) | **GET** /api/v1/bank_transaction_rules/create | Gets a new blank bank_transaction rule object
[**showBankTransactionRule**](BankTransactionRulesApiAdapter.md#showBankTransactionRule) | **GET** /api/v1/bank_transaction_rules/{id} | Shows a bank_transaction
[**storeBankTransactionRule**](BankTransactionRulesApiAdapter.md#storeBankTransactionRule) | **POST** /api/v1/bank_transaction_rules | Adds a bank_transaction rule
[**updateBankTransactionRule**](BankTransactionRulesApiAdapter.md#updateBankTransactionRule) | **PUT** /api/v1/bank_transaction_rules/{id} | Updates a bank_transaction Rule


<a name="bulkBankTransactionRules"></a>
# **bulkBankTransactionRules**
> bulkBankTransactionRules(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of bank_transation rules



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionRulesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Action paramters
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    apiInstance.bulkBankTransactionRules(X_API_TOKEN, xRequestedWith, requestBody, index)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionRulesApiAdapter#bulkBankTransactionRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionRulesApiAdapter#bulkBankTransactionRules")
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

<a name="deleteBankTransactionRule"></a>
# **deleteBankTransactionRule**
> deleteBankTransactionRule(X_API_TOKEN, xRequestedWith, id, include)

Deletes a bank_transaction rule

Handles the deletion of a bank_transaction rule by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionRulesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Bank Transaction Rule Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteBankTransactionRule(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionRulesApiAdapter#deleteBankTransactionRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionRulesApiAdapter#deleteBankTransactionRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Bank Transaction Rule Hashed ID |
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

<a name="editBankTransactionRule"></a>
# **editBankTransactionRule**
> BankTransactionRule editBankTransactionRule(X_API_TOKEN, xRequestedWith, id, include)

Shows a bank_transaction for editing

Displays a bank_transaction by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionRulesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Bank Transaction Rule Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransactionRule = apiInstance.editBankTransactionRule(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionRulesApiAdapter#editBankTransactionRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionRulesApiAdapter#editBankTransactionRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Bank Transaction Rule Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankTransactionRule**](BankTransactionRule.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankTransactionRules"></a>
# **getBankTransactionRules**
> BankTransactionRule getBankTransactionRules(X_API_TOKEN, xRequestedWith, include, index, rows)

Gets a list of bank_transaction_rules

Lists all bank transaction rules

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionRulesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
val rows : java.math.BigDecimal = 50 // java.math.BigDecimal | The number of bank integrations to return
try {
    val result : BankTransactionRule = apiInstance.getBankTransactionRules(X_API_TOKEN, xRequestedWith, include, index, rows)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionRulesApiAdapter#getBankTransactionRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionRulesApiAdapter#getBankTransactionRules")
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

[**BankTransactionRule**](BankTransactionRule.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankTransactionRulesCreate"></a>
# **getBankTransactionRulesCreate**
> BankTransactionRule getBankTransactionRulesCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank bank_transaction rule object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionRulesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransactionRule = apiInstance.getBankTransactionRulesCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionRulesApiAdapter#getBankTransactionRulesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionRulesApiAdapter#getBankTransactionRulesCreate")
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

[**BankTransactionRule**](BankTransactionRule.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showBankTransactionRule"></a>
# **showBankTransactionRule**
> BankTransactionRule showBankTransactionRule(X_API_TOKEN, xRequestedWith, id, include)

Shows a bank_transaction

Displays a bank_transaction by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionRulesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Bank Transaction RuleHashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransactionRule = apiInstance.showBankTransactionRule(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionRulesApiAdapter#showBankTransactionRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionRulesApiAdapter#showBankTransactionRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Bank Transaction RuleHashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankTransactionRule**](BankTransactionRule.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeBankTransactionRule"></a>
# **storeBankTransactionRule**
> BankTransactionRule storeBankTransactionRule(X_API_TOKEN, xRequestedWith, include)

Adds a bank_transaction rule

Adds an bank_transaction to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionRulesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransactionRule = apiInstance.storeBankTransactionRule(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionRulesApiAdapter#storeBankTransactionRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionRulesApiAdapter#storeBankTransactionRule")
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

[**BankTransactionRule**](BankTransactionRule.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBankTransactionRule"></a>
# **updateBankTransactionRule**
> BankTransactionRule updateBankTransactionRule(X_API_TOKEN, xRequestedWith, id, include)

Updates a bank_transaction Rule

Handles the updating of a bank_transaction rule by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankTransactionRulesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Bank Transaction Rule Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankTransactionRule = apiInstance.updateBankTransactionRule(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankTransactionRulesApiAdapter#updateBankTransactionRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankTransactionRulesApiAdapter#updateBankTransactionRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Bank Transaction Rule Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankTransactionRule**](BankTransactionRule.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

