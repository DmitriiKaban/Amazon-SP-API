/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Data Kiosk
 * The Selling Partner API for Data Kiosk lets you submit GraphQL queries from a variety of schemas to help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2023-11-15
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.datakiosk;

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
 * The response for the &#x60;getQueries&#x60; operation.
 */
@ApiModel(description = "The response for the `getQueries` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:13.274+03:00")
public class GetQueriesResponse {
  @SerializedName("queries")
  private QueryList queries = null;

  @SerializedName("pagination")
  private GetQueriesResponsePagination pagination = null;

  public GetQueriesResponse queries(QueryList queries) {
    this.queries = queries;
    return this;
  }

   /**
   * The Data Kiosk queries.
   * @return queries
  **/
  @ApiModelProperty(required = true, value = "The Data Kiosk queries.")
  public QueryList getQueries() {
    return queries;
  }

  public void setQueries(QueryList queries) {
    this.queries = queries;
  }

  public GetQueriesResponse pagination(GetQueriesResponsePagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public GetQueriesResponsePagination getPagination() {
    return pagination;
  }

  public void setPagination(GetQueriesResponsePagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQueriesResponse getQueriesResponse = (GetQueriesResponse) o;
    return Objects.equals(this.queries, getQueriesResponse.queries) &&
        Objects.equals(this.pagination, getQueriesResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQueriesResponse {\n");
    
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

