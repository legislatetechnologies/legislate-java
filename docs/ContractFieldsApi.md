# ContractFieldsApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTemplateTermUsingGET**](ContractFieldsApi.md#getTemplateTermUsingGET) | **GET** /v1/terms/{termId} | Get template term.
[**getTemplateTermsUsingGET**](ContractFieldsApi.md#getTemplateTermsUsingGET) | **GET** /v1/templates/{templateId}/terms | Get template terms.

<a name="getTemplateTermUsingGET"></a>
# **getTemplateTermUsingGET**
> ContractFieldResponseDTO getTemplateTermUsingGET(termId)

Get template term.

This operation will retrieve terms about a given template.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.ContractFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractFieldsApi apiInstance = new ContractFieldsApi();
Long termId = 789L; // Long | The unique Id of the field you'd like to look up.
try {
    ContractFieldResponseDTO result = apiInstance.getTemplateTermUsingGET(termId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractFieldsApi#getTemplateTermUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **termId** | **Long**| The unique Id of the field you&#x27;d like to look up. |

### Return type

[**ContractFieldResponseDTO**](ContractFieldResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplateTermsUsingGET"></a>
# **getTemplateTermsUsingGET**
> List&lt;ContractFieldResponseDTO&gt; getTemplateTermsUsingGET(templateId)

Get template terms.

This operation will retrieve terms about a given template.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.ContractFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

ContractFieldsApi apiInstance = new ContractFieldsApi();
Long templateId = 789L; // Long | The unique Id of the team you'd like to retrieve the available contract types from.
try {
    List<ContractFieldResponseDTO> result = apiInstance.getTemplateTermsUsingGET(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractFieldsApi#getTemplateTermsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **Long**| The unique Id of the team you&#x27;d like to retrieve the available contract types from. |

### Return type

[**List&lt;ContractFieldResponseDTO&gt;**](ContractFieldResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

