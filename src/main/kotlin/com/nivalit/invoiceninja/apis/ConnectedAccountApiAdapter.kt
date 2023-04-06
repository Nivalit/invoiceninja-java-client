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
import com.nivalit.invoiceninja.models.User
import com.nivalit.invoiceninja.models.ValidationError

import com.fasterxml.jackson.annotation.JsonProperty

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

class ConnectedAccountApiAdapter(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://demo.invoiceninja.com")
        }
    }

    /**
     * Connect an oauth user to an existing user
     * Refreshes the dataset
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @param includeStatic Returns static variables (optional)
     * @param clearCache Clears the static cache (optional)
     * @return User
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun connectedAccount(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String? = null, includeStatic: kotlin.String? = null, clearCache: kotlin.String? = null) : User {
        val localVarResponse = connectedAccountWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include, includeStatic = includeStatic, clearCache = clearCache)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as User
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
     * Connect an oauth user to an existing user
     * Refreshes the dataset
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @param includeStatic Returns static variables (optional)
     * @param clearCache Clears the static cache (optional)
     * @return ApiResponse<User?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun connectedAccountWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?, includeStatic: kotlin.String?, clearCache: kotlin.String?) : ApiResponse<User?> {
        val localVariableConfig = connectedAccountRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include, includeStatic = includeStatic, clearCache = clearCache)

        return request<Unit, User>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation connectedAccount
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @param includeStatic Returns static variables (optional)
     * @param clearCache Clears the static cache (optional)
     * @return RequestConfig
     */
    fun connectedAccountRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?, includeStatic: kotlin.String?, clearCache: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (include != null) {
                    put("include", listOf(include.toString()))
                }
                if (includeStatic != null) {
                    put("include_static", listOf(includeStatic.toString()))
                }
                if (clearCache != null) {
                    put("clear_cache", listOf(clearCache.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/connected_account",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
