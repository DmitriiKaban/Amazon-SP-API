/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.finances;

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
 * An event related to a Tax-Deducted-at-Source (TDS) reimbursement.
 */
@ApiModel(description = "An event related to a Tax-Deducted-at-Source (TDS) reimbursement.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:24.145+03:00")
public class TDSReimbursementEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("TDSOrderId")
  private String tdSOrderId = null;

  @SerializedName("ReimbursedAmount")
  private Currency reimbursedAmount = null;

  public TDSReimbursementEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public TDSReimbursementEvent tdSOrderId(String tdSOrderId) {
    this.tdSOrderId = tdSOrderId;
    return this;
  }

   /**
   * The Tax-Deducted-at-Source (TDS) identifier.
   * @return tdSOrderId
  **/
  @ApiModelProperty(value = "The Tax-Deducted-at-Source (TDS) identifier.")
  public String getTdSOrderId() {
    return tdSOrderId;
  }

  public void setTdSOrderId(String tdSOrderId) {
    this.tdSOrderId = tdSOrderId;
  }

  public TDSReimbursementEvent reimbursedAmount(Currency reimbursedAmount) {
    this.reimbursedAmount = reimbursedAmount;
    return this;
  }

   /**
   * The amount reimbursed.
   * @return reimbursedAmount
  **/
  @ApiModelProperty(value = "The amount reimbursed.")
  public Currency getReimbursedAmount() {
    return reimbursedAmount;
  }

  public void setReimbursedAmount(Currency reimbursedAmount) {
    this.reimbursedAmount = reimbursedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TDSReimbursementEvent tdSReimbursementEvent = (TDSReimbursementEvent) o;
    return Objects.equals(this.postedDate, tdSReimbursementEvent.postedDate) &&
        Objects.equals(this.tdSOrderId, tdSReimbursementEvent.tdSOrderId) &&
        Objects.equals(this.reimbursedAmount, tdSReimbursementEvent.reimbursedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, tdSOrderId, reimbursedAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TDSReimbursementEvent {\n");
    
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    tdSOrderId: ").append(toIndentedString(tdSOrderId)).append("\n");
    sb.append("    reimbursedAmount: ").append(toIndentedString(reimbursedAmount)).append("\n");
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

