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
 * Summary information about a placement option.
 */
@ApiModel(description = "Summary information about a placement option.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:29.243+03:00")
public class PlacementOptionSummary {
  @SerializedName("placementOptionId")
  private String placementOptionId = null;

  @SerializedName("status")
  private String status = null;

  public PlacementOptionSummary placementOptionId(String placementOptionId) {
    this.placementOptionId = placementOptionId;
    return this;
  }

   /**
   * Identifier to a placement option. A placement option represents the shipment splits and destinations of SKUs.
   * @return placementOptionId
  **/
  @ApiModelProperty(required = true, value = "Identifier to a placement option. A placement option represents the shipment splits and destinations of SKUs.")
  public String getPlacementOptionId() {
    return placementOptionId;
  }

  public void setPlacementOptionId(String placementOptionId) {
    this.placementOptionId = placementOptionId;
  }

  public PlacementOptionSummary status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of a placement option. Can be &#x60;OFFERED&#x60; or &#x60;ACCEPTED&#x60;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of a placement option. Can be `OFFERED` or `ACCEPTED`.")
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
    PlacementOptionSummary placementOptionSummary = (PlacementOptionSummary) o;
    return Objects.equals(this.placementOptionId, placementOptionSummary.placementOptionId) &&
        Objects.equals(this.status, placementOptionSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementOptionId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementOptionSummary {\n");
    
    sb.append("    placementOptionId: ").append(toIndentedString(placementOptionId)).append("\n");
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

