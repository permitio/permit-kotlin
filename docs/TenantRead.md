
# TenantRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A unique id by which Permit will identify the tenant. The tenant key must be url-friendly (slugified). | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the tenant | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the tenant belongs to. | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the project that the tenant belongs to. | 
**environmentId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the environment that the tenant belongs to. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the tenant was created (ISO_8601 format). | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the tenant was last updated/modified (ISO_8601 format). | 
**lastActionAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the tenant was last active (ISO_8601 format). In other words, this is the last time a permission check was done on a resource belonging to this tenant. | 
**name** | **kotlin.String** | A descriptive name for the tenant | 
**description** | **kotlin.String** | an optional longer description of the tenant |  [optional]
**attributes** | [**kotlin.Any**](.md) | Arbitraty tenant attributes that will be used to enforce attribute-based access control policies. |  [optional]



