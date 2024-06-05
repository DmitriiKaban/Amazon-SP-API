/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  **Note:** The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.orders;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.orders.OrderRegulatedInfo;
import java.io.IOException;

/**
 * The response schema for the &#x60;getOrderRegulatedInfo&#x60; operation.
 */
@ApiModel(description = "The response schema for the `getOrderRegulatedInfo` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:45.401+03:00")
public class GetOrderRegulatedInfoResponse {
  @SerializedName("payload")
  private OrderRegulatedInfo payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOrderRegulatedInfoResponse payload(OrderRegulatedInfo payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the &#x60;getOrderRegulatedInfo&#x60; operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the `getOrderRegulatedInfo` operation.")
  public OrderRegulatedInfo getPayload() {
    return payload;
  }

  public void setPayload(OrderRegulatedInfo payload) {
    this.payload = payload;
  }

  public GetOrderRegulatedInfoResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the &#x60;getOrderRegulatedInfo&#x60; operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the `getOrderRegulatedInfo` operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderRegulatedInfoResponse getOrderRegulatedInfoResponse = (GetOrderRegulatedInfoResponse) o;
    return Objects.equals(this.payload, getOrderRegulatedInfoResponse.payload) &&
        Objects.equals(this.errors, getOrderRegulatedInfoResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderRegulatedInfoResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

