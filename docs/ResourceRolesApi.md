# ResourceRolesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addParentResourceRole**](ResourceRolesApi.md#addParentResourceRole) | **PUT** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles/{role_id}/parents/{parent_role_id} | Add Parent Role
[**assignPermissionsToResourceRole**](ResourceRolesApi.md#assignPermissionsToResourceRole) | **POST** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles/{role_id}/permissions | Assign Permissions to Role
[**createResourceRole**](ResourceRolesApi.md#createResourceRole) | **POST** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles | Create Resource Role
[**deleteResourceRole**](ResourceRolesApi.md#deleteResourceRole) | **DELETE** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles/{role_id} | Delete Resource Role
[**getResourceRole**](ResourceRolesApi.md#getResourceRole) | **GET** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles/{role_id} | Get Resource Role
[**listResourceRoles**](ResourceRolesApi.md#listResourceRoles) | **GET** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles | List Resource Roles
[**removeParentResourceRole**](ResourceRolesApi.md#removeParentResourceRole) | **DELETE** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles/{role_id}/parents/{parent_role_id} | Remove Parent Role
[**removePermissionsFromResourceRole**](ResourceRolesApi.md#removePermissionsFromResourceRole) | **DELETE** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles/{role_id}/permissions | Remove Permissions from Role
[**updateResourceRole**](ResourceRolesApi.md#updateResourceRole) | **PATCH** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/roles/{role_id} | Update Resource Role


<a name="addParentResourceRole"></a>
# **addParentResourceRole**
> ResourceRoleRead addParentResourceRole(projId, envId, resourceId, roleId, parentRoleId)

Add Parent Role

This endpoint is part of the role hierarchy feature.  Makes role with id &#x60;role_id&#x60; extend the role with id &#x60;parent_role_id&#x60;. In other words, &#x60;role_id&#x60; will automatically be assigned any permissions that are granted to &#x60;parent_role_id&#x60;.  We can say the &#x60;role_id&#x60; **extends** &#x60;parent_role_id&#x60; or **inherits** from &#x60;parent_role_id&#x60;.  If &#x60;role_id&#x60; is already an ancestor of &#x60;parent_role_id&#x60;, the request will fail with HTTP 400 to prevent a cycle in the role hierarchy.  Both roles must be defined on the same resource, identified by id &#x60;resource_id&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val parentRoleId : kotlin.String = parentRoleId_example // kotlin.String | Either the unique id of the parent role, or the URL-friendly key of the parent role (i.e: the \"slug\").
try {
    val result : ResourceRoleRead = apiInstance.addParentResourceRole(projId, envId, resourceId, roleId, parentRoleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#addParentResourceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#addParentResourceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **parentRoleId** | **kotlin.String**| Either the unique id of the parent role, or the URL-friendly key of the parent role (i.e: the \&quot;slug\&quot;). |

### Return type

[**ResourceRoleRead**](ResourceRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="assignPermissionsToResourceRole"></a>
# **assignPermissionsToResourceRole**
> ResourceRoleRead assignPermissionsToResourceRole(projId, envId, resourceId, roleId, addRolePermissions)

Assign Permissions to Role

Assign permissions to role.  If some of the permissions specified are already unassigned, will skip them.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val addRolePermissions : AddRolePermissions =  // AddRolePermissions | 
try {
    val result : ResourceRoleRead = apiInstance.assignPermissionsToResourceRole(projId, envId, resourceId, roleId, addRolePermissions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#assignPermissionsToResourceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#assignPermissionsToResourceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **addRolePermissions** | [**AddRolePermissions**](AddRolePermissions.md)|  |

### Return type

[**ResourceRoleRead**](ResourceRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createResourceRole"></a>
# **createResourceRole**
> ResourceRoleRead createResourceRole(projId, envId, resourceId, resourceRoleCreate)

Create Resource Role

Creates a new role associated with the resource.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val resourceRoleCreate : ResourceRoleCreate =  // ResourceRoleCreate | 
try {
    val result : ResourceRoleRead = apiInstance.createResourceRole(projId, envId, resourceId, resourceRoleCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#createResourceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#createResourceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **resourceRoleCreate** | [**ResourceRoleCreate**](ResourceRoleCreate.md)|  |

### Return type

[**ResourceRoleRead**](ResourceRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResourceRole"></a>
# **deleteResourceRole**
> deleteResourceRole(projId, envId, resourceId, roleId)

Delete Resource Role

Deletes the role and all its related data. This includes any permissions granted to said role.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
try {
    apiInstance.deleteResourceRole(projId, envId, resourceId, roleId)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#deleteResourceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#deleteResourceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourceRole"></a>
# **getResourceRole**
> ResourceRoleRead getResourceRole(projId, envId, resourceId, roleId)

Get Resource Role

Gets a single role defined on the resource, if such role exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
try {
    val result : ResourceRoleRead = apiInstance.getResourceRole(projId, envId, resourceId, roleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#getResourceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#getResourceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |

### Return type

[**ResourceRoleRead**](ResourceRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listResourceRoles"></a>
# **listResourceRoles**
> kotlin.collections.List&lt;ResourceRoleRead&gt; listResourceRoles(projId, envId, resourceId, page, perPage)

List Resource Roles

Lists all the roles defined on the resource.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ResourceRoleRead> = apiInstance.listResourceRoles(projId, envId, resourceId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#listResourceRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#listResourceRoles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;ResourceRoleRead&gt;**](ResourceRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeParentResourceRole"></a>
# **removeParentResourceRole**
> ResourceRoleRead removeParentResourceRole(projId, envId, resourceId, roleId, parentRoleId)

Remove Parent Role

This endpoint is part of the role hierarchy feature.  Removes &#x60;parent_role_id&#x60; from the list of parent roles of role with id &#x60;role_id&#x60;. In other words, &#x60;role_id&#x60; will no longer be automatically assigned permissions that are granted to &#x60;parent_role_id&#x60;.  We can say the &#x60;role_id&#x60; **not longer extends** &#x60;parent_role_id&#x60; or **no longer inherits** from &#x60;parent_role_id&#x60;.  Both roles must be defined on the same resource, identified by id &#x60;resource_id&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val parentRoleId : kotlin.String = parentRoleId_example // kotlin.String | Either the unique id of the parent role, or the URL-friendly key of the parent role (i.e: the \"slug\").
try {
    val result : ResourceRoleRead = apiInstance.removeParentResourceRole(projId, envId, resourceId, roleId, parentRoleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#removeParentResourceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#removeParentResourceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **parentRoleId** | **kotlin.String**| Either the unique id of the parent role, or the URL-friendly key of the parent role (i.e: the \&quot;slug\&quot;). |

### Return type

[**ResourceRoleRead**](ResourceRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removePermissionsFromResourceRole"></a>
# **removePermissionsFromResourceRole**
> ResourceRoleRead removePermissionsFromResourceRole(projId, envId, resourceId, roleId, removeRolePermissions)

Remove Permissions from Role

Remove permissions from role.  If some of the permissions specified are already unassigned, will skip them.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val removeRolePermissions : RemoveRolePermissions =  // RemoveRolePermissions | 
try {
    val result : ResourceRoleRead = apiInstance.removePermissionsFromResourceRole(projId, envId, resourceId, roleId, removeRolePermissions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#removePermissionsFromResourceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#removePermissionsFromResourceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **removeRolePermissions** | [**RemoveRolePermissions**](RemoveRolePermissions.md)|  |

### Return type

[**ResourceRoleRead**](ResourceRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateResourceRole"></a>
# **updateResourceRole**
> ResourceRoleRead updateResourceRole(projId, envId, resourceId, roleId, resourceRoleUpdate)

Update Resource Role

Partially updates the role defined on a resource. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceRolesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val roleId : kotlin.String = roleId_example // kotlin.String | Either the unique id of the role, or the URL-friendly key of the role (i.e: the \"slug\").
val resourceRoleUpdate : ResourceRoleUpdate =  // ResourceRoleUpdate | 
try {
    val result : ResourceRoleRead = apiInstance.updateResourceRole(projId, envId, resourceId, roleId, resourceRoleUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceRolesApi#updateResourceRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceRolesApi#updateResourceRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **roleId** | **kotlin.String**| Either the unique id of the role, or the URL-friendly key of the role (i.e: the \&quot;slug\&quot;). |
 **resourceRoleUpdate** | [**ResourceRoleUpdate**](ResourceRoleUpdate.md)|  |

### Return type

[**ResourceRoleRead**](ResourceRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

