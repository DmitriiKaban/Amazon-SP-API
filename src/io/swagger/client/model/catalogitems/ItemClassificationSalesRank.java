/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.catalogitems;

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
 * Sales rank of an Amazon catalog item by classification.
 */
@ApiModel(description = "Sales rank of an Amazon catalog item by classification.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:11.421+03:00")
public class ItemClassificationSalesRank {
  @SerializedName("classificationId")
  private String classificationId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("rank")
  private Integer rank = null;

  public ItemClassificationSalesRank classificationId(String classificationId) {
    this.classificationId = classificationId;
    return this;
  }

   /**
   * Identifier of the classification associated with the sales rank.
   * @return classificationId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the classification associated with the sales rank.")
  public String getClassificationId() {
    return classificationId;
  }

  public void setClassificationId(String classificationId) {
    this.classificationId = classificationId;
  }

  public ItemClassificationSalesRank title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title, or name, of the sales rank.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Title, or name, of the sales rank.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ItemClassificationSalesRank link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Corresponding Amazon retail website link, or URL, for the sales rank.
   * @return link
  **/
  @ApiModelProperty(value = "Corresponding Amazon retail website link, or URL, for the sales rank.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ItemClassificationSalesRank rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Sales rank value.
   * @return rank
  **/
  @ApiModelProperty(required = true, value = "Sales rank value.")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemClassificationSalesRank itemClassificationSalesRank = (ItemClassificationSalesRank) o;
    return Objects.equals(this.classificationId, itemClassificationSalesRank.classificationId) &&
        Objects.equals(this.title, itemClassificationSalesRank.title) &&
        Objects.equals(this.link, itemClassificationSalesRank.link) &&
        Objects.equals(this.rank, itemClassificationSalesRank.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationId, title, link, rank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemClassificationSalesRank {\n");
    
    sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

