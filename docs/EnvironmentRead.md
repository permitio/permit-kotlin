
# EnvironmentRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the environment (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the environment. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the environment belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the environment belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the environment was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the environment was last updated/modified (ISO_8601 format). | 
**name** | **kotlin.String** | The name of the environment | 
**description** | **kotlin.String** | an optional longer description of the environment |  [optional]
**customBranchName** | **kotlin.String** | when using gitops feature, an optional branch name for the environment |  [optional]



