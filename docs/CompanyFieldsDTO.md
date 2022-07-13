# CompanyFieldsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**RegisteredOfficeAddressDTO**](RegisteredOfficeAddressDTO.md) |  |  [optional]
**companyName** | **String** |  |  [optional]
**companyNumber** | **String** |  |  [optional]
**contractConfigurationId** | **Long** |  |  [optional]
**createdBy** | **Long** |  |  [optional]
**id** | **Long** |  |  [optional]
**registeredOfficeAddress** | [**RegisteredOfficeAddressDTO**](RegisteredOfficeAddressDTO.md) |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**side** | [**SideEnum**](#SideEnum) |  |  [optional]
**signatoryRelatedCompany** | **Long** |  |  [optional]

<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
COLLABORATOR | &quot;collaborator&quot;
PARTY | &quot;party&quot;
SIGNATORY | &quot;signatory&quot;
SUPP_SIG | &quot;supp_sig&quot;
WITNESS | &quot;witness&quot;

<a name="SideEnum"></a>
## Enum: SideEnum
Name | Value
---- | -----
BOTH | &quot;both&quot;
FIRST | &quot;first&quot;
SECOND | &quot;second&quot;
