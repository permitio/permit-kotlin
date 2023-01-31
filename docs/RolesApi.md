# RolesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParentRole**](RolesApi.md#addParentRole) | **PUT** /v2/schema/{proj_id}/{env_id}/roles/{role_id}/parents/{parent_role_id} | Add Parent Role
[**assignPermissionsToRole**](RolesApi.md#assignPermissionsToRole) | **POST** /v2/schema/{proj_id}/{env_id}/roles/{role_id}/permissions | Assign Permissions To Role
[**createRole**](RolesApi.md#createRole) | **POST** /v2/schema/{proj_id}/{env_id}/roles | Create Role
[**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /v2/schema/{proj_id}/{env_id}/roles/{role_id} | Delete Role
[**getRole**](RolesApi.md#getRole) | **GET** /v2/schema/{proj_id}/{env_id}/roles/{role_id} | Get Role
[**listRoles**](RolesApi.md#listRoles) | **GET** /v2/schema/{proj_id}/{env_id}/roles | List Roles
[**removeParentRole**](RolesApi.md#removeParentRole) | **DELETE** /v2/schema/{proj_id}/{env_id}/roles/{role_id}/parents/{parent_role_id} | Remove Parent Role
[**removePermissionsFromRole**](RolesApi.md#removePermissionsFromRole) | **DELETE** /v2/schema/{proj_id}/{env_id}/roles/{role_id}/permissions | Remove Permissions From Role
[**updateRole**](RolesApi.md#updateRole) | **PATCH** /v2/schema/{proj_id}/{env_id}/roles/{role_id} | Update Role


<a name="addParentRole"></a>
# **addParentRole**
> RoleRead addParentRole(projId, envId, roleId, parentRoleId)

Add Parent Role

This endpoint is part of the role hierarchy feature.  Makes role with id &#x60;role_id&#x60; extend the role with id &#x60;parent_role_id&#x60;. In other words, &#x60;role_id&#x60; will automatically be assigned any permissions that are granted to &#x60;parent_role_id&#x60;.  We can say the &#x60;role_id&#x60; **extends** &#x60;parent_role_id&#x60; or **inherits** from &#x60;parent_role_id&#x60;.  If &#x60;role_id&#x60; is already an ancestor of &#x60;parent_role_id&#x60;, the request will fail with HTTP 400 to prevent a cycle in the role hierarchy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val parentRoleId : kotlin.String = parentRoleId_example // kotlin.String | Either the unique id of the parent role, or the URL-friendly key of the parent role (i.e: the \"slug\").
try {
    val result : RoleRead = apiInstance.addParentRole(projId, envId, roleId, parentRoleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#addParentRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#addParentRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **parentRoleId** | **kotlin.String**| Either the unique id of the parent role, or the URL-friendly key of the parent role (i.e: the \&quot;slug\&quot;). |

### Return type

[**RoleRead**](RoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assignPermissionsToRole"></a>
# **assignPermissionsToRole**
> RoleRead assignPermissionsToRole(projId, envId, roleId, addRolePermissions)

Assign Permissions To Role

Assign permissions to role.  If some of the permissions specified are already unassigned, will skip them.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val addRolePermissions : AddRolePermissions =  // AddRolePermissions | 
try {
    val result : RoleRead = apiInstance.assignPermissionsToRole(projId, envId, roleId, addRolePermissions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#assignPermissionsToRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#assignPermissionsToRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **addRolePermissions** | [**AddRolePermissions**](AddRolePermissions.md)|  |

### Return type

[**RoleRead**](RoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRole"></a>
# **createRole**
> RoleRead createRole(projId, envId, roleCreate)

Create Role

Creates a new tenant role.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleCreate : RoleCreate =  // RoleCreate | 
try {
    val result : RoleRead = apiInstance.createRole(projId, envId, roleCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#createRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#createRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleCreate** | [**RoleCreate**](RoleCreate.md)|  |

### Return type

[**RoleRead**](RoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRole"></a>
# **deleteRole**
> deleteRole(projId, envId, roleId)

Delete Role

Deletes a tenant role and all its related data. This includes any permissions granted to said role.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
try {
    apiInstance.deleteRole(projId, envId, roleId)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#deleteRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#deleteRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRole"></a>
# **getRole**
> RoleRead getRole(projId, envId, roleId)

Get Role

Gets a single tenant role, if such role exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
try {
    val result : RoleRead = apiInstance.getRole(projId, envId, roleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#getRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#getRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |

### Return type

[**RoleRead**](RoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRoles"></a>
# **listRoles**
> kotlin.collections.List&lt;RoleRead&gt; listRoles(projId, envId, page, perPage)

List Roles

Lists all tenant roles.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<RoleRead> = apiInstance.listRoles(projId, envId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#listRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#listRoles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;RoleRead&gt;**](RoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeParentRole"></a>
# **removeParentRole**
> RoleRead removeParentRole(projId, envId, roleId, parentRoleId)

Remove Parent Role

This endpoint is part of the role hierarchy feature.  Removes &#x60;parent_role_id&#x60; from the list of parent roles of role with id &#x60;role_id&#x60;. In other words, &#x60;role_id&#x60; will no longer be automatically assigned permissions that are granted to &#x60;parent_role_id&#x60;.  We can say the &#x60;role_id&#x60; **not longer extends** &#x60;parent_role_id&#x60; or **no longer inherits** from &#x60;parent_role_id&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val parentRoleId : kotlin.String = parentRoleId_example // kotlin.String | Either the unique id of the parent role, or the URL-friendly key of the parent role (i.e: the \"slug\").
try {
    val result : RoleRead = apiInstance.removeParentRole(projId, envId, roleId, parentRoleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#removeParentRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#removeParentRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **parentRoleId** | **kotlin.String**| Either the unique id of the parent role, or the URL-friendly key of the parent role (i.e: the \&quot;slug\&quot;). |

### Return type

[**RoleRead**](RoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removePermissionsFromRole"></a>
# **removePermissionsFromRole**
> RoleRead removePermissionsFromRole(projId, envId, roleId, removeRolePermissions)

Remove Permissions From Role

Remove permissions from role.  If some of the permissions specified are already unassigned, will skip them.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val removeRolePermissions : RemoveRolePermissions =  // RemoveRolePermissions | 
try {
    val result : RoleRead = apiInstance.removePermissionsFromRole(projId, envId, roleId, removeRolePermissions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#removePermissionsFromRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#removePermissionsFromRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **removeRolePermissions** | [**RemoveRolePermissions**](RemoveRolePermissions.md)|  |

### Return type

[**RoleRead**](RoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRole"></a>
# **updateRole**
> RoleRead updateRole(projId, envId, roleId, roleUpdate)

Update Role

Partially updates a tenant role. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val roleUpdate : RoleUpdate =  // RoleUpdate | 
try {
    val result : RoleRead = apiInstance.updateRole(projId, envId, roleId, roleUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#updateRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#updateRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **roleUpdate** | [**RoleUpdate**](RoleUpdate.md)|  |

### Return type

[**RoleRead**](RoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

