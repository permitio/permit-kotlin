# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dummy**](DefaultApi.md#dummy) | **GET** /v2/stress/dummy | Dummy
[**dummyDb**](DefaultApi.md#dummyDb) | **GET** /v2/stress/db/dummy | Dummy Db
[**getOrganizationV2StressDbOrganizationGet**](DefaultApi.md#getOrganizationV2StressDbOrganizationGet) | **GET** /v2/stress/db/organization | Get Organization
[**getOrganizationWithAuthn**](DefaultApi.md#getOrganizationWithAuthn) | **GET** /v2/stress/db/organization_auth | Get Organization With Authn
[**getOrganizationWithAuthz**](DefaultApi.md#getOrganizationWithAuthz) | **GET** /v2/stress/db/organization_authz | Get Organization With Authz


<a name="dummy"></a>
# **dummy**
> kotlin.Any dummy()

Dummy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.Any = apiInstance.dummy()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dummy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dummy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dummyDb"></a>
# **dummyDb**
> kotlin.Any dummyDb()

Dummy Db

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.Any = apiInstance.dummyDb()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dummyDb")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dummyDb")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationV2StressDbOrganizationGet"></a>
# **getOrganizationV2StressDbOrganizationGet**
> OrganizationRead getOrganizationV2StressDbOrganizationGet()

Get Organization

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : OrganizationRead = apiInstance.getOrganizationV2StressDbOrganizationGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOrganizationV2StressDbOrganizationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOrganizationV2StressDbOrganizationGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrganizationRead**](OrganizationRead.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationWithAuthn"></a>
# **getOrganizationWithAuthn**
> OrganizationRead getOrganizationWithAuthn()

Get Organization With Authn

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : OrganizationRead = apiInstance.getOrganizationWithAuthn()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOrganizationWithAuthn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOrganizationWithAuthn")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrganizationRead**](OrganizationRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrganizationWithAuthz"></a>
# **getOrganizationWithAuthz**
> OrganizationRead getOrganizationWithAuthz()

Get Organization With Authz

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : OrganizationRead = apiInstance.getOrganizationWithAuthz()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOrganizationWithAuthz")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOrganizationWithAuthz")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrganizationRead**](OrganizationRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

