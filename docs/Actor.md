
# Actor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  | 
**email** | **kotlin.String** | Email of the user controlling this account | 
**isOnboarding** | [**inline**](#IsOnboarding) |  | 
**onboardingStep** | [**inline**](#OnboardingStep) |  | 
**key** | **kotlin.String** |  | 
**orgId** | [**java.util.UUID**](java.util.UUID.md) |  | 
**projectId** | [**java.util.UUID**](java.util.UUID.md) |  | 
**envId** | [**java.util.UUID**](java.util.UUID.md) |  | 
**tenantId** | [**java.util.UUID**](java.util.UUID.md) |  | 
**objectType** | [**MemberAccessObj**](MemberAccessObj.md) |  | 
**ownerType** | [**APIKeyOwnerType**](APIKeyOwnerType.md) |  | 
**actorType** | [**inline**](#ActorType) |  |  [optional]
**name** | **kotlin.String** | Name of this user |  [optional]
**givenName** | **kotlin.String** | Given name of the user |  [optional]
**familyName** | **kotlin.String** | Family name of the user |  [optional]
**picture** | **kotlin.String** | URL to picture, photo, or avatar of the user that controls this account. |  [optional]


<a name="IsOnboarding"></a>
## Enum: is_onboarding
Name | Value
---- | -----
isOnboarding | false


<a name="OnboardingStep"></a>
## Enum: onboarding_step
Name | Value
---- | -----
onboardingStep | done


<a name="ActorType"></a>
## Enum: actor_type
Name | Value
---- | -----
actorType | api_key



