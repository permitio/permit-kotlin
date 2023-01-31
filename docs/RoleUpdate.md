
# RoleUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the role |  [optional]
**description** | **kotlin.String** | optional description string explaining what this role represents, or what permissions are granted to it. |  [optional]
**permissions** | **kotlin.collections.List&lt;kotlin.String&gt;** | list of action keys that define what actions this resource role is permitted to do |  [optional]
**extends** | **kotlin.collections.List&lt;kotlin.String&gt;** | list of role keys that define what roles this role extends. In other words: this role will automatically inherit all the permissions of the given roles in this list. |  [optional]



