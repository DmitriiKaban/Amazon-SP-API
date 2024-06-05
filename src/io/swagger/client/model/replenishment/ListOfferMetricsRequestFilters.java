/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
 *
 * OpenAPI spec version: 2022-11-07
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.replenishment;

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
 * Use these parameters to filter results. Any result must match all provided parameters. For any parameter that is an array, the result must match at least one element in the provided array.
 */
@ApiModel(description = "Use these parameters to filter results. Any result must match all provided parameters. For any parameter that is an array, the result must match at least one element in the provided array.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:53.825+03:00")
public class ListOfferMetricsRequestFilters {
  @SerializedName("aggregationFrequency")
  private AggregationFrequency aggregationFrequency = null;

  @SerializedName("timeInterval")
  private TimeInterval timeInterval = null;

  @SerializedName("timePeriodType")
  private TimePeriodType timePeriodType = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("programTypes")
  private ProgramTypes programTypes = null;

  @SerializedName("asins")
  private List<String> asins = null;

  public ListOfferMetricsRequestFilters aggregationFrequency(AggregationFrequency aggregationFrequency) {
    this.aggregationFrequency = aggregationFrequency;
    return this;
  }

   /**
   * Get aggregationFrequency
   * @return aggregationFrequency
  **/
  @ApiModelProperty(value = "")
  public AggregationFrequency getAggregationFrequency() {
    return aggregationFrequency;
  }

  public void setAggregationFrequency(AggregationFrequency aggregationFrequency) {
    this.aggregationFrequency = aggregationFrequency;
  }

  public ListOfferMetricsRequestFilters timeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    return this;
  }

   /**
   * A time interval used to compute metrics.
   * @return timeInterval
  **/
  @ApiModelProperty(required = true, value = "A time interval used to compute metrics.")
  public TimeInterval getTimeInterval() {
    return timeInterval;
  }

  public void setTimeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }

  public ListOfferMetricsRequestFilters timePeriodType(TimePeriodType timePeriodType) {
    this.timePeriodType = timePeriodType;
    return this;
  }

   /**
   * Get timePeriodType
   * @return timePeriodType
  **/
  @ApiModelProperty(required = true, value = "")
  public TimePeriodType getTimePeriodType() {
    return timePeriodType;
  }

  public void setTimePeriodType(TimePeriodType timePeriodType) {
    this.timePeriodType = timePeriodType;
  }

  public ListOfferMetricsRequestFilters marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace identifier. The supported marketplaces for both sellers and vendors are US, CA, ES, UK, FR, IT, IN, DE and JP. The supported marketplaces for vendors only are BR, AU, MX, AE and NL.  Refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids) to find the identifier for the marketplace.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "The marketplace identifier. The supported marketplaces for both sellers and vendors are US, CA, ES, UK, FR, IT, IN, DE and JP. The supported marketplaces for vendors only are BR, AU, MX, AE and NL.  Refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids) to find the identifier for the marketplace.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ListOfferMetricsRequestFilters programTypes(ProgramTypes programTypes) {
    this.programTypes = programTypes;
    return this;
  }

   /**
   * Get programTypes
   * @return programTypes
  **/
  @ApiModelProperty(required = true, value = "")
  public ProgramTypes getProgramTypes() {
    return programTypes;
  }

  public void setProgramTypes(ProgramTypes programTypes) {
    this.programTypes = programTypes;
  }

  public ListOfferMetricsRequestFilters asins(List<String> asins) {
    this.asins = asins;
    return this;
  }

  public ListOfferMetricsRequestFilters addAsinsItem(String asinsItem) {
    if (this.asins == null) {
      this.asins = new ArrayList<String>();
    }
    this.asins.add(asinsItem);
    return this;
  }

   /**
   * A list of Amazon Standard Identification Numbers (ASINs).
   * @return asins
  **/
  @ApiModelProperty(value = "A list of Amazon Standard Identification Numbers (ASINs).")
  public List<String> getAsins() {
    return asins;
  }

  public void setAsins(List<String> asins) {
    this.asins = asins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOfferMetricsRequestFilters listOfferMetricsRequestFilters = (ListOfferMetricsRequestFilters) o;
    return Objects.equals(this.aggregationFrequency, listOfferMetricsRequestFilters.aggregationFrequency) &&
        Objects.equals(this.timeInterval, listOfferMetricsRequestFilters.timeInterval) &&
        Objects.equals(this.timePeriodType, listOfferMetricsRequestFilters.timePeriodType) &&
        Objects.equals(this.marketplaceId, listOfferMetricsRequestFilters.marketplaceId) &&
        Objects.equals(this.programTypes, listOfferMetricsRequestFilters.programTypes) &&
        Objects.equals(this.asins, listOfferMetricsRequestFilters.asins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationFrequency, timeInterval, timePeriodType, marketplaceId, programTypes, asins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfferMetricsRequestFilters {\n");
    
    sb.append("    aggregationFrequency: ").append(toIndentedString(aggregationFrequency)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
    sb.append("    timePeriodType: ").append(toIndentedString(timePeriodType)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    programTypes: ").append(toIndentedString(programTypes)).append("\n");
    sb.append("    asins: ").append(toIndentedString(asins)).append("\n");
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

