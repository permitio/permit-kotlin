# ResourcesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createResource**](ResourcesApi.md#createResource) | **POST** /v2/schema/{proj_id}/{env_id}/resources | Create Resource
[**deleteResource**](ResourcesApi.md#deleteResource) | **DELETE** /v2/schema/{proj_id}/{env_id}/resources/{resource_id} | Delete Resource
[**getResource**](ResourcesApi.md#getResource) | **GET** /v2/schema/{proj_id}/{env_id}/resources/{resource_id} | Get Resource
[**listResources**](ResourcesApi.md#listResources) | **GET** /v2/schema/{proj_id}/{env_id}/resources | List Resources
[**replaceResource**](ResourcesApi.md#replaceResource) | **PUT** /v2/schema/{proj_id}/{env_id}/resources/{resource_id} | Replace Resource
[**updateResource**](ResourcesApi.md#updateResource) | **PATCH** /v2/schema/{proj_id}/{env_id}/resources/{resource_id} | Update Resource


<a name="createResource"></a>
# **createResource**
> ResourceRead createResource(projId, envId, resourceCreate)

Create Resource

Creates a new resource (a type of object you may protect with permissions).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceCreate : ResourceCreate =  // ResourceCreate | 
try {
    val result : ResourceRead = apiInstance.createResource(projId, envId, resourceCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#createResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#createResource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceCreate** | [**ResourceCreate**](ResourceCreate.md)|  |

### Return type

[**ResourceRead**](ResourceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResource"></a>
# **deleteResource**
> deleteResource(projId, envId, resourceId)

Delete Resource

Deletes the resource and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
try {
    apiInstance.deleteResource(projId, envId, resourceId)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#deleteResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#deleteResource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResource"></a>
# **getResource**
> ResourceRead getResource(projId, envId, resourceId)

Get Resource

Gets a single resource, if such resource exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
try {
    val result : ResourceRead = apiInstance.getResource(projId, envId, resourceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#getResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#getResource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |

### Return type

[**ResourceRead**](ResourceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listResources"></a>
# **listResources**
> kotlin.collections.List&lt;ResourceRead&gt; listResources(projId, envId, includeBuiltIn, page, perPage)

List Resources

Lists all the resources defined in your schema.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val includeBuiltIn : kotlin.Boolean = true // kotlin.Boolean | Whether to include or exclude built-in resources, default is False
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ResourceRead> = apiInstance.listResources(projId, envId, includeBuiltIn, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#listResources")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#listResources")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **includeBuiltIn** | **kotlin.Boolean**| Whether to include or exclude built-in resources, default is False | [optional] [default to false]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;ResourceRead&gt;**](ResourceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceResource"></a>
# **replaceResource**
> ResourceRead replaceResource(projId, envId, resourceId, resourceReplace)

Replace Resource

Completely replaces the resource definition.  - If the resource key is changed, all role and permissions assignments for the the resource will be revoked. - If the resource key is unchanged, but some actions are removed or renamed from the resource definition, role and permissions assignments for these actions will be revoked.  TODO: we need to decide if we are auto-revoking, or if we are rejecting the PUT completely while there are permissions that can be affected.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val resourceReplace : ResourceReplace =  // ResourceReplace | 
try {
    val result : ResourceRead = apiInstance.replaceResource(projId, envId, resourceId, resourceReplace)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#replaceResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#replaceResource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **resourceReplace** | [**ResourceReplace**](ResourceReplace.md)|  |

### Return type

[**ResourceRead**](ResourceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateResource"></a>
# **updateResource**
> ResourceRead updateResource(projId, envId, resourceId, resourceUpdate)

Update Resource

Partially updates the resource definition. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourcesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val resourceUpdate : ResourceUpdate =  // ResourceUpdate | 
try {
    val result : ResourceRead = apiInstance.updateResource(projId, envId, resourceId, resourceUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourcesApi#updateResource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourcesApi#updateResource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **resourceUpdate** | [**ResourceUpdate**](ResourceUpdate.md)|  |

### Return type

[**ResourceRead**](ResourceRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

