# UsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignRoleToUser**](UsersApi.md#assignRoleToUser) | **POST** /v2/facts/{proj_id}/{env_id}/users/{user_id}/roles | Assign Role To User
[**createUser**](UsersApi.md#createUser) | **POST** /v2/facts/{proj_id}/{env_id}/users | Create User
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /v2/facts/{proj_id}/{env_id}/users/{user_id} | Delete User
[**getUser**](UsersApi.md#getUser) | **GET** /v2/facts/{proj_id}/{env_id}/users/{user_id} | Get User
[**listUsers**](UsersApi.md#listUsers) | **GET** /v2/facts/{proj_id}/{env_id}/users | List Users
[**replaceUser**](UsersApi.md#replaceUser) | **PUT** /v2/facts/{proj_id}/{env_id}/users/{user_id} | Replace User
[**unassignRoleFromUser**](UsersApi.md#unassignRoleFromUser) | **DELETE** /v2/facts/{proj_id}/{env_id}/users/{user_id}/roles | Unassign Role From User
[**updateUser**](UsersApi.md#updateUser) | **PATCH** /v2/facts/{proj_id}/{env_id}/users/{user_id} | Update User


<a name="assignRoleToUser"></a>
# **assignRoleToUser**
> RoleAssignmentRead assignRoleToUser(projId, envId, userId, userRoleCreate)

Assign Role To User

Assigns a role to the user within the tenant.  The tenant defines the scope of the assignment. In other words, the role is effective only within the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
val userRoleCreate : UserRoleCreate =  // UserRoleCreate | 
try {
    val result : RoleAssignmentRead = apiInstance.assignRoleToUser(projId, envId, userId, userRoleCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#assignRoleToUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#assignRoleToUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |
 **userRoleCreate** | [**UserRoleCreate**](UserRoleCreate.md)|  |

### Return type

[**RoleAssignmentRead**](RoleAssignmentRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUser"></a>
# **createUser**
> UserRead createUser(projId, envId, userCreate)

Create User

Creates a new user inside the Permit.io system, from that point forward you may run permission checks on that user.  If the user is already created: will return 200 instead of 201, and will return the existing user object in the response body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userCreate : UserCreate =  // UserCreate | 
try {
    val result : UserRead = apiInstance.createUser(projId, envId, userCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#createUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userCreate** | [**UserCreate**](UserCreate.md)|  |

### Return type

[**UserRead**](UserRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(projId, envId, userId)

Delete User

Deletes the user and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
try {
    apiInstance.deleteUser(projId, envId, userId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserRead getUser(projId, envId, userId)

Get User

Gets a user, if such user exists. Otherwise returns 404.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
try {
    val result : UserRead = apiInstance.getUser(projId, envId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |

### Return type

[**UserRead**](UserRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> PaginatedResultUserRead listUsers(projId, envId, search, page, perPage)

List Users

Lists all the users defined within an environment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val search : kotlin.String = search_example // kotlin.String | Text search for the email field
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : PaginatedResultUserRead = apiInstance.listUsers(projId, envId, search, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#listUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#listUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
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

<a name="replaceUser"></a>
# **replaceUser**
> UserRead replaceUser(projId, envId, userId, userCreate)

Replace User

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
val userCreate : UserCreate =  // UserCreate | 
try {
    val result : UserRead = apiInstance.replaceUser(projId, envId, userId, userCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#replaceUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#replaceUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |
 **userCreate** | [**UserCreate**](UserCreate.md)|  |

### Return type

[**UserRead**](UserRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unassignRoleFromUser"></a>
# **unassignRoleFromUser**
> UserRead unassignRoleFromUser(projId, envId, userId, userRoleRemove)

Unassign Role From User

Unassigns the role from the user within the tenant.  The tenant defines the scope of the assignment. In other words, the role is effective only within the tenant.  If the role is not actually assigned, will return 404.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
val userRoleRemove : UserRoleRemove =  // UserRoleRemove | 
try {
    val result : UserRead = apiInstance.unassignRoleFromUser(projId, envId, userId, userRoleRemove)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#unassignRoleFromUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#unassignRoleFromUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |
 **userRoleRemove** | [**UserRoleRemove**](UserRoleRemove.md)|  |

### Return type

[**UserRead**](UserRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> UserRead updateUser(projId, envId, userId, userUpdate)

Update User

Partially updates the user definition. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
val userUpdate : UserUpdate =  // UserUpdate | 
try {
    val result : UserRead = apiInstance.updateUser(projId, envId, userId, userUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |
 **userUpdate** | [**UserUpdate**](UserUpdate.md)|  |

### Return type

[**UserRead**](UserRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

