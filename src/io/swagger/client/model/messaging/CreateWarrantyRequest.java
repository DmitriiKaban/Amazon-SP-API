/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.messaging;

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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * The request schema for the createWarranty operation.
 */
@ApiModel(description = "The request schema for the createWarranty operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:41.498+03:00")
public class CreateWarrantyRequest {
  @SerializedName("attachments")
  private List<Attachment> attachments = null;

  @SerializedName("coverageStartDate")
  private OffsetDateTime coverageStartDate = null;

  @SerializedName("coverageEndDate")
  private OffsetDateTime coverageEndDate = null;

  public CreateWarrantyRequest attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public CreateWarrantyRequest addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments to include in the message to the buyer. If any text is included in the attachment, the text must be written in the buyer&#39;s language of preference, which can be retrieved from the GetAttributes operation.
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments to include in the message to the buyer. If any text is included in the attachment, the text must be written in the buyer's language of preference, which can be retrieved from the GetAttributes operation.")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public CreateWarrantyRequest coverageStartDate(OffsetDateTime coverageStartDate) {
    this.coverageStartDate = coverageStartDate;
    return this;
  }

   /**
   * The start date of the warranty coverage to include in the message to the buyer.
   * @return coverageStartDate
  **/
  @ApiModelProperty(value = "The start date of the warranty coverage to include in the message to the buyer.")
  public OffsetDateTime getCoverageStartDate() {
    return coverageStartDate;
  }

  public void setCoverageStartDate(OffsetDateTime coverageStartDate) {
    this.coverageStartDate = coverageStartDate;
  }

  public CreateWarrantyRequest coverageEndDate(OffsetDateTime coverageEndDate) {
    this.coverageEndDate = coverageEndDate;
    return this;
  }

   /**
   * The end date of the warranty coverage to include in the message to the buyer.
   * @return coverageEndDate
  **/
  @ApiModelProperty(value = "The end date of the warranty coverage to include in the message to the buyer.")
  public OffsetDateTime getCoverageEndDate() {
    return coverageEndDate;
  }

  public void setCoverageEndDate(OffsetDateTime coverageEndDate) {
    this.coverageEndDate = coverageEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWarrantyRequest createWarrantyRequest = (CreateWarrantyRequest) o;
    return Objects.equals(this.attachments, createWarrantyRequest.attachments) &&
        Objects.equals(this.coverageStartDate, createWarrantyRequest.coverageStartDate) &&
        Objects.equals(this.coverageEndDate, createWarrantyRequest.coverageEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, coverageStartDate, coverageEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWarrantyRequest {\n");
    
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    coverageStartDate: ").append(toIndentedString(coverageStartDate)).append("\n");
    sb.append("    coverageEndDate: ").append(toIndentedString(coverageEndDate)).append("\n");
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

