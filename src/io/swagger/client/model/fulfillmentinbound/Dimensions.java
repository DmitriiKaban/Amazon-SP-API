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
 * Measurement of a package dimensions.
 */
@ApiModel(description = "Measurement of a package dimensions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:29.243+03:00")
public class Dimensions {
  @SerializedName("height")
  private Double height = null;

  @SerializedName("length")
  private Double length = null;

  @SerializedName("unitOfMeasurement")
  private UnitOfMeasurement unitOfMeasurement = null;

  @SerializedName("width")
  private Double width = null;

  public Dimensions height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height.
   * minimum: 0
   * maximum: 100000
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Height.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Dimensions length(Double length) {
    this.length = length;
    return this;
  }

   /**
   * Length.
   * minimum: 0
   * maximum: 100000
   * @return length
  **/
  @ApiModelProperty(required = true, value = "Length.")
  public Double getLength() {
    return length;
  }

  public void setLength(Double length) {
    this.length = length;
  }

  public Dimensions unitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Get unitOfMeasurement
   * @return unitOfMeasurement
  **/
  @ApiModelProperty(required = true, value = "")
  public UnitOfMeasurement getUnitOfMeasurement() {
    return unitOfMeasurement;
  }

  public void setUnitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }

  public Dimensions width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width.
   * minimum: 0
   * maximum: 100000
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Width.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dimensions dimensions = (Dimensions) o;
    return Objects.equals(this.height, dimensions.height) &&
        Objects.equals(this.length, dimensions.length) &&
        Objects.equals(this.unitOfMeasurement, dimensions.unitOfMeasurement) &&
        Objects.equals(this.width, dimensions.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, length, unitOfMeasurement, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dimensions {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    unitOfMeasurement: ").append(toIndentedString(unitOfMeasurement)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

