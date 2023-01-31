# UsersElementsDataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**elementsAssignRoleToUser**](UsersElementsDataApi.md#elementsAssignRoleToUser) | **POST** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/users/{user_id}/roles | Assign role to user
[**elementsCreateUser**](UsersElementsDataApi.md#elementsCreateUser) | **POST** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/users | Create user
[**elementsDeleteUser**](UsersElementsDataApi.md#elementsDeleteUser) | **DELETE** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/users/{user_id} | Delete user
[**elementsListRoles**](UsersElementsDataApi.md#elementsListRoles) | **GET** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/roles | List roles
[**elementsListUsers**](UsersElementsDataApi.md#elementsListUsers) | **GET** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/users | List users
[**elementsUnassignRoleFromUser**](UsersElementsDataApi.md#elementsUnassignRoleFromUser) | **DELETE** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/users/{user_id}/roles | Unassign role from user
[**setConfigActive**](UsersElementsDataApi.md#setConfigActive) | **POST** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/active | Set Config Active


<a name="elementsAssignRoleToUser"></a>
# **elementsAssignRoleToUser**
> RoleAssignmentRead elementsAssignRoleToUser(projId, envId, elementsConfigId, userId, elementsUserRoleCreate)

Assign role to user

Assigns a role to the user within the tenant.  The tenant defines the scope of the assignment. In other words, the role is effective only within the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersElementsDataApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
val elementsUserRoleCreate : ElementsUserRoleCreate =  // ElementsUserRoleCreate | 
try {
    val result : RoleAssignmentRead = apiInstance.elementsAssignRoleToUser(projId, envId, elementsConfigId, userId, elementsUserRoleCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersElementsDataApi#elementsAssignRoleToUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersElementsDataApi#elementsAssignRoleToUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |
 **elementsUserRoleCreate** | [**ElementsUserRoleCreate**](ElementsUserRoleCreate.md)|  |

### Return type

[**RoleAssignmentRead**](RoleAssignmentRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="elementsCreateUser"></a>
# **elementsCreateUser**
> UserRead elementsCreateUser(projId, envId, elementsConfigId, elementsUserCreate)

Create user

Creates a new user inside the Permit.io system, from that point forward you may run permission checks on that user.  If the user is already created: will return 200 instead of 201, and will return the existing user object in the response body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersElementsDataApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val elementsUserCreate : ElementsUserCreate =  // ElementsUserCreate | 
try {
    val result : UserRead = apiInstance.elementsCreateUser(projId, envId, elementsConfigId, elementsUserCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersElementsDataApi#elementsCreateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersElementsDataApi#elementsCreateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **elementsUserCreate** | [**ElementsUserCreate**](ElementsUserCreate.md)|  |

### Return type

[**UserRead**](UserRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="elementsDeleteUser"></a>
# **elementsDeleteUser**
> elementsDeleteUser(projId, envId, elementsConfigId, userId)

Delete user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersElementsDataApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
try {
    apiInstance.elementsDeleteUser(projId, envId, elementsConfigId, userId)
} catch (e: ClientException) {
    println("4xx response calling UsersElementsDataApi#elementsDeleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersElementsDataApi#elementsDeleteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="elementsListRoles"></a>
# **elementsListRoles**
> kotlin.collections.List&lt;ElementsRoleRead&gt; elementsListRoles(projId, envId, elementsConfigId, search, page, perPage)

List roles

Lists all the users defined within an environment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersElementsDataApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val search : kotlin.String = search_example // kotlin.String | Text search for the email field
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ElementsRoleRead> = apiInstance.elementsListRoles(projId, envId, elementsConfigId, search, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersElementsDataApi#elementsListRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersElementsDataApi#elementsListRoles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **search** | **kotlin.String**| Text search for the email field | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;ElementsRoleRead&gt;**](ElementsRoleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="elementsListUsers"></a>
# **elementsListUsers**
> PaginatedResultUserRead elementsListUsers(projId, envId, elementsConfigId, search, page, perPage)

List users

Lists all the users defined within an environment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersElementsDataApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val search : kotlin.String = search_example // kotlin.String | Text search for the email field
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : PaginatedResultUserRead = apiInstance.elementsListUsers(projId, envId, elementsConfigId, search, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersElementsDataApi#elementsListUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersElementsDataApi#elementsListUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **search** | **kotlin.String**| Text search for the email field | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**PaginatedResultUserRead**](PaginatedResultUserRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="elementsUnassignRoleFromUser"></a>
# **elementsUnassignRoleFromUser**
> elementsUnassignRoleFromUser(projId, envId, elementsConfigId, userId, elementsUserRoleRemove)

Unassign role from user

Unassigns the role from the user within the tenant.  The tenant defines the scope of the assignment. In other words, the role is effective only within the tenant.  If the role is not actually assigned, will return 404.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersElementsDataApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
val elementsUserRoleRemove : ElementsUserRoleRemove =  // ElementsUserRoleRemove | 
try {
    apiInstance.elementsUnassignRoleFromUser(projId, envId, elementsConfigId, userId, elementsUserRoleRemove)
} catch (e: ClientException) {
    println("4xx response calling UsersElementsDataApi#elementsUnassignRoleFromUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersElementsDataApi#elementsUnassignRoleFromUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |
 **elementsUserRoleRemove** | [**ElementsUserRoleRemove**](ElementsUserRoleRemove.md)|  |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setConfigActive"></a>
# **setConfigActive**
> setConfigActive(elementsConfigId, projId, envId)

Set Config Active

Updates the embed_config.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersElementsDataApi()
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
try {
    apiInstance.setConfigActive(elementsConfigId, projId, envId)
} catch (e: ClientException) {
    println("4xx response calling UsersElementsDataApi#setConfigActive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersElementsDataApi#setConfigActive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

