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
import org.openapitools.client.models.PaginatedResultAuditLog

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

class AuditElementsDataApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * List audit logs
     * Lists audit logs for for specific elements config (tenant scope)
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param elementsConfigId Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;).
     * @param search Text search for the email field (optional)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return PaginatedResultAuditLog
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun elementsListAuditLogs(projId: kotlin.String, envId: kotlin.String, elementsConfigId: kotlin.String, search: kotlin.String? = null, page: kotlin.Int? = 1, perPage: kotlin.Int? = 30) : PaginatedResultAuditLog {
        val localVarResponse = elementsListAuditLogsWithHttpInfo(projId = projId, envId = envId, elementsConfigId = elementsConfigId, search = search, page = page, perPage = perPage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaginatedResultAuditLog
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
     * List audit logs
     * Lists audit logs for for specific elements config (tenant scope)
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param elementsConfigId Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;).
     * @param search Text search for the email field (optional)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return ApiResponse<PaginatedResultAuditLog?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun elementsListAuditLogsWithHttpInfo(projId: kotlin.String, envId: kotlin.String, elementsConfigId: kotlin.String, search: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?) : ApiResponse<PaginatedResultAuditLog?> {
        val localVariableConfig = elementsListAuditLogsRequestConfig(projId = projId, envId = envId, elementsConfigId = elementsConfigId, search = search, page = page, perPage = perPage)

        return request<Unit, PaginatedResultAuditLog>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation elementsListAuditLogs
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param envId Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;).
     * @param elementsConfigId Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;).
     * @param search Text search for the email field (optional)
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return RequestConfig
     */
    fun elementsListAuditLogsRequestConfig(projId: kotlin.String, envId: kotlin.String, elementsConfigId: kotlin.String, search: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (search != null) {
                    put("search", listOf(search.toString()))
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
            path = "/v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/audit_logs".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"env_id"+"}", encodeURIComponent(envId.toString())).replace("{"+"elements_config_id"+"}", encodeURIComponent(elementsConfigId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
