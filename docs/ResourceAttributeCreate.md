
# ResourceAttributeCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the attribute (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the attribute. | 
**type** | [**AttributeType**](AttributeType.md) | The type of the attribute, we currently support: &#x60;bool&#x60;, &#x60;number&#x60; (ints, floats), &#x60;time&#x60; (a timestamp), &#x60;string&#x60;, and &#x60;json&#x60;. | 
**description** | **kotlin.String** | An optional longer description of what this attribute respresents in your system |  [optional]



