# AuditLogsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetailedAuditLog**](AuditLogsApi.md#getDetailedAuditLog) | **GET** /v2/pdps/{proj_id}/{env_id}/audit_logs/{log_id} | Get detailed audit log
[**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /v2/pdps/{proj_id}/{env_id}/audit_logs | List Audit Logs


<a name="getDetailedAuditLog"></a>
# **getDetailedAuditLog**
> DetailedAuditLog getDetailedAuditLog(projId, envId, logId)

Get detailed audit log

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuditLogsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val logId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The unique id of the audit log
try {
    val result : DetailedAuditLog = apiInstance.getDetailedAuditLog(projId, envId, logId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditLogsApi#getDetailedAuditLog")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditLogsApi#getDetailedAuditLog")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **logId** | **java.util.UUID**| The unique id of the audit log |

### Return type

[**DetailedAuditLog**](DetailedAuditLog.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAuditLogs"></a>
# **listAuditLogs**
> PaginatedResultAuditLog listAuditLogs(projId, envId, pdpId, users, decision, resources, tenant, action, timestampFrom, timestampTo, page, perPage)

List Audit Logs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuditLogsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val pdpId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Filter by pdp config id
val users : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of user keys or emails to filter by
val decision : kotlin.Boolean = true // kotlin.Boolean | Filter by decision result
val resources : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filter by resources
val tenant : kotlin.String = tenant_example // kotlin.String | Filter by tenant
val action : kotlin.String = action_example // kotlin.String | Filter by action
val timestampFrom : kotlin.Int = 56 // kotlin.Int | Filter by timestamp from
val timestampTo : kotlin.Int = 56 // kotlin.Int | Filter by timestamp to
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : PaginatedResultAuditLog = apiInstance.listAuditLogs(projId, envId, pdpId, users, decision, resources, tenant, action, timestampFrom, timestampTo, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditLogsApi#listAuditLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditLogsApi#listAuditLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **pdpId** | **java.util.UUID**| Filter by pdp config id | [optional]
 **users** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of user keys or emails to filter by | [optional]
 **decision** | **kotlin.Boolean**| Filter by decision result | [optional]
 **resources** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filter by resources | [optional]
 **tenant** | **kotlin.String**| Filter by tenant | [optional]
 **action** | **kotlin.String**| Filter by action | [optional]
 **timestampFrom** | **kotlin.Int**| Filter by timestamp from | [optional]
 **timestampTo** | **kotlin.Int**| Filter by timestamp to | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**PaginatedResultAuditLog**](PaginatedResultAuditLog.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

