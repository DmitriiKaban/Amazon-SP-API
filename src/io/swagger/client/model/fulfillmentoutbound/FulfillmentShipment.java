/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.fulfillmentoutbound;

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

/**
 * Delivery and item information for a shipment in a fulfillment order.
 */
@ApiModel(description = "Delivery and item information for a shipment in a fulfillment order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:32.042+03:00")
public class FulfillmentShipment {
  @SerializedName("amazonShipmentId")
  private String amazonShipmentId = null;

  @SerializedName("fulfillmentCenterId")
  private String fulfillmentCenterId = null;

  /**
   * The current status of the shipment.
   */
  @JsonAdapter(FulfillmentShipmentStatusEnum.Adapter.class)
  public enum FulfillmentShipmentStatusEnum {
    PENDING("PENDING"),
    
    SHIPPED("SHIPPED"),
    
    CANCELLED_BY_FULFILLER("CANCELLED_BY_FULFILLER"),
    
    CANCELLED_BY_SELLER("CANCELLED_BY_SELLER");

    private String value;

    FulfillmentShipmentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FulfillmentShipmentStatusEnum fromValue(String text) {
      for (FulfillmentShipmentStatusEnum b : FulfillmentShipmentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FulfillmentShipmentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FulfillmentShipmentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FulfillmentShipmentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FulfillmentShipmentStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("fulfillmentShipmentStatus")
  private FulfillmentShipmentStatusEnum fulfillmentShipmentStatus = null;

  @SerializedName("shippingDate")
  private String shippingDate = null;

  @SerializedName("estimatedArrivalDate")
  private String estimatedArrivalDate = null;

  @SerializedName("shippingNotes")
  private List<String> shippingNotes = null;

  @SerializedName("fulfillmentShipmentItem")
  private FulfillmentShipmentItemList fulfillmentShipmentItem = null;

  @SerializedName("fulfillmentShipmentPackage")
  private FulfillmentShipmentPackageList fulfillmentShipmentPackage = null;

  public FulfillmentShipment amazonShipmentId(String amazonShipmentId) {
    this.amazonShipmentId = amazonShipmentId;
    return this;
  }

   /**
   * A shipment identifier assigned by Amazon.
   * @return amazonShipmentId
  **/
  @ApiModelProperty(required = true, value = "A shipment identifier assigned by Amazon.")
  public String getAmazonShipmentId() {
    return amazonShipmentId;
  }

  public void setAmazonShipmentId(String amazonShipmentId) {
    this.amazonShipmentId = amazonShipmentId;
  }

  public FulfillmentShipment fulfillmentCenterId(String fulfillmentCenterId) {
    this.fulfillmentCenterId = fulfillmentCenterId;
    return this;
  }

   /**
   * An identifier for the fulfillment center that the shipment will be sent from.
   * @return fulfillmentCenterId
  **/
  @ApiModelProperty(required = true, value = "An identifier for the fulfillment center that the shipment will be sent from.")
  public String getFulfillmentCenterId() {
    return fulfillmentCenterId;
  }

  public void setFulfillmentCenterId(String fulfillmentCenterId) {
    this.fulfillmentCenterId = fulfillmentCenterId;
  }

  public FulfillmentShipment fulfillmentShipmentStatus(FulfillmentShipmentStatusEnum fulfillmentShipmentStatus) {
    this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
    return this;
  }

   /**
   * The current status of the shipment.
   * @return fulfillmentShipmentStatus
  **/
  @ApiModelProperty(required = true, value = "The current status of the shipment.")
  public FulfillmentShipmentStatusEnum getFulfillmentShipmentStatus() {
    return fulfillmentShipmentStatus;
  }

  public void setFulfillmentShipmentStatus(FulfillmentShipmentStatusEnum fulfillmentShipmentStatus) {
    this.fulfillmentShipmentStatus = fulfillmentShipmentStatus;
  }

  public FulfillmentShipment shippingDate(String shippingDate) {
    this.shippingDate = shippingDate;
    return this;
  }

   /**
   * The meaning of the &#x60;shippingDate&#x60; value depends on the current status of the shipment. If the current value of &#x60;FulfillmentShipmentStatus&#x60; is:  * Pending - &#x60;shippingDate&#x60; represents the estimated time that the shipment will leave the Amazon fulfillment center.  * Shipped - &#x60;shippingDate&#x60; represents the date that the shipment left the Amazon fulfillment center. If a shipment includes more than one package, &#x60;shippingDate&#x60; applies to all of the packages in the shipment. If the value of &#x60;FulfillmentShipmentStatus&#x60; is &#x60;CancelledByFulfiller&#x60; or &#x60;CancelledBySeller&#x60;, &#x60;shippingDate&#x60; is not returned. The value must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format.
   * @return shippingDate
  **/
  @ApiModelProperty(value = "The meaning of the `shippingDate` value depends on the current status of the shipment. If the current value of `FulfillmentShipmentStatus` is:  * Pending - `shippingDate` represents the estimated time that the shipment will leave the Amazon fulfillment center.  * Shipped - `shippingDate` represents the date that the shipment left the Amazon fulfillment center. If a shipment includes more than one package, `shippingDate` applies to all of the packages in the shipment. If the value of `FulfillmentShipmentStatus` is `CancelledByFulfiller` or `CancelledBySeller`, `shippingDate` is not returned. The value must be in <a href='https://developer-docs.amazon.com/sp-api/docs/iso-8601'>ISO 8601</a> format.")
  public String getShippingDate() {
    return shippingDate;
  }

  public void setShippingDate(String shippingDate) {
    this.shippingDate = shippingDate;
  }

  public FulfillmentShipment estimatedArrivalDate(String estimatedArrivalDate) {
    this.estimatedArrivalDate = estimatedArrivalDate;
    return this;
  }

   /**
   * The estimated arrival date and time of the shipment. Must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. Note that this value can change over time. If a shipment includes more than one package, &#x60;estimatedArrivalDate&#x60; applies to all of the packages in the shipment. If the shipment has been cancelled, &#x60;estimatedArrivalDate&#x60; is not returned.
   * @return estimatedArrivalDate
  **/
  @ApiModelProperty(value = "The estimated arrival date and time of the shipment. Must be in <a href='https://developer-docs.amazon.com/sp-api/docs/iso-8601'>ISO 8601</a> format. Note that this value can change over time. If a shipment includes more than one package, `estimatedArrivalDate` applies to all of the packages in the shipment. If the shipment has been cancelled, `estimatedArrivalDate` is not returned.")
  public String getEstimatedArrivalDate() {
    return estimatedArrivalDate;
  }

  public void setEstimatedArrivalDate(String estimatedArrivalDate) {
    this.estimatedArrivalDate = estimatedArrivalDate;
  }

  public FulfillmentShipment shippingNotes(List<String> shippingNotes) {
    this.shippingNotes = shippingNotes;
    return this;
  }

  public FulfillmentShipment addShippingNotesItem(String shippingNotesItem) {
    if (this.shippingNotes == null) {
      this.shippingNotes = new ArrayList<String>();
    }
    this.shippingNotes.add(shippingNotesItem);
    return this;
  }

   /**
   * Provides additional insight into shipment timeline. Primairly used to communicate that actual delivery dates aren&#39;t available.
   * @return shippingNotes
  **/
  @ApiModelProperty(value = "Provides additional insight into shipment timeline. Primairly used to communicate that actual delivery dates aren't available.")
  public List<String> getShippingNotes() {
    return shippingNotes;
  }

  public void setShippingNotes(List<String> shippingNotes) {
    this.shippingNotes = shippingNotes;
  }

  public FulfillmentShipment fulfillmentShipmentItem(FulfillmentShipmentItemList fulfillmentShipmentItem) {
    this.fulfillmentShipmentItem = fulfillmentShipmentItem;
    return this;
  }

   /**
   * Get fulfillmentShipmentItem
   * @return fulfillmentShipmentItem
  **/
  @ApiModelProperty(required = true, value = "")
  public FulfillmentShipmentItemList getFulfillmentShipmentItem() {
    return fulfillmentShipmentItem;
  }

  public void setFulfillmentShipmentItem(FulfillmentShipmentItemList fulfillmentShipmentItem) {
    this.fulfillmentShipmentItem = fulfillmentShipmentItem;
  }

  public FulfillmentShipment fulfillmentShipmentPackage(FulfillmentShipmentPackageList fulfillmentShipmentPackage) {
    this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
    return this;
  }

   /**
   * Get fulfillmentShipmentPackage
   * @return fulfillmentShipmentPackage
  **/
  @ApiModelProperty(value = "")
  public FulfillmentShipmentPackageList getFulfillmentShipmentPackage() {
    return fulfillmentShipmentPackage;
  }

  public void setFulfillmentShipmentPackage(FulfillmentShipmentPackageList fulfillmentShipmentPackage) {
    this.fulfillmentShipmentPackage = fulfillmentShipmentPackage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentShipment fulfillmentShipment = (FulfillmentShipment) o;
    return Objects.equals(this.amazonShipmentId, fulfillmentShipment.amazonShipmentId) &&
        Objects.equals(this.fulfillmentCenterId, fulfillmentShipment.fulfillmentCenterId) &&
        Objects.equals(this.fulfillmentShipmentStatus, fulfillmentShipment.fulfillmentShipmentStatus) &&
        Objects.equals(this.shippingDate, fulfillmentShipment.shippingDate) &&
        Objects.equals(this.estimatedArrivalDate, fulfillmentShipment.estimatedArrivalDate) &&
        Objects.equals(this.shippingNotes, fulfillmentShipment.shippingNotes) &&
        Objects.equals(this.fulfillmentShipmentItem, fulfillmentShipment.fulfillmentShipmentItem) &&
        Objects.equals(this.fulfillmentShipmentPackage, fulfillmentShipment.fulfillmentShipmentPackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonShipmentId, fulfillmentCenterId, fulfillmentShipmentStatus, shippingDate, estimatedArrivalDate, shippingNotes, fulfillmentShipmentItem, fulfillmentShipmentPackage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentShipment {\n");
    
    sb.append("    amazonShipmentId: ").append(toIndentedString(amazonShipmentId)).append("\n");
    sb.append("    fulfillmentCenterId: ").append(toIndentedString(fulfillmentCenterId)).append("\n");
    sb.append("    fulfillmentShipmentStatus: ").append(toIndentedString(fulfillmentShipmentStatus)).append("\n");
    sb.append("    shippingDate: ").append(toIndentedString(shippingDate)).append("\n");
    sb.append("    estimatedArrivalDate: ").append(toIndentedString(estimatedArrivalDate)).append("\n");
    sb.append("    shippingNotes: ").append(toIndentedString(shippingNotes)).append("\n");
    sb.append("    fulfillmentShipmentItem: ").append(toIndentedString(fulfillmentShipmentItem)).append("\n");
    sb.append("    fulfillmentShipmentPackage: ").append(toIndentedString(fulfillmentShipmentPackage)).append("\n");
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

