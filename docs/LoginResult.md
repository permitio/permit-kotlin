
# LoginResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loggedIn** | **kotlin.Boolean** | whether login was successful | 
**expiresAt** | **kotlin.Int** | when will the login session expire (the unix timestamp in seconds) | 
**activeOrgId** | [**java.util.UUID**](java.util.UUID.md) | the active organization on the session after the login |  [optional]
**inviteAttempt** | [**InviteAttemptResult**](InviteAttemptResult.md) |  |  [optional]



