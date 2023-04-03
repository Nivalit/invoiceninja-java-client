# TaskStatusApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkTaskStatuss**](TaskStatusApi.md#bulkTaskStatuss) | **POST** /api/v1/task_statuses/bulk | Performs bulk actions on an array of task statuses
[**editTaskStatuss**](TaskStatusApi.md#editTaskStatuss) | **GET** /api/v1/task_statuses/{id}/edit | Shows an TaskStatusfor editting
[**getTaskStatuses**](TaskStatusApi.md#getTaskStatuses) | **GET** /api/v1/task_statuses | Gets a list of task statuses
[**getTaskStatussCreate**](TaskStatusApi.md#getTaskStatussCreate) | **GET** /api/v1/task_statuses/create | Gets a new blank TaskStatus object
[**showTaskStatus**](TaskStatusApi.md#showTaskStatus) | **GET** /api/v1/task_statuses/{id} | Shows a TaskStatus Term
[**storeTaskStatus**](TaskStatusApi.md#storeTaskStatus) | **POST** /api/v1/task_statuses | Adds a TaskStatus
[**updateTaskStatus**](TaskStatusApi.md#updateTaskStatus) | **PUT** /api/v1/task_statuses/{id} | Updates a TaskStatus Term


<a name="bulkTaskStatuss"></a>
# **bulkTaskStatuss**
> TaskStatus bulkTaskStatuss(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of task statuses



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskStatusApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | TaskStatus Ter,s
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : TaskStatus = apiInstance.bulkTaskStatuss(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskStatusApi#bulkTaskStatuss")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskStatusApi#bulkTaskStatuss")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| TaskStatus Ter,s |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**TaskStatus**](TaskStatus.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editTaskStatuss"></a>
# **editTaskStatuss**
> TaskStatus editTaskStatuss(X_API_TOKEN, xRequestedWith, id, include)

Shows an TaskStatusfor editting

Displays an TaskStatusby id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskStatusApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The TaskStatusHashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : TaskStatus = apiInstance.editTaskStatuss(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskStatusApi#editTaskStatuss")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskStatusApi#editTaskStatuss")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The TaskStatusHashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**TaskStatus**](TaskStatus.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskStatuses"></a>
# **getTaskStatuses**
> TaskStatus getTaskStatuses(X_API_TOKEN, xRequestedWith, include, index)

Gets a list of task statuses

Lists task statuses

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskStatusApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : TaskStatus = apiInstance.getTaskStatuses(X_API_TOKEN, xRequestedWith, include, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskStatusApi#getTaskStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskStatusApi#getTaskStatuses")
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

[**TaskStatus**](TaskStatus.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskStatussCreate"></a>
# **getTaskStatussCreate**
> TaskStatus getTaskStatussCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank TaskStatus object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskStatusApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : TaskStatus = apiInstance.getTaskStatussCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskStatusApi#getTaskStatussCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskStatusApi#getTaskStatussCreate")
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

[**TaskStatus**](TaskStatus.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showTaskStatus"></a>
# **showTaskStatus**
> TaskStatus showTaskStatus(X_API_TOKEN, xRequestedWith, id, include)

Shows a TaskStatus Term

Displays an TaskStatusby id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskStatusApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The TaskStatusHashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : TaskStatus = apiInstance.showTaskStatus(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskStatusApi#showTaskStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskStatusApi#showTaskStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The TaskStatusHashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**TaskStatus**](TaskStatus.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeTaskStatus"></a>
# **storeTaskStatus**
> TaskStatus storeTaskStatus(X_API_TOKEN, xRequestedWith, taskStatus, include)

Adds a TaskStatus

Adds a TaskStatusto the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskStatusApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val taskStatus : TaskStatus =  // TaskStatus | The task_status request
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : TaskStatus = apiInstance.storeTaskStatus(X_API_TOKEN, xRequestedWith, taskStatus, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskStatusApi#storeTaskStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskStatusApi#storeTaskStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **taskStatus** | [**TaskStatus**](TaskStatus.md)| The task_status request |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**TaskStatus**](TaskStatus.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskStatus"></a>
# **updateTaskStatus**
> TaskStatus updateTaskStatus(X_API_TOKEN, xRequestedWith, id, include)

Updates a TaskStatus Term

Handles the updating of an TaskStatus Termby id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskStatusApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The TaskStatusHashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : TaskStatus = apiInstance.updateTaskStatus(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskStatusApi#updateTaskStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskStatusApi#updateTaskStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The TaskStatusHashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**TaskStatus**](TaskStatus.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

