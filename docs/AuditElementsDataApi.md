# AuditElementsDataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**elementsListAuditLogs**](AuditElementsDataApi.md#elementsListAuditLogs) | **GET** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/data/audit_logs | List audit logs


<a name="elementsListAuditLogs"></a>
# **elementsListAuditLogs**
> PaginatedResultAuditLog elementsListAuditLogs(projId, envId, elementsConfigId, search, page, perPage)

List audit logs

Lists audit logs for for specific elements config (tenant scope)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuditElementsDataApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val search : kotlin.String = search_example // kotlin.String | Text search for the email field
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : PaginatedResultAuditLog = apiInstance.elementsListAuditLogs(projId, envId, elementsConfigId, search, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuditElementsDataApi#elementsListAuditLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuditElementsDataApi#elementsListAuditLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **search** | **kotlin.String**| Text search for the email field | [optional]
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

