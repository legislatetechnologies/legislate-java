# CollaboratorFieldsRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The unique email of the contract collaborator. Deprecated: Will be removed in v2.0.0 |  [optional]
**identityFields** | [**List&lt;CreateCollaboratorIdentityFieldV1DTO&gt;**](CreateCollaboratorIdentityFieldV1DTO.md) | The identity fields of the contract collaborator. | 
**inviterId** | **Long** | The unique Id of the user who is inviting the collaborator to the contract. | 
**role** | [**List&lt;RoleEnum&gt;**](#List&lt;RoleEnum&gt;) | The role of contract collaborator. | 
**side** | [**SideEnum**](#SideEnum) | The side of contract collaborator. | 
**signatoryId** | **Long** | The unique Id of the contract signatory who is going to sign the contract on behalf of the party / company. |  [optional]
**userId** | **Long** | The unique Id of the contract collaborator you are adding to the contract. | 

<a name="List<RoleEnum>"></a>
## Enum: List&lt;RoleEnum&gt;
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
