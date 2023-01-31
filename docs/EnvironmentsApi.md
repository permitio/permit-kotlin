# EnvironmentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEnvironment**](EnvironmentsApi.md#createEnvironment) | **POST** /v2/projects/{proj_id}/envs | Create Environment
[**deleteEnvironment**](EnvironmentsApi.md#deleteEnvironment) | **DELETE** /v2/projects/{proj_id}/envs/{env_id} | Delete Environment
[**getEnvironment**](EnvironmentsApi.md#getEnvironment) | **GET** /v2/projects/{proj_id}/envs/{env_id} | Get Environment
[**listEnvironments**](EnvironmentsApi.md#listEnvironments) | **GET** /v2/projects/{proj_id}/envs | List Environments
[**statsEnvironments**](EnvironmentsApi.md#statsEnvironments) | **GET** /v2/projects/{proj_id}/envs/{env_id}/stats | Stats Environments
[**updateEnvironment**](EnvironmentsApi.md#updateEnvironment) | **PATCH** /v2/projects/{proj_id}/envs/{env_id} | Update Environment


<a name="createEnvironment"></a>
# **createEnvironment**
> EnvironmentRead createEnvironment(projId, environmentCreate)

Create Environment

Creates a new environment under a given project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val environmentCreate : EnvironmentCreate =  // EnvironmentCreate | 
try {
    val result : EnvironmentRead = apiInstance.createEnvironment(projId, environmentCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#createEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#createEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **environmentCreate** | [**EnvironmentCreate**](EnvironmentCreate.md)|  |

### Return type

[**EnvironmentRead**](EnvironmentRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEnvironment"></a>
# **deleteEnvironment**
> deleteEnvironment(projId, envId)

Delete Environment

Deletes an environment and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
try {
    apiInstance.deleteEnvironment(projId, envId)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#deleteEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#deleteEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="getEnvironment"></a>
# **getEnvironment**
> EnvironmentRead getEnvironment(projId, envId)

Get Environment

Gets a single environment matching the given env_id, if such environment exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
try {
    val result : EnvironmentRead = apiInstance.getEnvironment(projId, envId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#getEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#getEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |

### Return type

[**EnvironmentRead**](EnvironmentRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEnvironments"></a>
# **listEnvironments**
> kotlin.collections.List&lt;EnvironmentRead&gt; listEnvironments(projId, page, perPage)

List Environments

Lists all the environments under a given project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<EnvironmentRead> = apiInstance.listEnvironments(projId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#listEnvironments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#listEnvironments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;EnvironmentRead&gt;**](EnvironmentRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="statsEnvironments"></a>
# **statsEnvironments**
> EnvironmentStats statsEnvironments(projId, envId)

Stats Environments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
try {
    val result : EnvironmentStats = apiInstance.statsEnvironments(projId, envId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#statsEnvironments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#statsEnvironments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |

### Return type

[**EnvironmentStats**](EnvironmentStats.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEnvironment"></a>
# **updateEnvironment**
> EnvironmentRead updateEnvironment(projId, envId, environmentUpdate)

Update Environment

Updates the environment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnvironmentsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val environmentUpdate : EnvironmentUpdate =  // EnvironmentUpdate | 
try {
    val result : EnvironmentRead = apiInstance.updateEnvironment(projId, envId, environmentUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnvironmentsApi#updateEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnvironmentsApi#updateEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **environmentUpdate** | [**EnvironmentUpdate**](EnvironmentUpdate.md)|  |

### Return type

[**EnvironmentRead**](EnvironmentRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

