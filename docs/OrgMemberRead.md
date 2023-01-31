
# OrgMemberRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) | Unique id of the account member | 
**email** | **kotlin.String** | Email of the user controlling this account | 
**emailVerified** | **kotlin.Boolean** | Whether this email address is verified or not. For social providers like &#39;Login with Google&#39; this is done automatically, otherwise we will send the user a verification link in email. | 
**isSuperuser** | **kotlin.Boolean** | Whether or not this user has special access to permit.io organizations | 
**isOnboarding** | **kotlin.Boolean** | Whether or not this user is currently onboarding, needs to be replaced by a user journey object | 
**onboardingStep** | [**OnboardingStep**](OnboardingStep.md) | the step the user is currently going through in onboarding | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the account member was created (ISO_8601 format). | 
**identities** | [**kotlin.collections.List&lt;IdentityRead&gt;**](IdentityRead.md) |  | 
**settings** | [**kotlin.Any**](.md) | Custom permit.io dashboard settings, such as preferred theme, etc. | 
**name** | **kotlin.String** | Name of this user |  [optional]
**givenName** | **kotlin.String** | First name of the user |  [optional]
**familyName** | **kotlin.String** | Last name of the user |  [optional]
**picture** | **kotlin.String** | URL to picture, photo, or avatar of the user that controls this account. |  [optional]
**lastLogin** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Last date and time this user logged in (ISO_8601 format). |  [optional]
**lastIp** | **kotlin.String** | Last IP address from which this user logged in. |  [optional]
**loginsCount** | **kotlin.Int** | Total number of logins this user has performed. |  [optional]



