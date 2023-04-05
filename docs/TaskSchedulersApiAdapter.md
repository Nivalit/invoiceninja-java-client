# TaskSchedulersApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkTaskSchedulerActions**](TaskSchedulersApiAdapter.md#bulkTaskSchedulerActions) | **POST** /api/v1/task_schedulers/bulk | Performs bulk actions on an array of task_schedulers
[**createTaskScheduler**](TaskSchedulersApiAdapter.md#createTaskScheduler) | **POST** /api/v1/task_schedulers/ | Create task scheduler with job 
[**destroyTaskScheduler**](TaskSchedulersApiAdapter.md#destroyTaskScheduler) | **DELETE** /api/v1/task_schedulers/{id} | Destroy Task Scheduler
[**getTaskScheduler**](TaskSchedulersApiAdapter.md#getTaskScheduler) | **GET** /api/v1/task_schedulers/create | Gets a new blank scheduler object
[**getTaskSchedulers**](TaskSchedulersApiAdapter.md#getTaskSchedulers) | **GET** /api/v1/task_schedulers/ | Task Scheduler Index
[**showTaskScheduler**](TaskSchedulersApiAdapter.md#showTaskScheduler) | **GET** /api/v1/task_schedulers/{id} | Show given scheduler
[**updateTaskScheduler**](TaskSchedulersApiAdapter.md#updateTaskScheduler) | **PUT** /api/v1/task_schedulers/{id} | Update task scheduler 


<a name="bulkTaskSchedulerActions"></a>
# **bulkTaskSchedulerActions**
> TaskSchedulerSchema bulkTaskSchedulerActions(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of task_schedulers



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskSchedulersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | array of ids
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : TaskSchedulerSchema = apiInstance.bulkTaskSchedulerActions(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskSchedulersApiAdapter#bulkTaskSchedulerActions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskSchedulersApiAdapter#bulkTaskSchedulerActions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| array of ids |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**TaskSchedulerSchema**](TaskSchedulerSchema.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTaskScheduler"></a>
# **createTaskScheduler**
> createTaskScheduler(xRequestedWith, taskSchedulerSchema, X_API_SECRET)

Create task scheduler with job 

Create task scheduler with a job (action(job) request should be sent via request also. Example: We want client report to be job which will be run      * multiple times, we should send the same parameters in the request as we would send if we wanted to get report, see example

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskSchedulersApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val taskSchedulerSchema : TaskSchedulerSchema =  // TaskSchedulerSchema | 
val X_API_SECRET : kotlin.String = password // kotlin.String | The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route.
try {
    apiInstance.createTaskScheduler(xRequestedWith, taskSchedulerSchema, X_API_SECRET)
} catch (e: ClientException) {
    println("4xx response calling TaskSchedulersApiAdapter#createTaskScheduler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskSchedulersApiAdapter#createTaskScheduler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **taskSchedulerSchema** | [**TaskSchedulerSchema**](TaskSchedulerSchema.md)|  |
 **X_API_SECRET** | **kotlin.String**| The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyTaskScheduler"></a>
# **destroyTaskScheduler**
> destroyTaskScheduler(xRequestedWith, id)

Destroy Task Scheduler

Destroy task scheduler and its associated job

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskSchedulersApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Scheduler Hashed ID
try {
    apiInstance.destroyTaskScheduler(xRequestedWith, id)
} catch (e: ClientException) {
    println("4xx response calling TaskSchedulersApiAdapter#destroyTaskScheduler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskSchedulersApiAdapter#destroyTaskScheduler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Scheduler Hashed ID |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskScheduler"></a>
# **getTaskScheduler**
> TaskSchedulerSchema getTaskScheduler(X_API_TOKEN, xRequestedWith, include)

Gets a new blank scheduler object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskSchedulersApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : TaskSchedulerSchema = apiInstance.getTaskScheduler(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskSchedulersApiAdapter#getTaskScheduler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskSchedulersApiAdapter#getTaskScheduler")
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

[**TaskSchedulerSchema**](TaskSchedulerSchema.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskSchedulers"></a>
# **getTaskSchedulers**
> getTaskSchedulers(xRequestedWith)

Task Scheduler Index

Get all schedulers with associated jobs

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskSchedulersApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
try {
    apiInstance.getTaskSchedulers(xRequestedWith)
} catch (e: ClientException) {
    println("4xx response calling TaskSchedulersApiAdapter#getTaskSchedulers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskSchedulersApiAdapter#getTaskSchedulers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showTaskScheduler"></a>
# **showTaskScheduler**
> showTaskScheduler(xRequestedWith, id)

Show given scheduler

Get scheduler with associated job

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskSchedulersApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Scheduler Hashed ID
try {
    apiInstance.showTaskScheduler(xRequestedWith, id)
} catch (e: ClientException) {
    println("4xx response calling TaskSchedulersApiAdapter#showTaskScheduler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskSchedulersApiAdapter#showTaskScheduler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Scheduler Hashed ID |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTaskScheduler"></a>
# **updateTaskScheduler**
> updateTaskScheduler(xRequestedWith, id, taskSchedulerSchema, X_API_SECRET)

Update task scheduler 

Update task scheduler

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = TaskSchedulersApiAdapter()
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Scheduler Hashed ID
val taskSchedulerSchema : TaskSchedulerSchema =  // TaskSchedulerSchema | 
val X_API_SECRET : kotlin.String = password // kotlin.String | The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route.
try {
    apiInstance.updateTaskScheduler(xRequestedWith, id, taskSchedulerSchema, X_API_SECRET)
} catch (e: ClientException) {
    println("4xx response calling TaskSchedulersApiAdapter#updateTaskScheduler")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskSchedulersApiAdapter#updateTaskScheduler")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Scheduler Hashed ID |
 **taskSchedulerSchema** | [**TaskSchedulerSchema**](TaskSchedulerSchema.md)|  |
 **X_API_SECRET** | **kotlin.String**| The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

