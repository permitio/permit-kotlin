# ConditionSetsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConditionSet**](ConditionSetsApi.md#createConditionSet) | **POST** /v2/schema/{proj_id}/{env_id}/condition_sets | Create Condition Set
[**deleteConditionSet**](ConditionSetsApi.md#deleteConditionSet) | **DELETE** /v2/schema/{proj_id}/{env_id}/condition_sets/{condition_set_id} | Delete Condition Set
[**getConditionSet**](ConditionSetsApi.md#getConditionSet) | **GET** /v2/schema/{proj_id}/{env_id}/condition_sets/{condition_set_id} | Get Condition Set
[**listConditionSets**](ConditionSetsApi.md#listConditionSets) | **GET** /v2/schema/{proj_id}/{env_id}/condition_sets | List Condition Sets
[**updateConditionSet**](ConditionSetsApi.md#updateConditionSet) | **PATCH** /v2/schema/{proj_id}/{env_id}/condition_sets/{condition_set_id} | Update Condition Set


<a name="createConditionSet"></a>
# **createConditionSet**
> ConditionSetRead createConditionSet(projId, envId, conditionSetCreate)

Create Condition Set

Creates a new condition set (can be either a user set or a resource set).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConditionSetsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val conditionSetCreate : ConditionSetCreate =  // ConditionSetCreate | 
try {
    val result : ConditionSetRead = apiInstance.createConditionSet(projId, envId, conditionSetCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConditionSetsApi#createConditionSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConditionSetsApi#createConditionSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **conditionSetCreate** | [**ConditionSetCreate**](ConditionSetCreate.md)|  |

### Return type

[**ConditionSetRead**](ConditionSetRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConditionSet"></a>
# **deleteConditionSet**
> deleteConditionSet(projId, envId, conditionSetId)

Delete Condition Set

Deletes a condition set and all its related data. This includes any permissions granted to said condition set (i.e: any matching condition set rules).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConditionSetsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val conditionSetId : kotlin.String = conditionSetId_example // kotlin.String | Either the unique id of the condition set, or the URL-friendly key of the condition set (i.e: the \"slug\").
try {
    apiInstance.deleteConditionSet(projId, envId, conditionSetId)
} catch (e: ClientException) {
    println("4xx response calling ConditionSetsApi#deleteConditionSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConditionSetsApi#deleteConditionSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **conditionSetId** | **kotlin.String**| Either the unique id of the condition set, or the URL-friendly key of the condition set (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConditionSet"></a>
# **getConditionSet**
> ConditionSetRead getConditionSet(projId, envId, conditionSetId)

Get Condition Set

Gets a single condition set, if such condition set exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConditionSetsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val conditionSetId : kotlin.String = conditionSetId_example // kotlin.String | Either the unique id of the condition set, or the URL-friendly key of the condition set (i.e: the \"slug\").
try {
    val result : ConditionSetRead = apiInstance.getConditionSet(projId, envId, conditionSetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConditionSetsApi#getConditionSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConditionSetsApi#getConditionSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **conditionSetId** | **kotlin.String**| Either the unique id of the condition set, or the URL-friendly key of the condition set (i.e: the \&quot;slug\&quot;). |

### Return type

[**ConditionSetRead**](ConditionSetRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConditionSets"></a>
# **listConditionSets**
> kotlin.collections.List&lt;ConditionSetRead&gt; listConditionSets(projId, envId, type, page, perPage)

List Condition Sets

Lists all condition sets matching a filter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConditionSetsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val type : ConditionSetType =  // ConditionSetType | if provided, will return only the condition sets of the specified type. e.g: only user sets.
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ConditionSetRead> = apiInstance.listConditionSets(projId, envId, type, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConditionSetsApi#listConditionSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConditionSetsApi#listConditionSets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **type** | [**ConditionSetType**](.md)| if provided, will return only the condition sets of the specified type. e.g: only user sets. | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;ConditionSetRead&gt;**](ConditionSetRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateConditionSet"></a>
# **updateConditionSet**
> ConditionSetRead updateConditionSet(projId, envId, conditionSetId, conditionSetUpdate)

Update Condition Set

Partially updates a condition set. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConditionSetsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val conditionSetId : kotlin.String = conditionSetId_example // kotlin.String | Either the unique id of the condition set, or the URL-friendly key of the condition set (i.e: the \"slug\").
val conditionSetUpdate : ConditionSetUpdate =  // ConditionSetUpdate | 
try {
    val result : ConditionSetRead = apiInstance.updateConditionSet(projId, envId, conditionSetId, conditionSetUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConditionSetsApi#updateConditionSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConditionSetsApi#updateConditionSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **conditionSetId** | **kotlin.String**| Either the unique id of the condition set, or the URL-friendly key of the condition set (i.e: the \&quot;slug\&quot;). |
 **conditionSetUpdate** | [**ConditionSetUpdate**](ConditionSetUpdate.md)|  |

### Return type

[**ConditionSetRead**](ConditionSetRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

