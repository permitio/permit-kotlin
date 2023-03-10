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
import org.openapitools.client.models.ResourceCreate
import org.openapitools.client.models.ResourceRead
import org.openapitools.client.models.ResourceReplace
import org.openapitools.client.models.ResourceUpdate

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

class ResourcesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create Resource
     * Creates a new resource (a type of object you may protect with permissions).
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceCreate 
     * @return ResourceRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createResource(projId: kotlin.String, envId: kotlin.String, resourceCreate: ResourceCreate) : ResourceRead {
        val localVarResponse = createResourceWithHttpInfo(projId = projId, envId = envId, resourceCreate = resourceCreate)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ResourceRead
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
     * Create Resource
     * Creates a new resource (a type of object you may protect with permissions).
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceCreate 
     * @return ApiResponse<ResourceRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createResourceWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceCreate: ResourceCreate) : ApiResponse<ResourceRead?> {
        val localVariableConfig = createResourceRequestConfig(projId = projId, envId = envId, resourceCreate = resourceCreate)

        return request<ResourceCreate, ResourceRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createResource
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceCreate 
     * @return RequestConfig
     */
    fun createResourceRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceCreate: ResourceCreate) : RequestConfig<ResourceCreate> {
        val localVariableBody = resourceCreate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v2/schema/{proj_id}/{env_id}/resources".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete Resource
     * Deletes the resource and all its related data.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteResource(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String) : Unit {
        val localVarResponse = deleteResourceWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId)

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
     * Delete Resource
     * Deletes the resource and all its related data.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteResourceWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = deleteResourceRequestConfig(projId = projId, envId = envId, resourceId = resourceId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteResource
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun deleteResourceRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Get Resource
     * Gets a single resource, if such resource exists.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @return ResourceRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getResource(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String) : ResourceRead {
        val localVarResponse = getResourceWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ResourceRead
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
     * Get Resource
     * Gets a single resource, if such resource exists.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<ResourceRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getResourceWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String) : ApiResponse<ResourceRead?> {
        val localVariableConfig = getResourceRequestConfig(projId = projId, envId = envId, resourceId = resourceId)

        return request<Unit, ResourceRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getResource
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun getResourceRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List Resources
     * Lists all the resources defined in your schema.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param includeBuiltIn Whether to include or exclude built-in resources, default is False (optional, default to false)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return kotlin.collections.List<ResourceRead>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listResources(projId: kotlin.String, envId: kotlin.String, includeBuiltIn: kotlin.Boolean? = false, page: kotlin.Int? = 1, perPage: kotlin.Int? = 30) : kotlin.collections.List<ResourceRead> {
        val localVarResponse = listResourcesWithHttpInfo(projId = projId, envId = envId, includeBuiltIn = includeBuiltIn, page = page, perPage = perPage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<ResourceRead>
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
     * List Resources
     * Lists all the resources defined in your schema.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param includeBuiltIn Whether to include or exclude built-in resources, default is False (optional, default to false)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return ApiResponse<kotlin.collections.List<ResourceRead>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listResourcesWithHttpInfo(projId: kotlin.String, envId: kotlin.String, includeBuiltIn: kotlin.Boolean?, page: kotlin.Int?, perPage: kotlin.Int?) : ApiResponse<kotlin.collections.List<ResourceRead>?> {
        val localVariableConfig = listResourcesRequestConfig(projId = projId, envId = envId, includeBuiltIn = includeBuiltIn, page = page, perPage = perPage)

        return request<Unit, kotlin.collections.List<ResourceRead>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listResources
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param includeBuiltIn Whether to include or exclude built-in resources, default is False (optional, default to false)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return RequestConfig
     */
    fun listResourcesRequestConfig(projId: kotlin.String, envId: kotlin.String, includeBuiltIn: kotlin.Boolean?, page: kotlin.Int?, perPage: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (includeBuiltIn != null) {
                    put("include_built_in", listOf(includeBuiltIn.toString()))
                }
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
            path = "/v2/schema/{proj_id}/{env_id}/resources".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Replace Resource
     * Completely replaces the resource definition.  - If the resource key is changed, all role and permissions assignments for the the resource will be revoked. - If the resource key is unchanged, but some actions are removed or renamed from the resource definition, role and permissions assignments for these actions will be revoked.  TODO: we need to decide if we are auto-revoking, or if we are rejecting the PUT completely while there are permissions that can be affected.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceReplace 
     * @return ResourceRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun replaceResource(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceReplace: ResourceReplace) : ResourceRead {
        val localVarResponse = replaceResourceWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId, resourceReplace = resourceReplace)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ResourceRead
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
     * Replace Resource
     * Completely replaces the resource definition.  - If the resource key is changed, all role and permissions assignments for the the resource will be revoked. - If the resource key is unchanged, but some actions are removed or renamed from the resource definition, role and permissions assignments for these actions will be revoked.  TODO: we need to decide if we are auto-revoking, or if we are rejecting the PUT completely while there are permissions that can be affected.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceReplace 
     * @return ApiResponse<ResourceRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun replaceResourceWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceReplace: ResourceReplace) : ApiResponse<ResourceRead?> {
        val localVariableConfig = replaceResourceRequestConfig(projId = projId, envId = envId, resourceId = resourceId, resourceReplace = resourceReplace)

        return request<ResourceReplace, ResourceRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation replaceResource
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceReplace 
     * @return RequestConfig
     */
    fun replaceResourceRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceReplace: ResourceReplace) : RequestConfig<ResourceReplace> {
        val localVariableBody = resourceReplace
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Update Resource
     * Partially updates the resource definition. Fields that will be provided will be completely overwritten.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceUpdate 
     * @return ResourceRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateResource(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceUpdate: ResourceUpdate) : ResourceRead {
        val localVarResponse = updateResourceWithHttpInfo(projId = projId, envId = envId, resourceId = resourceId, resourceUpdate = resourceUpdate)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ResourceRead
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
     * Update Resource
     * Partially updates the resource definition. Fields that will be provided will be completely overwritten.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceUpdate 
     * @return ApiResponse<ResourceRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateResourceWithHttpInfo(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceUpdate: ResourceUpdate) : ApiResponse<ResourceRead?> {
        val localVariableConfig = updateResourceRequestConfig(projId = projId, envId = envId, resourceId = resourceId, resourceUpdate = resourceUpdate)

        return request<ResourceUpdate, ResourceRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateResource
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param resourceId Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;).
     * @param resourceUpdate 
     * @return RequestConfig
     */
    fun updateResourceRequestConfig(projId: kotlin.String, envId: kotlin.String, resourceId: kotlin.String, resourceUpdate: ResourceUpdate) : RequestConfig<ResourceUpdate> {
        val localVariableBody = resourceUpdate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/v2/schema/{proj_id}/{env_id}/resources/{resource_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"resource_id"+"}", encodeURIComponent(resourceId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
