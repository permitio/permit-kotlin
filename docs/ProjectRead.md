
# ProjectRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the project (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the project. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the project belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the project was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the project was last updated/modified (ISO_8601 format). | 
**name** | **kotlin.String** | The name of the project | 
**urnNamespace** | **kotlin.String** | Optional namespace for URNs. If empty, URNs will be generated from project key. |  [optional]
**description** | **kotlin.String** | a longer description outlining the project objectives |  [optional]
**settings** | [**kotlin.Any**](.md) | the settings for this project |  [optional]
**activePolicyRepoId** | [**java.util.UUID**](java.util.UUID.md) | the id of the policy repo to use for this project |  [optional]



