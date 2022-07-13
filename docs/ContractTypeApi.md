# ContractTypeApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContractTypePerTeamUsingGET**](ContractTypeApi.md#getContractTypePerTeamUsingGET) | **GET** /v1/teams/{teamId}/contract-types/{contractTypeId} | Get information relative a given contract type.
[**getContractTypeUsingGET**](ContractTypeApi.md#getContractTypeUsingGET) | **GET** /v1/contract-types/{contractTypeId} | Get contract type terms.
[**getContractTypesPerTeamUsingGET**](ContractTypeApi.md#getContractTypesPerTeamUsingGET) | **GET** /v1/teams/{teamId}/contract-types | Get contract types of a team
[**getContractTypesUsingGET**](ContractTypeApi.md#getContractTypesUsingGET) | **GET** /v1/contract-types | Get public contract types.

<a name="getContractTypePerTeamUsingGET"></a>
# **getContractTypePerTeamUsingGET**
> ContractTypeResponseDTO getContractTypePerTeamUsingGET(contractTypeId, teamId)

Get information relative a given contract type.

This operation will retrieve information about a given contract type and a team.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.ContractTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractTypeApi apiInstance = new ContractTypeApi();
Long contractTypeId = 789L; // Long | The unique Id of the contract type you'd like to look up contract template information from.
Long teamId = 789L; // Long | The unique Id of the team you wish to retrieve the contract type information from.
try {
    ContractTypeResponseDTO result = apiInstance.getContractTypePerTeamUsingGET(contractTypeId, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractTypeApi#getContractTypePerTeamUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractTypeId** | **Long**| The unique Id of the contract type you&#x27;d like to look up contract template information from. |
 **teamId** | **Long**| The unique Id of the team you wish to retrieve the contract type information from. |

### Return type

[**ContractTypeResponseDTO**](ContractTypeResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContractTypeUsingGET"></a>
# **getContractTypeUsingGET**
> ContractTypeResponseDTO getContractTypeUsingGET(contractTypeId)

Get contract type terms.

This operation will retrieve terms about a given contract type.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.ContractTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractTypeApi apiInstance = new ContractTypeApi();
Long contractTypeId = 789L; // Long | The unique Id of the contract type you'd like to look up contract template information from.
try {
    ContractTypeResponseDTO result = apiInstance.getContractTypeUsingGET(contractTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractTypeApi#getContractTypeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractTypeId** | **Long**| The unique Id of the contract type you&#x27;d like to look up contract template information from. |

### Return type

[**ContractTypeResponseDTO**](ContractTypeResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContractTypesPerTeamUsingGET"></a>
# **getContractTypesPerTeamUsingGET**
> List&lt;ContractTypeResponseDTO&gt; getContractTypesPerTeamUsingGET(teamId)

Get contract types of a team

This operation will retrieve information of every contract type relative a team.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.ContractTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractTypeApi apiInstance = new ContractTypeApi();
Long teamId = 789L; // Long | The unique Id of the team you wish to retrieve the contract type information from.
try {
    List<ContractTypeResponseDTO> result = apiInstance.getContractTypesPerTeamUsingGET(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractTypeApi#getContractTypesPerTeamUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| The unique Id of the team you wish to retrieve the contract type information from. |

### Return type

[**List&lt;ContractTypeResponseDTO&gt;**](ContractTypeResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContractTypesUsingGET"></a>
# **getContractTypesUsingGET**
> List&lt;ContractTypeResponseDTO&gt; getContractTypesUsingGET()

Get public contract types.

This operation will retrieve terms about a given contract type.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.ContractTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractTypeApi apiInstance = new ContractTypeApi();
try {
    List<ContractTypeResponseDTO> result = apiInstance.getContractTypesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractTypeApi#getContractTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ContractTypeResponseDTO&gt;**](ContractTypeResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

