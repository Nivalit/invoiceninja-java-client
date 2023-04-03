
# CompanyUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permissions** | **kotlin.String** | The company user permissions |  [optional]
**settings** | [**kotlin.Any**](.md) | Settings that are used for the frontend applications to store user preferences / metadata |  [optional]
**reactSettings** | [**kotlin.Any**](.md) | Dedicated settings object for the react web application |  [optional]
**isOwner** | **kotlin.Boolean** | Determines whether the user owns this company |  [optional]
**isAdmin** | **kotlin.Boolean** | Determines whether the user is the admin of this company |  [optional]
**isLocked** | **kotlin.Boolean** | Determines whether the users access to this company has been locked |  [optional]
**updatedAt** | **kotlin.Int** | The last time the record was modified, format Unix Timestamp |  [optional]
**deletedAt** | **kotlin.Int** | Timestamp when the user was archived, format Unix Timestamp |  [optional]
**account** | [**Account**](Account.md) |  |  [optional]
**company** | [**Company**](Company.md) |  |  [optional]
**user** | [**User**](User.md) |  |  [optional]
**token** | [**CompanyToken**](CompanyToken.md) |  |  [optional]



