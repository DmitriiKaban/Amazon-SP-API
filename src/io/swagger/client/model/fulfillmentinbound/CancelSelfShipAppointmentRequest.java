/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.fulfillmentinbound;

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
 * The &#x60;cancelSelfShipAppointment&#x60; request.
 */
@ApiModel(description = "The `cancelSelfShipAppointment` request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:29.243+03:00")
public class CancelSelfShipAppointmentRequest {
  @SerializedName("reasonComment")
  private ReasonComment reasonComment = null;

  public CancelSelfShipAppointmentRequest reasonComment(ReasonComment reasonComment) {
    this.reasonComment = reasonComment;
    return this;
  }

   /**
   * Get reasonComment
   * @return reasonComment
  **/
  @ApiModelProperty(value = "")
  public ReasonComment getReasonComment() {
    return reasonComment;
  }

  public void setReasonComment(ReasonComment reasonComment) {
    this.reasonComment = reasonComment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelSelfShipAppointmentRequest cancelSelfShipAppointmentRequest = (CancelSelfShipAppointmentRequest) o;
    return Objects.equals(this.reasonComment, cancelSelfShipAppointmentRequest.reasonComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonComment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelSelfShipAppointmentRequest {\n");
    
    sb.append("    reasonComment: ").append(toIndentedString(reasonComment)).append("\n");
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
