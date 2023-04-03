# GroupSettingsApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkGroupSettings**](GroupSettingsApi.md#bulkGroupSettings) | **POST** /api/v1/group_settings/bulk | Performs bulk actions on an array of group_settings
[**deleteGroupSetting**](GroupSettingsApi.md#deleteGroupSetting) | **DELETE** /api/v1/group_settings/{id} | Deletes a GroupSetting
[**editGroupSetting**](GroupSettingsApi.md#editGroupSetting) | **GET** /api/v1/group_settings/{id}/edit | Shows an GroupSetting for editting
[**getGroupSettings**](GroupSettingsApi.md#getGroupSettings) | **GET** /api/v1/group_settings | Gets a list of group_settings
[**getGroupSettingsCreate**](GroupSettingsApi.md#getGroupSettingsCreate) | **GET** /api/v1/group_settings/create | Gets a new blank GroupSetting object
[**showGroupSetting**](GroupSettingsApi.md#showGroupSetting) | **GET** /api/v1/group_settings/{id} | Shows an GroupSetting
[**storeGroupSetting**](GroupSettingsApi.md#storeGroupSetting) | **POST** /api/v1/group_settings | Adds a GroupSetting
[**updateGroupSetting**](GroupSettingsApi.md#updateGroupSetting) | **PUT** /api/v1/group_settings/{id} | Updates an GroupSetting
[**uploadGroupSetting**](GroupSettingsApi.md#uploadGroupSetting) | **PUT** /api/v1/group_settings/{id}/upload | Uploads a document to a group setting


<a name="bulkGroupSettings"></a>
# **bulkGroupSettings**
> bulkGroupSettings(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of group_settings



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | An array of group_settings ids
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    apiInstance.bulkGroupSettings(X_API_TOKEN, xRequestedWith, requestBody, index)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#bulkGroupSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#bulkGroupSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| An array of group_settings ids |
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

<a name="deleteGroupSetting"></a>
# **deleteGroupSetting**
> deleteGroupSetting(X_API_TOKEN, xRequestedWith, id, include)

Deletes a GroupSetting

Handles the deletion of an GroupSetting by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The GroupSetting Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.deleteGroupSetting(X_API_TOKEN, xRequestedWith, id, include)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#deleteGroupSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#deleteGroupSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The GroupSetting Hashed ID |
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

<a name="editGroupSetting"></a>
# **editGroupSetting**
> GroupSetting editGroupSetting(X_API_TOKEN, xRequestedWith, id, include)

Shows an GroupSetting for editting

Displays an GroupSetting by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The GroupSetting Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : GroupSetting = apiInstance.editGroupSetting(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#editGroupSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#editGroupSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The GroupSetting Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**GroupSetting**](GroupSetting.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupSettings"></a>
# **getGroupSettings**
> GroupSetting getGroupSettings(X_API_TOKEN, xRequestedWith, include)

Gets a list of group_settings

Lists group_settings, search and filters allow fine grained lists to be generated.          Query parameters can be added to performed more fine grained filtering of the group_settings, these are handled by the GroupSettingFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : GroupSetting = apiInstance.getGroupSettings(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#getGroupSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#getGroupSettings")
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

[**GroupSetting**](GroupSetting.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupSettingsCreate"></a>
# **getGroupSettingsCreate**
> GroupSetting getGroupSettingsCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank GroupSetting object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : GroupSetting = apiInstance.getGroupSettingsCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#getGroupSettingsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#getGroupSettingsCreate")
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

[**GroupSetting**](GroupSetting.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="showGroupSetting"></a>
# **showGroupSetting**
> GroupSetting showGroupSetting(X_API_TOKEN, xRequestedWith, id, include)

Shows an GroupSetting

Displays an GroupSetting by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The GroupSetting Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : GroupSetting = apiInstance.showGroupSetting(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#showGroupSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#showGroupSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The GroupSetting Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**GroupSetting**](GroupSetting.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeGroupSetting"></a>
# **storeGroupSetting**
> GroupSetting storeGroupSetting(X_API_TOKEN, xRequestedWith, include)

Adds a GroupSetting

Adds an GroupSetting to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : GroupSetting = apiInstance.storeGroupSetting(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#storeGroupSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#storeGroupSetting")
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

[**GroupSetting**](GroupSetting.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGroupSetting"></a>
# **updateGroupSetting**
> GroupSetting updateGroupSetting(X_API_TOKEN, xRequestedWith, id, include)

Updates an GroupSetting

Handles the updating of an GroupSetting by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The GroupSetting Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : GroupSetting = apiInstance.updateGroupSetting(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#updateGroupSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#updateGroupSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The GroupSetting Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**GroupSetting**](GroupSetting.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadGroupSetting"></a>
# **uploadGroupSetting**
> Invoice uploadGroupSetting(X_API_TOKEN, xRequestedWith, id, include)

Uploads a document to a group setting

Handles the uploading of a document to a group setting

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = GroupSettingsApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The Group Setting Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : Invoice = apiInstance.uploadGroupSetting(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupSettingsApi#uploadGroupSetting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupSettingsApi#uploadGroupSetting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The Group Setting Hashed ID |
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

