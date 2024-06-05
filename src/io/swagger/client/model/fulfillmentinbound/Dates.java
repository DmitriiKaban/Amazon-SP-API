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
 * Specifies the dates that the seller expects their shipment will be shipped and delivered.
 */
@ApiModel(description = "Specifies the dates that the seller expects their shipment will be shipped and delivered.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:29.243+03:00")
public class Dates {
  @SerializedName("deliveryWindow")
  private Window deliveryWindow = null;

  @SerializedName("readyToShipWindow")
  private Window readyToShipWindow = null;

  public Dates deliveryWindow(Window deliveryWindow) {
    this.deliveryWindow = deliveryWindow;
    return this;
  }

   /**
   * Get deliveryWindow
   * @return deliveryWindow
  **/
  @ApiModelProperty(value = "")
  public Window getDeliveryWindow() {
    return deliveryWindow;
  }

  public void setDeliveryWindow(Window deliveryWindow) {
    this.deliveryWindow = deliveryWindow;
  }

  public Dates readyToShipWindow(Window readyToShipWindow) {
    this.readyToShipWindow = readyToShipWindow;
    return this;
  }

   /**
   * Get readyToShipWindow
   * @return readyToShipWindow
  **/
  @ApiModelProperty(value = "")
  public Window getReadyToShipWindow() {
    return readyToShipWindow;
  }

  public void setReadyToShipWindow(Window readyToShipWindow) {
    this.readyToShipWindow = readyToShipWindow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dates dates = (Dates) o;
    return Objects.equals(this.deliveryWindow, dates.deliveryWindow) &&
        Objects.equals(this.readyToShipWindow, dates.readyToShipWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryWindow, readyToShipWindow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dates {\n");
    
    sb.append("    deliveryWindow: ").append(toIndentedString(deliveryWindow)).append("\n");
    sb.append("    readyToShipWindow: ").append(toIndentedString(readyToShipWindow)).append("\n");
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

