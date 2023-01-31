# ElementsConfigsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createElementsConfig**](ElementsConfigsApi.md#createElementsConfig) | **POST** /v2/elements/{proj_id}/{env_id}/config | Create Elements Config
[**deleteElementsConfig**](ElementsConfigsApi.md#deleteElementsConfig) | **DELETE** /v2/elements/{proj_id}/{env_id}/{elements_config_id} | Delete Elements Config
[**getElementsConfig**](ElementsConfigsApi.md#getElementsConfig) | **GET** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id} | Get Elements Config
[**getElementsConfigRuntime**](ElementsConfigsApi.md#getElementsConfigRuntime) | **GET** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id}/runtime | Get Elements Config Runtime
[**getElementsTypeConfig**](ElementsConfigsApi.md#getElementsTypeConfig) | **GET** /v2/elements/{proj_id}/{env_id}/{element_type} | Get Elements Type Config
[**listElementsConfigs**](ElementsConfigsApi.md#listElementsConfigs) | **GET** /v2/elements/{proj_id}/{env_id}/config | List Elements Configs
[**updateElementsConfig**](ElementsConfigsApi.md#updateElementsConfig) | **PATCH** /v2/elements/{proj_id}/{env_id}/config/{elements_config_id} | Update Elements Config
[**updateElementsTypePermissions**](ElementsConfigsApi.md#updateElementsTypePermissions) | **PATCH** /v2/elements/{proj_id}/{env_id}/{element_type} | Update Elements Type Permissions


<a name="createElementsConfig"></a>
# **createElementsConfig**
> ElementsConfigRead createElementsConfig(projId, envId, elementsConfigCreate)

Create Elements Config

Creates a new elements_config under the active organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ElementsConfigsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigCreate : ElementsConfigCreate =  // ElementsConfigCreate | 
try {
    val result : ElementsConfigRead = apiInstance.createElementsConfig(projId, envId, elementsConfigCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElementsConfigsApi#createElementsConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElementsConfigsApi#createElementsConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigCreate** | [**ElementsConfigCreate**](ElementsConfigCreate.md)|  |

### Return type

[**ElementsConfigRead**](ElementsConfigRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteElementsConfig"></a>
# **deleteElementsConfig**
> deleteElementsConfig(elementsConfigId, projId, envId)

Delete Elements Config

Deletes the elements_config and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ElementsConfigsApi()
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
try {
    apiInstance.deleteElementsConfig(elementsConfigId, projId, envId)
} catch (e: ClientException) {
    println("4xx response calling ElementsConfigsApi#deleteElementsConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElementsConfigsApi#deleteElementsConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getElementsConfig"></a>
# **getElementsConfig**
> ElementsConfigRead getElementsConfig(projId, envId, elementsConfigId)

Get Elements Config

Gets a single elements_config matching the given elements_config_id, if such elements_config exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ElementsConfigsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
try {
    val result : ElementsConfigRead = apiInstance.getElementsConfig(projId, envId, elementsConfigId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElementsConfigsApi#getElementsConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElementsConfigsApi#getElementsConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |

### Return type

[**ElementsConfigRead**](ElementsConfigRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getElementsConfigRuntime"></a>
# **getElementsConfigRuntime**
> ElementsConfigRuntimeRead getElementsConfigRuntime(projId, envId, elementsConfigId)

Get Elements Config Runtime

Gets a single elements_config matching the given elements_config_id, if such elements_config exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ElementsConfigsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
try {
    val result : ElementsConfigRuntimeRead = apiInstance.getElementsConfigRuntime(projId, envId, elementsConfigId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElementsConfigsApi#getElementsConfigRuntime")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElementsConfigsApi#getElementsConfigRuntime")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |

### Return type

[**ElementsConfigRuntimeRead**](ElementsConfigRuntimeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getElementsTypeConfig"></a>
# **getElementsTypeConfig**
> ElementsEnvTypeRead getElementsTypeConfig(projId, envId, elementType)

Get Elements Type Config

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ElementsConfigsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementType : ElementsType =  // ElementsType | Either the unique id of the elements_type, or the URL-friendly key of the elements_type (i.e: the \"slug\").
try {
    val result : ElementsEnvTypeRead = apiInstance.getElementsTypeConfig(projId, envId, elementType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElementsConfigsApi#getElementsTypeConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElementsConfigsApi#getElementsTypeConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementType** | [**ElementsType**](.md)| Either the unique id of the elements_type, or the URL-friendly key of the elements_type (i.e: the \&quot;slug\&quot;). |

### Return type

[**ElementsEnvTypeRead**](ElementsEnvTypeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listElementsConfigs"></a>
# **listElementsConfigs**
> PaginatedResultElementsConfigRead listElementsConfigs(projId, envId, page, perPage)

List Elements Configs

Lists all the elements_configs under the active organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ElementsConfigsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : PaginatedResultElementsConfigRead = apiInstance.listElementsConfigs(projId, envId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElementsConfigsApi#listElementsConfigs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElementsConfigsApi#listElementsConfigs")
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

[**PaginatedResultElementsConfigRead**](PaginatedResultElementsConfigRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateElementsConfig"></a>
# **updateElementsConfig**
> ElementsConfigRead updateElementsConfig(elementsConfigId, projId, envId, elementsConfigUpdate)

Update Elements Config

Updates the elements_config.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ElementsConfigsApi()
val elementsConfigId : kotlin.String = elementsConfigId_example // kotlin.String | Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \"slug\").
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsConfigUpdate : ElementsConfigUpdate =  // ElementsConfigUpdate | 
try {
    val result : ElementsConfigRead = apiInstance.updateElementsConfig(elementsConfigId, projId, envId, elementsConfigUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElementsConfigsApi#updateElementsConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElementsConfigsApi#updateElementsConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elementsConfigId** | **kotlin.String**| Either the unique id of the elements_config, or the URL-friendly key of the elements_config (i.e: the \&quot;slug\&quot;). |
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsConfigUpdate** | [**ElementsConfigUpdate**](ElementsConfigUpdate.md)|  |

### Return type

[**ElementsConfigRead**](ElementsConfigRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateElementsTypePermissions"></a>
# **updateElementsTypePermissions**
> ElementsEnvTypeRead updateElementsTypePermissions(elementType, projId, envId, elementsEnvTypeUpdate)

Update Elements Type Permissions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ElementsConfigsApi()
val elementType : ElementsType =  // ElementsType | Either the unique id of the elements_type, or the URL-friendly key of the elements_type (i.e: the \"slug\").
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val elementsEnvTypeUpdate : ElementsEnvTypeUpdate =  // ElementsEnvTypeUpdate | 
try {
    val result : ElementsEnvTypeRead = apiInstance.updateElementsTypePermissions(elementType, projId, envId, elementsEnvTypeUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ElementsConfigsApi#updateElementsTypePermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ElementsConfigsApi#updateElementsTypePermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elementType** | [**ElementsType**](.md)| Either the unique id of the elements_type, or the URL-friendly key of the elements_type (i.e: the \&quot;slug\&quot;). |
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **elementsEnvTypeUpdate** | [**ElementsEnvTypeUpdate**](ElementsEnvTypeUpdate.md)|  |

### Return type

[**ElementsEnvTypeRead**](ElementsEnvTypeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

