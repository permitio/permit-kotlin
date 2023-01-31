
# PolicyRepoCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | A URL-friendly name of the policy repo (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the policy repo. | 
**url** | **kotlin.String** |  | 
**credentials** | [**SSHAuthData**](SSHAuthData.md) |  | 
**mainBranchName** | **kotlin.String** |  |  [optional]
**activateWhenValidated** | **kotlin.Boolean** | if you want to change your policy repository to this repo right after it is validated |  [optional]



