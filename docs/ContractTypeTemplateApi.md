# ContractTypeTemplateApi

All URIs are relative to https://api.legislate.tech

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTemplateUsingGET**](ContractTypeTemplateApi.md#getTemplateUsingGET) | **GET** /v1/teams/{teamId}/contract-types/{contractTypeId}/templates/{templateId} | Get contract template.
[**getTemplatesUsingGET**](ContractTypeTemplateApi.md#getTemplatesUsingGET) | **GET** /v1/teams/{teamId}/contract-types/{contractTypeId}/templates | Get the latest template version for a contract type

<a name="getTemplateUsingGET"></a>
# **getTemplateUsingGET**
> ContractResponseDTO getTemplateUsingGET(contractTypeId, teamId, templateId)

Get contract template.

This operation will retrieve details about a given contract.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.ContractTypeTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractTypeTemplateApi apiInstance = new ContractTypeTemplateApi();
Long contractTypeId = 789L; // Long | contractTypeId
Long teamId = 789L; // Long | teamId
Long templateId = 789L; // Long | templateId
try {
    ContractResponseDTO result = apiInstance.getTemplateUsingGET(contractTypeId, teamId, templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractTypeTemplateApi#getTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractTypeId** | **Long**| contractTypeId |
 **teamId** | **Long**| teamId |
 **templateId** | **Long**| templateId |

### Return type

[**ContractResponseDTO**](ContractResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplatesUsingGET"></a>
# **getTemplatesUsingGET**
> ContractResponseDTO getTemplatesUsingGET(contractTypeId, teamId)

Get the latest template version for a contract type

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.ContractTypeTemplateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractTypeTemplateApi apiInstance = new ContractTypeTemplateApi();
Long contractTypeId = 789L; // Long | contractTypeId
Long teamId = 789L; // Long | teamId
try {
    ContractResponseDTO result = apiInstance.getTemplatesUsingGET(contractTypeId, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractTypeTemplateApi#getTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractTypeId** | **Long**| contractTypeId |
 **teamId** | **Long**| teamId |

### Return type

[**ContractResponseDTO**](ContractResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

