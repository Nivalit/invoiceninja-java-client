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
import com.nivalit.invoiceninja.models.TaxRate
import com.nivalit.invoiceninja.models.ValidationError
import com.nivalit.invoiceninja.models.Webhook

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

class TaxRatesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://demo.invoiceninja.com")
        }
    }

    /**
     * Performs bulk actions on an array of TaxRates
     * 
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Tax Rates
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return Webhook
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkTaxRates(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String? = null) : Webhook {
        val localVarResponse = bulkTaxRatesWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, requestBody = requestBody, index = index)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Webhook
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
     * Performs bulk actions on an array of TaxRates
     * 
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Tax Rates
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return ApiResponse<Webhook?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun bulkTaxRatesWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String?) : ApiResponse<Webhook?> {
        val localVariableConfig = bulkTaxRatesRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, requestBody = requestBody, index = index)

        return request<kotlin.collections.List<kotlin.Int>, Webhook>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation bulkTaxRates
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Tax Rates
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return RequestConfig
     */
    fun bulkTaxRatesRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String?) : RequestConfig<kotlin.collections.List<kotlin.Int>> {
        val localVariableBody = requestBody
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (index != null) {
                    put("index", listOf(index.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/tax_rates/bulk",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Deletes a TaxRate
     * Handles the deletion of an TaxRate by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteTaxRate(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : Unit {
        val localVarResponse = deleteTaxRateWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

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
     * Deletes a TaxRate
     * Handles the deletion of an TaxRate by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteTaxRateWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = deleteTaxRateRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteTaxRate
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return RequestConfig
     */
    fun deleteTaxRateRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v1/tax_rates/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Shows a Tax Rate for editting
     * Displays a Tax Rate by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return TaxRate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun editTaxRate(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : TaxRate {
        val localVarResponse = editTaxRateWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaxRate
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
     * Shows a Tax Rate for editting
     * Displays a Tax Rate by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return ApiResponse<TaxRate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun editTaxRateWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<TaxRate?> {
        val localVariableConfig = editTaxRateRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return request<Unit, TaxRate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation editTaxRate
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return RequestConfig
     */
    fun editTaxRateRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/tax_rates/{id}/edit".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Gets a new blank Tax Rate object
     * Returns a blank object with default values
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return TaxRate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTaxRateCreate(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String) : TaxRate {
        val localVarResponse = getTaxRateCreateWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaxRate
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
     * Gets a new blank Tax Rate object
     * Returns a blank object with default values
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return ApiResponse<TaxRate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTaxRateCreateWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String) : ApiResponse<TaxRate?> {
        val localVariableConfig = getTaxRateCreateRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith)

        return request<Unit, TaxRate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTaxRateCreate
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return RequestConfig
     */
    fun getTaxRateCreateRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/tax_rates/create",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Gets a list of tax_rates
     * Lists tax rates
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return TaxRate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTaxRates(index: kotlin.String? = null) : TaxRate {
        val localVarResponse = getTaxRatesWithHttpInfo(index = index)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaxRate
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
     * Gets a list of tax_rates
     * Lists tax rates
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return ApiResponse<TaxRate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTaxRatesWithHttpInfo(index: kotlin.String?) : ApiResponse<TaxRate?> {
        val localVariableConfig = getTaxRatesRequestConfig(index = index)

        return request<Unit, TaxRate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTaxRates
     *
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return RequestConfig
     */
    fun getTaxRatesRequestConfig(index: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (index != null) {
                    put("index", listOf(index.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/tax_rates",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Shows a Tax Rate
     * Displays an TaxRate by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return TaxRate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun showTaxRate(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : TaxRate {
        val localVarResponse = showTaxRateWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaxRate
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
     * Shows a Tax Rate
     * Displays an TaxRate by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return ApiResponse<TaxRate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun showTaxRateWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<TaxRate?> {
        val localVariableConfig = showTaxRateRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return request<Unit, TaxRate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation showTaxRate
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return RequestConfig
     */
    fun showTaxRateRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/tax_rates/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Updates a tax rate
     * Handles the updating of a tax rate by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return TaxRate
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateTaxRate(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : TaxRate {
        val localVarResponse = updateTaxRateWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaxRate
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
     * Updates a tax rate
     * Handles the updating of a tax rate by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return ApiResponse<TaxRate?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateTaxRateWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<TaxRate?> {
        val localVariableConfig = updateTaxRateRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return request<Unit, TaxRate>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateTaxRate
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The TaxRate Hashed ID
     * @return RequestConfig
     */
    fun updateTaxRateRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v1/tax_rates/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
