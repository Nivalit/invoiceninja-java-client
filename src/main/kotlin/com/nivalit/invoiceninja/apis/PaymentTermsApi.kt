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
import com.nivalit.invoiceninja.models.Payment
import com.nivalit.invoiceninja.models.PaymentTerm
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

class PaymentTermsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://demo.invoiceninja.com")
        }
    }

    /**
     * Performs bulk actions on an array of payment terms
     * 
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Payment Ter,s
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return PaymentTerm
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkPaymentTerms(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String? = null) : PaymentTerm {
        val localVarResponse = bulkPaymentTermsWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, requestBody = requestBody, index = index)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentTerm
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
     * Performs bulk actions on an array of payment terms
     * 
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Payment Ter,s
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return ApiResponse<PaymentTerm?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun bulkPaymentTermsWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String?) : ApiResponse<PaymentTerm?> {
        val localVariableConfig = bulkPaymentTermsRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, requestBody = requestBody, index = index)

        return request<kotlin.collections.List<kotlin.Int>, PaymentTerm>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation bulkPaymentTerms
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Payment Ter,s
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return RequestConfig
     */
    fun bulkPaymentTermsRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String?) : RequestConfig<kotlin.collections.List<kotlin.Int>> {
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
            path = "/api/v1/payment_terms/bulk",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Shows an Payment Term for editting
     * Displays an Payment Term by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return PaymentTerm
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun editPaymentTerms(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String? = null) : PaymentTerm {
        val localVarResponse = editPaymentTermsWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id, include = include)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentTerm
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
     * Shows an Payment Term for editting
     * Displays an Payment Term by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return ApiResponse<PaymentTerm?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun editPaymentTermsWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String?) : ApiResponse<PaymentTerm?> {
        val localVariableConfig = editPaymentTermsRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id, include = include)

        return request<Unit, PaymentTerm>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation editPaymentTerms
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return RequestConfig
     */
    fun editPaymentTermsRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (include != null) {
                    put("include", listOf(include.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/payment_terms/{id}/edit".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Gets a list of payment terms
     * Lists payment terms
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return PaymentTerm
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPaymentTerms(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String? = null, index: kotlin.String? = null) : PaymentTerm {
        val localVarResponse = getPaymentTermsWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include, index = index)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentTerm
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
     * Gets a list of payment terms
     * Lists payment terms
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return ApiResponse<PaymentTerm?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getPaymentTermsWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?, index: kotlin.String?) : ApiResponse<PaymentTerm?> {
        val localVariableConfig = getPaymentTermsRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include, index = index)

        return request<Unit, PaymentTerm>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getPaymentTerms
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return RequestConfig
     */
    fun getPaymentTermsRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?, index: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (include != null) {
                    put("include", listOf(include.toString()))
                }
                if (index != null) {
                    put("index", listOf(index.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/payment_terms",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Gets a new blank PaymentTerm object
     * Returns a blank object with default values
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return Payment
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPaymentTermsCreate(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String? = null) : Payment {
        val localVarResponse = getPaymentTermsCreateWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Payment
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
     * Gets a new blank PaymentTerm object
     * Returns a blank object with default values
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return ApiResponse<Payment?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getPaymentTermsCreateWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?) : ApiResponse<Payment?> {
        val localVariableConfig = getPaymentTermsCreateRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include)

        return request<Unit, Payment>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getPaymentTermsCreate
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return RequestConfig
     */
    fun getPaymentTermsCreateRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (include != null) {
                    put("include", listOf(include.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/payment_terms/create",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Shows a Payment Term
     * Displays an Payment Term by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return PaymentTerm
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun showPaymentTerm(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String? = null) : PaymentTerm {
        val localVarResponse = showPaymentTermWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id, include = include)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentTerm
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
     * Shows a Payment Term
     * Displays an Payment Term by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return ApiResponse<PaymentTerm?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun showPaymentTermWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String?) : ApiResponse<PaymentTerm?> {
        val localVariableConfig = showPaymentTermRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id, include = include)

        return request<Unit, PaymentTerm>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation showPaymentTerm
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return RequestConfig
     */
    fun showPaymentTermRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (include != null) {
                    put("include", listOf(include.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/payment_terms/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Adds a Payment
     * Adds a Payment Term to the system
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param paymentTerm The payment_terms request
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return PaymentTerm
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun storePaymentTerm(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, paymentTerm: PaymentTerm, include: kotlin.String? = null) : PaymentTerm {
        val localVarResponse = storePaymentTermWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, paymentTerm = paymentTerm, include = include)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentTerm
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
     * Adds a Payment
     * Adds a Payment Term to the system
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param paymentTerm The payment_terms request
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return ApiResponse<PaymentTerm?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun storePaymentTermWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, paymentTerm: PaymentTerm, include: kotlin.String?) : ApiResponse<PaymentTerm?> {
        val localVariableConfig = storePaymentTermRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, paymentTerm = paymentTerm, include = include)

        return request<PaymentTerm, PaymentTerm>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation storePaymentTerm
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param paymentTerm The payment_terms request
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return RequestConfig
     */
    fun storePaymentTermRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, paymentTerm: PaymentTerm, include: kotlin.String?) : RequestConfig<PaymentTerm> {
        val localVariableBody = paymentTerm
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (include != null) {
                    put("include", listOf(include.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/payment_terms",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Updates a Payment Term
     * Handles the updating of an Payment Termby id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return PaymentTerm
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updatePaymentTerm(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String? = null) : PaymentTerm {
        val localVarResponse = updatePaymentTermWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id, include = include)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymentTerm
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
     * Updates a Payment Term
     * Handles the updating of an Payment Termby id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return ApiResponse<PaymentTerm?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updatePaymentTermWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String?) : ApiResponse<PaymentTerm?> {
        val localVariableConfig = updatePaymentTermRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id, include = include)

        return request<Unit, PaymentTerm>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updatePaymentTerm
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Payment Term Hashed ID
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return RequestConfig
     */
    fun updatePaymentTermRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String, include: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (include != null) {
                    put("include", listOf(include.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v1/payment_terms/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
