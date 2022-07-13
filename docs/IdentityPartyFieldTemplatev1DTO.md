# IdentityPartyFieldTemplatev1DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**identityFieldId** | **Long** |  |  [optional]
**index** | **Long** |  |  [optional]
**label** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**options** | [**List&lt;IdentityFieldOptionDTO&gt;**](IdentityFieldOptionDTO.md) |  |  [optional]
**parentOption** | **String** |  |  [optional]
**required** | **Boolean** |  |  [optional]
**rolesVisibilityList** | [**List&lt;RoleVisibilityDTO&gt;**](RoleVisibilityDTO.md) |  |  [optional]
**side** | [**SideEnum**](#SideEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**validationType** | **String** |  |  [optional]
**value** | **String** |  |  [optional]
**valueType** | **String** |  |  [optional]

<a name="SideEnum"></a>
## Enum: SideEnum
Name | Value
---- | -----
BOTH | &quot;both&quot;
FIRST | &quot;first&quot;
SECOND | &quot;second&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ADDRESS | &quot;address&quot;
CURRENCY | &quot;currency&quot;
DATE | &quot;date&quot;
DISTANCE | &quot;distance&quot;
DURATION | &quot;duration&quot;
DURATION_PLAIN | &quot;duration_plain&quot;
INPUT | &quot;input&quot;
RADIO | &quot;radio&quot;
SELECT | &quot;select&quot;
UPLOAD | &quot;upload&quot;
