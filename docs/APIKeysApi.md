# APIKeysApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiKey**](APIKeysApi.md#createApiKey) | **POST** /v2/api-key | Create Api Key
[**deleteApiKey**](APIKeysApi.md#deleteApiKey) | **DELETE** /v2/api-key/{api_key_id} | Delete Api Key
[**getApiKey**](APIKeysApi.md#getApiKey) | **GET** /v2/api-key/{api_key_id} | Get Api Key
[**getApiKeyScope**](APIKeysApi.md#getApiKeyScope) | **GET** /v2/api-key/scope | Get Api Key Scope
[**getEnvironmentApiKey**](APIKeysApi.md#getEnvironmentApiKey) | **GET** /v2/api-key/{proj_id}/{env_id} | Get Environment Api Key
[**listApiKeys**](APIKeysApi.md#listApiKeys) | **GET** /v2/api-key | List Api Keys


<a name="createApiKey"></a>
# **createApiKey**
> APIKeyRead createApiKey(apIKeyCreate)

Create Api Key

Creates a new api_key under the active organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = APIKeysApi()
val apIKeyCreate : APIKeyCreate =  // APIKeyCreate | 
try {
    val result : APIKeyRead = apiInstance.createApiKey(apIKeyCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APIKeysApi#createApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APIKeysApi#createApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apIKeyCreate** | [**APIKeyCreate**](APIKeyCreate.md)|  |

### Return type

[**APIKeyRead**](APIKeyRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApiKey"></a>
# **deleteApiKey**
> deleteApiKey(apiKeyId)

Delete Api Key

Deletes the api_key and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = APIKeysApi()
val apiKeyId : kotlin.String = apiKeyId_example // kotlin.String | The unique id of the API key
try {
    apiInstance.deleteApiKey(apiKeyId)
} catch (e: ClientException) {
    println("4xx response calling APIKeysApi#deleteApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APIKeysApi#deleteApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyId** | **kotlin.String**| The unique id of the API key |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getApiKey"></a>
# **getApiKey**
> APIKeyRead getApiKey(apiKeyId)

Get Api Key

Gets a single api_key matching the given api_key_id, if such api_key exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = APIKeysApi()
val apiKeyId : kotlin.String = apiKeyId_example // kotlin.String | The unique id of the API key
try {
    val result : APIKeyRead = apiInstance.getApiKey(apiKeyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APIKeysApi#getApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APIKeysApi#getApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKeyId** | **kotlin.String**| The unique id of the API key |

### Return type

[**APIKeyRead**](APIKeyRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getApiKeyScope"></a>
# **getApiKeyScope**
> APIKeyScopeRead getApiKeyScope()

Get Api Key Scope

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = APIKeysApi()
try {
    val result : APIKeyScopeRead = apiInstance.getApiKeyScope()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APIKeysApi#getApiKeyScope")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APIKeysApi#getApiKeyScope")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIKeyScopeRead**](APIKeyScopeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnvironmentApiKey"></a>
# **getEnvironmentApiKey**
> APIKeyRead getEnvironmentApiKey(projId, envId)

Get Environment Api Key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = APIKeysApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
try {
    val result : APIKeyRead = apiInstance.getEnvironmentApiKey(projId, envId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APIKeysApi#getEnvironmentApiKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APIKeysApi#getEnvironmentApiKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |

### Return type

[**APIKeyRead**](APIKeyRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listApiKeys"></a>
# **listApiKeys**
> PaginatedResultAPIKeyRead listApiKeys(page, perPage)

List Api Keys

Lists all the api_keys under the active organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = APIKeysApi()
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : PaginatedResultAPIKeyRead = apiInstance.listApiKeys(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling APIKeysApi#listApiKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling APIKeysApi#listApiKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**PaginatedResultAPIKeyRead**](PaginatedResultAPIKeyRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

