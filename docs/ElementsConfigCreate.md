
# ElementsConfigCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the elements_config (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the elements_config. | 
**name** | **kotlin.String** | The name of the elements_config | 
**elementsType** | [**ElementsType**](ElementsType.md) | The type of the elements interface, e.g: user management | 
**settings** | [**kotlin.collections.Map&lt;kotlin.String, Settings&gt;**](Settings.md) | Obj with the options of the elements interface, e.g: primary color | 
**rolesToLevels** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;kotlin.String&gt;&gt;** | Obj with levels as keys and role ids as values | 
**webhook** | [**WebhookCreate**](WebhookCreate.md) |  |  [optional]



