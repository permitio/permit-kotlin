
# ProjectCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the project (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the project. | 
**name** | **kotlin.String** | The name of the project | 
**urnNamespace** | **kotlin.String** | Optional namespace for URNs. If empty, URNs will be generated from project key. |  [optional]
**description** | **kotlin.String** | a longer description outlining the project objectives |  [optional]
**settings** | [**kotlin.Any**](.md) | the settings for this project |  [optional]
**activePolicyRepoId** | [**java.util.UUID**](java.util.UUID.md) | the id of the policy repo to use for this project |  [optional]



