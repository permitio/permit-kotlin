# PolicyDecisionPointsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthenticatingPdpConfigValues**](PolicyDecisionPointsApi.md#getAuthenticatingPdpConfigValues) | **POST** /v2/pdps/me/config | Get connected PDP configuration and push state
[**getAuthenticatingPdpConfigValuesLegacy**](PolicyDecisionPointsApi.md#getAuthenticatingPdpConfigValuesLegacy) | **GET** /v2/pdps/me/config | Get connected PDP configuration
[**getPdpConfigValues**](PolicyDecisionPointsApi.md#getPdpConfigValues) | **GET** /v2/pdps/{proj_id}/{env_id}/configs/{pdp_id}/values | Get PDP configuration
[**listPdpConfigs**](PolicyDecisionPointsApi.md#listPdpConfigs) | **GET** /v2/pdps/{proj_id}/{env_id}/configs | List PDP configurations
[**rotatePdpApiKey**](PolicyDecisionPointsApi.md#rotatePdpApiKey) | **POST** /v2/pdps/{proj_id}/{env_id}/configs/{pdp_id}/rotate-api-key | Rotate PDP API Key


<a name="getAuthenticatingPdpConfigValues"></a>
# **getAuthenticatingPdpConfigValues**
> RemoteConfig getAuthenticatingPdpConfigValues(pdPStateUpdate)

Get connected PDP configuration and push state

Gets the configuration values for the currently authenticated PDP container.  The PDP authenticates with an API key scoped to a given Permit.io environment. The system identifies the PDP via its API key and then returns all the configuration values required for the container to run correctly.  The config values returned are considered \&quot;overrides\&quot;, meaning they are overriding any default values given to the container by the user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyDecisionPointsApi()
val pdPStateUpdate : PDPStateUpdate =  // PDPStateUpdate | 
try {
    val result : RemoteConfig = apiInstance.getAuthenticatingPdpConfigValues(pdPStateUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyDecisionPointsApi#getAuthenticatingPdpConfigValues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyDecisionPointsApi#getAuthenticatingPdpConfigValues")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pdPStateUpdate** | [**PDPStateUpdate**](PDPStateUpdate.md)|  |

### Return type

[**RemoteConfig**](RemoteConfig.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthenticatingPdpConfigValuesLegacy"></a>
# **getAuthenticatingPdpConfigValuesLegacy**
> RemoteConfig getAuthenticatingPdpConfigValuesLegacy()

Get connected PDP configuration

Gets the configuration values for the currently authenticated PDP container.  The PDP authenticates with an API key scoped to a given Permit.io environment. The system identifies the PDP via its API key and then returns all the configuration values required for the container to run correctly.  The config values returned are considered \&quot;overrides\&quot;, meaning they are overriding any default values given to the container by the user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyDecisionPointsApi()
try {
    val result : RemoteConfig = apiInstance.getAuthenticatingPdpConfigValuesLegacy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyDecisionPointsApi#getAuthenticatingPdpConfigValuesLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyDecisionPointsApi#getAuthenticatingPdpConfigValuesLegacy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RemoteConfig**](RemoteConfig.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPdpConfigValues"></a>
# **getPdpConfigValues**
> RemoteConfig getPdpConfigValues(projId, envId, pdpId)

Get PDP configuration

Gets the configuration values for the PDP container with id &#x60;pdp_id&#x60;.  The config values returned are considered \&quot;overrides\&quot;, meaning they are overriding any default values given to the container by the user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyDecisionPointsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val pdpId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The unique id of the pdp
try {
    val result : RemoteConfig = apiInstance.getPdpConfigValues(projId, envId, pdpId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyDecisionPointsApi#getPdpConfigValues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyDecisionPointsApi#getPdpConfigValues")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **pdpId** | **java.util.UUID**| The unique id of the pdp |

### Return type

[**RemoteConfig**](RemoteConfig.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPdpConfigs"></a>
# **listPdpConfigs**
> kotlin.collections.List&lt;PDPConfigRead&gt; listPdpConfigs(projId, envId, page, perPage)

List PDP configurations

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyDecisionPointsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<PDPConfigRead> = apiInstance.listPdpConfigs(projId, envId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyDecisionPointsApi#listPdpConfigs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyDecisionPointsApi#listPdpConfigs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;PDPConfigRead&gt;**](PDPConfigRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rotatePdpApiKey"></a>
# **rotatePdpApiKey**
> PDPConfigRead rotatePdpApiKey(projId, envId, pdpId)

Rotate PDP API Key

Rotates the API key of the PDP container with id &#x60;pdp_id&#x60;.  The rotation of the API key revokes the old API key and issues a new API key to the PDP.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyDecisionPointsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val pdpId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The unique id of the pdp
try {
    val result : PDPConfigRead = apiInstance.rotatePdpApiKey(projId, envId, pdpId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyDecisionPointsApi#rotatePdpApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyDecisionPointsApi#rotatePdpApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **pdpId** | **java.util.UUID**| The unique id of the pdp |

### Return type

[**PDPConfigRead**](PDPConfigRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

