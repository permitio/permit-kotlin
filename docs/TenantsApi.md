# TenantsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTenant**](TenantsApi.md#createTenant) | **POST** /v2/facts/{proj_id}/{env_id}/tenants | Create Tenant
[**deleteTenant**](TenantsApi.md#deleteTenant) | **DELETE** /v2/facts/{proj_id}/{env_id}/tenants/{tenant_id} | Delete Tenant
[**deleteTenantUser**](TenantsApi.md#deleteTenantUser) | **DELETE** /v2/facts/{proj_id}/{env_id}/tenants/{tenant_id}/users/{user_id} | Delete Tenant User
[**getTenant**](TenantsApi.md#getTenant) | **GET** /v2/facts/{proj_id}/{env_id}/tenants/{tenant_id} | Get Tenant
[**listTenantUsers**](TenantsApi.md#listTenantUsers) | **GET** /v2/facts/{proj_id}/{env_id}/tenants/{tenant_id}/users | List Tenant Users
[**listTenants**](TenantsApi.md#listTenants) | **GET** /v2/facts/{proj_id}/{env_id}/tenants | List Tenants
[**updateTenant**](TenantsApi.md#updateTenant) | **PATCH** /v2/facts/{proj_id}/{env_id}/tenants/{tenant_id} | Update Tenant


<a name="createTenant"></a>
# **createTenant**
> TenantRead createTenant(projId, envId, tenantCreate)

Create Tenant

Creates a new tenant inside the Permit.io system.  If the tenant is already created: will return 200 instead of 201, and will return the existing tenant object in the response body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val tenantCreate : TenantCreate =  // TenantCreate | 
try {
    val result : TenantRead = apiInstance.createTenant(projId, envId, tenantCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#createTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#createTenant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **tenantCreate** | [**TenantCreate**](TenantCreate.md)|  |

### Return type

[**TenantRead**](TenantRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTenant"></a>
# **deleteTenant**
> deleteTenant(projId, envId, tenantId)

Delete Tenant

Deletes the tenant and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val tenantId : kotlin.String = tenantId_example // kotlin.String | Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \"slug\").
try {
    apiInstance.deleteTenant(projId, envId, tenantId)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#deleteTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#deleteTenant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **tenantId** | **kotlin.String**| Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTenantUser"></a>
# **deleteTenantUser**
> deleteTenantUser(projId, envId, tenantId, userId)

Delete Tenant User

Deletes a user under a tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val tenantId : kotlin.String = tenantId_example // kotlin.String | Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \"slug\").
val userId : kotlin.String = userId_example // kotlin.String | Either the unique id of the user, or the URL-friendly key of the user (i.e: the \"slug\").
try {
    apiInstance.deleteTenantUser(projId, envId, tenantId, userId)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#deleteTenantUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#deleteTenantUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **tenantId** | **kotlin.String**| Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \&quot;slug\&quot;). |
 **userId** | **kotlin.String**| Either the unique id of the user, or the URL-friendly key of the user (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTenant"></a>
# **getTenant**
> TenantRead getTenant(projId, envId, tenantId)

Get Tenant

Gets a tenant, if such tenant exists. Otherwise returns 404.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val tenantId : kotlin.String = tenantId_example // kotlin.String | Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \"slug\").
try {
    val result : TenantRead = apiInstance.getTenant(projId, envId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **tenantId** | **kotlin.String**| Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \&quot;slug\&quot;). |

### Return type

[**TenantRead**](TenantRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTenantUsers"></a>
# **listTenantUsers**
> PaginatedResultUserRead listTenantUsers(projId, tenantId, envId, search, page, perPage)

List Tenant Users

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val tenantId : kotlin.String = tenantId_example // kotlin.String | Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val search : kotlin.String = search_example // kotlin.String | Text search for the email field
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : PaginatedResultUserRead = apiInstance.listTenantUsers(projId, tenantId, envId, search, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#listTenantUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#listTenantUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **tenantId** | **kotlin.String**| Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **search** | **kotlin.String**| Text search for the email field | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**PaginatedResultUserRead**](PaginatedResultUserRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTenants"></a>
# **listTenants**
> kotlin.collections.List&lt;TenantRead&gt; listTenants(projId, envId, search, page, perPage)

List Tenants

Lists all the tenants defined within an environment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val search : kotlin.String = search_example // kotlin.String | Text search for the tenant name or key
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<TenantRead> = apiInstance.listTenants(projId, envId, search, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#listTenants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#listTenants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **search** | **kotlin.String**| Text search for the tenant name or key | [optional]
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;TenantRead&gt;**](TenantRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTenant"></a>
# **updateTenant**
> TenantRead updateTenant(projId, envId, tenantId, tenantUpdate)

Update Tenant

Partially updates the tenant definition. Fields that will be provided will be completely overwritten.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val envId : kotlin.String = envId_example // kotlin.String | Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \"slug\").
val tenantId : kotlin.String = tenantId_example // kotlin.String | Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \"slug\").
val tenantUpdate : TenantUpdate =  // TenantUpdate | 
try {
    val result : TenantRead = apiInstance.updateTenant(projId, envId, tenantId, tenantUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#updateTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#updateTenant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **envId** | **kotlin.String**| Either the unique id of the environment, or the URL-friendly key of the environment (i.e: the \&quot;slug\&quot;). |
 **tenantId** | **kotlin.String**| Either the unique id of the tenant, or the URL-friendly key of the tenant (i.e: the \&quot;slug\&quot;). |
 **tenantUpdate** | [**TenantUpdate**](TenantUpdate.md)|  |

### Return type

[**TenantRead**](TenantRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

