# UsersApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserUsingPOST**](UsersApi.md#createUserUsingPOST) | **POST** /v1/users | Create a user
[**getUserUsingGET**](UsersApi.md#getUserUsingGET) | **GET** /v1/users/{userId} | Get user details.
[**getUsersUsingGET**](UsersApi.md#getUsersUsingGET) | **GET** /v1/users | Get all users.

<a name="createUserUsingPOST"></a>
# **createUserUsingPOST**
> Link createUserUsingPOST(body)

Create a user

This operation will create a user

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
CreateUserRequestDTO body = new CreateUserRequestDTO(); // CreateUserRequestDTO | createUserRequestDTO
try {
    Link result = apiInstance.createUserUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUserRequestDTO**](CreateUserRequestDTO.md)| createUserRequestDTO |

### Return type

[**Link**](Link.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> UserResponseDTO getUserUsingGET(userId)

Get user details.

This operation will retrieve details about a given user.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | The unique Id of the user you'd like to look up.
try {
    UserResponseDTO result = apiInstance.getUserUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The unique Id of the user you&#x27;d like to look up. |

### Return type

[**UserResponseDTO**](UserResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> List&lt;Object&gt; getUsersUsingGET()

Get all users.

This operation will retrieve all users.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
try {
    List<Object> result = apiInstance.getUsersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

