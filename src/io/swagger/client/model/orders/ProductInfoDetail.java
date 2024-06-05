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
import java.io.IOException;

/**
 * Product information on the number of items.
 */
@ApiModel(description = "Product information on the number of items.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:45.401+03:00")
public class ProductInfoDetail {
  @SerializedName("NumberOfItems")
  private String numberOfItems = null;

  public ProductInfoDetail numberOfItems(String numberOfItems) {
    this.numberOfItems = numberOfItems;
    return this;
  }

   /**
   * The total number of items that are included in the ASIN.
   * @return numberOfItems
  **/
  @ApiModelProperty(value = "The total number of items that are included in the ASIN.")
  public String getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(String numberOfItems) {
    this.numberOfItems = numberOfItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInfoDetail productInfoDetail = (ProductInfoDetail) o;
    return Objects.equals(this.numberOfItems, productInfoDetail.numberOfItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInfoDetail {\n");
    
    sb.append("    numberOfItems: ").append(toIndentedString(numberOfItems)).append("\n");
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
