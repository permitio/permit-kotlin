# RoleAssignmentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignRole**](RoleAssignmentsApi.md#assignRole) | **POST** /v2/facts/{proj_id}/{env_id}/role_assignments | Assign Role
[**listRoleAssignments**](RoleAssignmentsApi.md#listRoleAssignments) | **GET** /v2/facts/{proj_id}/{env_id}/role_assignments | List Role Assignments
[**unassignRole**](RoleAssignmentsApi.md#unassignRole) | **DELETE** /v2/facts/{proj_id}/{env_id}/role_assignments | Unassign Role


<a name="assignRole"></a>
# **assignRole**
> RoleAssignmentRead assignRole(projId, envId, roleAssignmentCreate)

Assign Role

Assigns a role to a user within a tenant.  The tenant defines the scope of the assignment. In other words, the role is effective only within the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoleAssignmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleAssignmentCreate : RoleAssignmentCreate =  // RoleAssignmentCreate | 
try {
    val result : RoleAssignmentRead = apiInstance.assignRole(projId, envId, roleAssignmentCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoleAssignmentsApi#assignRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoleAssignmentsApi#assignRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleAssignmentCreate** | [**RoleAssignmentCreate**](RoleAssignmentCreate.md)|  |

### Return type

[**RoleAssignmentRead**](RoleAssignmentRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRoleAssignments"></a>
# **listRoleAssignments**
> kotlin.collections.List&lt;RoleAssignmentRead&gt; listRoleAssignments(projId, envId, user, role, tenant, page, perPage)

List Role Assignments

Lists the role assignments defined within an environment.  - If the &#x60;user&#x60; filter is present, will only return the role assignments of that user. - If the &#x60;tenant&#x60; filter is present, will only return the role assignments in that tenant. - If the &#x60;role&#x60; filter is present, will only return role assignments that are granting that role.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoleAssignmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val user : kotlin.String = user_example // kotlin.String | optional user filter, will only return role assignments granted to this user.
val role : kotlin.String = role_example // kotlin.String | optional role filter, will only return role assignments granting this role.
val tenant : kotlin.String = tenant_example // kotlin.String | optional tenant filter, will only return role assignments granted in that tenant.
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<RoleAssignmentRead> = apiInstance.listRoleAssignments(projId, envId, user, role, tenant, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoleAssignmentsApi#listRoleAssignments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoleAssignmentsApi#listRoleAssignments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **user** | **kotlin.String**| optional user filter, will only return role assignments granted to this user. | [optional]
 **role** | **kotlin.String**| optional role filter, will only return role assignments granting this role. | [optional]
 **tenant** | **kotlin.String**| optional tenant filter, will only return role assignments granted in that tenant. | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;RoleAssignmentRead&gt;**](RoleAssignmentRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unassignRole"></a>
# **unassignRole**
> unassignRole(projId, envId, roleAssignmentRemove)

Unassign Role

Unassigns a user role within a tenant.  The tenant defines the scope of the assignment. In other words, the role is effective only within the tenant.  If the role is not actually assigned, will return 404.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoleAssignmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleAssignmentRemove : RoleAssignmentRemove =  // RoleAssignmentRemove | 
try {
    apiInstance.unassignRole(projId, envId, roleAssignmentRemove)
} catch (e: ClientException) {
    println("4xx response calling RoleAssignmentsApi#unassignRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoleAssignmentsApi#unassignRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleAssignmentRemove** | [**RoleAssignmentRemove**](RoleAssignmentRemove.md)|  |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

