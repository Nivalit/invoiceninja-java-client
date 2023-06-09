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
import com.nivalit.invoiceninja.models.TaskSchedulerSchema
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

class TaskSchedulersApiAdapter(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://demo.invoiceninja.com")
        }
    }

    /**
     * Performs bulk actions on an array of task_schedulers
     * 
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody array of ids
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return TaskSchedulerSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun bulkTaskSchedulerActions(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String? = null) : TaskSchedulerSchema {
        val localVarResponse = bulkTaskSchedulerActionsWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, requestBody = requestBody, index = index)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskSchedulerSchema
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
     * Performs bulk actions on an array of task_schedulers
     * 
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody array of ids
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return ApiResponse<TaskSchedulerSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun bulkTaskSchedulerActionsWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String?) : ApiResponse<TaskSchedulerSchema?> {
        val localVariableConfig = bulkTaskSchedulerActionsRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, requestBody = requestBody, index = index)

        return request<kotlin.collections.List<kotlin.Int>, TaskSchedulerSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation bulkTaskSchedulerActions
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param requestBody array of ids
     * @param index Replaces the default response index from data to a user specific string (optional)
     * @return RequestConfig
     */
    fun bulkTaskSchedulerActionsRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, requestBody: kotlin.collections.List<kotlin.Int>, index: kotlin.String?) : RequestConfig<kotlin.collections.List<kotlin.Int>> {
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
            path = "/api/v1/task_schedulers/bulk",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Create task scheduler with job 
     * Create task scheduler with a job (action(job) request should be sent via request also. Example: We want client report to be job which will be run      * multiple times, we should send the same parameters in the request as we would send if we wanted to get report, see example
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param taskSchedulerSchema 
     * @param X_API_SECRET The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createTaskScheduler(xRequestedWith: kotlin.String, taskSchedulerSchema: TaskSchedulerSchema, X_API_SECRET: kotlin.String? = null) : Unit {
        val localVarResponse = createTaskSchedulerWithHttpInfo(xRequestedWith = xRequestedWith, taskSchedulerSchema = taskSchedulerSchema, X_API_SECRET = X_API_SECRET)

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
     * Create task scheduler with job 
     * Create task scheduler with a job (action(job) request should be sent via request also. Example: We want client report to be job which will be run      * multiple times, we should send the same parameters in the request as we would send if we wanted to get report, see example
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param taskSchedulerSchema 
     * @param X_API_SECRET The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun createTaskSchedulerWithHttpInfo(xRequestedWith: kotlin.String, taskSchedulerSchema: TaskSchedulerSchema, X_API_SECRET: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = createTaskSchedulerRequestConfig(xRequestedWith = xRequestedWith, taskSchedulerSchema = taskSchedulerSchema, X_API_SECRET = X_API_SECRET)

        return request<TaskSchedulerSchema, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createTaskScheduler
     *
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param taskSchedulerSchema 
     * @param X_API_SECRET The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. (optional)
     * @return RequestConfig
     */
    fun createTaskSchedulerRequestConfig(xRequestedWith: kotlin.String, taskSchedulerSchema: TaskSchedulerSchema, X_API_SECRET: kotlin.String?) : RequestConfig<TaskSchedulerSchema> {
        val localVariableBody = taskSchedulerSchema
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_SECRET?.apply { localVariableHeaders["X-API-SECRET"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v1/task_schedulers/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Destroy Task Scheduler
     * Destroy task scheduler and its associated job
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun destroyTaskScheduler(xRequestedWith: kotlin.String, id: kotlin.String) : Unit {
        val localVarResponse = destroyTaskSchedulerWithHttpInfo(xRequestedWith = xRequestedWith, id = id)

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
     * Destroy Task Scheduler
     * Destroy task scheduler and its associated job
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun destroyTaskSchedulerWithHttpInfo(xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = destroyTaskSchedulerRequestConfig(xRequestedWith = xRequestedWith, id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation destroyTaskScheduler
     *
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @return RequestConfig
     */
    fun destroyTaskSchedulerRequestConfig(xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v1/task_schedulers/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Gets a new blank scheduler object
     * Returns a blank object with default values
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return TaskSchedulerSchema
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTaskScheduler(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String? = null) : TaskSchedulerSchema {
        val localVarResponse = getTaskSchedulerWithHttpInfo(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TaskSchedulerSchema
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
     * Gets a new blank scheduler object
     * Returns a blank object with default values
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return ApiResponse<TaskSchedulerSchema?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTaskSchedulerWithHttpInfo(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?) : ApiResponse<TaskSchedulerSchema?> {
        val localVariableConfig = getTaskSchedulerRequestConfig(X_API_TOKEN = X_API_TOKEN, xRequestedWith = xRequestedWith, include = include)

        return request<Unit, TaskSchedulerSchema>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTaskScheduler
     *
     * @param X_API_TOKEN The API token to be used for authentication
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param include Includes child relationships in the response, format is comma separated. Check each model for the list of associated includes (optional)
     * @return RequestConfig
     */
    fun getTaskSchedulerRequestConfig(X_API_TOKEN: kotlin.String, xRequestedWith: kotlin.String, include: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/api/v1/task_schedulers/create",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Task Scheduler Index
     * Get all schedulers with associated jobs
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTaskSchedulers(xRequestedWith: kotlin.String) : Unit {
        val localVarResponse = getTaskSchedulersWithHttpInfo(xRequestedWith = xRequestedWith)

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
     * Task Scheduler Index
     * Get all schedulers with associated jobs
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun getTaskSchedulersWithHttpInfo(xRequestedWith: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = getTaskSchedulersRequestConfig(xRequestedWith = xRequestedWith)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTaskSchedulers
     *
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @return RequestConfig
     */
    fun getTaskSchedulersRequestConfig(xRequestedWith: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/task_schedulers/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Show given scheduler
     * Get scheduler with associated job
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun showTaskScheduler(xRequestedWith: kotlin.String, id: kotlin.String) : Unit {
        val localVarResponse = showTaskSchedulerWithHttpInfo(xRequestedWith = xRequestedWith, id = id)

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
     * Show given scheduler
     * Get scheduler with associated job
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun showTaskSchedulerWithHttpInfo(xRequestedWith: kotlin.String, id: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = showTaskSchedulerRequestConfig(xRequestedWith = xRequestedWith, id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation showTaskScheduler
     *
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @return RequestConfig
     */
    fun showTaskSchedulerRequestConfig(xRequestedWith: kotlin.String, id: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/task_schedulers/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update task scheduler 
     * Update task scheduler
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @param taskSchedulerSchema 
     * @param X_API_SECRET The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateTaskScheduler(xRequestedWith: kotlin.String, id: kotlin.String, taskSchedulerSchema: TaskSchedulerSchema, X_API_SECRET: kotlin.String? = null) : Unit {
        val localVarResponse = updateTaskSchedulerWithHttpInfo(xRequestedWith = xRequestedWith, id = id, taskSchedulerSchema = taskSchedulerSchema, X_API_SECRET = X_API_SECRET)

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
     * Update task scheduler 
     * Update task scheduler
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @param taskSchedulerSchema 
     * @param X_API_SECRET The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun updateTaskSchedulerWithHttpInfo(xRequestedWith: kotlin.String, id: kotlin.String, taskSchedulerSchema: TaskSchedulerSchema, X_API_SECRET: kotlin.String?) : ApiResponse<Unit?> {
        val localVariableConfig = updateTaskSchedulerRequestConfig(xRequestedWith = xRequestedWith, id = id, taskSchedulerSchema = taskSchedulerSchema, X_API_SECRET = X_API_SECRET)

        return request<TaskSchedulerSchema, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateTaskScheduler
     *
     * @param xRequestedWith Used to send the XMLHttpRequest header
     * @param id The Scheduler Hashed ID
     * @param taskSchedulerSchema 
     * @param X_API_SECRET The API secret as defined by the .env variable API_SECRET. Only needed for self hosted users, and only applicable on the login route. (optional)
     * @return RequestConfig
     */
    fun updateTaskSchedulerRequestConfig(xRequestedWith: kotlin.String, id: kotlin.String, taskSchedulerSchema: TaskSchedulerSchema, X_API_SECRET: kotlin.String?) : RequestConfig<TaskSchedulerSchema> {
        val localVariableBody = taskSchedulerSchema
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        X_API_SECRET?.apply { localVariableHeaders["X-API-SECRET"] = this.toString() }
        xRequestedWith.apply { localVariableHeaders["X-Requested-With"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v1/task_schedulers/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
