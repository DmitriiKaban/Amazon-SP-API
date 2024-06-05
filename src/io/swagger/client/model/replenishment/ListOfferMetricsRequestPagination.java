/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
 *
 * OpenAPI spec version: 2022-11-07
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.replenishment;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Use these parameters to paginate through the response.
 */
@ApiModel(description = "Use these parameters to paginate through the response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:53.825+03:00")
public class ListOfferMetricsRequestPagination {
  @SerializedName("limit")
  private Long limit = null;

  @SerializedName("offset")
  private Long offset = null;

  public ListOfferMetricsRequestPagination limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of results to return in the response.
   * minimum: 1
   * maximum: 500
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "The maximum number of results to return in the response.")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public ListOfferMetricsRequestPagination offset(Long offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The offset from which to retrieve the number of results specified by the &#x60;limit&#x60; value. The first result is at offset 0.
   * minimum: 0
   * maximum: 9000
   * @return offset
  **/
  @ApiModelProperty(required = true, value = "The offset from which to retrieve the number of results specified by the `limit` value. The first result is at offset 0.")
  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOfferMetricsRequestPagination listOfferMetricsRequestPagination = (ListOfferMetricsRequestPagination) o;
    return Objects.equals(this.limit, listOfferMetricsRequestPagination.limit) &&
        Objects.equals(this.offset, listOfferMetricsRequestPagination.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfferMetricsRequestPagination {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

