
# AuthnMeMemberRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  | 
**email** | **kotlin.String** | Email of the user controlling this account | 
**isOnboarding** | **kotlin.Boolean** |  | 
**onboardingStep** | [**OnboardingStep**](OnboardingStep.md) |  | 
**actorType** | [**inline**](#ActorType) |  |  [optional]
**name** | **kotlin.String** | Name of this user |  [optional]
**givenName** | **kotlin.String** | Given name of the user |  [optional]
**familyName** | **kotlin.String** | Family name of the user |  [optional]
**picture** | **kotlin.String** | URL to picture, photo, or avatar of the user that controls this account. |  [optional]


<a name="ActorType"></a>
## Enum: actor_type
Name | Value
---- | -----
actorType | member



