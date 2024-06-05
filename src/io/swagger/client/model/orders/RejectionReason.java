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
import java.io.IOException;

/**
 * The reason for rejecting the order&#39;s regulated information. Not present if the order isn&#39;t rejected.
 */
@ApiModel(description = "The reason for rejecting the order's regulated information. Not present if the order isn't rejected.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:45.401+03:00")
public class RejectionReason {
  @SerializedName("RejectionReasonId")
  private String rejectionReasonId = null;

  @SerializedName("RejectionReasonDescription")
  private String rejectionReasonDescription = null;

  public RejectionReason rejectionReasonId(String rejectionReasonId) {
    this.rejectionReasonId = rejectionReasonId;
    return this;
  }

   /**
   * The unique identifier for the rejection reason.
   * @return rejectionReasonId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier for the rejection reason.")
  public String getRejectionReasonId() {
    return rejectionReasonId;
  }

  public void setRejectionReasonId(String rejectionReasonId) {
    this.rejectionReasonId = rejectionReasonId;
  }

  public RejectionReason rejectionReasonDescription(String rejectionReasonDescription) {
    this.rejectionReasonDescription = rejectionReasonDescription;
    return this;
  }

   /**
   * The description of this rejection reason.
   * @return rejectionReasonDescription
  **/
  @ApiModelProperty(required = true, value = "The description of this rejection reason.")
  public String getRejectionReasonDescription() {
    return rejectionReasonDescription;
  }

  public void setRejectionReasonDescription(String rejectionReasonDescription) {
    this.rejectionReasonDescription = rejectionReasonDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectionReason rejectionReason = (RejectionReason) o;
    return Objects.equals(this.rejectionReasonId, rejectionReason.rejectionReasonId) &&
        Objects.equals(this.rejectionReasonDescription, rejectionReason.rejectionReasonDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectionReasonId, rejectionReasonDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectionReason {\n");
    
    sb.append("    rejectionReasonId: ").append(toIndentedString(rejectionReasonId)).append("\n");
    sb.append("    rejectionReasonDescription: ").append(toIndentedString(rejectionReasonDescription)).append("\n");
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

