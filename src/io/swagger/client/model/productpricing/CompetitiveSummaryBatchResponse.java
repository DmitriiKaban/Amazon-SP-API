/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, refer to the [Product Pricing v2022-05-01 Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.productpricing;

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
 * The response schema of the &#x60;competitiveSummaryBatch&#x60; operation.
 */
@ApiModel(description = "The response schema of the `competitiveSummaryBatch` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:51.838+03:00")
public class CompetitiveSummaryBatchResponse {
  @SerializedName("responses")
  private CompetitiveSummaryResponseList responses = null;

  public CompetitiveSummaryBatchResponse responses(CompetitiveSummaryResponseList responses) {
    this.responses = responses;
    return this;
  }

   /**
   * The response list of the &#x60;competitiveSummaryBatch&#x60; operation.
   * @return responses
  **/
  @ApiModelProperty(required = true, value = "The response list of the `competitiveSummaryBatch` operation.")
  public CompetitiveSummaryResponseList getResponses() {
    return responses;
  }

  public void setResponses(CompetitiveSummaryResponseList responses) {
    this.responses = responses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitiveSummaryBatchResponse competitiveSummaryBatchResponse = (CompetitiveSummaryBatchResponse) o;
    return Objects.equals(this.responses, competitiveSummaryBatchResponse.responses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitiveSummaryBatchResponse {\n");
    
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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

