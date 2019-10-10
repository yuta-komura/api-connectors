/**
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ConditionalApi {
  String basePath = "https://localhost";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Cancel conditional order.
  * 
   * @param stopOrderId Order ID of conditional order.
   * @return Object
  */
  public Object conditionalCancel (String stopOrderId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'stopOrderId' is set
    if (stopOrderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'stopOrderId' when calling conditionalCancel",
        new ApiException(400, "Missing the required parameter 'stopOrderId' when calling conditionalCancel"));
    }

    // create path and map variables
    String path = "/open-api/stop-order/cancel";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "stop_order_id", stopOrderId));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Cancel conditional order.
   * 
   * @param stopOrderId Order ID of conditional order.
  */
  public void conditionalCancel (String stopOrderId, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'stopOrderId' is set
    if (stopOrderId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'stopOrderId' when calling conditionalCancel",
        new ApiException(400, "Missing the required parameter 'stopOrderId' when calling conditionalCancel"));
    }

    // create path and map variables
    String path = "/open-api/stop-order/cancel".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "stop_order_id", stopOrderId));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get my conditional order list.
  * 
   * @param stopOrderId Order ID of conditional order.
   * @param orderLinkId Agency customized order ID.
   * @param symbol Contract type. Default BTCUSD.
   * @param order Sort orders by creation date
   * @param page Page. Default getting first page data
   * @param limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page.
   * @return Object
  */
  public Object conditionalGetOrders (String stopOrderId, String orderLinkId, String symbol, String order, BigDecimal page, BigDecimal limit) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/open-api/stop-order/list";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "stop_order_id", stopOrderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_link_id", orderLinkId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order", order));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get my conditional order list.
   * 
   * @param stopOrderId Order ID of conditional order.   * @param orderLinkId Agency customized order ID.   * @param symbol Contract type. Default BTCUSD.   * @param order Sort orders by creation date   * @param page Page. Default getting first page data   * @param limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page.
  */
  public void conditionalGetOrders (String stopOrderId, String orderLinkId, String symbol, String order, BigDecimal page, BigDecimal limit, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/open-api/stop-order/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "stop_order_id", stopOrderId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_link_id", orderLinkId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order", order));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Place a new conditional order.
  * 
   * @param side Side.
   * @param symbol Contract type.
   * @param orderType Conditional order type.
   * @param qty Order quantity.
   * @param price Execution price for conditional order
   * @param basePrice Send current market price. It will be used to compare with the value of &#39;stop_px&#39;, to decide whether your conditional order will be triggered by crossing trigger price from upper side or lower side. Mainly used to identify the expected direction of the current conditional order..
   * @param stopPx Trigger price.
   * @param timeInForce Time in force.
   * @param closeOnTrigger close on trigger.
   * @param orderLinkId Customized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique..
   * @return Object
  */
  public Object conditionalNew (String side, String symbol, String orderType, BigDecimal qty, Double price, Double basePrice, Double stopPx, String timeInForce, Boolean closeOnTrigger, String orderLinkId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'side' is set
    if (side == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'side' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'side' when calling conditionalNew"));
    }
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'symbol' when calling conditionalNew"));
    }
    // verify the required parameter 'orderType' is set
    if (orderType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderType' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'orderType' when calling conditionalNew"));
    }
    // verify the required parameter 'qty' is set
    if (qty == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'qty' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'qty' when calling conditionalNew"));
    }
    // verify the required parameter 'price' is set
    if (price == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'price' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'price' when calling conditionalNew"));
    }
    // verify the required parameter 'basePrice' is set
    if (basePrice == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'basePrice' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'basePrice' when calling conditionalNew"));
    }
    // verify the required parameter 'stopPx' is set
    if (stopPx == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'stopPx' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'stopPx' when calling conditionalNew"));
    }
    // verify the required parameter 'timeInForce' is set
    if (timeInForce == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeInForce' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'timeInForce' when calling conditionalNew"));
    }

    // create path and map variables
    String path = "/open-api/stop-order/create";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "side", side));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_type", orderType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qty", qty));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "price", price));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "base_price", basePrice));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "stop_px", stopPx));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "time_in_force", timeInForce));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "close_on_trigger", closeOnTrigger));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_link_id", orderLinkId));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Place a new conditional order.
   * 
   * @param side Side.   * @param symbol Contract type.   * @param orderType Conditional order type.   * @param qty Order quantity.   * @param price Execution price for conditional order   * @param basePrice Send current market price. It will be used to compare with the value of &#39;stop_px&#39;, to decide whether your conditional order will be triggered by crossing trigger price from upper side or lower side. Mainly used to identify the expected direction of the current conditional order..   * @param stopPx Trigger price.   * @param timeInForce Time in force.   * @param closeOnTrigger close on trigger.   * @param orderLinkId Customized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique..
  */
  public void conditionalNew (String side, String symbol, String orderType, BigDecimal qty, Double price, Double basePrice, Double stopPx, String timeInForce, Boolean closeOnTrigger, String orderLinkId, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'side' is set
    if (side == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'side' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'side' when calling conditionalNew"));
    }
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'symbol' when calling conditionalNew"));
    }
    // verify the required parameter 'orderType' is set
    if (orderType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderType' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'orderType' when calling conditionalNew"));
    }
    // verify the required parameter 'qty' is set
    if (qty == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'qty' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'qty' when calling conditionalNew"));
    }
    // verify the required parameter 'price' is set
    if (price == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'price' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'price' when calling conditionalNew"));
    }
    // verify the required parameter 'basePrice' is set
    if (basePrice == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'basePrice' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'basePrice' when calling conditionalNew"));
    }
    // verify the required parameter 'stopPx' is set
    if (stopPx == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'stopPx' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'stopPx' when calling conditionalNew"));
    }
    // verify the required parameter 'timeInForce' is set
    if (timeInForce == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeInForce' when calling conditionalNew",
        new ApiException(400, "Missing the required parameter 'timeInForce' when calling conditionalNew"));
    }

    // create path and map variables
    String path = "/open-api/stop-order/create".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "side", side));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_type", orderType));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qty", qty));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "price", price));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "base_price", basePrice));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "stop_px", stopPx));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "time_in_force", timeInForce));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "close_on_trigger", closeOnTrigger));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_link_id", orderLinkId));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}