
# RoleRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the role | 
**key** | **kotlin.String** | A URL-friendly name of the role (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the role. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the role | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the role belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the role belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the role belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the role was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the role was last updated/modified (ISO_8601 format). | 
**description** | **kotlin.String** | optional description string explaining what this role represents, or what permissions are granted to it. |  [optional]
**permissions** | **kotlin.collections.List&lt;kotlin.String&gt;** | list of action keys that define what actions this resource role is permitted to do |  [optional]
**extends** | **kotlin.collections.List&lt;kotlin.String&gt;** | list of role keys that define what roles this role extends. In other words: this role will automatically inherit all the permissions of the given roles in this list. |  [optional]



