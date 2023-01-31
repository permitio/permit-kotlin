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

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.openapitools.client.models.HTTPValidationError
import org.openapitools.client.models.ResourceActionCreate
import org.openapitools.client.models.ResourceActionRead
import org.openapitools.client.models.ResourceActionUpdate

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class ResourceActionsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create Resource Action
     * Creates a new action that can affect the resource.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceActionCreate 
     * @return ResourceActionRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createResourceAction(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceActionCreate: ResourceActionCreate) : ResourceActionRead {
        val localVarResponse = createResourceActionWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId, resourceActionCreate = resourceActionCreate)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ResourceActionRead
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
     * Create Resource Action
     * Creates a new action that can affect the resource.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceActionCreate 
     * @return ApiResponse<ResourceActionRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createResourceActionWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceActionCreate: ResourceActionCreate) : ApiResponse<ResourceActionRead?> {
        val localVariableConfig = createResourceActionRequestConfig(projId = projId, envId = envId, resourceId = resourceId, resourceActionCreate = resourceActionCreate)

        return request<ResourceActionCreate, ResourceActionRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createResourceAction
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceActionCreate 
     * @return RequestConfig
     */
    fun createResourceActionRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceActionCreate: ResourceActionCreate) : RequestConfig<ResourceActionCreate> {
        val localVariableBody = resourceActionCreate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete Resource Action
     * Deletes the action and all its related data. This includes any permissions granted to perform the action.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteResourceAction(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String) : Unit {
        val localVarResponse = deleteResourceActionWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId, actionId = actionId)

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
     * Delete Resource Action
     * Deletes the action and all its related data. This includes any permissions granted to perform the action.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteResourceActionWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = deleteResourceActionRequestConfig(projId = projId, envId = envId, resourceId = resourceId, actionId = actionId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteResourceAction
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun deleteResourceActionRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions/{action_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())).replace("{"+"action_id"+"}", encodeURIComponent(actionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Get Resource Action
     * Gets a single action defined on the resource, if such action exists.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @return ResourceActionRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getResourceAction(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String) : ResourceActionRead {
        val localVarResponse = getResourceActionWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId, actionId = actionId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ResourceActionRead
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
     * Get Resource Action
     * Gets a single action defined on the resource, if such action exists.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<ResourceActionRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getResourceActionWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String) : ApiResponse<ResourceActionRead?> {
        val localVariableConfig = getResourceActionRequestConfig(projId = projId, envId = envId, resourceId = resourceId, actionId = actionId)

        return request<Unit, ResourceActionRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getResourceAction
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun getResourceActionRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions/{action_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())).replace("{"+"action_id"+"}", encodeURIComponent(actionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List Resource Actions
     * Lists all the actions defined on the resource.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return kotlin.collections.List<ResourceActionRead>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listResourceActions(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, page: kotlin.Int? = 1, perPage: kotlin.Int? = 30) : kotlin.collections.List<ResourceActionRead> {
        val localVarResponse = listResourceActionsWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId, page = page, perPage = perPage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<ResourceActionRead>
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
     * List Resource Actions
     * Lists all the actions defined on the resource.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return ApiResponse<kotlin.collections.List<ResourceActionRead>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listResourceActionsWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?) : ApiResponse<kotlin.collections.List<ResourceActionRead>?> {
        val localVariableConfig = listResourceActionsRequestConfig(projId = projId, envId = envId, resourceId = resourceId, page = page, perPage = perPage)

        return request<Unit, kotlin.collections.List<ResourceActionRead>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listResourceActions
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return RequestConfig
     */
    fun listResourceActionsRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (perPage != null) {
                    put("per_page", listOf(perPage.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Update Resource Action
     * Partially updates the action defined on a resource. Fields that will be provided will be completely overwritten.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @param resourceActionUpdate 
     * @return ResourceActionRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateResourceAction(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String, resourceActionUpdate: ResourceActionUpdate) : ResourceActionRead {
        val localVarResponse = updateResourceActionWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId, actionId = actionId, resourceActionUpdate = resourceActionUpdate)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ResourceActionRead
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
     * Update Resource Action
     * Partially updates the action defined on a resource. Fields that will be provided will be completely overwritten.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @param resourceActionUpdate 
     * @return ApiResponse<ResourceActionRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateResourceActionWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String, resourceActionUpdate: ResourceActionUpdate) : ApiResponse<ResourceActionRead?> {
        val localVariableConfig = updateResourceActionRequestConfig(projId = projId, envId = envId, resourceId = resourceId, actionId = actionId, resourceActionUpdate = resourceActionUpdate)

        return request<ResourceActionUpdate, ResourceActionRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateResourceAction
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param actionId Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;).
     * @param resourceActionUpdate 
     * @return RequestConfig
     */
    fun updateResourceActionRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, actionId: kotlin.String, resourceActionUpdate: ResourceActionUpdate) : RequestConfig<ResourceActionUpdate> {
        val localVariableBody = resourceActionUpdate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions/{action_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())).replace("{"+"action_id"+"}", encodeURIComponent(actionId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
