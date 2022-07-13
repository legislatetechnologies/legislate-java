# ContractCollaboratorResponseDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_links** | [**Links**](Links.md) |  |  [optional]
**collaboratorName** | **String** |  |  [optional]
**contractId** | **Long** |  |  [optional]
**email** | **String** |  |  [optional]
**fields** | [**List&lt;FieldDTO&gt;**](FieldDTO.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) |  |  [optional]
**side** | [**SideEnum**](#SideEnum) |  |  [optional]
**userId** | **Long** |  |  [optional]

<a name="List<RolesEnum>"></a>
## Enum: List&lt;RolesEnum&gt;
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
