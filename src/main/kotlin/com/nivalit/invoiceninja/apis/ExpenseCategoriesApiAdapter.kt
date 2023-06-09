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
import com.nivalit.invoiceninja.models.ExpenseCategory
import com.nivalit.invoiceninja.models.ValidationError
import com.nivalit.invoiceninja.models.Webhook

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

class ExpenseCategoriesApiAdapter(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://demo.invoiceninja.com")
        }
    }

    /**
     * Performs bulk actions on an array of ExpenseCategorys
     * 
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Expens Categorys
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
    fun bulkExpenseCategorys(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String? = null) : Webhook {
        val localVarResponse = bulkExpenseCategorysWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, requestBody = requestBody, index = index)

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
     * Performs bulk actions on an array of ExpenseCategorys
     * 
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Expens Categorys
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return ApiResponse<Webhook?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun bulkExpenseCategorysWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String?) : ApiResponse<Webhook?> {
        val localVariableConfig = bulkExpenseCategorysRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, requestBody = requestBody, index = index)

        return request<kotlin.collections.List<kotlin.Int>, Webhook>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation bulkExpenseCategorys
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody Expens Categorys
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return RequestConfig
     */
    fun bulkExpenseCategorysRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String?) : RequestConfig<kotlin.collections.List<kotlin.Int>> {
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
            path = "/api/v1/expense_categories/bulk",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Deletes a ExpenseCategory
     * Handles the deletion of an ExpenseCategory by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteExpenseCategory(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : Unit {
        val localVarResponse = deleteExpenseCategoryWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

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
     * Deletes a ExpenseCategory
     * Handles the deletion of an ExpenseCategory by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteExpenseCategoryWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = deleteExpenseCategoryRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteExpenseCategory
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return RequestConfig
     */
    fun deleteExpenseCategoryRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v1/expense_categories/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Shows a Expens Category for editting
     * Displays a Expens Category by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return ExpenseCategory
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun editExpenseCategory(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ExpenseCategory {
        val localVarResponse = editExpenseCategoryWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ExpenseCategory
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
     * Shows a Expens Category for editting
     * Displays a Expens Category by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return ApiResponse<ExpenseCategory?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun editExpenseCategoryWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<ExpenseCategory?> {
        val localVariableConfig = editExpenseCategoryRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return request<Unit, ExpenseCategory>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation editExpenseCategory
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return RequestConfig
     */
    fun editExpenseCategoryRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/expense_categories/{id}/edit".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Gets a new blank Expens Category object
     * Returns a blank object with default values
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return ExpenseCategory
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getExpenseCategoryCreate(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String) : ExpenseCategory {
        val localVarResponse = getExpenseCategoryCreateWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ExpenseCategory
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
     * Gets a new blank Expens Category object
     * Returns a blank object with default values
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return ApiResponse<ExpenseCategory?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getExpenseCategoryCreateWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String) : ApiResponse<ExpenseCategory?> {
        val localVariableConfig = getExpenseCategoryCreateRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith)

        return request<Unit, ExpenseCategory>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getExpenseCategoryCreate
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return RequestConfig
     */
    fun getExpenseCategoryCreateRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/expense_categories/create",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Gets a list of expense_categories
     * Lists tax rates
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return ExpenseCategory
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getExpenseCategorys(index: kotlin.String? = null) : ExpenseCategory {
        val localVarResponse = getExpenseCategorysWithHttpInfo(index = index)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ExpenseCategory
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
     * Gets a list of expense_categories
     * Lists tax rates
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return ApiResponse<ExpenseCategory?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getExpenseCategorysWithHttpInfo(index: kotlin.String?) : ApiResponse<ExpenseCategory?> {
        val localVariableConfig = getExpenseCategorysRequestConfig(index = index)

        return request<Unit, ExpenseCategory>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getExpenseCategorys
     *
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return RequestConfig
     */
    fun getExpenseCategorysRequestConfig(index: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v1/expense_categories",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Shows a Expens Category
     * Displays an ExpenseCategory by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return ExpenseCategory
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun showExpenseCategory(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ExpenseCategory {
        val localVarResponse = showExpenseCategoryWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ExpenseCategory
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
     * Shows a Expens Category
     * Displays an ExpenseCategory by id
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return ApiResponse<ExpenseCategory?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun showExpenseCategoryWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<ExpenseCategory?> {
        val localVariableConfig = showExpenseCategoryRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return request<Unit, ExpenseCategory>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation showExpenseCategory
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return RequestConfig
     */
    fun showExpenseCategoryRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/expense_categories/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Adds a expense category
     * Adds an expense category to the system
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return ExpenseCategory
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun storeExpenseCategory(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String? = null) : ExpenseCategory {
        val localVarResponse = storeExpenseCategoryWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ExpenseCategory
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
     * Adds a expense category
     * Adds an expense category to the system
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return ApiResponse<ExpenseCategory?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun storeExpenseCategoryWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?) : ApiResponse<ExpenseCategory?> {
        val localVariableConfig = storeExpenseCategoryRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include)

        return request<Unit, ExpenseCategory>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation storeExpenseCategory
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return RequestConfig
     */
    fun storeExpenseCategoryRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?) : RequestConfig<Unit> {
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
            method = RequestMethod.POST,
            path = "/api/v1/expense_categories",
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
     * @param id The ExpenseCategory Hashed ID
     * @return ExpenseCategory
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateExpenseCategory(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ExpenseCategory {
        val localVarResponse = updateExpenseCategoryWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ExpenseCategory
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
     * @param id The ExpenseCategory Hashed ID
     * @return ApiResponse<ExpenseCategory?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateExpenseCategoryWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<ExpenseCategory?> {
        val localVariableConfig = updateExpenseCategoryRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, id = id)

        return request<Unit, ExpenseCategory>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateExpenseCategory
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The ExpenseCategory Hashed ID
     * @return RequestConfig
     */
    fun updateExpenseCategoryRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_TOKEN.apply { localVariableHeaders["X-API-TOKEN"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v1/expense_categories/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
