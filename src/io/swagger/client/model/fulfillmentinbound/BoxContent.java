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
 * Specifies contents in a box. Each &#x60;BoxContent&#x60; minimally contains a mapping of an MSKU to the prep owner, label owner and its quantity in the box. It also contains the MSKU expiration date and manufacturing lot code if applicable.
 */
@ApiModel(description = "Specifies contents in a box. Each `BoxContent` minimally contains a mapping of an MSKU to the prep owner, label owner and its quantity in the box. It also contains the MSKU expiration date and manufacturing lot code if applicable.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:29.243+03:00")
public class BoxContent {
  @SerializedName("expiration")
  private String expiration = null;

  @SerializedName("labelOwner")
  private LabelOwner labelOwner = null;

  @SerializedName("manufacturingLotCode")
  private String manufacturingLotCode = null;

  @SerializedName("msku")
  private String msku = null;

  @SerializedName("prepOwner")
  private PrepOwner prepOwner = null;

  @SerializedName("quantityInBox")
  private Integer quantityInBox = null;

  public BoxContent expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * The date in ISO 8601 format for when the MSKU expires.
   * @return expiration
  **/
  @ApiModelProperty(value = "The date in ISO 8601 format for when the MSKU expires.")
  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  public BoxContent labelOwner(LabelOwner labelOwner) {
    this.labelOwner = labelOwner;
    return this;
  }

   /**
   * Get labelOwner
   * @return labelOwner
  **/
  @ApiModelProperty(required = true, value = "")
  public LabelOwner getLabelOwner() {
    return labelOwner;
  }

  public void setLabelOwner(LabelOwner labelOwner) {
    this.labelOwner = labelOwner;
  }

  public BoxContent manufacturingLotCode(String manufacturingLotCode) {
    this.manufacturingLotCode = manufacturingLotCode;
    return this;
  }

   /**
   * The manufacturing lot code.
   * @return manufacturingLotCode
  **/
  @ApiModelProperty(value = "The manufacturing lot code.")
  public String getManufacturingLotCode() {
    return manufacturingLotCode;
  }

  public void setManufacturingLotCode(String manufacturingLotCode) {
    this.manufacturingLotCode = manufacturingLotCode;
  }

  public BoxContent msku(String msku) {
    this.msku = msku;
    return this;
  }

   /**
   * The merchant SKU, a merchant-supplied identifier for a specific SKU.
   * @return msku
  **/
  @ApiModelProperty(required = true, value = "The merchant SKU, a merchant-supplied identifier for a specific SKU.")
  public String getMsku() {
    return msku;
  }

  public void setMsku(String msku) {
    this.msku = msku;
  }

  public BoxContent prepOwner(PrepOwner prepOwner) {
    this.prepOwner = prepOwner;
    return this;
  }

   /**
   * Get prepOwner
   * @return prepOwner
  **/
  @ApiModelProperty(required = true, value = "")
  public PrepOwner getPrepOwner() {
    return prepOwner;
  }

  public void setPrepOwner(PrepOwner prepOwner) {
    this.prepOwner = prepOwner;
  }

  public BoxContent quantityInBox(Integer quantityInBox) {
    this.quantityInBox = quantityInBox;
    return this;
  }

   /**
   * The number of units of the given MSKU in the box.
   * minimum: 1
   * maximum: 10000
   * @return quantityInBox
  **/
  @ApiModelProperty(required = true, value = "The number of units of the given MSKU in the box.")
  public Integer getQuantityInBox() {
    return quantityInBox;
  }

  public void setQuantityInBox(Integer quantityInBox) {
    this.quantityInBox = quantityInBox;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxContent boxContent = (BoxContent) o;
    return Objects.equals(this.expiration, boxContent.expiration) &&
        Objects.equals(this.labelOwner, boxContent.labelOwner) &&
        Objects.equals(this.manufacturingLotCode, boxContent.manufacturingLotCode) &&
        Objects.equals(this.msku, boxContent.msku) &&
        Objects.equals(this.prepOwner, boxContent.prepOwner) &&
        Objects.equals(this.quantityInBox, boxContent.quantityInBox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiration, labelOwner, manufacturingLotCode, msku, prepOwner, quantityInBox);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxContent {\n");
    
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    labelOwner: ").append(toIndentedString(labelOwner)).append("\n");
    sb.append("    manufacturingLotCode: ").append(toIndentedString(manufacturingLotCode)).append("\n");
    sb.append("    msku: ").append(toIndentedString(msku)).append("\n");
    sb.append("    prepOwner: ").append(toIndentedString(prepOwner)).append("\n");
    sb.append("    quantityInBox: ").append(toIndentedString(quantityInBox)).append("\n");
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

