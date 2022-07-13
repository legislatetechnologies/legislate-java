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


import com.legislate.model.ContractTypeResponseDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractTypeApi {
    private ApiClient apiClient;

    public ContractTypeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContractTypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getContractTypePerTeamUsingGET
     * @param contractTypeId The unique Id of the contract type you&#x27;d like to look up contract template information from. (required)
     * @param teamId The unique Id of the team you wish to retrieve the contract type information from. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContractTypePerTeamUsingGETCall(Long contractTypeId, Long teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/teams/{teamId}/contract-types/{contractTypeId}"
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
    private com.squareup.okhttp.Call getContractTypePerTeamUsingGETValidateBeforeCall(Long contractTypeId, Long teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'contractTypeId' is set
        if (contractTypeId == null) {
            throw new ApiException("Missing the required parameter 'contractTypeId' when calling getContractTypePerTeamUsingGET(Async)");
        }
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling getContractTypePerTeamUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getContractTypePerTeamUsingGETCall(contractTypeId, teamId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get information relative a given contract type.
     * This operation will retrieve information about a given contract type and a team.
     * @param contractTypeId The unique Id of the contract type you&#x27;d like to look up contract template information from. (required)
     * @param teamId The unique Id of the team you wish to retrieve the contract type information from. (required)
     * @return ContractTypeResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContractTypeResponseDTO getContractTypePerTeamUsingGET(Long contractTypeId, Long teamId) throws ApiException {
        ApiResponse<ContractTypeResponseDTO> resp = getContractTypePerTeamUsingGETWithHttpInfo(contractTypeId, teamId);
        return resp.getData();
    }

    /**
     * Get information relative a given contract type.
     * This operation will retrieve information about a given contract type and a team.
     * @param contractTypeId The unique Id of the contract type you&#x27;d like to look up contract template information from. (required)
     * @param teamId The unique Id of the team you wish to retrieve the contract type information from. (required)
     * @return ApiResponse&lt;ContractTypeResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContractTypeResponseDTO> getContractTypePerTeamUsingGETWithHttpInfo(Long contractTypeId, Long teamId) throws ApiException {
        com.squareup.okhttp.Call call = getContractTypePerTeamUsingGETValidateBeforeCall(contractTypeId, teamId, null, null);
        Type localVarReturnType = new TypeToken<ContractTypeResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get information relative a given contract type. (asynchronously)
     * This operation will retrieve information about a given contract type and a team.
     * @param contractTypeId The unique Id of the contract type you&#x27;d like to look up contract template information from. (required)
     * @param teamId The unique Id of the team you wish to retrieve the contract type information from. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContractTypePerTeamUsingGETAsync(Long contractTypeId, Long teamId, final ApiCallback<ContractTypeResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContractTypePerTeamUsingGETValidateBeforeCall(contractTypeId, teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContractTypeResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getContractTypeUsingGET
     * @param contractTypeId The unique Id of the contract type you&#x27;d like to look up contract template information from. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContractTypeUsingGETCall(Long contractTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/contract-types/{contractTypeId}"
            .replaceAll("\\{" + "contractTypeId" + "\\}", apiClient.escapeString(contractTypeId.toString()));

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
    private com.squareup.okhttp.Call getContractTypeUsingGETValidateBeforeCall(Long contractTypeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'contractTypeId' is set
        if (contractTypeId == null) {
            throw new ApiException("Missing the required parameter 'contractTypeId' when calling getContractTypeUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getContractTypeUsingGETCall(contractTypeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get contract type terms.
     * This operation will retrieve terms about a given contract type.
     * @param contractTypeId The unique Id of the contract type you&#x27;d like to look up contract template information from. (required)
     * @return ContractTypeResponseDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContractTypeResponseDTO getContractTypeUsingGET(Long contractTypeId) throws ApiException {
        ApiResponse<ContractTypeResponseDTO> resp = getContractTypeUsingGETWithHttpInfo(contractTypeId);
        return resp.getData();
    }

    /**
     * Get contract type terms.
     * This operation will retrieve terms about a given contract type.
     * @param contractTypeId The unique Id of the contract type you&#x27;d like to look up contract template information from. (required)
     * @return ApiResponse&lt;ContractTypeResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContractTypeResponseDTO> getContractTypeUsingGETWithHttpInfo(Long contractTypeId) throws ApiException {
        com.squareup.okhttp.Call call = getContractTypeUsingGETValidateBeforeCall(contractTypeId, null, null);
        Type localVarReturnType = new TypeToken<ContractTypeResponseDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contract type terms. (asynchronously)
     * This operation will retrieve terms about a given contract type.
     * @param contractTypeId The unique Id of the contract type you&#x27;d like to look up contract template information from. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContractTypeUsingGETAsync(Long contractTypeId, final ApiCallback<ContractTypeResponseDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContractTypeUsingGETValidateBeforeCall(contractTypeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContractTypeResponseDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getContractTypesPerTeamUsingGET
     * @param teamId The unique Id of the team you wish to retrieve the contract type information from. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContractTypesPerTeamUsingGETCall(Long teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/teams/{teamId}/contract-types"
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
    private com.squareup.okhttp.Call getContractTypesPerTeamUsingGETValidateBeforeCall(Long teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new ApiException("Missing the required parameter 'teamId' when calling getContractTypesPerTeamUsingGET(Async)");
        }
        
        com.squareup.okhttp.Call call = getContractTypesPerTeamUsingGETCall(teamId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get contract types of a team
     * This operation will retrieve information of every contract type relative a team.
     * @param teamId The unique Id of the team you wish to retrieve the contract type information from. (required)
     * @return List&lt;ContractTypeResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ContractTypeResponseDTO> getContractTypesPerTeamUsingGET(Long teamId) throws ApiException {
        ApiResponse<List<ContractTypeResponseDTO>> resp = getContractTypesPerTeamUsingGETWithHttpInfo(teamId);
        return resp.getData();
    }

    /**
     * Get contract types of a team
     * This operation will retrieve information of every contract type relative a team.
     * @param teamId The unique Id of the team you wish to retrieve the contract type information from. (required)
     * @return ApiResponse&lt;List&lt;ContractTypeResponseDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ContractTypeResponseDTO>> getContractTypesPerTeamUsingGETWithHttpInfo(Long teamId) throws ApiException {
        com.squareup.okhttp.Call call = getContractTypesPerTeamUsingGETValidateBeforeCall(teamId, null, null);
        Type localVarReturnType = new TypeToken<List<ContractTypeResponseDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contract types of a team (asynchronously)
     * This operation will retrieve information of every contract type relative a team.
     * @param teamId The unique Id of the team you wish to retrieve the contract type information from. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContractTypesPerTeamUsingGETAsync(Long teamId, final ApiCallback<List<ContractTypeResponseDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContractTypesPerTeamUsingGETValidateBeforeCall(teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ContractTypeResponseDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getContractTypesUsingGET
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContractTypesUsingGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/contract-types";

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
    private com.squareup.okhttp.Call getContractTypesUsingGETValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getContractTypesUsingGETCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get public contract types.
     * This operation will retrieve terms about a given contract type.
     * @return List&lt;ContractTypeResponseDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ContractTypeResponseDTO> getContractTypesUsingGET() throws ApiException {
        ApiResponse<List<ContractTypeResponseDTO>> resp = getContractTypesUsingGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get public contract types.
     * This operation will retrieve terms about a given contract type.
     * @return ApiResponse&lt;List&lt;ContractTypeResponseDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ContractTypeResponseDTO>> getContractTypesUsingGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getContractTypesUsingGETValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<ContractTypeResponseDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get public contract types. (asynchronously)
     * This operation will retrieve terms about a given contract type.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContractTypesUsingGETAsync(final ApiCallback<List<ContractTypeResponseDTO>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContractTypesUsingGETValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ContractTypeResponseDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}