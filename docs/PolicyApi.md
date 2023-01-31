# PolicyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOpalDataSources**](PolicyApi.md#getOpalDataSources) | **GET** /v2/opal/data/config | Get Opal Data Sources
[**getOpalDataSourcesOpalDataConfigGet**](PolicyApi.md#getOpalDataSourcesOpalDataConfigGet) | **GET** /opal/data/config | Get Opal Data Sources


<a name="getOpalDataSources"></a>
# **getOpalDataSources**
> DataSourceConfig getOpalDataSources(token)

Get Opal Data Sources

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : DataSourceConfig = apiInstance.getOpalDataSources(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyApi#getOpalDataSources")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyApi#getOpalDataSources")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  | [optional]

### Return type

[**DataSourceConfig**](DataSourceConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOpalDataSourcesOpalDataConfigGet"></a>
# **getOpalDataSourcesOpalDataConfigGet**
> DataSourceConfig getOpalDataSourcesOpalDataConfigGet(token)

Get Opal Data Sources

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : DataSourceConfig = apiInstance.getOpalDataSourcesOpalDataConfigGet(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyApi#getOpalDataSourcesOpalDataConfigGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyApi#getOpalDataSourcesOpalDataConfigGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  | [optional]

### Return type

[**DataSourceConfig**](DataSourceConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

