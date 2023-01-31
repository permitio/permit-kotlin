
# UserRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A unique id by which Permit will identify the user for permission checks. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the user | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the user belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the user belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the user belongs to. | 
**roles** | [**kotlin.collections.List&lt;UserRole&gt;**](UserRole.md) |  |  [optional]
**email** | **kotlin.String** | The email of the user. If synced, will be unique inside the environment. |  [optional]
**firstName** | **kotlin.String** | First name of the user. |  [optional]
**lastName** | **kotlin.String** | Last name of the user. |  [optional]
**attributes** | [**kotlin.Any**](.md) | Arbitraty user attributes that will be used to enforce attribute-based access control policies. |  [optional]



