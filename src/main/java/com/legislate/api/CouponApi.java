/*
 * Legislate API
 * The Legislate API is organized around REST. Our API has predictable resource-oriented URLs, accepts form-encoded request bodies, returns JSON-encoded responses, and uses standard HTTP response codes, authentication, and verbs.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.legislate.api;

import com.legislate.ApiCallback;
import com.legislate.ApiClient;
import com.legislate.ApiException;
import com.legislate.ApiResponse;
import com.legislate.Configuration;
import com.legislate.Pair;
import com.legislate.ProgressRequestBody;
import com.legislate.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CouponApi {
    private ApiClient apiClient;

    public CouponApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CouponApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEmailCouponSubscritpionUsingGET
     * @param couponId couponId (required)
     * @param email email (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEmailCouponSubscritpionUsingGETCall(String couponId, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/email/coupon/{couponId}/register/{email}"
            .replaceAll("\\{" + "couponId" + "\\}", apiClient.escapeString(couponId.toString()))
            .replaceAll("\\{" + "email" + "\\}", apiClient.escapeString(email.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth0_jwt" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEmailCouponSubscritpionUsingGETValidateBeforeCall(String couponId, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'couponId' is set
        if (couponId == null) {
            throw new ApiException("Missing the required parameter 'couponId' when calling getEmailCouponSubscritpionUsingGET(Async)");
        }
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling getEmailCouponSubscritpionUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getEmailCouponSubscritpionUsingGETCall(couponId, email, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send an email with a coupon for new users.
     * 
     * @param couponId couponId (required)
     * @param email email (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getEmailCouponSubscritpionUsingGET(String couponId, String email) throws ApiException {
        getEmailCouponSubscritpionUsingGETWithHttpInfo(couponId, email);
    }

    /**
     * Send an email with a coupon for new users.
     * 
     * @param couponId couponId (required)
     * @param email email (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getEmailCouponSubscritpionUsingGETWithHttpInfo(String couponId, String email) throws ApiException {
        com.squareup.okhttp.Call call = getEmailCouponSubscritpionUsingGETValidateBeforeCall(couponId, email, null, null);
        return apiClient.execute(call);
    }

    /**
     * Send an email with a coupon for new users. (asynchronously)
     * 
     * @param couponId couponId (required)
     * @param email email (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEmailCouponSubscritpionUsingGETAsync(String couponId, String email, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEmailCouponSubscritpionUsingGETValidateBeforeCall(couponId, email, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
