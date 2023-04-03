
# BankTransactionRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The bank transaction rules hashed id |  [optional]
**companyId** | **kotlin.String** | The company hashed id |  [optional]
**userId** | **kotlin.String** | The user hashed id |  [optional]
**name** | **kotlin.String** | The name of the transaction |  [optional]
**rules** | [**kotlin.collections.List&lt;BTRules&gt;**](BTRules.md) | A mapped collection of the sub rules for the BankTransactionRule |  [optional]
**autoConvert** | **kotlin.Boolean** | Flags whether the rule converts the transaction automatically |  [optional]
**matchesOnAll** | **kotlin.Boolean** | Flags whether all subrules are required for the match |  [optional]
**appliesTo** | **kotlin.String** | Flags whether the rule applies to a CREDIT or DEBIT |  [optional]
**clientId** | **kotlin.String** | The client hashed id |  [optional]
**vendorId** | **kotlin.String** | The vendor hashed id |  [optional]
**categoryId** | **kotlin.String** | The category hashed id |  [optional]



