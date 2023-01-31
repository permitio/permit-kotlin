
# InviteRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **kotlin.String** | The invited member&#39;s email address | 
**role** | **kotlin.String** | The role the member will be assigned with | 
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the invite | 
**organizationId** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the organization that the invite belongs to. | 
**inviteCode** | [**java.util.UUID**](java.util.UUID.md) | The invite code that is sent to the member&#39;s email | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the invite was created (ISO_8601 format). | 
**status** | [**InviteStatus**](InviteStatus.md) | The status of the invite (pending, failed, etc) | 
**failedReason** | **kotlin.String** | if failed, the reason the invitation failed |  [optional]



