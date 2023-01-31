# ConditionSetRulesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignSetPermissions**](ConditionSetRulesApi.md#assignSetPermissions) | **POST** /v2/facts/{proj_id}/{env_id}/set_rules | Assign Set Permissions
[**listSetPermissions**](ConditionSetRulesApi.md#listSetPermissions) | **GET** /v2/facts/{proj_id}/{env_id}/set_rules | List Set Permissions
[**unassignSetPermissions**](ConditionSetRulesApi.md#unassignSetPermissions) | **DELETE** /v2/facts/{proj_id}/{env_id}/set_rules | Unassign Set Permissions


<a name="assignSetPermissions"></a>
# **assignSetPermissions**
> kotlin.collections.List&lt;ConditionSetRuleRead&gt; assignSetPermissions(projId, envId, conditionSetRuleCreate)

Assign Set Permissions

Grant permissions to a user set *on* a resource set.  If the permission is already granted, it is skipped.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConditionSetRulesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val conditionSetRuleCreate : ConditionSetRuleCreate =  // ConditionSetRuleCreate | 
try {
    val result : kotlin.collections.List<ConditionSetRuleRead> = apiInstance.assignSetPermissions(projId, envId, conditionSetRuleCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConditionSetRulesApi#assignSetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConditionSetRulesApi#assignSetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **conditionSetRuleCreate** | [**ConditionSetRuleCreate**](ConditionSetRuleCreate.md)|  |

### Return type

[**kotlin.collections.List&lt;ConditionSetRuleRead&gt;**](ConditionSetRuleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSetPermissions"></a>
# **listSetPermissions**
> kotlin.collections.List&lt;ConditionSetRuleRead&gt; listSetPermissions(projId, envId, userSet, permission, resourceSet, page, perPage)

List Set Permissions

Lists the condition set rules matching the filter. - If the &#x60;user_set&#x60; filter is present, will only return the permissions set of that user set. - If the &#x60;permission&#x60; filter is present, will only return the permissions sets that equals to the queried permission. - If the &#x60;resource_set&#x60; filter is present, will only return the permissions set of that resource set.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConditionSetRulesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val userSet : kotlin.String = userSet_example // kotlin.String | optional user set filter, will only return rules where the permission is granted to this user set
val permission : kotlin.String = permission_example // kotlin.String | optional permission filter, will only return condition set rules granting this permission
val resourceSet : kotlin.String = resourceSet_example // kotlin.String | optional resource set filter, will only return rules where the permission is granted on this resource set
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<ConditionSetRuleRead> = apiInstance.listSetPermissions(projId, envId, userSet, permission, resourceSet, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConditionSetRulesApi#listSetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConditionSetRulesApi#listSetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **userSet** | **kotlin.String**| optional user set filter, will only return rules where the permission is granted to this user set | [optional]
 **permission** | **kotlin.String**| optional permission filter, will only return condition set rules granting this permission | [optional]
 **resourceSet** | **kotlin.String**| optional resource set filter, will only return rules where the permission is granted on this resource set | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;ConditionSetRuleRead&gt;**](ConditionSetRuleRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unassignSetPermissions"></a>
# **unassignSetPermissions**
> unassignSetPermissions(projId, envId, conditionSetRuleRemove)

Unassign Set Permissions

Revokes permissions to a user set *on* a resource set.  If the permission is not granted, it is skipped.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConditionSetRulesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val conditionSetRuleRemove : ConditionSetRuleRemove =  // ConditionSetRuleRemove | 
try {
    apiInstance.unassignSetPermissions(projId, envId, conditionSetRuleRemove)
} catch (e: ClientException) {
    println("4xx response calling ConditionSetRulesApi#unassignSetPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConditionSetRulesApi#unassignSetPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **conditionSetRuleRemove** | [**ConditionSetRuleRemove**](ConditionSetRuleRemove.md)|  |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

