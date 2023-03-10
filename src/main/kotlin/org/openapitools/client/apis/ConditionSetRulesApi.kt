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

import org.openapitools.client.models.ConditionSetRuleCreate
import org.openapitools.client.models.ConditionSetRuleRead
import org.openapitools.client.models.ConditionSetRuleRemove
import org.openapitools.client.models.HTTPValidationError

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

class ConditionSetRulesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Assign Set Permissions
     * Grant permissions to a user set *on* a resource set.  If the permission is already granted, it is skipped.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param conditionSetRuleCreate 
     * @return kotlin.collections.List<ConditionSetRuleRead>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun assignSetPermissions(projId: kotlin.String, envId: kotlin.String, conditionSetRuleCreate: ConditionSetRuleCreate) : kotlin.collections.List<ConditionSetRuleRead> {
        val localVarResponse = assignSetPermissionsWithHttpInfo(projId = projId, envId = envId, conditionSetRuleCreate = conditionSetRuleCreate)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<ConditionSetRuleRead>
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
     * Assign Set Permissions
     * Grant permissions to a user set *on* a resource set.  If the permission is already granted, it is skipped.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param conditionSetRuleCreate 
     * @return ApiResponse<kotlin.collections.List<ConditionSetRuleRead>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun assignSetPermissionsWithHttpInfo(projId: kotlin.String, envId: kotlin.String, conditionSetRuleCreate: ConditionSetRuleCreate) : ApiResponse<kotlin.collections.List<ConditionSetRuleRead>?> {
        val localVariableConfig = assignSetPermissionsRequestConfig(projId = projId, envId = envId, conditionSetRuleCreate = conditionSetRuleCreate)

        return request<ConditionSetRuleCreate, kotlin.collections.List<ConditionSetRuleRead>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation assignSetPermissions
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param conditionSetRuleCreate 
     * @return RequestConfig
     */
    fun assignSetPermissionsRequestConfig(projId: kotlin.String, envId: kotlin.String, conditionSetRuleCreate: ConditionSetRuleCreate) : RequestConfig<ConditionSetRuleCreate> {
        val localVariableBody = conditionSetRuleCreate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v2/facts/{proj_id}/{env_id}/set_rules".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List Set Permissions
     * Lists the condition set rules matching the filter. - If the &#x60;user_set&#x60; filter is present, will only return the permissions set of that user set. - If the &#x60;permission&#x60; filter is present, will only return the permissions sets that equals to the queried permission. - If the &#x60;resource_set&#x60; filter is present, will only return the permissions set of that resource set.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param userSet optional user set filter, will only return rules where the permission is granted to this user set (optional)
     * @param permission optional permission filter, will only return condition set rules granting this permission (optional)
     * @param resourceSet optional resource set filter, will only return rules where the permission is granted on this resource set (optional)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return kotlin.collections.List<ConditionSetRuleRead>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listSetPermissions(projId: kotlin.String, envId: kotlin.String, userSet: kotlin.String? = null, permission: kotlin.String? = null, resourceSet: kotlin.String? = null, page: kotlin.Int? = 1, perPage: kotlin.Int? = 30) : kotlin.collections.List<ConditionSetRuleRead> {
        val localVarResponse = listSetPermissionsWithHttpInfo(projId = projId, envId = envId, userSet = userSet, permission = permission, resourceSet = resourceSet, page = page, perPage = perPage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<ConditionSetRuleRead>
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
     * List Set Permissions
     * Lists the condition set rules matching the filter. - If the &#x60;user_set&#x60; filter is present, will only return the permissions set of that user set. - If the &#x60;permission&#x60; filter is present, will only return the permissions sets that equals to the queried permission. - If the &#x60;resource_set&#x60; filter is present, will only return the permissions set of that resource set.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param userSet optional user set filter, will only return rules where the permission is granted to this user set (optional)
     * @param permission optional permission filter, will only return condition set rules granting this permission (optional)
     * @param resourceSet optional resource set filter, will only return rules where the permission is granted on this resource set (optional)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return ApiResponse<kotlin.collections.List<ConditionSetRuleRead>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listSetPermissionsWithHttpInfo(projId: kotlin.String, envId: kotlin.String, userSet: kotlin.String?, permission: kotlin.String?, resourceSet: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?) : ApiResponse<kotlin.collections.List<ConditionSetRuleRead>?> {
        val localVariableConfig = listSetPermissionsRequestConfig(projId = projId, envId = envId, userSet = userSet, permission = permission, resourceSet = resourceSet, page = page, perPage = perPage)

        return request<Unit, kotlin.collections.List<ConditionSetRuleRead>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listSetPermissions
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param userSet optional user set filter, will only return rules where the permission is granted to this user set (optional)
     * @param permission optional permission filter, will only return condition set rules granting this permission (optional)
     * @param resourceSet optional resource set filter, will only return rules where the permission is granted on this resource set (optional)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return RequestConfig
     */
    fun listSetPermissionsRequestConfig(projId: kotlin.String, envId: kotlin.String, userSet: kotlin.String?, permission: kotlin.String?, resourceSet: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (userSet != null) {
                    put("user_set", listOf(userSet.toString()))
                }
                if (permission != null) {
                    put("permission", listOf(permission.toString()))
                }
                if (resourceSet != null) {
                    put("resource_set", listOf(resourceSet.toString()))
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
            path = "/v2/facts/{proj_id}/{env_id}/set_rules".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Unassign Set Permissions
     * Revokes permissions to a user set *on* a resource set.  If the permission is not granted, it is skipped.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param conditionSetRuleRemove 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun unassignSetPermissions(projId: kotlin.String, envId: kotlin.String, conditionSetRuleRemove: ConditionSetRuleRemove) : Unit {
        val localVarResponse = unassignSetPermissionsWithHttpInfo(projId = projId, envId = envId, conditionSetRuleRemove = conditionSetRuleRemove)

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
     * Unassign Set Permissions
     * Revokes permissions to a user set *on* a resource set.  If the permission is not granted, it is skipped.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param conditionSetRuleRemove 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun unassignSetPermissionsWithHttpInfo(projId: kotlin.String, envId: kotlin.String, conditionSetRuleRemove: ConditionSetRuleRemove) : ApiResponse<Unit?> {
        val localVariableConfig = unassignSetPermissionsRequestConfig(projId = projId, envId = envId, conditionSetRuleRemove = conditionSetRuleRemove)

        return request<ConditionSetRuleRemove, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation unassignSetPermissions
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param conditionSetRuleRemove 
     * @return RequestConfig
     */
    fun unassignSetPermissionsRequestConfig(projId: kotlin.String, envId: kotlin.String, conditionSetRuleRemove: ConditionSetRuleRemove) : RequestConfig<ConditionSetRuleRemove> {
        val localVariableBody = conditionSetRuleRemove
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/v2/facts/{proj_id}/{env_id}/set_rules".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
