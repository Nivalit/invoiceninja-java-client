# ActvitiesApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActivities**](ActvitiesApiAdapter.md#getActivities) | **GET** /api/v1/activities | Returns a list of actvities
[**getActivityHistoricalEntityPdf**](ActvitiesApiAdapter.md#getActivityHistoricalEntityPdf) | **GET** /api/v1/actvities/download_entity/{activity_id} | Returns a PDF for the given activity


<a name="getActivities"></a>
# **getActivities**
> Client getActivities(X_API_TOKEN, xRequestedWith, include, index, perPage, page)

Returns a list of actvities

Lists all activities related to this company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ActvitiesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = history // kotlin.String | Include child relations of the Activity object, format is comma separated. **Note** it is possible to chain multiple includes together, ie. include=account,token
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
val perPage : kotlin.Int = 20 // kotlin.Int | The number of records to return for each request, default is 20
val page : kotlin.Int = 1 // kotlin.Int | The page number to return for this request (when performing pagination), default is 1
try {
    val result : Client = apiInstance.getActivities(X_API_TOKEN, xRequestedWith, include, index, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActvitiesApiAdapter#getActivities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActvitiesApiAdapter#getActivities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **include** | **kotlin.String**| Include child relations of the Activity object, format is comma separated. **Note** it is possible to chain multiple includes together, ie. include&#x3D;account,token | [optional]
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]
 **perPage** | **kotlin.Int**| The number of records to return for each request, default is 20 | [optional]
 **page** | **kotlin.Int**| The page number to return for this request (when performing pagination), default is 1 | [optional]

### Return type

[**Client**](Client.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActivityHistoricalEntityPdf"></a>
# **getActivityHistoricalEntityPdf**
> getActivityHistoricalEntityPdf(X_API_TOKEN, xRequestedWith, activityId, include)

Returns a PDF for the given activity

Returns a PDF for the given activity

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = ActvitiesApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val activityId : kotlin.String = D2J234DFA // kotlin.String | The Activity Hashed ID
val include : kotlin.String = history // kotlin.String | Include child relations of the Activity object, format is comma separated. **Note** it is possible to chain multiple includes together, ie. include=account,token
try {
    apiInstance.getActivityHistoricalEntityPdf(X_API_TOKEN, xRequestedWith, activityId, include)
} catch (e: ClientException) {
    println("4xx response calling ActvitiesApiAdapter#getActivityHistoricalEntityPdf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActvitiesApiAdapter#getActivityHistoricalEntityPdf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **activityId** | **kotlin.String**| The Activity Hashed ID |
 **include** | **kotlin.String**| Include child relations of the Activity object, format is comma separated. **Note** it is possible to chain multiple includes together, ie. include&#x3D;account,token | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

