/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Listings Restrictions
 * The Selling Partner API for Listings Restrictions provides programmatic access to restrictions on Amazon catalog listings.  For more information, see the [Listings Restrictions API Use Case Guide](doc:listings-restrictions-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.listingsrestrictions;

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
 * A link to resources related to a listing restriction.
 */
@ApiModel(description = "A link to resources related to a listing restriction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:37.767+03:00")
public class Link {
  @SerializedName("resource")
  private String resource = null;

  /**
   * The HTTP verb used to interact with the related resource.
   */
  @JsonAdapter(VerbEnum.Adapter.class)
  public enum VerbEnum {
    GET("GET");

    private String value;

    VerbEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerbEnum fromValue(String text) {
      for (VerbEnum b : VerbEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerbEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerbEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerbEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerbEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("verb")
  private VerbEnum verb = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  public Link resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The URI of the related resource.
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "The URI of the related resource.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public Link verb(VerbEnum verb) {
    this.verb = verb;
    return this;
  }

   /**
   * The HTTP verb used to interact with the related resource.
   * @return verb
  **/
  @ApiModelProperty(required = true, value = "The HTTP verb used to interact with the related resource.")
  public VerbEnum getVerb() {
    return verb;
  }

  public void setVerb(VerbEnum verb) {
    this.verb = verb;
  }

  public Link title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the related resource.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the related resource.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Link type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The media type of the related resource.
   * @return type
  **/
  @ApiModelProperty(value = "The media type of the related resource.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.resource, link.resource) &&
        Objects.equals(this.verb, link.verb) &&
        Objects.equals(this.title, link.title) &&
        Objects.equals(this.type, link.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, verb, title, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

