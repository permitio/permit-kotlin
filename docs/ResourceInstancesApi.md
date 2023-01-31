# ResourceInstancesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createResourceInstance**](ResourceInstancesApi.md#createResourceInstance) | **POST** /v2/facts/{proj_id}/{env_id}/resource_instances | Create Resource Instance
[**deleteResourceInstance**](ResourceInstancesApi.md#deleteResourceInstance) | **DELETE** /v2/facts/{proj_id}/{env_id}/resource_instances/{instance_id} | Delete Resource Instance
[**getResourceInstance**](ResourceInstancesApi.md#getResourceInstance) | **GET** /v2/facts/{proj_id}/{env_id}/resource_instances/{instance_id} | Get Resource Instance
[**listResourceInstances**](ResourceInstancesApi.md#listResourceInstances) | **GET** /v2/facts/{proj_id}/{env_id}/resource_instances | List Resource Instances
[**updateResourceInstance**](ResourceInstancesApi.md#updateResourceInstance) | **PATCH** /v2/facts/{proj_id}/{env_id}/resource_instances/{instance_id} | Update Resource Instance


<a name="createResourceInstance"></a>
# **createResourceInstance**
> ResourceInstanceRead createResourceInstance(projId, envId, resourceInstanceCreate)

Create Resource Instance

Creates a new instance inside the Permit.io system.  If the instance is already created: will return 200 instead of 201, and will return the existing instance object in the response body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceInstancesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceInstanceCreate : ResourceInstanceCreate =  // ResourceInstanceCreate | 
try {
    val result : ResourceInstanceRead = apiInstance.createResourceInstance(projId, envId, resourceInstanceCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceInstancesApi#createResourceInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceInstancesApi#createResourceInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceInstanceCreate** | [**ResourceInstanceCreate**](ResourceInstanceCreate.md)|  |

### Return type

[**ResourceInstanceRead**](ResourceInstanceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResourceInstance"></a>
# **deleteResourceInstance**
> deleteResourceInstance(projId, envId, instanceId)

Delete Resource Instance

Deletes the instance and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceInstancesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val instanceId : kotlin.String = instanceId_example // kotlin.String | Either the unique id of the resource instance, or the URL-friendly key of the resource instance (i.e: the \"slug\").
try {
    apiInstance.deleteResourceInstance(projId, envId, instanceId)
} catch (e: ClientException) {
    println("4xx response calling ResourceInstancesApi#deleteResourceInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceInstancesApi#deleteResourceInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **instanceId** | **kotlin.String**| Either the unique id of the resource instance, or the URL-friendly key of the resource instance (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourceInstance"></a>
# **getResourceInstance**
> ResourceInstanceRead getResourceInstance(projId, envId, instanceId)

Get Resource Instance

Gets a instance, if such instance exists. Otherwise returns 404.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceInstancesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val instanceId : kotlin.String = instanceId_example // kotlin.String | Either the unique id of the resource instance, or the URL-friendly key of the resource instance (i.e: the \"slug\").
try {
    val result : ResourceInstanceRead = apiInstance.getResourceInstance(projId, envId, instanceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceInstancesApi#getResourceInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceInstancesApi#getResourceInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **instanceId** | **kotlin.String**| Either the unique id of the resource instance, or the URL-friendly key of the resource instance (i.e: the \&quot;slug\&quot;). |

### Return type

[**ResourceInstanceRead**](ResourceInstanceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listResourceInstances"></a>
# **listResourceInstances**
> kotlin.collections.List&lt;ResourceInstanceRead&gt; listResourceInstances(projId, envId, page, perPage)

List Resource Instances

Lists all the resource instances defined within an environment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceInstancesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ResourceInstanceRead> = apiInstance.listResourceInstances(projId, envId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceInstancesApi#listResourceInstances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceInstancesApi#listResourceInstances")
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

[**kotlin.collections.List&lt;ResourceInstanceRead&gt;**](ResourceInstanceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateResourceInstance"></a>
# **updateResourceInstance**
> ResourceInstanceRead updateResourceInstance(projId, envId, instanceId, resourceInstanceUpdate)

Update Resource Instance

Partially updates the instance definition. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceInstancesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val instanceId : kotlin.String = instanceId_example // kotlin.String | Either the unique id of the resource instance, or the URL-friendly key of the resource instance (i.e: the \"slug\").
val resourceInstanceUpdate : ResourceInstanceUpdate =  // ResourceInstanceUpdate | 
try {
    val result : ResourceInstanceRead = apiInstance.updateResourceInstance(projId, envId, instanceId, resourceInstanceUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceInstancesApi#updateResourceInstance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceInstancesApi#updateResourceInstance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **instanceId** | **kotlin.String**| Either the unique id of the resource instance, or the URL-friendly key of the resource instance (i.e: the \&quot;slug\&quot;). |
 **resourceInstanceUpdate** | [**ResourceInstanceUpdate**](ResourceInstanceUpdate.md)|  |

### Return type

[**ResourceInstanceRead**](ResourceInstanceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

