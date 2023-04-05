# ExpenseCategoriesApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkExpenseCategorys**](ExpenseCategoriesApiAdapter.md#bulkExpenseCategorys) | **POST** /api/v1/expense_categories/bulk | Performs bulk actions on an array of ExpenseCategorys
[**deleteExpenseCategory**](ExpenseCategoriesApiAdapter.md#deleteExpenseCategory) | **DELETE** /api/v1/expense_categories/{id} | Deletes a ExpenseCategory
[**editExpenseCategory**](ExpenseCategoriesApiAdapter.md#editExpenseCategory) | **GET** /api/v1/expense_categories/{id}/edit | Shows a Expens Category for editting
[**getExpenseCategoryCreate**](ExpenseCategoriesApiAdapter.md#getExpenseCategoryCreate) | **GET** /api/v1/expense_categories/create | Gets a new blank Expens Category object
[**getExpenseCategorys**](ExpenseCategoriesApiAdapter.md#getExpenseCategorys) | **GET** /api/v1/expense_categories | Gets a list of expense_categories
[**showExpenseCategory**](ExpenseCategoriesApiAdapter.md#showExpenseCategory) | **GET** /api/v1/expense_categories/{id} | Shows a Expens Category
[**storeExpenseCategory**](ExpenseCategoriesApiAdapter.md#storeExpenseCategory) | **POST** /api/v1/expense_categories | Adds a expense category
[**updateExpenseCategory**](ExpenseCategoriesApiAdapter.md#updateExpenseCategory) | **PUT** /api/v1/expense_categories/{id} | Updates a tax rate


<a name="bulkExpenseCategorys"></a>
# **bulkExpenseCategorys**
> Webhook bulkExpenseCategorys(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of ExpenseCategorys



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExpenseCategoriesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Expens Categorys
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : Webhook = apiInstance.bulkExpenseCategorys(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseCategoriesApiAdapter#bulkExpenseCategorys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseCategoriesApiAdapter#bulkExpenseCategorys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Expens Categorys |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**Webhook**](Webhook.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExpenseCategory"></a>
# **deleteExpenseCategory**
> deleteExpenseCategory(X_API_TOKEN, xRequestedWith, id)

Deletes a ExpenseCategory

Handles the deletion of an ExpenseCategory by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExpenseCategoriesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The ExpenseCategory Hashed ID
try {
    apiInstance.deleteExpenseCategory(X_API_TOKEN, xRequestedWith, id)
} catch (e: ClientException) {
    println("4xx response calling ExpenseCategoriesApiAdapter#deleteExpenseCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseCategoriesApiAdapter#deleteExpenseCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The ExpenseCategory Hashed ID |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editExpenseCategory"></a>
# **editExpenseCategory**
> ExpenseCategory editExpenseCategory(X_API_TOKEN, xRequestedWith, id)

Shows a Expens Category for editting

Displays a Expens Category by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExpenseCategoriesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The ExpenseCategory Hashed ID
try {
    val result : ExpenseCategory = apiInstance.editExpenseCategory(X_API_TOKEN, xRequestedWith, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseCategoriesApiAdapter#editExpenseCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseCategoriesApiAdapter#editExpenseCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The ExpenseCategory Hashed ID |

### Return type

[**ExpenseCategory**](ExpenseCategory.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExpenseCategoryCreate"></a>
# **getExpenseCategoryCreate**
> ExpenseCategory getExpenseCategoryCreate(X_API_TOKEN, xRequestedWith)

Gets a new blank Expens Category object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExpenseCategoriesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    val result : ExpenseCategory = apiInstance.getExpenseCategoryCreate(X_API_TOKEN, xRequestedWith)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseCategoriesApiAdapter#getExpenseCategoryCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseCategoriesApiAdapter#getExpenseCategoryCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |

### Return type

[**ExpenseCategory**](ExpenseCategory.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExpenseCategorys"></a>
# **getExpenseCategorys**
> ExpenseCategory getExpenseCategorys(index)

Gets a list of expense_categories

Lists tax rates

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExpenseCategoriesApiAdapter()
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : ExpenseCategory = apiInstance.getExpenseCategorys(index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseCategoriesApiAdapter#getExpenseCategorys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseCategoriesApiAdapter#getExpenseCategorys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**ExpenseCategory**](ExpenseCategory.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showExpenseCategory"></a>
# **showExpenseCategory**
> ExpenseCategory showExpenseCategory(X_API_TOKEN, xRequestedWith, id)

Shows a Expens Category

Displays an ExpenseCategory by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExpenseCategoriesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The ExpenseCategory Hashed ID
try {
    val result : ExpenseCategory = apiInstance.showExpenseCategory(X_API_TOKEN, xRequestedWith, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseCategoriesApiAdapter#showExpenseCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseCategoriesApiAdapter#showExpenseCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The ExpenseCategory Hashed ID |

### Return type

[**ExpenseCategory**](ExpenseCategory.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeExpenseCategory"></a>
# **storeExpenseCategory**
> ExpenseCategory storeExpenseCategory(X_API_TOKEN, xRequestedWith, include)

Adds a expense category

Adds an expense category to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExpenseCategoriesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : ExpenseCategory = apiInstance.storeExpenseCategory(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseCategoriesApiAdapter#storeExpenseCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseCategoriesApiAdapter#storeExpenseCategory")
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

[**ExpenseCategory**](ExpenseCategory.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateExpenseCategory"></a>
# **updateExpenseCategory**
> ExpenseCategory updateExpenseCategory(X_API_TOKEN, xRequestedWith, id)

Updates a tax rate

Handles the updating of a tax rate by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ExpenseCategoriesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The ExpenseCategory Hashed ID
try {
    val result : ExpenseCategory = apiInstance.updateExpenseCategory(X_API_TOKEN, xRequestedWith, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseCategoriesApiAdapter#updateExpenseCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseCategoriesApiAdapter#updateExpenseCategory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The ExpenseCategory Hashed ID |

### Return type

[**ExpenseCategory**](ExpenseCategory.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

