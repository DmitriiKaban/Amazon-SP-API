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
import io.swagger.client.model.orders.BuyerTaxInfo;
import java.io.IOException;

/**
 * Buyer information for an order.
 */
@ApiModel(description = "Buyer information for an order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:45.401+03:00")
public class OrderBuyerInfo {
  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("BuyerEmail")
  private String buyerEmail = null;

  @SerializedName("BuyerName")
  private String buyerName = null;

  @SerializedName("BuyerCounty")
  private String buyerCounty = null;

  @SerializedName("BuyerTaxInfo")
  private BuyerTaxInfo buyerTaxInfo = null;

  @SerializedName("PurchaseOrderNumber")
  private String purchaseOrderNumber = null;

  public OrderBuyerInfo amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined order identifier, in 3-7-7 format.
   * @return amazonOrderId
  **/
  @ApiModelProperty(required = true, value = "An Amazon-defined order identifier, in 3-7-7 format.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public OrderBuyerInfo buyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
    return this;
  }

   /**
   * The anonymized email address of the buyer.
   * @return buyerEmail
  **/
  @ApiModelProperty(value = "The anonymized email address of the buyer.")
  public String getBuyerEmail() {
    return buyerEmail;
  }

  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }

  public OrderBuyerInfo buyerName(String buyerName) {
    this.buyerName = buyerName;
    return this;
  }

   /**
   * The buyer name or the recipient name.
   * @return buyerName
  **/
  @ApiModelProperty(value = "The buyer name or the recipient name.")
  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public OrderBuyerInfo buyerCounty(String buyerCounty) {
    this.buyerCounty = buyerCounty;
    return this;
  }

   /**
   * The county of the buyer.  **Note**: This attribute is only available in the Brazil marketplace.
   * @return buyerCounty
  **/
  @ApiModelProperty(value = "The county of the buyer.  **Note**: This attribute is only available in the Brazil marketplace.")
  public String getBuyerCounty() {
    return buyerCounty;
  }

  public void setBuyerCounty(String buyerCounty) {
    this.buyerCounty = buyerCounty;
  }

  public OrderBuyerInfo buyerTaxInfo(BuyerTaxInfo buyerTaxInfo) {
    this.buyerTaxInfo = buyerTaxInfo;
    return this;
  }

   /**
   * Tax information about the buyer. Sellers can use this data to issue electronic invoices for business orders.  **Note**: This attribute is only available for business orders in the Brazil, Mexico and India marketplaces.
   * @return buyerTaxInfo
  **/
  @ApiModelProperty(value = "Tax information about the buyer. Sellers can use this data to issue electronic invoices for business orders.  **Note**: This attribute is only available for business orders in the Brazil, Mexico and India marketplaces.")
  public BuyerTaxInfo getBuyerTaxInfo() {
    return buyerTaxInfo;
  }

  public void setBuyerTaxInfo(BuyerTaxInfo buyerTaxInfo) {
    this.buyerTaxInfo = buyerTaxInfo;
  }

  public OrderBuyerInfo purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The purchase order (PO) number entered by the buyer at checkout. Returned only for orders where the buyer entered a PO number at checkout.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(value = "The purchase order (PO) number entered by the buyer at checkout. Returned only for orders where the buyer entered a PO number at checkout.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBuyerInfo orderBuyerInfo = (OrderBuyerInfo) o;
    return Objects.equals(this.amazonOrderId, orderBuyerInfo.amazonOrderId) &&
        Objects.equals(this.buyerEmail, orderBuyerInfo.buyerEmail) &&
        Objects.equals(this.buyerName, orderBuyerInfo.buyerName) &&
        Objects.equals(this.buyerCounty, orderBuyerInfo.buyerCounty) &&
        Objects.equals(this.buyerTaxInfo, orderBuyerInfo.buyerTaxInfo) &&
        Objects.equals(this.purchaseOrderNumber, orderBuyerInfo.purchaseOrderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, buyerEmail, buyerName, buyerCounty, buyerTaxInfo, purchaseOrderNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBuyerInfo {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    buyerEmail: ").append(toIndentedString(buyerEmail)).append("\n");
    sb.append("    buyerName: ").append(toIndentedString(buyerName)).append("\n");
    sb.append("    buyerCounty: ").append(toIndentedString(buyerCounty)).append("\n");
    sb.append("    buyerTaxInfo: ").append(toIndentedString(buyerTaxInfo)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
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

