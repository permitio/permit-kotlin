# MembersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrganizationMember**](MembersApi.md#deleteOrganizationMember) | **DELETE** /v2/members/{member_id} | Delete Organization Member
[**getAuthenticatedMember**](MembersApi.md#getAuthenticatedMember) | **GET** /v2/members/me | Get the authenticated account member
[**getOrganizationMember**](MembersApi.md#getOrganizationMember) | **GET** /v2/members/{member_id} | Get Organization Member
[**listOrganizationMembers**](MembersApi.md#listOrganizationMembers) | **GET** /v2/members | List Organization Members
[**updateOrganizationMember**](MembersApi.md#updateOrganizationMember) | **PATCH** /v2/members/{member_id} | Update Organization Member


<a name="deleteOrganizationMember"></a>
# **deleteOrganizationMember**
> deleteOrganizationMember(memberId)

Delete Organization Member

Deletes an account member matching the given id or email address. The member will be removed from the active account in permit.io.  If the member is the only member in its account (organization), returns 400 (bad request), due to nobody remains with access to the account, meaning deletion of the entire account (org). To completely remove an account, call DELETE &#x60;/orgs/{org}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MembersApi()
val memberId : kotlin.String = memberId_example // kotlin.String | Either the unique id (UUID) of the account member, or the email address of the account member.
try {
    apiInstance.deleteOrganizationMember(memberId)
} catch (e: ClientException) {
    println("4xx response calling MembersApi#deleteOrganizationMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembersApi#deleteOrganizationMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberId** | **kotlin.String**| Either the unique id (UUID) of the account member, or the email address of the account member. |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuthenticatedMember"></a>
# **getAuthenticatedMember**
> OrgMemberRead getAuthenticatedMember()

Get the authenticated account member

Gets the authenticated account member&#39;s details.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MembersApi()
try {
    val result : OrgMemberRead = apiInstance.getAuthenticatedMember()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembersApi#getAuthenticatedMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembersApi#getAuthenticatedMember")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrgMemberRead**](OrgMemberRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationMember"></a>
# **getOrganizationMember**
> OrgMemberRead getOrganizationMember(memberId)

Get Organization Member

Gets a single account member by its id or email address. matching the given member, if no such member exists under the current active account (organization), returns 404.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MembersApi()
val memberId : kotlin.String = memberId_example // kotlin.String | Either the unique id (UUID) of the account member, or the email address of the account member.
try {
    val result : OrgMemberRead = apiInstance.getOrganizationMember(memberId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembersApi#getOrganizationMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembersApi#getOrganizationMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberId** | **kotlin.String**| Either the unique id (UUID) of the account member, or the email address of the account member. |

### Return type

[**OrgMemberRead**](OrgMemberRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrganizationMembers"></a>
# **listOrganizationMembers**
> kotlin.collections.List&lt;OrgMemberRead&gt; listOrganizationMembers(page, perPage)

List Organization Members

Lists all the account members that have access to the current active account. The active account/organization is determined by the API Key used or by the authenticated session id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MembersApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<OrgMemberRead> = apiInstance.listOrganizationMembers(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembersApi#listOrganizationMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembersApi#listOrganizationMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;OrgMemberRead&gt;**](OrgMemberRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrganizationMember"></a>
# **updateOrganizationMember**
> OrgMemberRead updateOrganizationMember(memberId, orgMemberUpdate)

Update Organization Member

Updates an account member&#39;s settings.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MembersApi()
val memberId : kotlin.String = memberId_example // kotlin.String | Either the unique id (UUID) of the account member, or the email address of the account member.
val orgMemberUpdate : OrgMemberUpdate =  // OrgMemberUpdate | 
try {
    val result : OrgMemberRead = apiInstance.updateOrganizationMember(memberId, orgMemberUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MembersApi#updateOrganizationMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MembersApi#updateOrganizationMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberId** | **kotlin.String**| Either the unique id (UUID) of the account member, or the email address of the account member. |
 **orgMemberUpdate** | [**OrgMemberUpdate**](OrgMemberUpdate.md)|  |

### Return type

[**OrgMemberRead**](OrgMemberRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

