# TeamsApi

All URIs are relative to *//localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTeamUsingGET**](TeamsApi.md#getTeamUsingGET) | **GET** /v1/teams/{teamId} | Get team details.
[**getTeamsUsingGET**](TeamsApi.md#getTeamsUsingGET) | **GET** /v1/users/{userId}/teams | Get teams.
[**postTeamUsingPOST**](TeamsApi.md#postTeamUsingPOST) | **POST** /v1/users/{userId}/teams | Create a team for a given user.
[**updateTeamUsingPATCH**](TeamsApi.md#updateTeamUsingPATCH) | **PATCH** /v1/teams/{teamId} | Updates a team.

<a name="getTeamUsingGET"></a>
# **getTeamUsingGET**
> TeamResponseDTO getTeamUsingGET(teamId)

Get team details.

This operation will retrieve details about a given team.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
Long teamId = 789L; // Long | teamId
try {
    TeamResponseDTO result = apiInstance.getTeamUsingGET(teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getTeamUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Long**| teamId |

### Return type

[**TeamResponseDTO**](TeamResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeamsUsingGET"></a>
# **getTeamsUsingGET**
> List&lt;TeamResponseDTO&gt; getTeamsUsingGET(userId)

Get teams.

This operation will retrieve all teams for a given user.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
Long userId = 789L; // Long | The unique Id of the user you'd whose teams you'd like to query.
try {
    List<TeamResponseDTO> result = apiInstance.getTeamsUsingGET(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#getTeamsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The unique Id of the user you&#x27;d whose teams you&#x27;d like to query. |

### Return type

[**List&lt;TeamResponseDTO&gt;**](TeamResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTeamUsingPOST"></a>
# **postTeamUsingPOST**
> TeamResponseDTO postTeamUsingPOST(body, userId)

Create a team for a given user.

This operation will create a team for a given user.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
CreateTeamRequestDTO body = new CreateTeamRequestDTO(); // CreateTeamRequestDTO | createTeamRequest
Long userId = 789L; // Long | The unique Id of the user for whom you'd like to create a team.
try {
    TeamResponseDTO result = apiInstance.postTeamUsingPOST(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#postTeamUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTeamRequestDTO**](CreateTeamRequestDTO.md)| createTeamRequest |
 **userId** | **Long**| The unique Id of the user for whom you&#x27;d like to create a team. |

### Return type

[**TeamResponseDTO**](TeamResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTeamUsingPATCH"></a>
# **updateTeamUsingPATCH**
> TeamResponseDTO updateTeamUsingPATCH(body, teamId)

Updates a team.

This operation will update a team details.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.TeamsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

TeamsApi apiInstance = new TeamsApi();
UpdateTeamRequestDTO body = new UpdateTeamRequestDTO(); // UpdateTeamRequestDTO | updateTeamRquest
Long teamId = 789L; // Long | The unique Id of the team you'd like to update.
try {
    TeamResponseDTO result = apiInstance.updateTeamUsingPATCH(body, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#updateTeamUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateTeamRequestDTO**](UpdateTeamRequestDTO.md)| updateTeamRquest |
 **teamId** | **Long**| The unique Id of the team you&#x27;d like to update. |

### Return type

[**TeamResponseDTO**](TeamResponseDTO.md)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

