
# WebhookRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the webhook | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the webhook belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the webhook belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the webhook belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the webhook was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the webhook was last updated/modified (ISO_8601 format). | 
**url** | **kotlin.String** | The url to POST the webhook to | 



