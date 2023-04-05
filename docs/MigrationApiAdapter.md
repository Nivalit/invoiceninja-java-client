# MigrationApiAdapter

All URIs are relative to *https://demo.invoiceninja.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPurgeCompany**](MigrationApiAdapter.md#postPurgeCompany) | **POST** /api/v1/migration/purge/{company} | Attempts to purge a company record and all its child records
[**postPurgeCompanySaveSettings**](MigrationApiAdapter.md#postPurgeCompanySaveSettings) | **POST** /api/v1/migration/purge_save_settings/{company} | Attempts to purge a companies child records but save the company record and its settings
[**postStartMigration**](MigrationApiAdapter.md#postStartMigration) | **POST** /api/v1/migration/start | Starts the migration from previous version of Invoice Ninja


<a name="postPurgeCompany"></a>
# **postPurgeCompany**
> postPurgeCompany(X_API_TOKEN, xRequestedWith, company)

Attempts to purge a company record and all its child records

Attempts to purge a company record and all its child records

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = MigrationApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val company : kotlin.String = D2J234DFA // kotlin.String | The Company Hashed ID
try {
    apiInstance.postPurgeCompany(X_API_TOKEN, xRequestedWith, company)
} catch (e: ClientException) {
    println("4xx response calling MigrationApiAdapter#postPurgeCompany")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationApiAdapter#postPurgeCompany")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **company** | **kotlin.String**| The Company Hashed ID |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postPurgeCompanySaveSettings"></a>
# **postPurgeCompanySaveSettings**
> postPurgeCompanySaveSettings(X_API_TOKEN, xRequestedWith, company)

Attempts to purge a companies child records but save the company record and its settings

Attempts to purge a companies child records but save the company record and its settings

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = MigrationApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val company : kotlin.String = D2J234DFA // kotlin.String | The Company Hashed ID
try {
    apiInstance.postPurgeCompanySaveSettings(X_API_TOKEN, xRequestedWith, company)
} catch (e: ClientException) {
    println("4xx response calling MigrationApiAdapter#postPurgeCompanySaveSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationApiAdapter#postPurgeCompanySaveSettings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **company** | **kotlin.String**| The Company Hashed ID |

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postStartMigration"></a>
# **postStartMigration**
> postStartMigration(X_API_TOKEN, xRequestedWith, migration, X_API_PASSWORD)

Starts the migration from previous version of Invoice Ninja

Starts the migration from previous version of Invoice Ninja

### Example
```kotlin
// Import classes:
//import com.nivalit.invoiceninja.infrastructure.*
//import com.nivalit.invoiceninja.models.*

val apiInstance = MigrationApiAdapter()
val X_API_TOKEN : kotlin.String = TOKEN // kotlin.String | The API token to be used for authentication
val xRequestedWith : kotlin.String = XMLHttpRequest // kotlin.String | Used to send the XMLHttpRequest header
val migration : kotlin.Any = migration.zip // kotlin.Any | The migraton file
val X_API_PASSWORD : kotlin.String = supersecretpassword // kotlin.String | The login password when challenged on certain protected routes
try {
    apiInstance.postStartMigration(X_API_TOKEN, xRequestedWith, migration, X_API_PASSWORD)
} catch (e: ClientException) {
    println("4xx response calling MigrationApiAdapter#postStartMigration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationApiAdapter#postStartMigration")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_TOKEN** | **kotlin.String**| The API token to be used for authentication |
 **xRequestedWith** | **kotlin.String**| Used to send the XMLHttpRequest header |
 **migration** | [**kotlin.Any**](.md)| The migraton file |
 **X_API_PASSWORD** | **kotlin.String**| The login password when challenged on certain protected routes | [optional]

### Return type

null (empty response body)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-TOKEN"] = ""
    ApiClient.apiKeyPrefix["X-API-TOKEN"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

