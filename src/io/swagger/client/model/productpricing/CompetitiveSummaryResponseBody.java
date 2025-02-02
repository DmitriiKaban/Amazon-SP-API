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
import io.swagger.client.model.ErrorList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The &#x60;competitiveSummaryResponse&#x60; body for a requested ASIN and &#x60;marketplaceId&#x60;.
 */
@ApiModel(description = "The `competitiveSummaryResponse` body for a requested ASIN and `marketplaceId`.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:51.838+03:00")
public class CompetitiveSummaryResponseBody {
  @SerializedName("asin")
  private String asin = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("featuredBuyingOptions")
  private List<FeaturedBuyingOption> featuredBuyingOptions = null;

  @SerializedName("lowestPricedOffers")
  private List<LowestPricedOffer> lowestPricedOffers = null;

  @SerializedName("referencePrices")
  private List<ReferencePrice> referencePrices = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public CompetitiveSummaryResponseBody asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The Amazon identifier for the item.
   * @return asin
  **/
  @ApiModelProperty(required = true, value = "The Amazon identifier for the item.")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public CompetitiveSummaryResponseBody marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * A marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "A marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public CompetitiveSummaryResponseBody featuredBuyingOptions(List<FeaturedBuyingOption> featuredBuyingOptions) {
    this.featuredBuyingOptions = featuredBuyingOptions;
    return this;
  }

  public CompetitiveSummaryResponseBody addFeaturedBuyingOptionsItem(FeaturedBuyingOption featuredBuyingOptionsItem) {
    if (this.featuredBuyingOptions == null) {
      this.featuredBuyingOptions = new ArrayList<FeaturedBuyingOption>();
    }
    this.featuredBuyingOptions.add(featuredBuyingOptionsItem);
    return this;
  }

   /**
   * A list of featured buying options for the given ASIN &#x60;marketplaceId&#x60; combination.
   * @return featuredBuyingOptions
  **/
  @ApiModelProperty(value = "A list of featured buying options for the given ASIN `marketplaceId` combination.")
  public List<FeaturedBuyingOption> getFeaturedBuyingOptions() {
    return featuredBuyingOptions;
  }

  public void setFeaturedBuyingOptions(List<FeaturedBuyingOption> featuredBuyingOptions) {
    this.featuredBuyingOptions = featuredBuyingOptions;
  }

  public CompetitiveSummaryResponseBody lowestPricedOffers(List<LowestPricedOffer> lowestPricedOffers) {
    this.lowestPricedOffers = lowestPricedOffers;
    return this;
  }

  public CompetitiveSummaryResponseBody addLowestPricedOffersItem(LowestPricedOffer lowestPricedOffersItem) {
    if (this.lowestPricedOffers == null) {
      this.lowestPricedOffers = new ArrayList<LowestPricedOffer>();
    }
    this.lowestPricedOffers.add(lowestPricedOffersItem);
    return this;
  }

   /**
   * A list of the lowest priced offers for the given ASIN &#x60;marketplaceId&#x60; combination.
   * @return lowestPricedOffers
  **/
  @ApiModelProperty(value = "A list of the lowest priced offers for the given ASIN `marketplaceId` combination.")
  public List<LowestPricedOffer> getLowestPricedOffers() {
    return lowestPricedOffers;
  }

  public void setLowestPricedOffers(List<LowestPricedOffer> lowestPricedOffers) {
    this.lowestPricedOffers = lowestPricedOffers;
  }

  public CompetitiveSummaryResponseBody referencePrices(List<ReferencePrice> referencePrices) {
    this.referencePrices = referencePrices;
    return this;
  }

  public CompetitiveSummaryResponseBody addReferencePricesItem(ReferencePrice referencePricesItem) {
    if (this.referencePrices == null) {
      this.referencePrices = new ArrayList<ReferencePrice>();
    }
    this.referencePrices.add(referencePricesItem);
    return this;
  }

   /**
   * A list of reference prices for the given ASIN &#x60;marketplaceId&#x60; combination.
   * @return referencePrices
  **/
  @ApiModelProperty(value = "A list of reference prices for the given ASIN `marketplaceId` combination.")
  public List<ReferencePrice> getReferencePrices() {
    return referencePrices;
  }

  public void setReferencePrices(List<ReferencePrice> referencePrices) {
    this.referencePrices = referencePrices;
  }

  public CompetitiveSummaryResponseBody errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * A list of errors
   * @return errors
  **/
  @ApiModelProperty(value = "A list of errors")
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
    CompetitiveSummaryResponseBody competitiveSummaryResponseBody = (CompetitiveSummaryResponseBody) o;
    return Objects.equals(this.asin, competitiveSummaryResponseBody.asin) &&
        Objects.equals(this.marketplaceId, competitiveSummaryResponseBody.marketplaceId) &&
        Objects.equals(this.featuredBuyingOptions, competitiveSummaryResponseBody.featuredBuyingOptions) &&
        Objects.equals(this.lowestPricedOffers, competitiveSummaryResponseBody.lowestPricedOffers) &&
        Objects.equals(this.referencePrices, competitiveSummaryResponseBody.referencePrices) &&
        Objects.equals(this.errors, competitiveSummaryResponseBody.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, marketplaceId, featuredBuyingOptions, lowestPricedOffers, referencePrices, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitiveSummaryResponseBody {\n");
    
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    featuredBuyingOptions: ").append(toIndentedString(featuredBuyingOptions)).append("\n");
    sb.append("    lowestPricedOffers: ").append(toIndentedString(lowestPricedOffers)).append("\n");
    sb.append("    referencePrices: ").append(toIndentedString(referencePrices)).append("\n");
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

