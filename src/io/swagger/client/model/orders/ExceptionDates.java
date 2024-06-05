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
import io.swagger.client.model.orders.OpenInterval;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Dates when the business is closed or open with a different time window.
 */
@ApiModel(description = "Dates when the business is closed or open with a different time window.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:45.401+03:00")
public class ExceptionDates {
  @SerializedName("ExceptionDate")
  private String exceptionDate = null;

  @SerializedName("IsOpen")
  private Boolean isOpen = null;

  @SerializedName("OpenIntervals")
  private List<OpenInterval> openIntervals = null;

  public ExceptionDates exceptionDate(String exceptionDate) {
    this.exceptionDate = exceptionDate;
    return this;
  }

   /**
   * Date when the business is closed, in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; date format.
   * @return exceptionDate
  **/
  @ApiModelProperty(value = "Date when the business is closed, in <a href='https://developer-docs.amazon.com/sp-api/docs/iso-8601'>ISO 8601</a> date format.")
  public String getExceptionDate() {
    return exceptionDate;
  }

  public void setExceptionDate(String exceptionDate) {
    this.exceptionDate = exceptionDate;
  }

  public ExceptionDates isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

   /**
   * Boolean indicating if the business is closed or open on that date.
   * @return isOpen
  **/
  @ApiModelProperty(value = "Boolean indicating if the business is closed or open on that date.")
  public Boolean isIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  public ExceptionDates openIntervals(List<OpenInterval> openIntervals) {
    this.openIntervals = openIntervals;
    return this;
  }

  public ExceptionDates addOpenIntervalsItem(OpenInterval openIntervalsItem) {
    if (this.openIntervals == null) {
      this.openIntervals = new ArrayList<OpenInterval>();
    }
    this.openIntervals.add(openIntervalsItem);
    return this;
  }

   /**
   * Time window during the day when the business is open.
   * @return openIntervals
  **/
  @ApiModelProperty(value = "Time window during the day when the business is open.")
  public List<OpenInterval> getOpenIntervals() {
    return openIntervals;
  }

  public void setOpenIntervals(List<OpenInterval> openIntervals) {
    this.openIntervals = openIntervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionDates exceptionDates = (ExceptionDates) o;
    return Objects.equals(this.exceptionDate, exceptionDates.exceptionDate) &&
        Objects.equals(this.isOpen, exceptionDates.isOpen) &&
        Objects.equals(this.openIntervals, exceptionDates.openIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptionDate, isOpen, openIntervals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionDates {\n");
    
    sb.append("    exceptionDate: ").append(toIndentedString(exceptionDate)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    openIntervals: ").append(toIndentedString(openIntervals)).append("\n");
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

