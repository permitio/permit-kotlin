
# ResourceAttributeRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**AttributeType**](AttributeType.md) | The type of the attribute, we currently support: &#x60;bool&#x60;, &#x60;number&#x60; (ints, floats), &#x60;time&#x60; (a timestamp), &#x60;string&#x60;, and &#x60;json&#x60;. | 
**key** | **kotlin.String** | A URL-friendly name of the attribute (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the attribute. | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the attribute | 
**resourceId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the resource that the attribute belongs to. | 
**resourceKey** | **kotlin.String** | A URL-friendly name of the resource (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the resource. | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the attribute belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the attribute belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the attribute belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the attribute was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the attribute was last updated/modified (ISO_8601 format). | 
**description** | **kotlin.String** | An optional longer description of what this attribute respresents in your system |  [optional]



