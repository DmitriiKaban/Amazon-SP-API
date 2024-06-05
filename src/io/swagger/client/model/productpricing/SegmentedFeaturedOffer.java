/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, refer to the [Product Pricing v2022-05-01 Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.productpricing;

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
 * A product offer with segment information indicating where it&#39;s featured.
 */
@ApiModel(description = "A product offer with segment information indicating where it's featured.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:51.838+03:00")
public class SegmentedFeaturedOffer {
  @SerializedName("sellerId")
  private String sellerId = null;

  @SerializedName("condition")
  private Condition condition = null;

  /**
   * The item subcondition for the offer.
   */
  @JsonAdapter(SubConditionEnum.Adapter.class)
  public enum SubConditionEnum {
    NEW("New"),
    
    MINT("Mint"),
    
    VERYGOOD("VeryGood"),
    
    GOOD("Good"),
    
    ACCEPTABLE("Acceptable"),
    
    POOR("Poor"),
    
    CLUB("Club"),
    
    OEM("OEM"),
    
    WARRANTY("Warranty"),
    
    REFURBISHEDWARRANTY("RefurbishedWarranty"),
    
    REFURBISHED("Refurbished"),
    
    OPENBOX("OpenBox"),
    
    OTHER("Other");

    private String value;

    SubConditionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubConditionEnum fromValue(String text) {
      for (SubConditionEnum b : SubConditionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubConditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubConditionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubConditionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubConditionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("subCondition")
  private SubConditionEnum subCondition = null;

  @SerializedName("fulfillmentType")
  private FulfillmentType fulfillmentType = null;

  @SerializedName("listingPrice")
  private MoneyType listingPrice = null;

  @SerializedName("shippingOptions")
  private List<ShippingOption> shippingOptions = null;

  @SerializedName("points")
  private Points points = null;

  @SerializedName("primeDetails")
  private PrimeDetails primeDetails = null;

  @SerializedName("featuredOfferSegments")
  private List<FeaturedOfferSegment> featuredOfferSegments = new ArrayList<FeaturedOfferSegment>();

  public SegmentedFeaturedOffer sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The seller identifier for the offer.
   * @return sellerId
  **/
  @ApiModelProperty(required = true, value = "The seller identifier for the offer.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public SegmentedFeaturedOffer condition(Condition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Item Condition.
   * @return condition
  **/
  @ApiModelProperty(required = true, value = "Item Condition.")
  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public SegmentedFeaturedOffer subCondition(SubConditionEnum subCondition) {
    this.subCondition = subCondition;
    return this;
  }

   /**
   * The item subcondition for the offer.
   * @return subCondition
  **/
  @ApiModelProperty(value = "The item subcondition for the offer.")
  public SubConditionEnum getSubCondition() {
    return subCondition;
  }

  public void setSubCondition(SubConditionEnum subCondition) {
    this.subCondition = subCondition;
  }

  public SegmentedFeaturedOffer fulfillmentType(FulfillmentType fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
    return this;
  }

   /**
   * The fulfillment type for the offer. Possible values are AFN (Amazon Fulfillment Network) and MFN (Merchant Fulfillment Network).
   * @return fulfillmentType
  **/
  @ApiModelProperty(required = true, value = "The fulfillment type for the offer. Possible values are AFN (Amazon Fulfillment Network) and MFN (Merchant Fulfillment Network).")
  public FulfillmentType getFulfillmentType() {
    return fulfillmentType;
  }

  public void setFulfillmentType(FulfillmentType fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
  }

  public SegmentedFeaturedOffer listingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
    return this;
  }

   /**
   * Offer buying price. Does not include shipping, points, or applicable promotions.
   * @return listingPrice
  **/
  @ApiModelProperty(required = true, value = "Offer buying price. Does not include shipping, points, or applicable promotions.")
  public MoneyType getListingPrice() {
    return listingPrice;
  }

  public void setListingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
  }

  public SegmentedFeaturedOffer shippingOptions(List<ShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }

  public SegmentedFeaturedOffer addShippingOptionsItem(ShippingOption shippingOptionsItem) {
    if (this.shippingOptions == null) {
      this.shippingOptions = new ArrayList<ShippingOption>();
    }
    this.shippingOptions.add(shippingOptionsItem);
    return this;
  }

   /**
   * A list of shipping options associated with this offer
   * @return shippingOptions
  **/
  @ApiModelProperty(value = "A list of shipping options associated with this offer")
  public List<ShippingOption> getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(List<ShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  public SegmentedFeaturedOffer points(Points points) {
    this.points = points;
    return this;
  }

   /**
   * The number of Amazon Points offered with the purchase of an item, and their monetary value. Note that the Points element is only returned in Japan (JP).
   * @return points
  **/
  @ApiModelProperty(value = "The number of Amazon Points offered with the purchase of an item, and their monetary value. Note that the Points element is only returned in Japan (JP).")
  public Points getPoints() {
    return points;
  }

  public void setPoints(Points points) {
    this.points = points;
  }

  public SegmentedFeaturedOffer primeDetails(PrimeDetails primeDetails) {
    this.primeDetails = primeDetails;
    return this;
  }

   /**
   * Amazon Prime details.
   * @return primeDetails
  **/
  @ApiModelProperty(value = "Amazon Prime details.")
  public PrimeDetails getPrimeDetails() {
    return primeDetails;
  }

  public void setPrimeDetails(PrimeDetails primeDetails) {
    this.primeDetails = primeDetails;
  }

  public SegmentedFeaturedOffer featuredOfferSegments(List<FeaturedOfferSegment> featuredOfferSegments) {
    this.featuredOfferSegments = featuredOfferSegments;
    return this;
  }

  public SegmentedFeaturedOffer addFeaturedOfferSegmentsItem(FeaturedOfferSegment featuredOfferSegmentsItem) {
    this.featuredOfferSegments.add(featuredOfferSegmentsItem);
    return this;
  }

   /**
   * The list of segment information in which the offer is featured.
   * @return featuredOfferSegments
  **/
  @ApiModelProperty(required = true, value = "The list of segment information in which the offer is featured.")
  public List<FeaturedOfferSegment> getFeaturedOfferSegments() {
    return featuredOfferSegments;
  }

  public void setFeaturedOfferSegments(List<FeaturedOfferSegment> featuredOfferSegments) {
    this.featuredOfferSegments = featuredOfferSegments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentedFeaturedOffer segmentedFeaturedOffer = (SegmentedFeaturedOffer) o;
    return Objects.equals(this.sellerId, segmentedFeaturedOffer.sellerId) &&
        Objects.equals(this.condition, segmentedFeaturedOffer.condition) &&
        Objects.equals(this.subCondition, segmentedFeaturedOffer.subCondition) &&
        Objects.equals(this.fulfillmentType, segmentedFeaturedOffer.fulfillmentType) &&
        Objects.equals(this.listingPrice, segmentedFeaturedOffer.listingPrice) &&
        Objects.equals(this.shippingOptions, segmentedFeaturedOffer.shippingOptions) &&
        Objects.equals(this.points, segmentedFeaturedOffer.points) &&
        Objects.equals(this.primeDetails, segmentedFeaturedOffer.primeDetails) &&
        Objects.equals(this.featuredOfferSegments, segmentedFeaturedOffer.featuredOfferSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerId, condition, subCondition, fulfillmentType, listingPrice, shippingOptions, points, primeDetails, featuredOfferSegments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentedFeaturedOffer {\n");
    
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    subCondition: ").append(toIndentedString(subCondition)).append("\n");
    sb.append("    fulfillmentType: ").append(toIndentedString(fulfillmentType)).append("\n");
    sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    primeDetails: ").append(toIndentedString(primeDetails)).append("\n");
    sb.append("    featuredOfferSegments: ").append(toIndentedString(featuredOfferSegments)).append("\n");
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

