
# ConditionSetRuleRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the condition set rule | 
**key** | **kotlin.String** | A unique id by which Permit will identify this condition set rule. | 
**userSet** | **kotlin.String** | the userset that is currently granted permissions, i.e: all the users matching this rule are granted the permission on the resourceset | 
**permission** | **kotlin.String** | a permission that is currently granted to the userset *on* the resourceset. | 
**resourceSet** | **kotlin.String** | the resourceset that represents the resources that are currently granted for access, i.e: all the resources matching this rule can be accessed by the userset to perform the granted *permission* | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the condition set rule belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the condition set rule belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the condition set rule belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the condition set rule was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the condition set rule was last updated/modified (ISO_8601 format). | 



