/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.nivalit.invoiceninja.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.nivalit.invoiceninja.models.AuthenticationError
import com.nivalit.invoiceninja.models.AuthorizationError
import com.nivalit.invoiceninja.models.Error
import com.nivalit.invoiceninja.models.ValidationError

import com.squareup.moshi.Json

import com.nivalit.invoiceninja.infrastructure.ApiClient
import com.nivalit.invoiceninja.infrastructure.ApiResponse
import com.nivalit.invoiceninja.infrastructure.ClientException
import com.nivalit.invoiceninja.infrastructure.ClientError
import com.nivalit.invoiceninja.infrastructure.ServerException
import com.nivalit.invoiceninja.infrastructure.ServerError
import com.nivalit.invoiceninja.infrastructure.MultiValueMap
import com.nivalit.invoiceninja.infrastructure.PartConfig
import com.nivalit.invoiceninja.infrastructure.RequestConfig
import com.nivalit.invoiceninja.infrastructure.RequestMethod
import com.nivalit.invoiceninja.infrastructure.ResponseType
import com.nivalit.invoiceninja.infrastructure.Success
import com.nivalit.invoiceninja.infrastructure.toMultiValue

class MigrationApiAdapter(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://demo.invoiceninja.com")
        }
    }

    /**
     * Attempts to purge a company record and all its child records
     * Attempts to purge a company record and all its child records
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param company The Company Hashed ID
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postPurgeCompany(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, company: kotlin.String) : Unit {
        val localVarResponse = postPurgeCompanyWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, company = company)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Attempts to purge a company record and all its child records
     * Attempts to purge a company record and all its child records
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param company The Company Hashed ID
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun postPurgeCompanyWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, company: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = postPurgeCompanyRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, company = company)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation postPurgeCompany
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param company The Company Hashed ID
     * @return RequestConfig
     */
    fun postPurgeCompanyRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, company: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/migration/purge/{company}".replace("{"+"company"+"}", encodeURIComponent(company.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Attempts to purge a companies child records but save the company record and its settings
     * Attempts to purge a companies child records but save the company record and its settings
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param company The Company Hashed ID
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postPurgeCompanySaveSettings(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, company: kotlin.String) : Unit {
        val localVarResponse = postPurgeCompanySaveSettingsWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, company = company)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Attempts to purge a companies child records but save the company record and its settings
     * Attempts to purge a companies child records but save the company record and its settings
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param company The Company Hashed ID
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun postPurgeCompanySaveSettingsWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, company: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = postPurgeCompanySaveSettingsRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, company = company)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation postPurgeCompanySaveSettings
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param company The Company Hashed ID
     * @return RequestConfig
     */
    fun postPurgeCompanySaveSettingsRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, company: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/migration/purge_save_settings/{company}".replace("{"+"company"+"}", encodeURIComponent(company.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Starts the migration from previous version of Invoice Ninja
     * Starts the migration from previous version of Invoice Ninja
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param migration The migraton file
     * @param X_API_PASSWORD The login password when challenged on certain protected routes (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun postStartMigration(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, migration: kotlin.Any, X_API_PASSWORD: kotlin.String? = null) : Unit {
        val localVarResponse = postStartMigrationWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, migration = migration, X_API_PASSWORD = X_API_PASSWORD)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Starts the migration from previous version of Invoice Ninja
     * Starts the migration from previous version of Invoice Ninja
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param migration The migraton file
     * @param X_API_PASSWORD The login password when challenged on certain protected routes (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun postStartMigrationWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, migration: kotlin.Any, X_API_PASSWORD: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = postStartMigrationRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, migration = migration, X_API_PASSWORD = X_API_PASSWORD)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation postStartMigration
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param migration The migraton file
     * @param X_API_PASSWORD The login password when challenged on certain protected routes (optional)
     * @return RequestConfig
     */
    fun postStartMigrationRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, migration: kotlin.Any, X_API_PASSWORD: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("migration", listOf(migration.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        X_API_PASSWORD?.apply { localVariableHeaders["X-API-PASSWORD"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/migration/start",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}