
# ResourceCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the resource (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the resource. | 
**name** | **kotlin.String** | The name of the resource | 
**actions** | [**kotlin.collections.Map&lt;kotlin.String, ActionBlockEditable&gt;**](ActionBlockEditable.md) |          A actions definition block, typically contained within a resource type definition block.         The actions represents the ways you can interact with a protected resource.          | 
**urn** | **kotlin.String** | The [URN](https://en.wikipedia.org/wiki/Uniform_Resource_Name) (Uniform Resource Name) of the resource |  [optional]
**description** | **kotlin.String** | An optional longer description of what this resource respresents in your system |  [optional]
**attributes** | [**kotlin.collections.Map&lt;kotlin.String, AttributeBlockEditable&gt;**](AttributeBlockEditable.md) | Attributes that each resource of this type defines, and can be used in your ABAC policies. |  [optional]



