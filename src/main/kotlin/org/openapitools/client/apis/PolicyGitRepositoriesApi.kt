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
import org.openapitools.client.models.PolicyRepoCreate
import org.openapitools.client.models.PolicyRepoRead
import org.openapitools.client.models.ProjectRead

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

class PolicyGitRepositoriesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Activate Policy Repo
     * Disable the currently active policy repo, this action means to turn off the gitops feature. If there is no active policy repo, this action will do nothing.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return ProjectRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun activatePolicyRepo(projId: kotlin.String, repoId: kotlin.String) : ProjectRead {
        val localVarResponse = activatePolicyRepoWithHttpInfo(projId = projId, repoId = repoId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ProjectRead
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
     * Activate Policy Repo
     * Disable the currently active policy repo, this action means to turn off the gitops feature. If there is no active policy repo, this action will do nothing.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<ProjectRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun activatePolicyRepoWithHttpInfo(projId: kotlin.String, repoId: kotlin.String) : ApiResponse<ProjectRead?> {
        val localVariableConfig = activatePolicyRepoRequestConfig(projId = projId, repoId = repoId)

        return request<Unit, ProjectRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation activatePolicyRepo
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun activatePolicyRepoRequestConfig(projId: kotlin.String, repoId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/v2/projects/{proj_id}/repos/{repo_id}/activate".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"repo_id"+"}", encodeURIComponent(repoId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Create Policy Repo
     * Creates a new policy repository configuration under a given project. The given repository is created with status &#39;pending&#39;, it will be changed and used as the &#39;active&#39; repository for the policy only after a successful attempt to use it. The repository main branch must be present in the remote.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param policyRepoCreate 
     * @return PolicyRepoRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createPolicyRepo(projId: kotlin.String, policyRepoCreate: PolicyRepoCreate) : PolicyRepoRead {
        val localVarResponse = createPolicyRepoWithHttpInfo(projId = projId, policyRepoCreate = policyRepoCreate)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PolicyRepoRead
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
     * Create Policy Repo
     * Creates a new policy repository configuration under a given project. The given repository is created with status &#39;pending&#39;, it will be changed and used as the &#39;active&#39; repository for the policy only after a successful attempt to use it. The repository main branch must be present in the remote.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param policyRepoCreate 
     * @return ApiResponse<PolicyRepoRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createPolicyRepoWithHttpInfo(projId: kotlin.String, policyRepoCreate: PolicyRepoCreate) : ApiResponse<PolicyRepoRead?> {
        val localVariableConfig = createPolicyRepoRequestConfig(projId = projId, policyRepoCreate = policyRepoCreate)

        return request<PolicyRepoCreate, PolicyRepoRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createPolicyRepo
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param policyRepoCreate 
     * @return RequestConfig
     */
    fun createPolicyRepoRequestConfig(projId: kotlin.String, policyRepoCreate: PolicyRepoCreate) : RequestConfig<PolicyRepoCreate> {
        val localVariableBody = policyRepoCreate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v2/projects/{proj_id}/repos".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete Policy Repo
     * Deletes an environment and all its related data.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deletePolicyRepo(projId: kotlin.String, repoId: kotlin.String) : Unit {
        val localVarResponse = deletePolicyRepoWithHttpInfo(projId = projId, repoId = repoId)

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
     * Delete Policy Repo
     * Deletes an environment and all its related data.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deletePolicyRepoWithHttpInfo(projId: kotlin.String, repoId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = deletePolicyRepoRequestConfig(projId = projId, repoId = repoId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deletePolicyRepo
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun deletePolicyRepoRequestConfig(projId: kotlin.String, repoId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/v2/projects/{proj_id}/repos/{repo_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"repo_id"+"}", encodeURIComponent(repoId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Disable Active Policy Repo
     * Disable the currently active policy repo, this action means to turn off the gitops feature. If there is no active policy repo, this action will do nothing.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @return ProjectRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun disableActivePolicyRepo(projId: kotlin.String) : ProjectRead {
        val localVarResponse = disableActivePolicyRepoWithHttpInfo(projId = projId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ProjectRead
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
     * Disable Active Policy Repo
     * Disable the currently active policy repo, this action means to turn off the gitops feature. If there is no active policy repo, this action will do nothing.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<ProjectRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun disableActivePolicyRepoWithHttpInfo(projId: kotlin.String) : ApiResponse<ProjectRead?> {
        val localVariableConfig = disableActivePolicyRepoRequestConfig(projId = projId)

        return request<Unit, ProjectRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation disableActivePolicyRepo
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun disableActivePolicyRepoRequestConfig(projId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/v2/projects/{proj_id}/repos/disable".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Get Active Policy Repo
     * Gets the currently active repository, if such repository exists.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @return PolicyRepoRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getActivePolicyRepo(projId: kotlin.String) : PolicyRepoRead {
        val localVarResponse = getActivePolicyRepoWithHttpInfo(projId = projId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PolicyRepoRead
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
     * Get Active Policy Repo
     * Gets the currently active repository, if such repository exists.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<PolicyRepoRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getActivePolicyRepoWithHttpInfo(projId: kotlin.String) : ApiResponse<PolicyRepoRead?> {
        val localVariableConfig = getActivePolicyRepoRequestConfig(projId = projId)

        return request<Unit, PolicyRepoRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getActivePolicyRepo
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun getActivePolicyRepoRequestConfig(projId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/projects/{proj_id}/repos/active".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Get Policy Repo
     * Gets a single repository matching the given repo_id, if such repository exists.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return PolicyRepoRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPolicyRepo(projId: kotlin.String, repoId: kotlin.String) : PolicyRepoRead {
        val localVarResponse = getPolicyRepoWithHttpInfo(projId = projId, repoId = repoId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PolicyRepoRead
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
     * Get Policy Repo
     * Gets a single repository matching the given repo_id, if such repository exists.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<PolicyRepoRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getPolicyRepoWithHttpInfo(projId: kotlin.String, repoId: kotlin.String) : ApiResponse<PolicyRepoRead?> {
        val localVariableConfig = getPolicyRepoRequestConfig(projId = projId, repoId = repoId)

        return request<Unit, PolicyRepoRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getPolicyRepo
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param repoId Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun getPolicyRepoRequestConfig(projId: kotlin.String, repoId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/projects/{proj_id}/repos/{repo_id}".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())).replace("{"+"repo_id"+"}", encodeURIComponent(repoId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List Policy Repos
     * Lists all the policy repositories under a given project.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return kotlin.collections.List<PolicyRepoRead>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listPolicyRepos(projId: kotlin.String, page: kotlin.Int? = 1, perPage: kotlin.Int? = 30) : kotlin.collections.List<PolicyRepoRead> {
        val localVarResponse = listPolicyReposWithHttpInfo(projId = projId, page = page, perPage = perPage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<PolicyRepoRead>
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
     * List Policy Repos
     * Lists all the policy repositories under a given project.
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return ApiResponse<kotlin.collections.List<PolicyRepoRead>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listPolicyReposWithHttpInfo(projId: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?) : ApiResponse<kotlin.collections.List<PolicyRepoRead>?> {
        val localVariableConfig = listPolicyReposRequestConfig(projId = projId, page = page, perPage = perPage)

        return request<Unit, kotlin.collections.List<PolicyRepoRead>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listPolicyRepos
     *
     * @param projId Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return RequestConfig
     */
    fun listPolicyReposRequestConfig(projId: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?) : RequestConfig<Unit> {
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
            path = "/v2/projects/{proj_id}/repos".replace("{"+"proj_id"+"}", encodeURIComponent(projId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
