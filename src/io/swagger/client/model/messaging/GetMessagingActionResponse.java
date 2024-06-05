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
import io.swagger.client.model.ErrorList;

import java.io.IOException;

/**
 * Describes a messaging action that can be taken for an order. Provides a JSON Hypertext Application Language (HAL) link to the JSON schema document that describes the expected input.
 */
@ApiModel(description = "Describes a messaging action that can be taken for an order. Provides a JSON Hypertext Application Language (HAL) link to the JSON schema document that describes the expected input.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:41.498+03:00")
public class GetMessagingActionResponse {
  @SerializedName("_links")
  private GetMessagingActionResponseLinks links = null;

  @SerializedName("_embedded")
  private GetMessagingActionResponseEmbedded embedded = null;

  @SerializedName("payload")
  private MessagingAction payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetMessagingActionResponse links(GetMessagingActionResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public GetMessagingActionResponseLinks getLinks() {
    return links;
  }

  public void setLinks(GetMessagingActionResponseLinks links) {
    this.links = links;
  }

  public GetMessagingActionResponse embedded(GetMessagingActionResponseEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(value = "")
  public GetMessagingActionResponseEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(GetMessagingActionResponseEmbedded embedded) {
    this.embedded = embedded;
  }

  public GetMessagingActionResponse payload(MessagingAction payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public MessagingAction getPayload() {
    return payload;
  }

  public void setPayload(MessagingAction payload) {
    this.payload = payload;
  }

  public GetMessagingActionResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
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
    GetMessagingActionResponse getMessagingActionResponse = (GetMessagingActionResponse) o;
    return Objects.equals(this.links, getMessagingActionResponse.links) &&
        Objects.equals(this.embedded, getMessagingActionResponse.embedded) &&
        Objects.equals(this.payload, getMessagingActionResponse.payload) &&
        Objects.equals(this.errors, getMessagingActionResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, embedded, payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessagingActionResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

