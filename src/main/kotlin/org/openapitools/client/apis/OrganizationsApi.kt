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
import org.openapitools.client.models.InviteCreate
import org.openapitools.client.models.InviteRead
import org.openapitools.client.models.MultiInviteResult
import org.openapitools.client.models.OrganizationCreate
import org.openapitools.client.models.OrganizationRead
import org.openapitools.client.models.OrganizationReadWithAPIKey
import org.openapitools.client.models.OrganizationUpdate

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

class OrganizationsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Cancel Invite
     * Cancels an invite that was sent to a new member.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param inviteId Id of the invite to cancel
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun cancelInvite(orgId: kotlin.String, inviteId: java.util.UUID) : Unit {
        val localVarResponse = cancelInviteWithHttpInfo(orgId = orgId, inviteId = inviteId)

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
     * Cancel Invite
     * Cancels an invite that was sent to a new member.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param inviteId Id of the invite to cancel
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun cancelInviteWithHttpInfo(orgId: kotlin.String, inviteId: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = cancelInviteRequestConfig(orgId = orgId, inviteId = inviteId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation cancelInvite
     *
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param inviteId Id of the invite to cancel
     * @return RequestConfig
     */
    fun cancelInviteRequestConfig(orgId: kotlin.String, inviteId: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/v2/orgs/{org_id}/invites/{invite_id}".replace("{"+"org_id"+"}", encodeURIComponent(orgId.toString())).replace("{"+"invite_id"+"}", encodeURIComponent(inviteId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Create Organization
     * Creates a new organization that will be owned by the authenticated actor (i.e: human team member or api key).
     * @param organizationCreate 
     * @return OrganizationReadWithAPIKey
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createOrganization(organizationCreate: OrganizationCreate) : OrganizationReadWithAPIKey {
        val localVarResponse = createOrganizationWithHttpInfo(organizationCreate = organizationCreate)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as OrganizationReadWithAPIKey
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
     * Create Organization
     * Creates a new organization that will be owned by the authenticated actor (i.e: human team member or api key).
     * @param organizationCreate 
     * @return ApiResponse<OrganizationReadWithAPIKey?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createOrganizationWithHttpInfo(organizationCreate: OrganizationCreate) : ApiResponse<OrganizationReadWithAPIKey?> {
        val localVariableConfig = createOrganizationRequestConfig(organizationCreate = organizationCreate)

        return request<OrganizationCreate, OrganizationReadWithAPIKey>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createOrganization
     *
     * @param organizationCreate 
     * @return RequestConfig
     */
    fun createOrganizationRequestConfig(organizationCreate: OrganizationCreate) : RequestConfig<OrganizationCreate> {
        val localVariableBody = organizationCreate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v2/orgs",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete Organization
     * Deletes an organization (Permit.io account) and all its related data.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteOrganization(orgId: kotlin.String) : Unit {
        val localVarResponse = deleteOrganizationWithHttpInfo(orgId = orgId)

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
     * Delete Organization
     * Deletes an organization (Permit.io account) and all its related data.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteOrganizationWithHttpInfo(orgId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = deleteOrganizationRequestConfig(orgId = orgId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteOrganization
     *
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun deleteOrganizationRequestConfig(orgId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/v2/orgs/{org_id}".replace("{"+"org_id"+"}", encodeURIComponent(orgId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Get Active Organization
     * Gets a single organization (Permit.io account) matching the given org_id, if such org exists and can be accessed by the authenticated actor.
     * @return OrganizationRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getActiveOrganization() : OrganizationRead {
        val localVarResponse = getActiveOrganizationWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as OrganizationRead
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
     * Get Active Organization
     * Gets a single organization (Permit.io account) matching the given org_id, if such org exists and can be accessed by the authenticated actor.
     * @return ApiResponse<OrganizationRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getActiveOrganizationWithHttpInfo() : ApiResponse<OrganizationRead?> {
        val localVariableConfig = getActiveOrganizationRequestConfig()

        return request<Unit, OrganizationRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getActiveOrganization
     *
     * @return RequestConfig
     */
    fun getActiveOrganizationRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/orgs/active/org",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Get Organization
     * Gets a single organization (Permit.io account) matching the given org_id, if such org exists and can be accessed by the authenticated actor.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @return OrganizationRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getOrganization(orgId: kotlin.String) : OrganizationRead {
        val localVarResponse = getOrganizationWithHttpInfo(orgId = orgId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as OrganizationRead
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
     * Get Organization
     * Gets a single organization (Permit.io account) matching the given org_id, if such org exists and can be accessed by the authenticated actor.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @return ApiResponse<OrganizationRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getOrganizationWithHttpInfo(orgId: kotlin.String) : ApiResponse<OrganizationRead?> {
        val localVariableConfig = getOrganizationRequestConfig(orgId = orgId)

        return request<Unit, OrganizationRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getOrganization
     *
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @return RequestConfig
     */
    fun getOrganizationRequestConfig(orgId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/orgs/{org_id}".replace("{"+"org_id"+"}", encodeURIComponent(orgId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Invite Members To Organization
     * Invite new members into the organization.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param inviteCreate 
     * @param inviterName  (optional)
     * @param inviterEmail  (optional)
     * @return MultiInviteResult
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun inviteMembersToOrganization(orgId: kotlin.String, inviteCreate: kotlin.collections.List<InviteCreate>, inviterName: kotlin.String? = null, inviterEmail: kotlin.String? = null) : MultiInviteResult {
        val localVarResponse = inviteMembersToOrganizationWithHttpInfo(orgId = orgId, inviteCreate = inviteCreate, inviterName = inviterName, inviterEmail = inviterEmail)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as MultiInviteResult
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
     * Invite Members To Organization
     * Invite new members into the organization.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param inviteCreate 
     * @param inviterName  (optional)
     * @param inviterEmail  (optional)
     * @return ApiResponse<MultiInviteResult?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun inviteMembersToOrganizationWithHttpInfo(orgId: kotlin.String, inviteCreate: kotlin.collections.List<InviteCreate>, inviterName: kotlin.String?, inviterEmail: kotlin.String?) : ApiResponse<MultiInviteResult?> {
        val localVariableConfig = inviteMembersToOrganizationRequestConfig(orgId = orgId, inviteCreate = inviteCreate, inviterName = inviterName, inviterEmail = inviterEmail)

        return request<kotlin.collections.List<InviteCreate>, MultiInviteResult>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation inviteMembersToOrganization
     *
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param inviteCreate 
     * @param inviterName  (optional)
     * @param inviterEmail  (optional)
     * @return RequestConfig
     */
    fun inviteMembersToOrganizationRequestConfig(orgId: kotlin.String, inviteCreate: kotlin.collections.List<InviteCreate>, inviterName: kotlin.String?, inviterEmail: kotlin.String?) : RequestConfig<kotlin.collections.List<InviteCreate>> {
        val localVariableBody = inviteCreate
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (inviterName != null) {
                    put("inviter_name", listOf(inviterName.toString()))
                }
                if (inviterEmail != null) {
                    put("inviter_email", listOf(inviterEmail.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v2/orgs/{org_id}/invites".replace("{"+"org_id"+"}", encodeURIComponent(orgId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List Organization Invites
     * Lists pending organization invites
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return kotlin.collections.List<InviteRead>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listOrganizationInvites(orgId: kotlin.String, page: kotlin.Int? = 1, perPage: kotlin.Int? = 30) : kotlin.collections.List<InviteRead> {
        val localVarResponse = listOrganizationInvitesWithHttpInfo(orgId = orgId, page = page, perPage = perPage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<InviteRead>
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
     * List Organization Invites
     * Lists pending organization invites
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return ApiResponse<kotlin.collections.List<InviteRead>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listOrganizationInvitesWithHttpInfo(orgId: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?) : ApiResponse<kotlin.collections.List<InviteRead>?> {
        val localVariableConfig = listOrganizationInvitesRequestConfig(orgId = orgId, page = page, perPage = perPage)

        return request<Unit, kotlin.collections.List<InviteRead>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listOrganizationInvites
     *
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return RequestConfig
     */
    fun listOrganizationInvitesRequestConfig(orgId: kotlin.String, page: kotlin.Int?, perPage: kotlin.Int?) : RequestConfig<Unit> {
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
            path = "/v2/orgs/{org_id}/invites".replace("{"+"org_id"+"}", encodeURIComponent(orgId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * List Organizations
     * Lists all the organizations that can be accessed by the authenticated actor (i.e: human team member or api key).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return kotlin.collections.List<OrganizationRead>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listOrganizations(page: kotlin.Int? = 1, perPage: kotlin.Int? = 30) : kotlin.collections.List<OrganizationRead> {
        val localVarResponse = listOrganizationsWithHttpInfo(page = page, perPage = perPage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<OrganizationRead>
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
     * List Organizations
     * Lists all the organizations that can be accessed by the authenticated actor (i.e: human team member or api key).
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return ApiResponse<kotlin.collections.List<OrganizationRead>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listOrganizationsWithHttpInfo(page: kotlin.Int?, perPage: kotlin.Int?) : ApiResponse<kotlin.collections.List<OrganizationRead>?> {
        val localVariableConfig = listOrganizationsRequestConfig(page = page, perPage = perPage)

        return request<Unit, kotlin.collections.List<OrganizationRead>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listOrganizations
     *
     * @param page Page number of the results to fetch, starting at 1. (optional, default to 1)
     * @param perPage The number of results per page (max 100). (optional, default to 30)
     * @return RequestConfig
     */
    fun listOrganizationsRequestConfig(page: kotlin.Int?, perPage: kotlin.Int?) : RequestConfig<Unit> {
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
            path = "/v2/orgs",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Update Organization
     * Updates the organization&#39;s profile.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param organizationUpdate 
     * @return OrganizationRead
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateOrganization(orgId: kotlin.String, organizationUpdate: OrganizationUpdate) : OrganizationRead {
        val localVarResponse = updateOrganizationWithHttpInfo(orgId = orgId, organizationUpdate = organizationUpdate)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as OrganizationRead
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
     * Update Organization
     * Updates the organization&#39;s profile.
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param organizationUpdate 
     * @return ApiResponse<OrganizationRead?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun updateOrganizationWithHttpInfo(orgId: kotlin.String, organizationUpdate: OrganizationUpdate) : ApiResponse<OrganizationRead?> {
        val localVariableConfig = updateOrganizationRequestConfig(orgId = orgId, organizationUpdate = organizationUpdate)

        return request<OrganizationUpdate, OrganizationRead>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateOrganization
     *
     * @param orgId Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;).
     * @param organizationUpdate 
     * @return RequestConfig
     */
    fun updateOrganizationRequestConfig(orgId: kotlin.String, organizationUpdate: OrganizationUpdate) : RequestConfig<OrganizationUpdate> {
        val localVariableBody = organizationUpdate
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/v2/orgs/{org_id}".replace("{"+"org_id"+"}", encodeURIComponent(orgId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
