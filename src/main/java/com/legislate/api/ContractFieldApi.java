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


import com.legislate.model.ContractFieldResponseDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractFieldApi {
    private ApiClient apiClient;

    public ContractFieldApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContractFieldApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getTemplateTermUsingGET
     * @param termId The unique Id of the field you&#x27;d like to look up. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTemplateTermUsingGETCall(Long termId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/terms/{termId}"
            .replaceAll("\\{" + "termId" + "\\}", apiClient.escapeString(termId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call getTemplateTermUsingGETValidateBeforeCall(Long termId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'termId' is set
        if (termId == null) {
            throw new ApiException("Missing the required parameter 'termId' when calling getTemplateTermUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getTemplateTermUsingGETCall(termId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get template term.
     * This operation will retrieve terms about a given template.
     * @param termId The unique Id of the field you&#x27;d like to look up. (required)
     * @return ContractFieldResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContractFieldResponseDTO getTemplateTermUsingGET(Long termId) throws ApiException {
        ApiResponse<ContractFieldResponseDTO> resp = getTemplateTermUsingGETWithHttpInfo(termId);
        return resp.getData();
    }

    /**
     * Get template term.
     * This operation will retrieve terms about a given template.
     * @param termId The unique Id of the field you&#x27;d like to look up. (required)
     * @return ApiResponse&lt;ContractFieldResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContractFieldResponseDTO> getTemplateTermUsingGETWithHttpInfo(Long termId) throws ApiException {
        com.squareup.okhttp.Call call = getTemplateTermUsingGETValidateBeforeCall(termId, null, null);
        Type localVarReturnType = new TypeToken<ContractFieldResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get template term. (asynchronously)
     * This operation will retrieve terms about a given template.
     * @param termId The unique Id of the field you&#x27;d like to look up. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplateTermUsingGETAsync(Long termId, final ApiCallback<ContractFieldResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTemplateTermUsingGETValidateBeforeCall(termId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContractFieldResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTemplateTermsUsingGET
     * @param templateId The unique Id of the team you&#x27;d like to retrieve the available contract types from. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTemplateTermsUsingGETCall(Long templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/templates/{templateId}/terms"
            .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call getTemplateTermsUsingGETValidateBeforeCall(Long templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling getTemplateTermsUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getTemplateTermsUsingGETCall(templateId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get template terms.
     * This operation will retrieve terms about a given template.
     * @param templateId The unique Id of the team you&#x27;d like to retrieve the available contract types from. (required)
     * @return List&lt;ContractFieldResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ContractFieldResponseDTO> getTemplateTermsUsingGET(Long templateId) throws ApiException {
        ApiResponse<List<ContractFieldResponseDTO>> resp = getTemplateTermsUsingGETWithHttpInfo(templateId);
        return resp.getData();
    }

    /**
     * Get template terms.
     * This operation will retrieve terms about a given template.
     * @param templateId The unique Id of the team you&#x27;d like to retrieve the available contract types from. (required)
     * @return ApiResponse&lt;List&lt;ContractFieldResponseDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ContractFieldResponseDTO>> getTemplateTermsUsingGETWithHttpInfo(Long templateId) throws ApiException {
        com.squareup.okhttp.Call call = getTemplateTermsUsingGETValidateBeforeCall(templateId, null, null);
        Type localVarReturnType = new TypeToken<List<ContractFieldResponseDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get template terms. (asynchronously)
     * This operation will retrieve terms about a given template.
     * @param templateId The unique Id of the team you&#x27;d like to retrieve the available contract types from. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplateTermsUsingGETAsync(Long templateId, final ApiCallback<List<ContractFieldResponseDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTemplateTermsUsingGETValidateBeforeCall(templateId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ContractFieldResponseDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
