# UserAttributesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserAttribute**](UserAttributesApi.md#createUserAttribute) | **POST** /v2/schema/{proj_id}/{env_id}/users/attributes | Create User Attribute
[**deleteUserAttribute**](UserAttributesApi.md#deleteUserAttribute) | **DELETE** /v2/schema/{proj_id}/{env_id}/users/attributes/{attribute_id} | Delete User Attribute
[**getUserAttribute**](UserAttributesApi.md#getUserAttribute) | **GET** /v2/schema/{proj_id}/{env_id}/users/attributes/{attribute_id} | Get User Attribute
[**listUserAttributes**](UserAttributesApi.md#listUserAttributes) | **GET** /v2/schema/{proj_id}/{env_id}/users/attributes | List User Attributes
[**updateUserAttribute**](UserAttributesApi.md#updateUserAttribute) | **PATCH** /v2/schema/{proj_id}/{env_id}/users/attributes/{attribute_id} | Update User Attribute


<a name="createUserAttribute"></a>
# **createUserAttribute**
> ResourceAttributeRead createUserAttribute(projId, envId, resourceAttributeCreate, resourceId)

Create User Attribute

Creates a new attribute for the User resource.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceAttributeCreate : ResourceAttributeCreate =  // ResourceAttributeCreate | 
val resourceId : kotlin.String = resourceId_example // kotlin.String | 
try {
    val result : ResourceAttributeRead = apiInstance.createUserAttribute(projId, envId, resourceAttributeCreate, resourceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAttributesApi#createUserAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAttributesApi#createUserAttribute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceAttributeCreate** | [**ResourceAttributeCreate**](ResourceAttributeCreate.md)|  |
 **resourceId** | **kotlin.String**|  | [optional] [default to &quot;__user&quot;]

### Return type

[**ResourceAttributeRead**](ResourceAttributeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserAttribute"></a>
# **deleteUserAttribute**
> deleteUserAttribute(projId, envId, attributeId, resourceId, page, perPage)

Delete User Attribute

Deletes the attribute and all its related data.  Note: If the attribute is used by policies, removing it will cause the attribute to evaluate as &#x60;undefined&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val attributeId : kotlin.String = attributeId_example // kotlin.String | Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    apiInstance.deleteUserAttribute(projId, envId, attributeId, resourceId, page, perPage)
} catch (e: ClientException) {
    println("4xx response calling UserAttributesApi#deleteUserAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAttributesApi#deleteUserAttribute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **attributeId** | **kotlin.String**| Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**|  | [optional] [default to &quot;__user&quot;]
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

<a name="getUserAttribute"></a>
# **getUserAttribute**
> ResourceAttributeRead getUserAttribute(projId, envId, attributeId, resourceId)

Get User Attribute

Gets a single attribute defined on the User resource, if such attribute exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val attributeId : kotlin.String = attributeId_example // kotlin.String | Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | 
try {
    val result : ResourceAttributeRead = apiInstance.getUserAttribute(projId, envId, attributeId, resourceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAttributesApi#getUserAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAttributesApi#getUserAttribute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **attributeId** | **kotlin.String**| Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**|  | [optional] [default to &quot;__user&quot;]

### Return type

[**ResourceAttributeRead**](ResourceAttributeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUserAttributes"></a>
# **listUserAttributes**
> kotlin.collections.List&lt;ResourceAttributeRead&gt; listUserAttributes(projId, envId, resourceId, page, perPage)

List User Attributes

Lists all the attributes defined on the User resource.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val resourceId : kotlin.String = resourceId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ResourceAttributeRead> = apiInstance.listUserAttributes(projId, envId, resourceId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAttributesApi#listUserAttributes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAttributesApi#listUserAttributes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **resourceId** | **kotlin.String**|  | [optional] [default to &quot;__user&quot;]
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

<a name="updateUserAttribute"></a>
# **updateUserAttribute**
> ResourceAttributeRead updateUserAttribute(projId, envId, attributeId, resourceAttributeUpdate, resourceId)

Update User Attribute

Partially updates the attribute defined on the User resource. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserAttributesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val attributeId : kotlin.String = attributeId_example // kotlin.String | Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \"slug\").
val resourceAttributeUpdate : ResourceAttributeUpdate =  // ResourceAttributeUpdate | 
val resourceId : kotlin.String = resourceId_example // kotlin.String | 
try {
    val result : ResourceAttributeRead = apiInstance.updateUserAttribute(projId, envId, attributeId, resourceAttributeUpdate, resourceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserAttributesApi#updateUserAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserAttributesApi#updateUserAttribute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **attributeId** | **kotlin.String**| Either the unique id of the attribute, or the URL-friendly key of the attribute (i.e: the \&quot;slug\&quot;). |
 **resourceAttributeUpdate** | [**ResourceAttributeUpdate**](ResourceAttributeUpdate.md)|  |
 **resourceId** | **kotlin.String**|  | [optional] [default to &quot;__user&quot;]

### Return type

[**ResourceAttributeRead**](ResourceAttributeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

