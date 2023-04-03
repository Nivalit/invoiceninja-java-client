# RecurringExpensesApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkRecurringExpenses**](RecurringExpensesApi.md#bulkRecurringExpenses) | **POST** /api/v1/recurring_expenses/bulk | Performs bulk actions on an array of recurring_expenses
[**deleteRecurringExpense**](RecurringExpensesApi.md#deleteRecurringExpense) | **DELETE** /api/v1/recurring_expenses/{id} | Deletes a client
[**editRecurringExpense**](RecurringExpensesApi.md#editRecurringExpense) | **GET** /api/v1/recurring_expenses/{id}/edit | Shows a client for editting
[**getRecurringExpenses**](RecurringExpensesApi.md#getRecurringExpenses) | **GET** /api/v1/recurring_expenses | Gets a list of recurring_expenses
[**getRecurringExpensesCreate**](RecurringExpensesApi.md#getRecurringExpensesCreate) | **GET** /api/v1/recurring_expenses/create | Gets a new blank client object
[**showRecurringExpense**](RecurringExpensesApi.md#showRecurringExpense) | **GET** /api/v1/recurring_expenses/{id} | Shows a client
[**storeRecurringExpense**](RecurringExpensesApi.md#storeRecurringExpense) | **POST** /api/v1/recurring_expenses | Adds a client
[**updateRecurringExpense**](RecurringExpensesApi.md#updateRecurringExpense) | **PUT** /api/v1/recurring_expenses/{id} | Updates a client


<a name="bulkRecurringExpenses"></a>
# **bulkRecurringExpenses**
> RecurringExpense bulkRecurringExpenses(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of recurring_expenses



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringExpensesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | User credentials
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : RecurringExpense = apiInstance.bulkRecurringExpenses(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringExpensesApi#bulkRecurringExpenses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringExpensesApi#bulkRecurringExpenses")
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

[**RecurringExpense**](RecurringExpense.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRecurringExpense"></a>
# **deleteRecurringExpense**
> deleteRecurringExpense(X_API_TOKEN, xRequestedWith, id, include)

Deletes a client

Handles the deletion of a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringExpensesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringExpense Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteRecurringExpense(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling RecurringExpensesApi#deleteRecurringExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringExpensesApi#deleteRecurringExpense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringExpense Hashed ID |
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

<a name="editRecurringExpense"></a>
# **editRecurringExpense**
> RecurringExpense editRecurringExpense(X_API_TOKEN, xRequestedWith, id, include)

Shows a client for editting

Displays a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringExpensesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringExpense Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringExpense = apiInstance.editRecurringExpense(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringExpensesApi#editRecurringExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringExpensesApi#editRecurringExpense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringExpense Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringExpense**](RecurringExpense.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecurringExpenses"></a>
# **getRecurringExpenses**
> RecurringExpense getRecurringExpenses(X_API_TOKEN, xRequestedWith, include, index)

Gets a list of recurring_expenses

Lists recurring_expenses, search and filters allow fine grained lists to be generated.      Query parameters can be added to performed more fine grained filtering of the recurring_expenses, these are handled by the RecurringExpenseFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringExpensesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : RecurringExpense = apiInstance.getRecurringExpenses(X_API_TOKEN, xRequestedWith, include, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringExpensesApi#getRecurringExpenses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringExpensesApi#getRecurringExpenses")
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

### Return type

[**RecurringExpense**](RecurringExpense.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecurringExpensesCreate"></a>
# **getRecurringExpensesCreate**
> RecurringExpense getRecurringExpensesCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank client object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringExpensesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringExpense = apiInstance.getRecurringExpensesCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringExpensesApi#getRecurringExpensesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringExpensesApi#getRecurringExpensesCreate")
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

[**RecurringExpense**](RecurringExpense.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showRecurringExpense"></a>
# **showRecurringExpense**
> RecurringExpense showRecurringExpense(X_API_TOKEN, xRequestedWith, id, include)

Shows a client

Displays a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringExpensesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringExpense Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringExpense = apiInstance.showRecurringExpense(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringExpensesApi#showRecurringExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringExpensesApi#showRecurringExpense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringExpense Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringExpense**](RecurringExpense.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeRecurringExpense"></a>
# **storeRecurringExpense**
> RecurringExpense storeRecurringExpense(X_API_TOKEN, xRequestedWith, include)

Adds a client

Adds an client to a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringExpensesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringExpense = apiInstance.storeRecurringExpense(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringExpensesApi#storeRecurringExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringExpensesApi#storeRecurringExpense")
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

[**RecurringExpense**](RecurringExpense.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRecurringExpense"></a>
# **updateRecurringExpense**
> RecurringExpense updateRecurringExpense(X_API_TOKEN, xRequestedWith, id, include)

Updates a client

Handles the updating of a client by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = RecurringExpensesApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The RecurringExpense Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : RecurringExpense = apiInstance.updateRecurringExpense(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecurringExpensesApi#updateRecurringExpense")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecurringExpensesApi#updateRecurringExpense")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The RecurringExpense Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**RecurringExpense**](RecurringExpense.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

