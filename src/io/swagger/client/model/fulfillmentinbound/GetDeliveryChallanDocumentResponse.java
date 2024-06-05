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
 * The &#x60;getDeliveryChallanDocumentResponse&#x60; response.
 */
@ApiModel(description = "The `getDeliveryChallanDocumentResponse` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:29.243+03:00")
public class GetDeliveryChallanDocumentResponse {
  @SerializedName("documentDownload")
  private DocumentDownload documentDownload = null;

  public GetDeliveryChallanDocumentResponse documentDownload(DocumentDownload documentDownload) {
    this.documentDownload = documentDownload;
    return this;
  }

   /**
   * Get documentDownload
   * @return documentDownload
  **/
  @ApiModelProperty(required = true, value = "")
  public DocumentDownload getDocumentDownload() {
    return documentDownload;
  }

  public void setDocumentDownload(DocumentDownload documentDownload) {
    this.documentDownload = documentDownload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDeliveryChallanDocumentResponse getDeliveryChallanDocumentResponse = (GetDeliveryChallanDocumentResponse) o;
    return Objects.equals(this.documentDownload, getDeliveryChallanDocumentResponse.documentDownload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDownload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDeliveryChallanDocumentResponse {\n");
    
    sb.append("    documentDownload: ").append(toIndentedString(documentDownload)).append("\n");
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

