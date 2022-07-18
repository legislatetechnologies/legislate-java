# CouponApi

All URIs are relative to https://api.legislate.tech

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmailCouponSubscritpionUsingGET**](CouponApi.md#getEmailCouponSubscritpionUsingGET) | **GET** /v1/email/coupon/{couponId}/register/{email} | Send an email with a coupon for new users.

<a name="getEmailCouponSubscritpionUsingGET"></a>
# **getEmailCouponSubscritpionUsingGET**
> getEmailCouponSubscritpionUsingGET(couponId, email)

Send an email with a coupon for new users.

### Example
```java
// Import classes:
//import com.legislate.ApiClient;
//import com.legislate.ApiException;
//import com.legislate.Configuration;
//import com.legislate.auth.*;
//import com.legislate.api.CouponApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: auth0_jwt
OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

CouponApi apiInstance = new CouponApi();
String couponId = "couponId_example"; // String | couponId
String email = "email_example"; // String | email
try {
    apiInstance.getEmailCouponSubscritpionUsingGET(couponId, email);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#getEmailCouponSubscritpionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponId** | **String**| couponId |
 **email** | **String**| email |

### Return type

null (empty response body)

### Authorization

[auth0_jwt](../README.md#auth0_jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

