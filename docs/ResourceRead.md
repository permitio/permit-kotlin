
# ResourceRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the resource (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the resource. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the resource | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the resource belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the resource belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the resource belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the resource was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the resource was last updated/modified (ISO_8601 format). | 
**name** | **kotlin.String** | The name of the resource | 
**urn** | **kotlin.String** | The [URN](https://en.wikipedia.org/wiki/Uniform_Resource_Name) (Uniform Resource Name) of the resource |  [optional]
**description** | **kotlin.String** | An optional longer description of what this resource respresents in your system |  [optional]
**actions** | [**kotlin.collections.Map&lt;kotlin.String, ActionBlockRead&gt;**](ActionBlockRead.md) |          A actions definition block, typically contained within a resource type definition block.         The actions represents the ways you can interact with a protected resource.          |  [optional]
**attributes** | [**kotlin.collections.Map&lt;kotlin.String, AttributeBlockRead&gt;**](AttributeBlockRead.md) | Attributes that each resource of this type defines, and can be used in your ABAC policies. |  [optional]



