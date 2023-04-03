# UsersApi

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkUsers**](UsersApi.md#bulkUsers) | **POST** /api/v1/users/bulk | Performs bulk actions on an array of users
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /api/v1/users/{id} | Deletes a User
[**detachUser**](UsersApi.md#detachUser) | **DELETE** /api/v1/users/{user}/detach_from_company | Detach an existing user to a company
[**editUser**](UsersApi.md#editUser) | **GET** /api/v1/users/{id}/edit | Shows an User for editting
[**getUsers**](UsersApi.md#getUsers) | **GET** /api/v1/users | Gets a list of users
[**getUsersCreate**](UsersApi.md#getUsersCreate) | **GET** /api/v1/users/create | Gets a new blank User object
[**inviteUser**](UsersApi.md#inviteUser) | **POST** /api/v1/users/{user}/invite | Reconfirm an existing user to a company
[**inviteUserReconfirm**](UsersApi.md#inviteUserReconfirm) | **POST** /api/v1/users/{user}/reconfirm | Reconfirm an existing user to a company
[**showUser**](UsersApi.md#showUser) | **GET** /api/v1/users/{id} | Shows an User
[**storeUser**](UsersApi.md#storeUser) | **POST** /api/v1/users | Adds a User
[**updateUser**](UsersApi.md#updateUser) | **PUT** /api/v1/users/{id} | Updates an User


<a name="bulkUsers"></a>
# **bulkUsers**
> User bulkUsers(X_API_TOKEN, xRequestedWith, requestBody, index)

Performs bulk actions on an array of users



### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val requestBody : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Hashed ids
val index : kotlin.String = user // kotlin.String | Replaces the default response index from data to a user specific string
try {
    val result : User = apiInstance.bulkUsers(X_API_TOKEN, xRequestedWith, requestBody, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#bulkUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#bulkUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Hashed ids |
 **index** | **kotlin.String**| Replaces the default response index from data to a user specific string | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(X_API_TOKEN, xRequestedWith, id, include, tokenName)

Deletes a User

Handles the deletion of an User by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The User Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
val tokenName : kotlin.String = iOS Device 11 iPad // kotlin.String | Customized name for the Users API Token
try {
    apiInstance.deleteUser(X_API_TOKEN, xRequestedWith, id, include, tokenName)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The User Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]
 **tokenName** | **kotlin.String**| Customized name for the Users API Token | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="detachUser"></a>
# **detachUser**
> detachUser(X_API_TOKEN, xRequestedWith, user, include)

Detach an existing user to a company

Detach an existing user from a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val user : kotlin.String = FD767dfd7 // kotlin.String | The user hashed_id
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.detachUser(X_API_TOKEN, xRequestedWith, user, include)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#detachUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#detachUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **user** | **kotlin.String**| The user hashed_id |
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

<a name="editUser"></a>
# **editUser**
> User editUser(X_API_TOKEN, xRequestedWith, id, include)

Shows an User for editting

Displays an User by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The User Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : User = apiInstance.editUser(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#editUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#editUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The User Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> User getUsers(X_API_TOKEN, xRequestedWith, include)

Gets a list of users

Lists users, search and filters allow fine grained lists to be generated.      Query parameters can be added to performed more fine grained filtering of the users, these are handled by the UserFilters class which defines the methods available

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : User = apiInstance.getUsers(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUsers")
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

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersCreate"></a>
# **getUsersCreate**
> User getUsersCreate(X_API_TOKEN, xRequestedWith, include)

Gets a new blank User object

Returns a blank object with default values

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : User = apiInstance.getUsersCreate(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUsersCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUsersCreate")
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

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inviteUser"></a>
# **inviteUser**
> inviteUser(X_API_TOKEN, xRequestedWith, user, include)

Reconfirm an existing user to a company

Reconfirm an existing user from a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val user : kotlin.String = FD767dfd7 // kotlin.String | The user hashed_id
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.inviteUser(X_API_TOKEN, xRequestedWith, user, include)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#inviteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#inviteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **user** | **kotlin.String**| The user hashed_id |
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

<a name="inviteUserReconfirm"></a>
# **inviteUserReconfirm**
> inviteUserReconfirm(X_API_TOKEN, xRequestedWith, user, include)

Reconfirm an existing user to a company

Reconfirm an existing user from a company

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val user : kotlin.String = FD767dfd7 // kotlin.String | The user hashed_id
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    apiInstance.inviteUserReconfirm(X_API_TOKEN, xRequestedWith, user, include)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#inviteUserReconfirm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#inviteUserReconfirm")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **user** | **kotlin.String**| The user hashed_id |
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

<a name="showUser"></a>
# **showUser**
> User showUser(X_API_TOKEN, xRequestedWith, id, include)

Shows an User

Displays an User by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The User Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : User = apiInstance.showUser(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#showUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#showUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The User Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="storeUser"></a>
# **storeUser**
> User storeUser(X_API_TOKEN, xRequestedWith, include)

Adds a User

Adds an User to the system

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : User = apiInstance.storeUser(X_API_TOKEN, xRequestedWith, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#storeUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#storeUser")
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

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> User updateUser(X_API_TOKEN, xRequestedWith, id, include)

Updates an User

Handles the updating of an User by id

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = UsersApi()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val id : kotlin.String = D2J234DFA // kotlin.String | The User Hashed ID
val include : kotlin.String = first_load // kotlin.String | Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes
try {
    val result : User = apiInstance.updateUser(X_API_TOKEN, xRequestedWith, id, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **id** | **kotlin.String**| The User Hashed ID |
 **include** | **kotlin.String**| Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

