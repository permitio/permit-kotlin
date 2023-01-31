# OPALDataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllData**](OPALDataApi.md#getAllData) | **GET** /v2/internal/opal_data/{org_id}/{proj_id}/{env_id} | Get All Data
[**getDataForRole**](OPALDataApi.md#getDataForRole) | **GET** /v2/internal/opal_data/{org_id}/{proj_id}/{env_id}/roles/{role_id} | Get Data For Role
[**getDataForSetRule**](OPALDataApi.md#getDataForSetRule) | **GET** /v2/internal/opal_data/{org_id}/{proj_id}/{env_id}/condition_set_rules/{user_set_id}/{resource_set_id} | Get Data For Set Rule
[**getDataForUser**](OPALDataApi.md#getDataForUser) | **GET** /v2/internal/opal_data/{org_id}/{proj_id}/{env_id}/users/{user_id} | Get Data For User


<a name="getAllData"></a>
# **getAllData**
> FullData getAllData(orgId, projId, envId, internalUpdateCache)

Get All Data

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OPALDataApi()
val orgId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
val projId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val internalUpdateCache : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FullData = apiInstance.getAllData(orgId, projId, envId, internalUpdateCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OPALDataApi#getAllData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OPALDataApi#getAllData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **java.util.UUID**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |
 **projId** | **java.util.UUID**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **java.util.UUID**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **internalUpdateCache** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**FullData**](FullData.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDataForRole"></a>
# **getDataForRole**
> RoleData getDataForRole(orgId, projId, envId, roleId)

Get Data For Role

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OPALDataApi()
val orgId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
val projId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val roleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : RoleData = apiInstance.getDataForRole(orgId, projId, envId, roleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OPALDataApi#getDataForRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OPALDataApi#getDataForRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **java.util.UUID**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |
 **projId** | **java.util.UUID**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **java.util.UUID**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **roleId** | **java.util.UUID**|  |

### Return type

[**RoleData**](RoleData.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDataForSetRule"></a>
# **getDataForSetRule**
> kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt; getDataForSetRule(orgId, projId, envId, userSetId, resourceSetId)

Get Data For Set Rule

return permission assignment data between user sets and resource sets (i.e: condition set rules data)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OPALDataApi()
val orgId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
val projId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userSetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val resourceSetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>> = apiInstance.getDataForSetRule(orgId, projId, envId, userSetId, resourceSetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OPALDataApi#getDataForSetRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OPALDataApi#getDataForSetRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **java.util.UUID**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |
 **projId** | **java.util.UUID**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **java.util.UUID**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userSetId** | **java.util.UUID**|  |
 **resourceSetId** | **java.util.UUID**|  |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt;**

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDataForUser"></a>
# **getDataForUser**
> UserData getDataForUser(orgId, projId, envId, userId)

Get Data For User

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OPALDataApi()
val orgId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \"slug\").
val projId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UserData = apiInstance.getDataForUser(orgId, projId, envId, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OPALDataApi#getDataForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OPALDataApi#getDataForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **java.util.UUID**| Either the unique id of the organization, or the URL-friendly key of the organization (i.e: the \&quot;slug\&quot;). |
 **projId** | **java.util.UUID**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **java.util.UUID**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userId** | **java.util.UUID**|  |

### Return type

[**UserData**](UserData.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

