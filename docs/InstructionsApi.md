# InstructionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLanguageInstructions**](InstructionsApi.md#listLanguageInstructions) | **GET** /v2/{proj_id}/{env_id}/get_instructions | List Language Instructions


<a name="listLanguageInstructions"></a>
# **listLanguageInstructions**
> kotlin.collections.List&lt;LanguageInstructions&gt; listLanguageInstructions(projId, envId)

List Language Instructions

Lists pending organization invites

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InstructionsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
try {
    val result : kotlin.collections.List<LanguageInstructions> = apiInstance.listLanguageInstructions(projId, envId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstructionsApi#listLanguageInstructions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstructionsApi#listLanguageInstructions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |

### Return type

[**kotlin.collections.List&lt;LanguageInstructions&gt;**](LanguageInstructions.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

