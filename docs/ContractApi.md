# ContractApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteContractUsingDELETE**](ContractApi.md#deleteContractUsingDELETE) | **DELETE** /v1/contracts/{contractId} | Deletes a contract by its id.
[**getContractFileUsingGET**](ContractApi.md#getContractFileUsingGET) | **GET** /v1/contracts/{contractId}/pdf | Get contract pdf
[**getContractHtmlUsingGET**](ContractApi.md#getContractHtmlUsingGET) | **GET** /v1/contracts/{contractId}/html | Get contract html
[**getContractUsingGET**](ContractApi.md#getContractUsingGET) | **GET** /v1/contracts/{contractId} | Get contract details.
[**getContractsUsingGET**](ContractApi.md#getContractsUsingGET) | **GET** /v1/teams/{teamId}/contracts | Get contracts in a team
[**postContractUsingPOST**](ContractApi.md#postContractUsingPOST) | **POST** /v1/teams/{teamId}/contracts | Create a contract with an auto-generated bundle.
[**updateContractUsingPATCH**](ContractApi.md#updateContractUsingPATCH) | **PATCH** /v1/contracts/{contractId} | Updates a contract.

<a name="deleteContractUsingDELETE"></a>
# **deleteContractUsingDELETE**
> CollaboratorResponseDTO deleteContractUsingDELETE(contractId)

Deletes a contract by its id.

This operation will delete a contract by its id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractApi apiInstance = new ContractApi();
Long contractId = 789L; // Long | The unique Id of the contract you'd like to delete.
try {
    CollaboratorResponseDTO result = apiInstance.deleteContractUsingDELETE(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractApi#deleteContractUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **Long**| The unique Id of the contract you&#x27;d like to delete. |

### Return type

[**CollaboratorResponseDTO**](CollaboratorResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContractFileUsingGET"></a>
# **getContractFileUsingGET**
> byte[] getContractFileUsingGET(contractId)

Get contract pdf

Generate the pdf of a contract

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractApi apiInstance = new ContractApi();
Long contractId = 789L; // Long | The unique Id of the contract you'd like to generate a pdf for.
try {
    byte[] result = apiInstance.getContractFileUsingGET(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractApi#getContractFileUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **Long**| The unique Id of the contract you&#x27;d like to generate a pdf for. |

### Return type

**byte[]**

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="getContractHtmlUsingGET"></a>
# **getContractHtmlUsingGET**
> String getContractHtmlUsingGET(contractId)

Get contract html

Generate the html of a contract

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractApi apiInstance = new ContractApi();
Long contractId = 789L; // Long | The unique Id of the contract you'd like to generate a html for.
try {
    String result = apiInstance.getContractHtmlUsingGET(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractApi#getContractHtmlUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **Long**| The unique Id of the contract you&#x27;d like to generate a html for. |

### Return type

**String**

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, text/html

<a name="getContractUsingGET"></a>
# **getContractUsingGET**
> ContractResponseDTO getContractUsingGET(contractId)

Get contract details.

This operation will retrieve details about a given contract.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractApi apiInstance = new ContractApi();
Long contractId = 789L; // Long | The unique Id of the contract configuration you'd like to look up.
try {
    ContractResponseDTO result = apiInstance.getContractUsingGET(contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractApi#getContractUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **Long**| The unique Id of the contract configuration you&#x27;d like to look up. |

### Return type

[**ContractResponseDTO**](ContractResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContractsUsingGET"></a>
# **getContractsUsingGET**
> List&lt;ContractResponseDTO&gt; getContractsUsingGET(teamId)

Get contracts in a team

Fetch all the contracts which are part of a team

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractApi apiInstance = new ContractApi();
Long teamId = 789L; // Long | The unique Id of the team you'd like to search the contracts.
try {
    List<ContractResponseDTO> result = apiInstance.getContractsUsingGET(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractApi#getContractsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| The unique Id of the team you&#x27;d like to search the contracts. |

### Return type

[**List&lt;ContractResponseDTO&gt;**](ContractResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postContractUsingPOST"></a>
# **postContractUsingPOST**
> Link postContractUsingPOST(body, teamId)

Create a contract with an auto-generated bundle.

This operation will create a contract inside an automatically generated bundle.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractApi apiInstance = new ContractApi();
CreateContractRequestDTO body = new CreateContractRequestDTO(); // CreateContractRequestDTO | createContractRequest
Long teamId = 789L; // Long | The unique Id of the team where the contract will be located.
try {
    Link result = apiInstance.postContractUsingPOST(body, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractApi#postContractUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateContractRequestDTO**](CreateContractRequestDTO.md)| createContractRequest |
 **teamId** | **Long**| The unique Id of the team where the contract will be located. |

### Return type

[**Link**](Link.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContractUsingPATCH"></a>
# **updateContractUsingPATCH**
> ContractResponseDTO updateContractUsingPATCH(body, contractId)

Updates a contract.

This operation will update a contract details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContractApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractApi apiInstance = new ContractApi();
UpdateContractRequestDTO body = new UpdateContractRequestDTO(); // UpdateContractRequestDTO | fields
Long contractId = 789L; // Long | The unique Id of the contract you'd like to update.
try {
    ContractResponseDTO result = apiInstance.updateContractUsingPATCH(body, contractId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractApi#updateContractUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateContractRequestDTO**](UpdateContractRequestDTO.md)| fields |
 **contractId** | **Long**| The unique Id of the contract you&#x27;d like to update. |

### Return type

[**ContractResponseDTO**](ContractResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

