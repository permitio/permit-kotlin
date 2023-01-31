# ResourceActionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createResourceAction**](ResourceActionsApi.md#createResourceAction) | **POST** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions | Create Resource Action
[**deleteResourceAction**](ResourceActionsApi.md#deleteResourceAction) | **DELETE** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions/{action_id} | Delete Resource Action
[**getResourceAction**](ResourceActionsApi.md#getResourceAction) | **GET** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions/{action_id} | Get Resource Action
[**listResourceActions**](ResourceActionsApi.md#listResourceActions) | **GET** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions | List Resource Actions
[**updateResourceAction**](ResourceActionsApi.md#updateResourceAction) | **PATCH** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/actions/{action_id} | Update Resource Action


<a name="createResourceAction"></a>
# **createResourceAction**
> ResourceActionRead createResourceAction(projId, envId, resourceId, resourceActionCreate)

Create Resource Action

Creates a new action that can affect the resource.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceActionsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val resourceActionCreate : ResourceActionCreate =  // ResourceActionCreate | 
try {
    val result : ResourceActionRead = apiInstance.createResourceAction(projId, envId, resourceId, resourceActionCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceActionsApi#createResourceAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceActionsApi#createResourceAction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **resourceActionCreate** | [**ResourceActionCreate**](ResourceActionCreate.md)|  |

### Return type

[**ResourceActionRead**](ResourceActionRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResourceAction"></a>
# **deleteResourceAction**
> deleteResourceAction(projId, envId, resourceId, actionId)

Delete Resource Action

Deletes the action and all its related data. This includes any permissions granted to perform the action.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceActionsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val actionId : kotlin.String = actionId_example // kotlin.String | Either the unique id of the action, or the URL-friendly key of the action (i.e: the \"slug\").
try {
    apiInstance.deleteResourceAction(projId, envId, resourceId, actionId)
} catch (e: ClientException) {
    println("4xx response calling ResourceActionsApi#deleteResourceAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceActionsApi#deleteResourceAction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **actionId** | **kotlin.String**| Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourceAction"></a>
# **getResourceAction**
> ResourceActionRead getResourceAction(projId, envId, resourceId, actionId)

Get Resource Action

Gets a single action defined on the resource, if such action exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceActionsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val actionId : kotlin.String = actionId_example // kotlin.String | Either the unique id of the action, or the URL-friendly key of the action (i.e: the \"slug\").
try {
    val result : ResourceActionRead = apiInstance.getResourceAction(projId, envId, resourceId, actionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceActionsApi#getResourceAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceActionsApi#getResourceAction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **actionId** | **kotlin.String**| Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;). |

### Return type

[**ResourceActionRead**](ResourceActionRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listResourceActions"></a>
# **listResourceActions**
> kotlin.collections.List&lt;ResourceActionRead&gt; listResourceActions(projId, envId, resourceId, page, perPage)

List Resource Actions

Lists all the actions defined on the resource.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceActionsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ResourceActionRead> = apiInstance.listResourceActions(projId, envId, resourceId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceActionsApi#listResourceActions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceActionsApi#listResourceActions")
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

[**kotlin.collections.List&lt;ResourceActionRead&gt;**](ResourceActionRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateResourceAction"></a>
# **updateResourceAction**
> ResourceActionRead updateResourceAction(projId, envId, resourceId, actionId, resourceActionUpdate)

Update Resource Action

Partially updates the action defined on a resource. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceActionsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val actionId : kotlin.String = actionId_example // kotlin.String | Either the unique id of the action, or the URL-friendly key of the action (i.e: the \"slug\").
val resourceActionUpdate : ResourceActionUpdate =  // ResourceActionUpdate | 
try {
    val result : ResourceActionRead = apiInstance.updateResourceAction(projId, envId, resourceId, actionId, resourceActionUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceActionsApi#updateResourceAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceActionsApi#updateResourceAction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **actionId** | **kotlin.String**| Either the unique id of the action, or the URL-friendly key of the action (i.e: the \&quot;slug\&quot;). |
 **resourceActionUpdate** | [**ResourceActionUpdate**](ResourceActionUpdate.md)|  |

### Return type

[**ResourceActionRead**](ResourceActionRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

