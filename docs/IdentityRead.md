
# IdentityRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **kotlin.String** | Unique User Id of this identity in the identity provider (including the provider type) | 
**provider** | **kotlin.String** | The identity provider type this identity came from | 
**sub** | **kotlin.String** | Unique User Id of this identity in the identity provider (NOT including the provider type) | 
**email** | **kotlin.String** | Email connected to this account identity | 
**emailVerified** | **kotlin.Boolean** | Whether this email address connected to this account identity is verified or not. For social providers like &#39;Login with Google&#39; this is done automatically, otherwise we will send the user a verification link in email. | 
**auth0Info** | [**kotlin.Any**](.md) | Raw user info json coming from our identity provider and matching a specific account identity | 



