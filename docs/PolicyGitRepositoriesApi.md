# PolicyGitRepositoriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activatePolicyRepo**](PolicyGitRepositoriesApi.md#activatePolicyRepo) | **PUT** /v2/projects/{proj_id}/repos/{repo_id}/activate | Activate Policy Repo
[**createPolicyRepo**](PolicyGitRepositoriesApi.md#createPolicyRepo) | **POST** /v2/projects/{proj_id}/repos | Create Policy Repo
[**deletePolicyRepo**](PolicyGitRepositoriesApi.md#deletePolicyRepo) | **DELETE** /v2/projects/{proj_id}/repos/{repo_id} | Delete Policy Repo
[**disableActivePolicyRepo**](PolicyGitRepositoriesApi.md#disableActivePolicyRepo) | **PUT** /v2/projects/{proj_id}/repos/disable | Disable Active Policy Repo
[**getActivePolicyRepo**](PolicyGitRepositoriesApi.md#getActivePolicyRepo) | **GET** /v2/projects/{proj_id}/repos/active | Get Active Policy Repo
[**getPolicyRepo**](PolicyGitRepositoriesApi.md#getPolicyRepo) | **GET** /v2/projects/{proj_id}/repos/{repo_id} | Get Policy Repo
[**listPolicyRepos**](PolicyGitRepositoriesApi.md#listPolicyRepos) | **GET** /v2/projects/{proj_id}/repos | List Policy Repos


<a name="activatePolicyRepo"></a>
# **activatePolicyRepo**
> ProjectRead activatePolicyRepo(projId, repoId)

Activate Policy Repo

Disable the currently active policy repo, this action means to turn off the gitops feature. If there is no active policy repo, this action will do nothing.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyGitRepositoriesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val repoId : kotlin.String = repoId_example // kotlin.String | Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \"slug\").
try {
    val result : ProjectRead = apiInstance.activatePolicyRepo(projId, repoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyGitRepositoriesApi#activatePolicyRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyGitRepositoriesApi#activatePolicyRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **repoId** | **kotlin.String**| Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;). |

### Return type

[**ProjectRead**](ProjectRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPolicyRepo"></a>
# **createPolicyRepo**
> PolicyRepoRead createPolicyRepo(projId, policyRepoCreate)

Create Policy Repo

Creates a new policy repository configuration under a given project. The given repository is created with status &#39;pending&#39;, it will be changed and used as the &#39;active&#39; repository for the policy only after a successful attempt to use it. The repository main branch must be present in the remote.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyGitRepositoriesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val policyRepoCreate : PolicyRepoCreate =  // PolicyRepoCreate | 
try {
    val result : PolicyRepoRead = apiInstance.createPolicyRepo(projId, policyRepoCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyGitRepositoriesApi#createPolicyRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyGitRepositoriesApi#createPolicyRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **policyRepoCreate** | [**PolicyRepoCreate**](PolicyRepoCreate.md)|  |

### Return type

[**PolicyRepoRead**](PolicyRepoRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePolicyRepo"></a>
# **deletePolicyRepo**
> deletePolicyRepo(projId, repoId)

Delete Policy Repo

Deletes an environment and all its related data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyGitRepositoriesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val repoId : kotlin.String = repoId_example // kotlin.String | Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \"slug\").
try {
    apiInstance.deletePolicyRepo(projId, repoId)
} catch (e: ClientException) {
    println("4xx response calling PolicyGitRepositoriesApi#deletePolicyRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyGitRepositoriesApi#deletePolicyRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **repoId** | **kotlin.String**| Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;). |

### Return type

null (empty response body)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disableActivePolicyRepo"></a>
# **disableActivePolicyRepo**
> ProjectRead disableActivePolicyRepo(projId)

Disable Active Policy Repo

Disable the currently active policy repo, this action means to turn off the gitops feature. If there is no active policy repo, this action will do nothing.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyGitRepositoriesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
try {
    val result : ProjectRead = apiInstance.disableActivePolicyRepo(projId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyGitRepositoriesApi#disableActivePolicyRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyGitRepositoriesApi#disableActivePolicyRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |

### Return type

[**ProjectRead**](ProjectRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActivePolicyRepo"></a>
# **getActivePolicyRepo**
> PolicyRepoRead getActivePolicyRepo(projId)

Get Active Policy Repo

Gets the currently active repository, if such repository exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyGitRepositoriesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
try {
    val result : PolicyRepoRead = apiInstance.getActivePolicyRepo(projId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyGitRepositoriesApi#getActivePolicyRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyGitRepositoriesApi#getActivePolicyRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |

### Return type

[**PolicyRepoRead**](PolicyRepoRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPolicyRepo"></a>
# **getPolicyRepo**
> PolicyRepoRead getPolicyRepo(projId, repoId)

Get Policy Repo

Gets a single repository matching the given repo_id, if such repository exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyGitRepositoriesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val repoId : kotlin.String = repoId_example // kotlin.String | Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \"slug\").
try {
    val result : PolicyRepoRead = apiInstance.getPolicyRepo(projId, repoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyGitRepositoriesApi#getPolicyRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyGitRepositoriesApi#getPolicyRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **repoId** | **kotlin.String**| Either the unique id of the policy repo, or the URL-friendly key of the policy repo (i.e: the \&quot;slug\&quot;). |

### Return type

[**PolicyRepoRead**](PolicyRepoRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPolicyRepos"></a>
# **listPolicyRepos**
> kotlin.collections.List&lt;PolicyRepoRead&gt; listPolicyRepos(projId, page, perPage)

List Policy Repos

Lists all the policy repositories under a given project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PolicyGitRepositoriesApi()
val projId : kotlin.String = projId_example // kotlin.String | Either the unique id of the project, or the URL-friendly key of the project (i.e: the \"slug\").
val page : kotlin.Int = 56 // kotlin.Int | Page number of the results to fetch, starting at 1.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100).
try {
    val result : kotlin.collections.List<PolicyRepoRead> = apiInstance.listPolicyRepos(projId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PolicyGitRepositoriesApi#listPolicyRepos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PolicyGitRepositoriesApi#listPolicyRepos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projId** | **kotlin.String**| Either the unique id of the project, or the URL-friendly key of the project (i.e: the \&quot;slug\&quot;). |
 **page** | **kotlin.Int**| Page number of the results to fetch, starting at 1. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;PolicyRepoRead&gt;**](PolicyRepoRead.md)

### Authorization


Configure HTTPBearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

