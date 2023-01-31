
# ElementsConfigRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the elements_config (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the elements_config. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the elements_config | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the elements_config belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the elements_config belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the elements_config belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the elements_config was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the elements_config was last updated/modified (ISO_8601 format). | 
**isActive** | **kotlin.Boolean** |  | 
**name** | **kotlin.String** | The name of the elements_config | 
**elementsType** | [**ElementsType**](ElementsType.md) | The type of the elements interface, e.g: user management | 
**settings** | [**kotlin.collections.Map&lt;kotlin.String, Settings&gt;**](Settings.md) | Obj with the options of the elements interface, e.g: primary color | 
**rolesToLevels** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;PermissionLevelRoleRead&gt;&gt;** | Obj with levels as keys and role ids as values | 
**webhook** | [**WebhookRead**](WebhookRead.md) |  |  [optional]



