
# ResourceActionRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the action | 
**key** | **kotlin.String** | A URL-friendly name of the action (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the action. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the action | 
**permissionName** | **kotlin.String** | The name of the action, prefixed by the resource the action is acting upon. | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the action belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the action belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the action belongs to. | 
**resourceId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the resource that the action belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the action was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the action was last updated/modified (ISO_8601 format). | 
**description** | **kotlin.String** | An optional longer description of what this action respresents in your system |  [optional]



