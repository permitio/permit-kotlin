# ResourceAttributesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createResourceAttribute**](ResourceAttributesApi.md#createResourceAttribute) | **POST** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/attributes | Create Resource Attribute
[**deleteResourceAttribute**](ResourceAttributesApi.md#deleteResourceAttribute) | **DELETE** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/attributes/{attribute_id} | Delete Resource Attribute
[**getResourceAttribute**](ResourceAttributesApi.md#getResourceAttribute) | **GET** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/attributes/{attribute_id} | Get Resource Attribute
[**listResourceAttributes**](ResourceAttributesApi.md#listResourceAttributes) | **GET** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/attributes | List Resource Attributes
[**updateResourceAttribute**](ResourceAttributesApi.md#updateResourceAttribute) | **PATCH** /v2/schema/{proj_id}/{env_id}/resources/{resource_id}/attributes/{attribute_id} | Update Resource Attribute


<a name="createResourceAttribute"></a>
# **createResourceAttribute**
> ResourceAttributeRead createResourceAttribute(projId, envId, resourceId, resourceAttributeCreate)

Create Resource Attribute

Creates a new attribute as part of the resource definition.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val resourceAttributeCreate : ResourceAttributeCreate =  // ResourceAttributeCreate | 
try {
    val result : ResourceAttributeRead = apiInstance.createResourceAttribute(projId, envId, resourceId, resourceAttributeCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceAttributesApi#createResourceAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceAttributesApi#createResourceAttribute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **resourceAttributeCreate** | [**ResourceAttributeCreate**](ResourceAttributeCreate.md)|  |

### Return type

[**ResourceAttributeRead**](ResourceAttributeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteResourceAttribute"></a>
# **deleteResourceAttribute**
> deleteResourceAttribute(projId, envId, resourceId, attributeId, page, perPage)

Delete Resource Attribute

Deletes the attribute and all its related data.  Note: If the attribute is used by policies, removing it will cause the attribute to evaluate as &#x60;undefined&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val attributeId : kotlin.String = attributeId_example // kotlin.String | Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    apiInstance.deleteResourceAttribute(projId, envId, resourceId, attributeId, page, perPage)
} catch (e: ClientException) {
    println("4xx response calling ResourceAttributesApi#deleteResourceAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceAttributesApi#deleteResourceAttribute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **attributeId** | **kotlin.String**| Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \&quot;slug\&quot;). |
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourceAttribute"></a>
# **getResourceAttribute**
> ResourceAttributeRead getResourceAttribute(projId, envId, resourceId, attributeId)

Get Resource Attribute

Gets a single attribute defined on the resource, if such attribute exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val attributeId : kotlin.String = attributeId_example // kotlin.String | Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \"slug\").
try {
    val result : ResourceAttributeRead = apiInstance.getResourceAttribute(projId, envId, resourceId, attributeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceAttributesApi#getResourceAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceAttributesApi#getResourceAttribute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **attributeId** | **kotlin.String**| Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \&quot;slug\&quot;). |

### Return type

[**ResourceAttributeRead**](ResourceAttributeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listResourceAttributes"></a>
# **listResourceAttributes**
> kotlin.collections.List&lt;ResourceAttributeRead&gt; listResourceAttributes(projId, envId, resourceId, page, perPage)

List Resource Attributes

Lists all the attributes defined on the resource.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ResourceAttributeRead> = apiInstance.listResourceAttributes(projId, envId, resourceId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceAttributesApi#listResourceAttributes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceAttributesApi#listResourceAttributes")
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

[**kotlin.collections.List&lt;ResourceAttributeRead&gt;**](ResourceAttributeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateResourceAttribute"></a>
# **updateResourceAttribute**
> ResourceAttributeRead updateResourceAttribute(projId, envId, resourceId, attributeId, resourceAttributeUpdate)

Update Resource Attribute

Partially updates the attribute defined on a resource. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \"slug\").
val attributeId : kotlin.String = attributeId_example // kotlin.String | Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \"slug\").
val resourceAttributeUpdate : ResourceAttributeUpdate =  // ResourceAttributeUpdate | 
try {
    val result : ResourceAttributeRead = apiInstance.updateResourceAttribute(projId, envId, resourceId, attributeId, resourceAttributeUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ResourceAttributesApi#updateResourceAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceAttributesApi#updateResourceAttribute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**| Either the unique id of the resource, or the URL-friendly key of the resource (i.e: the \&quot;slug\&quot;). |
 **attributeId** | **kotlin.String**| Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \&quot;slug\&quot;). |
 **resourceAttributeUpdate** | [**ResourceAttributeUpdate**](ResourceAttributeUpdate.md)|  |

### Return type

[**ResourceAttributeRead**](ResourceAttributeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

