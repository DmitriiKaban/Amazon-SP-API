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
import io.swagger.client.model.orders.Money;
import java.io.IOException;

/**
 * The number of Amazon Points offered with the purchase of an item, and their monetary value.
 */
@ApiModel(description = "The number of Amazon Points offered with the purchase of an item, and their monetary value.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:45.401+03:00")
public class PointsGrantedDetail {
  @SerializedName("PointsNumber")
  private Integer pointsNumber = null;

  @SerializedName("PointsMonetaryValue")
  private Money pointsMonetaryValue = null;

  public PointsGrantedDetail pointsNumber(Integer pointsNumber) {
    this.pointsNumber = pointsNumber;
    return this;
  }

   /**
   * The number of Amazon Points granted with the purchase of an item.
   * @return pointsNumber
  **/
  @ApiModelProperty(value = "The number of Amazon Points granted with the purchase of an item.")
  public Integer getPointsNumber() {
    return pointsNumber;
  }

  public void setPointsNumber(Integer pointsNumber) {
    this.pointsNumber = pointsNumber;
  }

  public PointsGrantedDetail pointsMonetaryValue(Money pointsMonetaryValue) {
    this.pointsMonetaryValue = pointsMonetaryValue;
    return this;
  }

   /**
   * The monetary value of the Amazon Points granted.
   * @return pointsMonetaryValue
  **/
  @ApiModelProperty(value = "The monetary value of the Amazon Points granted.")
  public Money getPointsMonetaryValue() {
    return pointsMonetaryValue;
  }

  public void setPointsMonetaryValue(Money pointsMonetaryValue) {
    this.pointsMonetaryValue = pointsMonetaryValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointsGrantedDetail pointsGrantedDetail = (PointsGrantedDetail) o;
    return Objects.equals(this.pointsNumber, pointsGrantedDetail.pointsNumber) &&
        Objects.equals(this.pointsMonetaryValue, pointsGrantedDetail.pointsMonetaryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointsNumber, pointsMonetaryValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointsGrantedDetail {\n");
    
    sb.append("    pointsNumber: ").append(toIndentedString(pointsNumber)).append("\n");
    sb.append("    pointsMonetaryValue: ").append(toIndentedString(pointsMonetaryValue)).append("\n");
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

