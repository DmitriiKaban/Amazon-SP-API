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

/**
 * Input information for a given box.
 */
@ApiModel(description = "Input information for a given box.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:29.243+03:00")
public class BoxInput {
  @SerializedName("boxId")
  private String boxId = null;

  @SerializedName("contentInformationSource")
  private BoxContentInformationSource contentInformationSource = null;

  @SerializedName("contents")
  private List<BoxContent> contents = null;

  @SerializedName("dimensions")
  private Dimensions dimensions = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("templateName")
  private String templateName = null;

  @SerializedName("weight")
  private Weight weight = null;

  public BoxInput boxId(String boxId) {
    this.boxId = boxId;
    return this;
  }

   /**
   * The ID of the box to update that was provided by Amazon. This ID is comprised of the external shipment ID         (which is generated after transportation has been confirmed) and the index of the box.
   * @return boxId
  **/
  @ApiModelProperty(value = "The ID of the box to update that was provided by Amazon. This ID is comprised of the external shipment ID         (which is generated after transportation has been confirmed) and the index of the box.")
  public String getBoxId() {
    return boxId;
  }

  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }

  public BoxInput contentInformationSource(BoxContentInformationSource contentInformationSource) {
    this.contentInformationSource = contentInformationSource;
    return this;
  }

   /**
   * Get contentInformationSource
   * @return contentInformationSource
  **/
  @ApiModelProperty(required = true, value = "")
  public BoxContentInformationSource getContentInformationSource() {
    return contentInformationSource;
  }

  public void setContentInformationSource(BoxContentInformationSource contentInformationSource) {
    this.contentInformationSource = contentInformationSource;
  }

  public BoxInput contents(List<BoxContent> contents) {
    this.contents = contents;
    return this;
  }

  public BoxInput addContentsItem(BoxContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<BoxContent>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * The Contents of the box containing a list of MSKUs and their quantity. If &#x60;boxAttribute&#x60; is &#x60;BARCODE_2D&#x60; or &#x60;MANUAL_PROCESS&#x60;, user should provide ALL of the items that could be in the box, without specifying item quantities.
   * @return contents
  **/
  @ApiModelProperty(value = "The Contents of the box containing a list of MSKUs and their quantity. If `boxAttribute` is `BARCODE_2D` or `MANUAL_PROCESS`, user should provide ALL of the items that could be in the box, without specifying item quantities.")
  public List<BoxContent> getContents() {
    return contents;
  }

  public void setContents(List<BoxContent> contents) {
    this.contents = contents;
  }

  public BoxInput dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public BoxInput quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of containers where all other properties like weight or dimensions are identical.
   * minimum: 1
   * maximum: 10000
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of containers where all other properties like weight or dimensions are identical.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BoxInput templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * The seller-provided name for a &#39;type&#39; of box (or a group of boxes with the same contents), which will be used to identify all created boxes of that type. When providing bulk box information, this value must be unique from the other box types. When providing individual boxes with existing IDs, this value can be shared between many boxes that have the same contents.
   * @return templateName
  **/
  @ApiModelProperty(required = true, value = "The seller-provided name for a 'type' of box (or a group of boxes with the same contents), which will be used to identify all created boxes of that type. When providing bulk box information, this value must be unique from the other box types. When providing individual boxes with existing IDs, this value can be shared between many boxes that have the same contents.")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public BoxInput weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxInput boxInput = (BoxInput) o;
    return Objects.equals(this.boxId, boxInput.boxId) &&
        Objects.equals(this.contentInformationSource, boxInput.contentInformationSource) &&
        Objects.equals(this.contents, boxInput.contents) &&
        Objects.equals(this.dimensions, boxInput.dimensions) &&
        Objects.equals(this.quantity, boxInput.quantity) &&
        Objects.equals(this.templateName, boxInput.templateName) &&
        Objects.equals(this.weight, boxInput.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxId, contentInformationSource, contents, dimensions, quantity, templateName, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxInput {\n");
    
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    contentInformationSource: ").append(toIndentedString(contentInformationSource)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

