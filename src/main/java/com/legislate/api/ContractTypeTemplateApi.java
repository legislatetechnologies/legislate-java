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


import com.legislate.model.ContractResponseDTO;
import com.legislate.model.ContractTypeTemplateResponseDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractTypeTemplateApi {
    private ApiClient apiClient;

    public ContractTypeTemplateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContractTypeTemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getTemplateUsingGET
     * @param contractTypeId contractTypeId (required)
     * @param teamId teamId (required)
     * @param templateId templateId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTemplateUsingGETCall(Long contractTypeId, Long teamId, Long templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/teams/{teamId}/contract-types/{contractTypeId}/templates/{templateId}"
            .replaceAll("\\{" + "contractTypeId" + "\\}", apiClient.escapeString(contractTypeId.toString()))
            .replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()))
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
    private com.squareup.okhttp.Call getTemplateUsingGETValidateBeforeCall(Long contractTypeId, Long teamId, Long templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'contractTypeId' is set
        if (contractTypeId == null) {
            throw new ApiException("Missing the required parameter 'contractTypeId' when calling getTemplateUsingGET(Async)");
        }
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling getTemplateUsingGET(Async)");
        }
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling getTemplateUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getTemplateUsingGETCall(contractTypeId, teamId, templateId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get contract template.
     * This operation will retrieve details about a given contract.
     * @param contractTypeId contractTypeId (required)
     * @param teamId teamId (required)
     * @param templateId templateId (required)
     * @return ContractResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContractResponseDTO getTemplateUsingGET(Long contractTypeId, Long teamId, Long templateId) throws ApiException {
        ApiResponse<ContractResponseDTO> resp = getTemplateUsingGETWithHttpInfo(contractTypeId, teamId, templateId);
        return resp.getData();
    }

    /**
     * Get contract template.
     * This operation will retrieve details about a given contract.
     * @param contractTypeId contractTypeId (required)
     * @param teamId teamId (required)
     * @param templateId templateId (required)
     * @return ApiResponse&lt;ContractResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContractResponseDTO> getTemplateUsingGETWithHttpInfo(Long contractTypeId, Long teamId, Long templateId) throws ApiException {
        com.squareup.okhttp.Call call = getTemplateUsingGETValidateBeforeCall(contractTypeId, teamId, templateId, null, null);
        Type localVarReturnType = new TypeToken<ContractResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contract template. (asynchronously)
     * This operation will retrieve details about a given contract.
     * @param contractTypeId contractTypeId (required)
     * @param teamId teamId (required)
     * @param templateId templateId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplateUsingGETAsync(Long contractTypeId, Long teamId, Long templateId, final ApiCallback<ContractResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTemplateUsingGETValidateBeforeCall(contractTypeId, teamId, templateId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContractResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTemplatesUsingGET
     * @param contractTypeId contractTypeId (required)
     * @param teamId teamId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTemplatesUsingGETCall(Long contractTypeId, Long teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/teams/{teamId}/contract-types/{contractTypeId}/templates"
            .replaceAll("\\{" + "contractTypeId" + "\\}", apiClient.escapeString(contractTypeId.toString()))
            .replaceAll("\\{" + "teamId" + "\\}", apiClient.escapeString(teamId.toString()));

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
    private com.squareup.okhttp.Call getTemplatesUsingGETValidateBeforeCall(Long contractTypeId, Long teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'contractTypeId' is set
        if (contractTypeId == null) {
            throw new ApiException("Missing the required parameter 'contractTypeId' when calling getTemplatesUsingGET(Async)");
        }
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling getTemplatesUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getTemplatesUsingGETCall(contractTypeId, teamId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the latest template version for a contract type
     * 
     * @param contractTypeId contractTypeId (required)
     * @param teamId teamId (required)
     * @return ContractResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ContractTypeTemplateResponseDTO> getTemplatesUsingGET(Long contractTypeId, Long teamId) throws ApiException {
        ApiResponse<List<ContractTypeTemplateResponseDTO>> resp = getTemplatesUsingGETWithHttpInfo(contractTypeId, teamId);
        return resp.getData();
    }

    /**
     * Get the latest template version for a contract type
     * 
     * @param contractTypeId contractTypeId (required)
     * @param teamId teamId (required)
     * @return ApiResponse&lt;ContractResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ContractTypeTemplateResponseDTO>> getTemplatesUsingGETWithHttpInfo(Long contractTypeId, Long teamId) throws ApiException {
        com.squareup.okhttp.Call call = getTemplatesUsingGETValidateBeforeCall(contractTypeId, teamId, null, null);
        Type localVarReturnType = new TypeToken<ContractResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the latest template version for a contract type (asynchronously)
     * 
     * @param contractTypeId contractTypeId (required)
     * @param teamId teamId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTemplatesUsingGETAsync(Long contractTypeId, Long teamId, final ApiCallback<ContractResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTemplatesUsingGETValidateBeforeCall(contractTypeId, teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContractResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
