# ProjectsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectsApi.md#createProject) | **POST** /v2/projects | Create Project
[**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /v2/projects/{proj_id} | Delete Project
[**getProject**](ProjectsApi.md#getProject) | **GET** /v2/projects/{proj_id} | Get Project
[**listProjects**](ProjectsApi.md#listProjects) | **GET** /v2/projects | List Projects
[**updateProject**](ProjectsApi.md#updateProject) | **PATCH** /v2/projects/{proj_id} | Update Project


<a name="createProject"></a>
# **createProject**
> ProjectRead createProject(projectCreate)

Create Project

Creates a new project under the active organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectCreate : ProjectCreate =  // ProjectCreate | 
try {
    val result : ProjectRead = apiInstance.createProject(projectCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreate** | [**ProjectCreate**](ProjectCreate.md)|  |

### Return type

[**ProjectRead**](ProjectRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(projId)

Delete Project

Deletes the project and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
try {
    apiInstance.deleteProject(projId)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> ProjectRead getProject(projId)

Get Project

Gets a single project matching the given proj_id, if such project exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
try {
    val result : ProjectRead = apiInstance.getProject(projId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |

### Return type

[**ProjectRead**](ProjectRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProjects"></a>
# **listProjects**
> kotlin.collections.List&lt;ProjectRead&gt; listProjects(page, perPage)

List Projects

Lists all the projects under the active organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ProjectRead> = apiInstance.listProjects(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#listProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#listProjects")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;ProjectRead&gt;**](ProjectRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> ProjectRead updateProject(projId, projectUpdate)

Update Project

Updates the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val projectUpdate : ProjectUpdate =  // ProjectUpdate | 
try {
    val result : ProjectRead = apiInstance.updateProject(projId, projectUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#updateProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#updateProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **projectUpdate** | [**ProjectUpdate**](ProjectUpdate.md)|  |

### Return type

[**ProjectRead**](ProjectRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

