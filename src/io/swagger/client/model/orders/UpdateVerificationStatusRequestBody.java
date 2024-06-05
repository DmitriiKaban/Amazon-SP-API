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
import io.swagger.client.model.orders.VerificationStatus;
import java.io.IOException;

/**
 * The updated values of the &#x60;VerificationStatus&#x60; field.
 */
@ApiModel(description = "The updated values of the `VerificationStatus` field.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:45.401+03:00")
public class UpdateVerificationStatusRequestBody {
  @SerializedName("status")
  private VerificationStatus status = null;

  @SerializedName("externalReviewerId")
  private String externalReviewerId = null;

  @SerializedName("rejectionReasonId")
  private String rejectionReasonId = null;

  public UpdateVerificationStatusRequestBody status(VerificationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * The new verification status of the order.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The new verification status of the order.")
  public VerificationStatus getStatus() {
    return status;
  }

  public void setStatus(VerificationStatus status) {
    this.status = status;
  }

  public UpdateVerificationStatusRequestBody externalReviewerId(String externalReviewerId) {
    this.externalReviewerId = externalReviewerId;
    return this;
  }

   /**
   * The identifier for the order&#39;s regulated information reviewer.
   * @return externalReviewerId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the order's regulated information reviewer.")
  public String getExternalReviewerId() {
    return externalReviewerId;
  }

  public void setExternalReviewerId(String externalReviewerId) {
    this.externalReviewerId = externalReviewerId;
  }

  public UpdateVerificationStatusRequestBody rejectionReasonId(String rejectionReasonId) {
    this.rejectionReasonId = rejectionReasonId;
    return this;
  }

   /**
   * The unique identifier for the rejection reason used for rejecting the order&#39;s regulated information. Only required if the new status is rejected.
   * @return rejectionReasonId
  **/
  @ApiModelProperty(value = "The unique identifier for the rejection reason used for rejecting the order's regulated information. Only required if the new status is rejected.")
  public String getRejectionReasonId() {
    return rejectionReasonId;
  }

  public void setRejectionReasonId(String rejectionReasonId) {
    this.rejectionReasonId = rejectionReasonId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVerificationStatusRequestBody updateVerificationStatusRequestBody = (UpdateVerificationStatusRequestBody) o;
    return Objects.equals(this.status, updateVerificationStatusRequestBody.status) &&
        Objects.equals(this.externalReviewerId, updateVerificationStatusRequestBody.externalReviewerId) &&
        Objects.equals(this.rejectionReasonId, updateVerificationStatusRequestBody.rejectionReasonId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, externalReviewerId, rejectionReasonId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerificationStatusRequestBody {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    externalReviewerId: ").append(toIndentedString(externalReviewerId)).append("\n");
    sb.append("    rejectionReasonId: ").append(toIndentedString(rejectionReasonId)).append("\n");
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

