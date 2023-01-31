
# DataSourceEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **kotlin.String** | Url source to query for data | 
**config** | [**kotlin.Any**](.md) | Suggested fetcher configuration (e.g. auth or method) to fetch data with |  [optional]
**topics** | **kotlin.collections.List&lt;kotlin.String&gt;** | topics the data applies to |  [optional]
**dstPath** | **kotlin.String** | OPA data api path to store the document at |  [optional]
**saveMethod** | **kotlin.String** | Method used to write into OPA - PUT/PATCH |  [optional]



