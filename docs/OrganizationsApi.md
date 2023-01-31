# OrganizationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelInvite**](OrganizationsApi.md#cancelInvite) | **DELETE** /v2/orgs/{org_id}/invites/{invite_id} | Cancel Invite
[**createOrganization**](OrganizationsApi.md#createOrganization) | **POST** /v2/orgs | Create Organization
[**deleteOrganization**](OrganizationsApi.md#deleteOrganization) | **DELETE** /v2/orgs/{org_id} | Delete Organization
[**getActiveOrganization**](OrganizationsApi.md#getActiveOrganization) | **GET** /v2/orgs/active/org | Get Active Organization
[**getOrganization**](OrganizationsApi.md#getOrganization) | **GET** /v2/orgs/{org_id} | Get Organization
[**inviteMembersToOrganization**](OrganizationsApi.md#inviteMembersToOrganization) | **POST** /v2/orgs/{org_id}/invites | Invite Members To Organization
[**listOrganizationInvites**](OrganizationsApi.md#listOrganizationInvites) | **GET** /v2/orgs/{org_id}/invites | List Organization Invites
[**listOrganizations**](OrganizationsApi.md#listOrganizations) | **GET** /v2/orgs | List Organizations
[**updateOrganization**](OrganizationsApi.md#updateOrganization) | **PATCH** /v2/orgs/{org_id} | Update Organization


<a name="cancelInvite"></a>
# **cancelInvite**
> cancelInvite(orgId, inviteId)

Cancel Invite

Cancels an invite that was sent to a new member.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
val orgId : kotlin.String = orgId_example // kotlin.String | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
val inviteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Id of the invite to cancel
try {
    apiInstance.cancelInvite(orgId, inviteId)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#cancelInvite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#cancelInvite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.String**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |
 **inviteId** | **java.util.UUID**| Id of the invite to cancel |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOrganization"></a>
# **createOrganization**
> OrganizationReadWithAPIKey createOrganization(organizationCreate)

Create Organization

Creates a new organization that will be owned by the authenticated actor (i.e: human team member or api key).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
val organizationCreate : OrganizationCreate =  // OrganizationCreate | 
try {
    val result : OrganizationReadWithAPIKey = apiInstance.createOrganization(organizationCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#createOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#createOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationCreate** | [**OrganizationCreate**](OrganizationCreate.md)|  |

### Return type

[**OrganizationReadWithAPIKey**](OrganizationReadWithAPIKey.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrganization"></a>
# **deleteOrganization**
> deleteOrganization(orgId)

Delete Organization

Deletes an organization (Permit.io account) and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
val orgId : kotlin.String = orgId_example // kotlin.String | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
try {
    apiInstance.deleteOrganization(orgId)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#deleteOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#deleteOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.String**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActiveOrganization"></a>
# **getActiveOrganization**
> OrganizationRead getActiveOrganization()

Get Active Organization

Gets a single organization (Permit.io account) matching the given org_id, if such org exists and can be accessed by the authenticated actor.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
try {
    val result : OrganizationRead = apiInstance.getActiveOrganization()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#getActiveOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#getActiveOrganization")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrganizationRead**](OrganizationRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganization"></a>
# **getOrganization**
> OrganizationRead getOrganization(orgId)

Get Organization

Gets a single organization (Permit.io account) matching the given org_id, if such org exists and can be accessed by the authenticated actor.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
val orgId : kotlin.String = orgId_example // kotlin.String | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
try {
    val result : OrganizationRead = apiInstance.getOrganization(orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#getOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#getOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.String**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |

### Return type

[**OrganizationRead**](OrganizationRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inviteMembersToOrganization"></a>
# **inviteMembersToOrganization**
> MultiInviteResult inviteMembersToOrganization(orgId, inviteCreate, inviterName, inviterEmail)

Invite Members To Organization

Invite new members into the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
val orgId : kotlin.String = orgId_example // kotlin.String | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
val inviteCreate : kotlin.collections.List<InviteCreate> =  // kotlin.collections.List<InviteCreate> | 
val inviterName : kotlin.String = inviterName_example // kotlin.String | 
val inviterEmail : kotlin.String = inviterEmail_example // kotlin.String | 
try {
    val result : MultiInviteResult = apiInstance.inviteMembersToOrganization(orgId, inviteCreate, inviterName, inviterEmail)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#inviteMembersToOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#inviteMembersToOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.String**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |
 **inviteCreate** | [**kotlin.collections.List&lt;InviteCreate&gt;**](InviteCreate.md)|  |
 **inviterName** | **kotlin.String**|  | [optional]
 **inviterEmail** | **kotlin.String**|  | [optional]

### Return type

[**MultiInviteResult**](MultiInviteResult.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOrganizationInvites"></a>
# **listOrganizationInvites**
> kotlin.collections.List&lt;InviteRead&gt; listOrganizationInvites(orgId, page, perPage)

List Organization Invites

Lists pending organization invites

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
val orgId : kotlin.String = orgId_example // kotlin.String | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<InviteRead> = apiInstance.listOrganizationInvites(orgId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#listOrganizationInvites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#listOrganizationInvites")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.String**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;InviteRead&gt;**](InviteRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrganizations"></a>
# **listOrganizations**
> kotlin.collections.List&lt;OrganizationRead&gt; listOrganizations(page, perPage)

List Organizations

Lists all the organizations that can be accessed by the authenticated actor (i.e: human team member or api key).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<OrganizationRead> = apiInstance.listOrganizations(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#listOrganizations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#listOrganizations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;OrganizationRead&gt;**](OrganizationRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrganization"></a>
# **updateOrganization**
> OrganizationRead updateOrganization(orgId, organizationUpdate)

Update Organization

Updates the organization&#39;s profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrganizationsApi()
val orgId : kotlin.String = orgId_example // kotlin.String | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
val organizationUpdate : OrganizationUpdate =  // OrganizationUpdate | 
try {
    val result : OrganizationRead = apiInstance.updateOrganization(orgId, organizationUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#updateOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#updateOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **kotlin.String**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |
 **organizationUpdate** | [**OrganizationUpdate**](OrganizationUpdate.md)|  |

### Return type

[**OrganizationRead**](OrganizationRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

