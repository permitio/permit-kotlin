
# ConditionSetRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A unique id by which Permit will identify the condition set. The key will be used as the generated rego rule name. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the condition set | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the condition set belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the condition set belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the condition set belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the condition set was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the condition set was last updated/modified (ISO_8601 format). | 
**name** | **kotlin.String** | A descriptive name for the set, i.e: &#39;US based employees&#39; or &#39;Users behind VPN&#39; | 
**type** | [**ConditionSetType**](ConditionSetType.md) | the type of the set: UserSet or ResourceSet |  [optional]
**autogenerated** | **kotlin.Boolean** | whether the set was autogenerated by the system. |  [optional]
**resourceId** | [**ResourceId**](ResourceId.md) |  |  [optional]
**resource** | [**ResourceRead**](ResourceRead.md) |  |  [optional]
**description** | **kotlin.String** | an optional longer description of the set |  [optional]
**conditions** | [**kotlin.Any**](.md) | a boolean expression that consists of multiple conditions, with and/or logic. |  [optional]



