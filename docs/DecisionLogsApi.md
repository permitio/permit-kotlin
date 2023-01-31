# DecisionLogsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPdpDecisionLogs**](DecisionLogsApi.md#listPdpDecisionLogs) | **GET** /v2/pdps/{proj_id}/{env_id}/decision-logs/{pdp_id} | List PDP Decisions


<a name="listPdpDecisionLogs"></a>
# **listPdpDecisionLogs**
> PaginatedResultOPADecisionLog listPdpDecisionLogs(projId, envId, pdpId, users, approved, resources, timestampFrom, timestampTo, page, perPage)

List PDP Decisions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DecisionLogsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val pdpId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The unique id of the pdp
val users : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of user IDs to filter by
val approved : kotlin.Boolean = true // kotlin.Boolean | Filter by approved decisions
val resources : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filter by resources
val timestampFrom : kotlin.Int = 56 // kotlin.Int | Filter by timestamp from
val timestampTo : kotlin.Int = 56 // kotlin.Int | Filter by timestamp to
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : PaginatedResultOPADecisionLog = apiInstance.listPdpDecisionLogs(projId, envId, pdpId, users, approved, resources, timestampFrom, timestampTo, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DecisionLogsApi#listPdpDecisionLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DecisionLogsApi#listPdpDecisionLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **pdpId** | **java.util.UUID**| The unique id of the pdp |
 **users** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of user IDs to filter by | [optional]
 **approved** | **kotlin.Boolean**| Filter by approved decisions | [optional]
 **resources** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filter by resources | [optional]
 **timestampFrom** | **kotlin.Int**| Filter by timestamp from | [optional]
 **timestampTo** | **kotlin.Int**| Filter by timestamp to | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**PaginatedResultOPADecisionLog**](PaginatedResultOPADecisionLog.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

