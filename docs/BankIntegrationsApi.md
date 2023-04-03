# BankIntegrationsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkBankIntegrations**](BankIntegrationsApi.md#bulkBankIntegrations) | **POST** /api/v1/bank_integrations/bulk | Performs bulk actions on an array of bank_integrations
[**deleteBankIntegration**](BankIntegrationsApi.md#deleteBankIntegration) | **DELETE** /api/v1/bank_integrations/{id} | Deletes a bank_integration
[**editBankIntegration**](BankIntegrationsApi.md#editBankIntegration) | **GET** /api/v1/bank_integrations/{id}/edit | Shows a bank_integration for editing
[**getAccountTransactions**](BankIntegrationsApi.md#getAccountTransactions) | **POST** /api/v1/bank_integrations/get_transactions/account_id | Retrieve transactions for a account
[**getBankIntegrations**](BankIntegrationsApi.md#getBankIntegrations) | **GET** /api/v1/bank_integrations | Returns a list of Bank Integrations
[**getBankIntegrationsCreate**](BankIntegrationsApi.md#getBankIntegrationsCreate) | **GET** /api/v1/bank_integrations/create | Gets a new blank bank_integration object
[**getRefreshAccounts**](BankIntegrationsApi.md#getRefreshAccounts) | **POST** /api/v1/bank_integrations/refresh_accounts | Gets the list of accounts from the remote server
[**getRemoveAccount**](BankIntegrationsApi.md#getRemoveAccount) | **POST** /api/v1/bank_integrations/remove_account/account_id | Removes an account from the integration
[**showBankIntegration**](BankIntegrationsApi.md#showBankIntegration) | **GET** /api/v1/bank_integrations/{id} | Shows a bank_integration
[**storeBankIntegration**](BankIntegrationsApi.md#storeBankIntegration) | **POST** /api/v1/bank_integrations | Adds a bank_integration
[**updateBankIntegration**](BankIntegrationsApi.md#updateBankIntegration) | **PUT** /api/v1/bank_integrations/{id} | Updates a bank_integration


<a name="bulkBankIntegrations"></a>
# **bulkBankIntegrations**
> bulkBankIntegrations(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of bank_integrations



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Action paramters
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    apiInstance.bulkBankIntegrations(X_API_TOKEN, xRequestedWith, requestBody, index)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#bulkBankIntegrations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#bulkBankIntegrations")
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

<a name="deleteBankIntegration"></a>
# **deleteBankIntegration**
> deleteBankIntegration(X_API_TOKEN, xRequestedWith, id, include)

Deletes a bank_integration

Handles the deletion of a bank_integration by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The BankIntegration Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteBankIntegration(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#deleteBankIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#deleteBankIntegration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The BankIntegration Hashed ID |
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

<a name="editBankIntegration"></a>
# **editBankIntegration**
> BankIntegration editBankIntegration(X_API_TOKEN, xRequestedWith, id, include)

Shows a bank_integration for editing

Displays a bank_integration by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The BankIntegration Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankIntegration = apiInstance.editBankIntegration(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#editBankIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#editBankIntegration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The BankIntegration Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountTransactions"></a>
# **getAccountTransactions**
> BankIntegration getAccountTransactions(X_API_TOKEN, xRequestedWith, include)

Retrieve transactions for a account

Retrieve transactions for a account

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankIntegration = apiInstance.getAccountTransactions(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#getAccountTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#getAccountTransactions")
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

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankIntegrations"></a>
# **getBankIntegrations**
> BankIntegration getBankIntegrations(X_API_TOKEN, xRequestedWith, include, index, rows)

Returns a list of Bank Integrations

Lists all bank integrations

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = company // kotlin.String | Include child relations of the BankIntegration object. Format is comma separated.
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
val rows : java.math.BigDecimal = 50 // java.math.BigDecimal | The number of bank integrations to return
try {
    val result : BankIntegration = apiInstance.getBankIntegrations(X_API_TOKEN, xRequestedWith, include, index, rows)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#getBankIntegrations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#getBankIntegrations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Include child relations of the BankIntegration object. Format is comma separated. | [optional]
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]
 **rows** | **java.math.BigDecimal**| The number of bank integrations to return | [optional]

### Return type

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBankIntegrationsCreate"></a>
# **getBankIntegrationsCreate**
> BankIntegration getBankIntegrationsCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank bank_integration object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankIntegration = apiInstance.getBankIntegrationsCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#getBankIntegrationsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#getBankIntegrationsCreate")
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

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRefreshAccounts"></a>
# **getRefreshAccounts**
> BankIntegration getRefreshAccounts(X_API_TOKEN, xRequestedWith, include)

Gets the list of accounts from the remote server

Adds an bank_integration to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankIntegration = apiInstance.getRefreshAccounts(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#getRefreshAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#getRefreshAccounts")
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

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRemoveAccount"></a>
# **getRemoveAccount**
> BankIntegration getRemoveAccount(X_API_TOKEN, xRequestedWith, include)

Removes an account from the integration

Removes an account from the integration

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankIntegration = apiInstance.getRemoveAccount(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#getRemoveAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#getRemoveAccount")
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

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showBankIntegration"></a>
# **showBankIntegration**
> BankIntegration showBankIntegration(X_API_TOKEN, xRequestedWith, id, include)

Shows a bank_integration

Displays a bank_integration by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The BankIntegration Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankIntegration = apiInstance.showBankIntegration(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#showBankIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#showBankIntegration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The BankIntegration Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeBankIntegration"></a>
# **storeBankIntegration**
> BankIntegration storeBankIntegration(X_API_TOKEN, xRequestedWith, include)

Adds a bank_integration

Adds an bank_integration to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankIntegration = apiInstance.storeBankIntegration(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#storeBankIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#storeBankIntegration")
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

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBankIntegration"></a>
# **updateBankIntegration**
> BankIntegration updateBankIntegration(X_API_TOKEN, xRequestedWith, id, include)

Updates a bank_integration

Handles the updating of a bank_integration by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = BankIntegrationsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The BankIntegration Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : BankIntegration = apiInstance.updateBankIntegration(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankIntegrationsApi#updateBankIntegration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankIntegrationsApi#updateBankIntegration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The BankIntegration Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**BankIntegration**](BankIntegration.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

