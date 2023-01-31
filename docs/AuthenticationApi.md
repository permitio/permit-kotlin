# AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**devLogin**](AuthenticationApi.md#devLogin) | **POST** /v2/auth/devlogin | (DEV MODE) Login
[**elementsLoginAs**](AuthenticationApi.md#elementsLoginAs) | **POST** /v2/auth/elements_login_as | Elements Login As
[**login**](AuthenticationApi.md#login) | **POST** /v2/auth/login | Login
[**loginElements**](AuthenticationApi.md#loginElements) | **GET** /v2/auth/login_elements | Login Elements
[**logoutGet**](AuthenticationApi.md#logoutGet) | **GET** /v2/auth/logout | Logout Get
[**logoutPost**](AuthenticationApi.md#logoutPost) | **POST** /v2/auth/logout | Logout Post
[**me**](AuthenticationApi.md#me) | **GET** /v2/auth/me | Me
[**switchOrganization**](AuthenticationApi.md#switchOrganization) | **POST** /v2/auth/switch_org/{org_id} | Switch Organization


<a name="devLogin"></a>
# **devLogin**
> devLogin(devLogin)

(DEV MODE) Login

The dev-login endpoints allows a developer inside permit.io to log in with an email address.  THIS IS ONLY AVAILABLE IN DEV MODE.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthenticationApi()
val devLogin : DevLogin =  // DevLogin | 
try {
    apiInstance.devLogin(devLogin)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#devLogin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#devLogin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **devLogin** | [**DevLogin**](DevLogin.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="elementsLoginAs"></a>
# **elementsLoginAs**
> EmbeddedLoginRequestOutput elementsLoginAs(userLoginRequestInput)

Elements Login As

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthenticationApi()
val userLoginRequestInput : UserLoginRequestInput =  // UserLoginRequestInput | 
try {
    val result : EmbeddedLoginRequestOutput = apiInstance.elementsLoginAs(userLoginRequestInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#elementsLoginAs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#elementsLoginAs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLoginRequestInput** | [**UserLoginRequestInput**](UserLoginRequestInput.md)|  |

### Return type

[**EmbeddedLoginRequestOutput**](EmbeddedLoginRequestOutput.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="login"></a>
# **login**
> LoginResult login(inviteCode)

Login

The login endpoint allows the frontend app to exchange a user JWT with a user session. The user session is stored on an httpOnly + secure cookie.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthenticationApi()
val inviteCode : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | An optional invite code to an existing organization. If the invite code is provided and is valid, the member will gain access to that organization.
try {
    val result : LoginResult = apiInstance.login(inviteCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#login")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#login")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteCode** | **java.util.UUID**| An optional invite code to an existing organization. If the invite code is provided and is valid, the member will gain access to that organization. | [optional]

### Return type

[**LoginResult**](LoginResult.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loginElements"></a>
# **loginElements**
> LoginResult loginElements(token)

Login Elements

The login endpoint allows the frontend app to exchange a user JWT with a user session. The user session is stored on an httpOnly + secure cookie.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthenticationApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : LoginResult = apiInstance.loginElements(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#loginElements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#loginElements")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

[**LoginResult**](LoginResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logoutGet"></a>
# **logoutGet**
> logoutGet()

Logout Get

The logout endpoint deletes the session cookie of a logged in user and invalidates cached VCs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthenticationApi()
try {
    apiInstance.logoutGet()
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#logoutGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#logoutGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logoutPost"></a>
# **logoutPost**
> logoutPost()

Logout Post

The logout endpoint deletes the session cookie of a logged in user and invalidates cached VCs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthenticationApi()
try {
    apiInstance.logoutPost()
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#logoutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#logoutPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="me"></a>
# **me**
> AuthnMeRead me()

Me

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthenticationApi()
try {
    val result : AuthnMeRead = apiInstance.me()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#me")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#me")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthnMeRead**](AuthnMeRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="switchOrganization"></a>
# **switchOrganization**
> LoginResult switchOrganization(orgId)

Switch Organization

Allows the user to switch his active organization (manipulates the user&#39;s login session).  This route will return a new login cookie to the user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthenticationApi()
val orgId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | the organization id the user wishes to switch to as the active org on the session
try {
    val result : LoginResult = apiInstance.switchOrganization(orgId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthenticationApi#switchOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthenticationApi#switchOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **java.util.UUID**| the organization id the user wishes to switch to as the active org on the session |

### Return type

[**LoginResult**](LoginResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

