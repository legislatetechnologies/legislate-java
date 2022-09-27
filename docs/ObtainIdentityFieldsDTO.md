# ObtainIdentityFieldsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collaboratorId** | **Long** | The id of the collaborator  | 
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) | The role/s of the collaborator  | 
**side** | [**SideEnum**](#SideEnum) | The side of the collaborator  | 

<a name="List<RolesEnum>"></a>
## Enum: List&lt;RolesEnum&gt;
Name | Value
---- | -----
COLLABORATOR | &quot;collaborator&quot;
PARTY | &quot;party&quot;
PARTY_WITH_SIGNATORY | &quot;party_with_signatory&quot;
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
