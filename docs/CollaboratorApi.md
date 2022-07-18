# CollaboratorApi

All URIs are relative to https://api.legislate.tech

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCollaboratorUsingDELETE**](CollaboratorApi.md#deleteCollaboratorUsingDELETE) | **DELETE** /v1/collaborators/{collaboratorId} | Delete a Collaborator by its id.
[**getCollaboratorIdentityFieldsUsingGET**](CollaboratorApi.md#getCollaboratorIdentityFieldsUsingGET) | **GET** /v1/templates/{idTemplate}/fields | Get Identity fields
[**getCollaboratorUsingGET**](CollaboratorApi.md#getCollaboratorUsingGET) | **GET** /v1/collaborators/{collaboratorId} | Get contract collaborator details
[**getCollaboratorsUsingGET**](CollaboratorApi.md#getCollaboratorsUsingGET) | **GET** /v1/contracts/{contractId}/collaborators | Get collaborators for a given contract
[**postCollaboratorUsingPOST**](CollaboratorApi.md#postCollaboratorUsingPOST) | **POST** /v1/contracts/{contractId}/collaborators | Create a collaborator given a contract
[**postCompanyUsingPOST**](CollaboratorApi.md#postCompanyUsingPOST) | **POST** /v1/contracts/{contractId}/company | Create a company given a contract
[**updateCollaboratorBinaryFileSignatureUsingPATCH**](CollaboratorApi.md#updateCollaboratorBinaryFileSignatureUsingPATCH) | **PATCH** /v1/collaborators/{collaboratorId}/signature | Upload a signature to a collaborator
[**updateCollaboratorFieldsUsingPATCH**](CollaboratorApi.md#updateCollaboratorFieldsUsingPATCH) | **PATCH** /v1/collaborators/{collaboratorId}/fields | Update collaborator fields
[**updateCollaboratorRolesUsingPATCH**](CollaboratorApi.md#updateCollaboratorRolesUsingPATCH) | **PATCH** /v1/collaborators/{collaboratorId}/roles | Update collaborator role
[**updateCollaboratorSignatureUsingPATCH**](CollaboratorApi.md#updateCollaboratorSignatureUsingPATCH) | **PATCH** /v1/collaborators/{collaboratorId}/user-signature | Upload a signature to a collaborator

<a name="deleteCollaboratorUsingDELETE"></a>
# **deleteCollaboratorUsingDELETE**
> deleteCollaboratorUsingDELETE(collaboratorId)

Delete a Collaborator by its id.

This operation will delete a Collaborator by its id.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator you'd like to delete.
try {
    apiInstance.deleteCollaboratorUsingDELETE(collaboratorId);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#deleteCollaboratorUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collaboratorId** | **Long**| The unique Id of the contract collaborator you&#x27;d like to delete. |

### Return type

null (empty response body)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCollaboratorIdentityFieldsUsingGET"></a>
# **getCollaboratorIdentityFieldsUsingGET**
> List&lt;IdentityFieldsCollaboratorRoleDTO&gt; getCollaboratorIdentityFieldsUsingGET(idTemplate, roles, side)

Get Identity fields

This operation will retrieve the fields need to be filled due to a side and a list of roles.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
Long idTemplate = 789L; // Long | The unique Id of the template of the contract which is associated with the collaborator.
List<String> roles = Arrays.asList("roles_example"); // List<String> | The role of the contract collaborator.
String side = "side_example"; // String | The sde of the contract collaborator.
try {
    List<IdentityFieldsCollaboratorRoleDTO> result = apiInstance.getCollaboratorIdentityFieldsUsingGET(idTemplate, roles, side);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#getCollaboratorIdentityFieldsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idTemplate** | **Long**| The unique Id of the template of the contract which is associated with the collaborator. |
 **roles** | [**List&lt;String&gt;**](String.md)| The role of the contract collaborator. | [enum: collaborator, party, party_with_signatory, signatory, supp_sig, witness]
 **side** | **String**| The sde of the contract collaborator. | [enum: both, first, second]

### Return type

[**List&lt;IdentityFieldsCollaboratorRoleDTO&gt;**](IdentityFieldsCollaboratorRoleDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCollaboratorUsingGET"></a>
# **getCollaboratorUsingGET**
> ContractCollaboratorResponseDTO getCollaboratorUsingGET(collaboratorId)

Get contract collaborator details

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator you'd like to look up.
try {
    ContractCollaboratorResponseDTO result = apiInstance.getCollaboratorUsingGET(collaboratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#getCollaboratorUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collaboratorId** | **Long**| The unique Id of the contract collaborator you&#x27;d like to look up. |

### Return type

[**ContractCollaboratorResponseDTO**](ContractCollaboratorResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCollaboratorsUsingGET"></a>
# **getCollaboratorsUsingGET**
> List&lt;ContractCollaboratorResponseDTO&gt; getCollaboratorsUsingGET(contractId)

Get collaborators for a given contract

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
Long contractId = 789L; // Long | The unique Id of the contract associated with the collaborator you'd like to look up.
try {
    List<ContractCollaboratorResponseDTO> result = apiInstance.getCollaboratorsUsingGET(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#getCollaboratorsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **Long**| The unique Id of the contract associated with the collaborator you&#x27;d like to look up. |

### Return type

[**List&lt;ContractCollaboratorResponseDTO&gt;**](ContractCollaboratorResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCollaboratorUsingPOST"></a>
# **postCollaboratorUsingPOST**
> Link postCollaboratorUsingPOST(body, contractId)

Create a collaborator given a contract

This operation will create a collaborator associated to the contract given

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
CollaboratorFieldsRequestDTO body = new CollaboratorFieldsRequestDTO(); // CollaboratorFieldsRequestDTO | createCollaboratorRequestDTO
Long contractId = 789L; // Long | The unique Id of the contract associated with the collaborator you'd like to look up.
try {
    Link result = apiInstance.postCollaboratorUsingPOST(body, contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#postCollaboratorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CollaboratorFieldsRequestDTO**](CollaboratorFieldsRequestDTO.md)| createCollaboratorRequestDTO |
 **contractId** | **Long**| The unique Id of the contract associated with the collaborator you&#x27;d like to look up. |

### Return type

[**Link**](Link.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCompanyUsingPOST"></a>
# **postCompanyUsingPOST**
> CompanyCreatedResponseDTO postCompanyUsingPOST(body, contractId)

Create a company given a contract

This operation will create a company associated to the contract given

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
CompanyFieldsDTO body = new CompanyFieldsDTO(); // CompanyFieldsDTO | companyFieldsDTORequest
Long contractId = 789L; // Long | The unique Id of the contract configuration.
try {
    CompanyCreatedResponseDTO result = apiInstance.postCompanyUsingPOST(body, contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#postCompanyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CompanyFieldsDTO**](CompanyFieldsDTO.md)| companyFieldsDTORequest |
 **contractId** | **Long**| The unique Id of the contract configuration. |

### Return type

[**CompanyCreatedResponseDTO**](CompanyCreatedResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollaboratorBinaryFileSignatureUsingPATCH"></a>
# **updateCollaboratorBinaryFileSignatureUsingPATCH**
> ContractCollaboratorResponseDTO updateCollaboratorBinaryFileSignatureUsingPATCH(collaboratorId)

Upload a signature to a collaborator

This operation will sign a contract.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator who is signing.
try {
    ContractCollaboratorResponseDTO result = apiInstance.updateCollaboratorBinaryFileSignatureUsingPATCH(collaboratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#updateCollaboratorBinaryFileSignatureUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collaboratorId** | **Long**| The unique Id of the contract collaborator who is signing. |

### Return type

[**ContractCollaboratorResponseDTO**](ContractCollaboratorResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateCollaboratorFieldsUsingPATCH"></a>
# **updateCollaboratorFieldsUsingPATCH**
> ContractCollaboratorResponseDTO updateCollaboratorFieldsUsingPATCH(body, collaboratorId)

Update collaborator fields

This operation will update a collaborator details.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
UpdateCollaboratorIdentityFieldsRequestDTO body = new UpdateCollaboratorIdentityFieldsRequestDTO(); // UpdateCollaboratorIdentityFieldsRequestDTO | fields
Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator you'd like to update.
try {
    ContractCollaboratorResponseDTO result = apiInstance.updateCollaboratorFieldsUsingPATCH(body, collaboratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#updateCollaboratorFieldsUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateCollaboratorIdentityFieldsRequestDTO**](UpdateCollaboratorIdentityFieldsRequestDTO.md)| fields |
 **collaboratorId** | **Long**| The unique Id of the contract collaborator you&#x27;d like to update. |

### Return type

[**ContractCollaboratorResponseDTO**](ContractCollaboratorResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollaboratorRolesUsingPATCH"></a>
# **updateCollaboratorRolesUsingPATCH**
> ContractCollaboratorResponseDTO updateCollaboratorRolesUsingPATCH(body, collaboratorId)

Update collaborator role

This operation will update a collaborator fields.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
UpdateFieldsCollaboratorDTO body = new UpdateFieldsCollaboratorDTO(); // UpdateFieldsCollaboratorDTO | fields
Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator who is signing.
try {
    ContractCollaboratorResponseDTO result = apiInstance.updateCollaboratorRolesUsingPATCH(body, collaboratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#updateCollaboratorRolesUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateFieldsCollaboratorDTO**](UpdateFieldsCollaboratorDTO.md)| fields |
 **collaboratorId** | **Long**| The unique Id of the contract collaborator who is signing. |

### Return type

[**ContractCollaboratorResponseDTO**](ContractCollaboratorResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollaboratorSignatureUsingPATCH"></a>
# **updateCollaboratorSignatureUsingPATCH**
> ContractCollaboratorResponseDTO updateCollaboratorSignatureUsingPATCH(collaboratorId)

Upload a signature to a collaborator

This operation will sign a contract.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CollaboratorApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CollaboratorApi apiInstance = new CollaboratorApi();
Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator who is signing.
try {
    ContractCollaboratorResponseDTO result = apiInstance.updateCollaboratorSignatureUsingPATCH(collaboratorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorApi#updateCollaboratorSignatureUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collaboratorId** | **Long**| The unique Id of the contract collaborator who is signing. |

### Return type

[**ContractCollaboratorResponseDTO**](ContractCollaboratorResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

