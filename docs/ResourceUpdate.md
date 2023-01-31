
# ResourceUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the resource |  [optional]
**urn** | **kotlin.String** | The [URN](https://en.wikipedia.org/wiki/Uniform_Resource_Name) (Uniform Resource Name) of the resource |  [optional]
**description** | **kotlin.String** | An optional longer description of what this resource respresents in your system |  [optional]
**actions** | [**kotlin.collections.Map&lt;kotlin.String, ActionBlockEditable&gt;**](ActionBlockEditable.md) |          A actions definition block, typically contained within a resource type definition block.         The actions represents the ways you can interact with a protected resource.          |  [optional]
**attributes** | [**kotlin.collections.Map&lt;kotlin.String, AttributeBlockEditable&gt;**](AttributeBlockEditable.md) | Attributes that each resource of this type defines, and can be used in your ABAC policies. |  [optional]



