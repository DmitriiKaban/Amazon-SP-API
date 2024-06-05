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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * A light-weight inbound plan.
 */
@ApiModel(description = "A light-weight inbound plan.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:29.243+03:00")
public class InboundPlanSummary {
  @SerializedName("contactInformation")
  private ContactInformation contactInformation = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("inboundPlanId")
  private String inboundPlanId = null;

  @SerializedName("lastUpdatedAt")
  private OffsetDateTime lastUpdatedAt = null;

  @SerializedName("marketplaceIds")
  private List<String> marketplaceIds = new ArrayList<String>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("sourceAddress")
  private Address sourceAddress = null;

  @SerializedName("status")
  private String status = null;

  public InboundPlanSummary contactInformation(ContactInformation contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

   /**
   * Get contactInformation
   * @return contactInformation
  **/
  @ApiModelProperty(required = true, value = "")
  public ContactInformation getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(ContactInformation contactInformation) {
    this.contactInformation = contactInformation;
  }

  public InboundPlanSummary createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO 8601 datetime with pattern &#x60;yyyy-MM-ddTHH:mm:ss.sssZ&#x60;.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The ISO 8601 datetime with pattern `yyyy-MM-ddTHH:mm:ss.sssZ`.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public InboundPlanSummary inboundPlanId(String inboundPlanId) {
    this.inboundPlanId = inboundPlanId;
    return this;
  }

   /**
   * Identifier to an inbound plan.
   * @return inboundPlanId
  **/
  @ApiModelProperty(required = true, value = "Identifier to an inbound plan.")
  public String getInboundPlanId() {
    return inboundPlanId;
  }

  public void setInboundPlanId(String inboundPlanId) {
    this.inboundPlanId = inboundPlanId;
  }

  public InboundPlanSummary lastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * ISO 8601 datetime with pattern &#x60;yyyy-MM-ddTHH:mm:ss.sssZ&#x60;.
   * @return lastUpdatedAt
  **/
  @ApiModelProperty(required = true, value = "ISO 8601 datetime with pattern `yyyy-MM-ddTHH:mm:ss.sssZ`.")
  public OffsetDateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public InboundPlanSummary marketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

  public InboundPlanSummary addMarketplaceIdsItem(String marketplaceIdsItem) {
    this.marketplaceIds.add(marketplaceIdsItem);
    return this;
  }

   /**
   * Marketplace IDs.
   * @return marketplaceIds
  **/
  @ApiModelProperty(required = true, value = "Marketplace IDs.")
  public List<String> getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }

  public InboundPlanSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human-readable name of the inbound plan.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Human-readable name of the inbound plan.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InboundPlanSummary sourceAddress(Address sourceAddress) {
    this.sourceAddress = sourceAddress;
    return this;
  }

   /**
   * Get sourceAddress
   * @return sourceAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getSourceAddress() {
    return sourceAddress;
  }

  public void setSourceAddress(Address sourceAddress) {
    this.sourceAddress = sourceAddress;
  }

  public InboundPlanSummary status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of the inbound plan. Can be &#39;ACTIVE&#39;, &#39;VOIDED&#39;, or &#39;SHIPPED&#39;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Current status of the inbound plan. Can be 'ACTIVE', 'VOIDED', or 'SHIPPED'.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundPlanSummary inboundPlanSummary = (InboundPlanSummary) o;
    return Objects.equals(this.contactInformation, inboundPlanSummary.contactInformation) &&
        Objects.equals(this.createdAt, inboundPlanSummary.createdAt) &&
        Objects.equals(this.inboundPlanId, inboundPlanSummary.inboundPlanId) &&
        Objects.equals(this.lastUpdatedAt, inboundPlanSummary.lastUpdatedAt) &&
        Objects.equals(this.marketplaceIds, inboundPlanSummary.marketplaceIds) &&
        Objects.equals(this.name, inboundPlanSummary.name) &&
        Objects.equals(this.sourceAddress, inboundPlanSummary.sourceAddress) &&
        Objects.equals(this.status, inboundPlanSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInformation, createdAt, inboundPlanId, lastUpdatedAt, marketplaceIds, name, sourceAddress, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundPlanSummary {\n");
    
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    inboundPlanId: ").append(toIndentedString(inboundPlanId)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
