/*
 * Selling Partner API for FBA Inbound Eligibilty
 * With the FBA Inbound Eligibility API, you can build applications that let sellers get eligibility previews for items before shipping them to Amazon's fulfillment centers. With this API you can find out if an item is eligible for inbound shipment to Amazon's fulfillment centers in a specific marketplace. You can also find out if an item is eligible for using the manufacturer barcode for FBA inventory tracking. Sellers can use this information to inform their decisions about which items to ship Amazon's fulfillment centers.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;
import io.swagger.client.StringUtil;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.fbainbound.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCache;
import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCacheImpl;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationSigner;
import com.amazon.SellingPartnerAPIAA.RateLimitConfiguration;
import com.amazon.SellingPartnerAPIAA.LWAException;

public class FbaInboundApi {
    private ApiClient apiClient;

    FbaInboundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FbaInboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getItemEligibilityPreview
     * @param asin The ASIN of the item for which you want an eligibility preview. (required)
     * @param program The program that you want to check eligibility against. (required)
     * @param marketplaceIds The identifier for the marketplace in which you want to determine eligibility. Required only when program&#x3D;INBOUND. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call getItemEligibilityPreviewCall(String asin, String program, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fba/inbound/v1/eligibility/itemPreview";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (asin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asin", asin));
        if (program != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("program", program));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getItemEligibilityPreviewValidateBeforeCall(String asin, String program, List<String> marketplaceIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        
        // verify the required parameter 'asin' is set
        if (asin == null) {
            throw new ApiException("Missing the required parameter 'asin' when calling getItemEligibilityPreview(Async)");
        }
        
        // verify the required parameter 'program' is set
        if (program == null) {
            throw new ApiException("Missing the required parameter 'program' when calling getItemEligibilityPreview(Async)");
        }
        

        com.squareup.okhttp.Call call = getItemEligibilityPreviewCall(asin, program, marketplaceIds, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * This operation gets an eligibility preview for an item that you specify. You can specify the type of eligibility preview that you want (INBOUND or COMMINGLING). For INBOUND previews, you can specify the marketplace in which you want to determine the item&#39;s eligibility.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The ASIN of the item for which you want an eligibility preview. (required)
     * @param program The program that you want to check eligibility against. (required)
     * @param marketplaceIds The identifier for the marketplace in which you want to determine eligibility. Required only when program&#x3D;INBOUND. (optional)
     * @return GetItemEligibilityPreviewResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public GetItemEligibilityPreviewResponse getItemEligibilityPreview(String asin, String program, List<String> marketplaceIds) throws ApiException,LWAException {
        ApiResponse<GetItemEligibilityPreviewResponse> resp = getItemEligibilityPreviewWithHttpInfo(asin, program, marketplaceIds);
        return resp.getData();
    }

    /**
     * 
     * This operation gets an eligibility preview for an item that you specify. You can specify the type of eligibility preview that you want (INBOUND or COMMINGLING). For INBOUND previews, you can specify the marketplace in which you want to determine the item&#39;s eligibility.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The ASIN of the item for which you want an eligibility preview. (required)
     * @param program The program that you want to check eligibility against. (required)
     * @param marketplaceIds The identifier for the marketplace in which you want to determine eligibility. Required only when program&#x3D;INBOUND. (optional)
     * @return ApiResponse&lt;GetItemEligibilityPreviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ApiResponse<GetItemEligibilityPreviewResponse> getItemEligibilityPreviewWithHttpInfo(String asin, String program, List<String> marketplaceIds) throws ApiException,LWAException {
        com.squareup.okhttp.Call call = getItemEligibilityPreviewValidateBeforeCall(asin, program, marketplaceIds, null, null);
        Type localVarReturnType = new TypeToken<GetItemEligibilityPreviewResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This operation gets an eligibility preview for an item that you specify. You can specify the type of eligibility preview that you want (INBOUND or COMMINGLING). For INBOUND previews, you can specify the marketplace in which you want to determine the item&#39;s eligibility.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The ASIN of the item for which you want an eligibility preview. (required)
     * @param program The program that you want to check eligibility against. (required)
     * @param marketplaceIds The identifier for the marketplace in which you want to determine eligibility. Required only when program&#x3D;INBOUND. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call getItemEligibilityPreviewAsync(String asin, String program, List<String> marketplaceIds, final ApiCallback<GetItemEligibilityPreviewResponse> callback) throws ApiException, LWAException {

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

        com.squareup.okhttp.Call call = getItemEligibilityPreviewValidateBeforeCall(asin, program, marketplaceIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetItemEligibilityPreviewResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    public static class Builder {
        private LWAAuthorizationCredentials lwaAuthorizationCredentials;
        private String endpoint;
        private LWAAccessTokenCache lwaAccessTokenCache;
        private Boolean disableAccessTokenCache = false;
        private RateLimitConfiguration rateLimitConfiguration;


        public Builder lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
            this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        
        public Builder lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
            this.lwaAccessTokenCache = lwaAccessTokenCache;
            return this;
        }
		
	   public Builder disableAccessTokenCache() {
            this.disableAccessTokenCache = true;
            return this;
        }

        public Builder rateLimitConfigurationOnRequests(RateLimitConfiguration rateLimitConfiguration){
            this.rateLimitConfiguration = rateLimitConfiguration;
            return this;
        }
        
        public Builder disableRateLimitOnRequests() {
            this.rateLimitConfiguration = null;
            return this;
        }

        public FbaInboundApi build() {
            if (lwaAuthorizationCredentials == null) {
                throw new RuntimeException("LWAAuthorizationCredentials not set");
            }

            if (StringUtil.isEmpty(endpoint)) {
                throw new RuntimeException("Endpoint not set");
            }
            
            LWAAuthorizationSigner lwaAuthorizationSigner = null;            
            if (disableAccessTokenCache) {
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
            }
            else {
                if (lwaAccessTokenCache == null) {
                    lwaAccessTokenCache = new LWAAccessTokenCacheImpl();                  
                 }
                 lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials,lwaAccessTokenCache);
            }

            return new FbaInboundApi(new ApiClient()
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setBasePath(endpoint)
                .setRateLimiter(rateLimitConfiguration));
        }
    }
}
