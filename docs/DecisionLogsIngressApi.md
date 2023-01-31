# DecisionLogsIngressApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**insertOpaDecisionLogs**](DecisionLogsIngressApi.md#insertOpaDecisionLogs) | **POST** /v2/decision-logs/ingress | OPA Decision Logs Ingress


<a name="insertOpaDecisionLogs"></a>
# **insertOpaDecisionLogs**
> insertOpaDecisionLogs(requestBody)

OPA Decision Logs Ingress

This ingress endpoint captures OPA decision logs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DecisionLogsIngressApi()
val requestBody : kotlin.collections.List<kotlin.Any> =  // kotlin.collections.List<kotlin.Any> | 
try {
    apiInstance.insertOpaDecisionLogs(requestBody)
} catch (e: ClientException) {
    println("4xx response calling DecisionLogsIngressApi#insertOpaDecisionLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DecisionLogsIngressApi#insertOpaDecisionLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md)|  |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

