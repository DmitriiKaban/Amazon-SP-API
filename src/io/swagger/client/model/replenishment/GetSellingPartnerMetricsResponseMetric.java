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
import java.math.BigDecimal;

/**
 * An object which contains metric data for a selling partner.
 */
@ApiModel(description = "An object which contains metric data for a selling partner.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:53.825+03:00")
public class GetSellingPartnerMetricsResponseMetric {
  @SerializedName("notDeliveredDueToOOS")
  private Double notDeliveredDueToOOS = null;

  @SerializedName("totalSubscriptionsRevenue")
  private Double totalSubscriptionsRevenue = null;

  @SerializedName("shippedSubscriptionUnits")
  private BigDecimal shippedSubscriptionUnits = null;

  @SerializedName("activeSubscriptions")
  private BigDecimal activeSubscriptions = null;

  @SerializedName("subscriberAverageRevenue")
  private Double subscriberAverageRevenue = null;

  @SerializedName("nonSubscriberAverageRevenue")
  private Double nonSubscriberAverageRevenue = null;

  @SerializedName("timeInterval")
  private TimeInterval timeInterval = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  public GetSellingPartnerMetricsResponseMetric notDeliveredDueToOOS(Double notDeliveredDueToOOS) {
    this.notDeliveredDueToOOS = notDeliveredDueToOOS;
    return this;
  }

   /**
   * The percentage of items that were not shipped out of the total shipped units over a period of time due to being out of stock. Applicable only for the PERFORMANCE timePeriodType.
   * minimum: 0
   * maximum: 100
   * @return notDeliveredDueToOOS
  **/
  @ApiModelProperty(value = "The percentage of items that were not shipped out of the total shipped units over a period of time due to being out of stock. Applicable only for the PERFORMANCE timePeriodType.")
  public Double getNotDeliveredDueToOOS() {
    return notDeliveredDueToOOS;
  }

  public void setNotDeliveredDueToOOS(Double notDeliveredDueToOOS) {
    this.notDeliveredDueToOOS = notDeliveredDueToOOS;
  }

  public GetSellingPartnerMetricsResponseMetric totalSubscriptionsRevenue(Double totalSubscriptionsRevenue) {
    this.totalSubscriptionsRevenue = totalSubscriptionsRevenue;
    return this;
  }

   /**
   * The revenue generated from subscriptions over a period of time. Applicable for both the PERFORMANCE and FORECAST timePeriodType.
   * minimum: 0
   * @return totalSubscriptionsRevenue
  **/
  @ApiModelProperty(value = "The revenue generated from subscriptions over a period of time. Applicable for both the PERFORMANCE and FORECAST timePeriodType.")
  public Double getTotalSubscriptionsRevenue() {
    return totalSubscriptionsRevenue;
  }

  public void setTotalSubscriptionsRevenue(Double totalSubscriptionsRevenue) {
    this.totalSubscriptionsRevenue = totalSubscriptionsRevenue;
  }

  public GetSellingPartnerMetricsResponseMetric shippedSubscriptionUnits(BigDecimal shippedSubscriptionUnits) {
    this.shippedSubscriptionUnits = shippedSubscriptionUnits;
    return this;
  }

   /**
   * The number of units shipped to the subscribers over a period of time. Applicable for both the PERFORMANCE and FORECAST timePeriodType.
   * minimum: 0
   * @return shippedSubscriptionUnits
  **/
  @ApiModelProperty(value = "The number of units shipped to the subscribers over a period of time. Applicable for both the PERFORMANCE and FORECAST timePeriodType.")
  public BigDecimal getShippedSubscriptionUnits() {
    return shippedSubscriptionUnits;
  }

  public void setShippedSubscriptionUnits(BigDecimal shippedSubscriptionUnits) {
    this.shippedSubscriptionUnits = shippedSubscriptionUnits;
  }

  public GetSellingPartnerMetricsResponseMetric activeSubscriptions(BigDecimal activeSubscriptions) {
    this.activeSubscriptions = activeSubscriptions;
    return this;
  }

   /**
   * The number of active subscriptions present at the end of the period. Applicable only for the PERFORMANCE timePeriodType.
   * minimum: 0
   * @return activeSubscriptions
  **/
  @ApiModelProperty(value = "The number of active subscriptions present at the end of the period. Applicable only for the PERFORMANCE timePeriodType.")
  public BigDecimal getActiveSubscriptions() {
    return activeSubscriptions;
  }

  public void setActiveSubscriptions(BigDecimal activeSubscriptions) {
    this.activeSubscriptions = activeSubscriptions;
  }

  public GetSellingPartnerMetricsResponseMetric subscriberAverageRevenue(Double subscriberAverageRevenue) {
    this.subscriberAverageRevenue = subscriberAverageRevenue;
    return this;
  }

   /**
   * The average revenue per subscriber of the program over a period of past 12 months for sellers and 6 months for vendors. Applicable only for the PERFORMANCE timePeriodType.
   * minimum: 0
   * @return subscriberAverageRevenue
  **/
  @ApiModelProperty(value = "The average revenue per subscriber of the program over a period of past 12 months for sellers and 6 months for vendors. Applicable only for the PERFORMANCE timePeriodType.")
  public Double getSubscriberAverageRevenue() {
    return subscriberAverageRevenue;
  }

  public void setSubscriberAverageRevenue(Double subscriberAverageRevenue) {
    this.subscriberAverageRevenue = subscriberAverageRevenue;
  }

  public GetSellingPartnerMetricsResponseMetric nonSubscriberAverageRevenue(Double nonSubscriberAverageRevenue) {
    this.nonSubscriberAverageRevenue = nonSubscriberAverageRevenue;
    return this;
  }

   /**
   * The average revenue per non-subscriber of the program over a period of past 12 months for sellers and 6 months for vendors. Applicable only for the PERFORMANCE timePeriodType.
   * minimum: 0
   * @return nonSubscriberAverageRevenue
  **/
  @ApiModelProperty(value = "The average revenue per non-subscriber of the program over a period of past 12 months for sellers and 6 months for vendors. Applicable only for the PERFORMANCE timePeriodType.")
  public Double getNonSubscriberAverageRevenue() {
    return nonSubscriberAverageRevenue;
  }

  public void setNonSubscriberAverageRevenue(Double nonSubscriberAverageRevenue) {
    this.nonSubscriberAverageRevenue = nonSubscriberAverageRevenue;
  }

  public GetSellingPartnerMetricsResponseMetric timeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    return this;
  }

   /**
   * A time interval used to compute metrics.
   * @return timeInterval
  **/
  @ApiModelProperty(value = "A time interval used to compute metrics.")
  public TimeInterval getTimeInterval() {
    return timeInterval;
  }

  public void setTimeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }

  public GetSellingPartnerMetricsResponseMetric currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code in ISO 4217 format.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency code in ISO 4217 format.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSellingPartnerMetricsResponseMetric getSellingPartnerMetricsResponseMetric = (GetSellingPartnerMetricsResponseMetric) o;
    return Objects.equals(this.notDeliveredDueToOOS, getSellingPartnerMetricsResponseMetric.notDeliveredDueToOOS) &&
        Objects.equals(this.totalSubscriptionsRevenue, getSellingPartnerMetricsResponseMetric.totalSubscriptionsRevenue) &&
        Objects.equals(this.shippedSubscriptionUnits, getSellingPartnerMetricsResponseMetric.shippedSubscriptionUnits) &&
        Objects.equals(this.activeSubscriptions, getSellingPartnerMetricsResponseMetric.activeSubscriptions) &&
        Objects.equals(this.subscriberAverageRevenue, getSellingPartnerMetricsResponseMetric.subscriberAverageRevenue) &&
        Objects.equals(this.nonSubscriberAverageRevenue, getSellingPartnerMetricsResponseMetric.nonSubscriberAverageRevenue) &&
        Objects.equals(this.timeInterval, getSellingPartnerMetricsResponseMetric.timeInterval) &&
        Objects.equals(this.currencyCode, getSellingPartnerMetricsResponseMetric.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notDeliveredDueToOOS, totalSubscriptionsRevenue, shippedSubscriptionUnits, activeSubscriptions, subscriberAverageRevenue, nonSubscriberAverageRevenue, timeInterval, currencyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSellingPartnerMetricsResponseMetric {\n");
    
    sb.append("    notDeliveredDueToOOS: ").append(toIndentedString(notDeliveredDueToOOS)).append("\n");
    sb.append("    totalSubscriptionsRevenue: ").append(toIndentedString(totalSubscriptionsRevenue)).append("\n");
    sb.append("    shippedSubscriptionUnits: ").append(toIndentedString(shippedSubscriptionUnits)).append("\n");
    sb.append("    activeSubscriptions: ").append(toIndentedString(activeSubscriptions)).append("\n");
    sb.append("    subscriberAverageRevenue: ").append(toIndentedString(subscriberAverageRevenue)).append("\n");
    sb.append("    nonSubscriberAverageRevenue: ").append(toIndentedString(nonSubscriberAverageRevenue)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
