/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.merchantfulfillment;

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
 * Details related to any dangerous goods/items that are being shipped.
 */
@ApiModel(description = "Details related to any dangerous goods/items that are being shipped.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:39.136+03:00")
public class DangerousGoodsDetails {
  @SerializedName("UnitedNationsRegulatoryId")
  private String unitedNationsRegulatoryId = null;

  @SerializedName("TransportationRegulatoryClass")
  private String transportationRegulatoryClass = null;

  /**
   * The specific packaging group of the item being shipped.
   */
  @JsonAdapter(PackingGroupEnum.Adapter.class)
  public enum PackingGroupEnum {
    I("I"),
    
    II("II"),
    
    III("III");

    private String value;

    PackingGroupEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PackingGroupEnum fromValue(String text) {
      for (PackingGroupEnum b : PackingGroupEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PackingGroupEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PackingGroupEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PackingGroupEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PackingGroupEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PackingGroup")
  private PackingGroupEnum packingGroup = null;

  /**
   * The specific packing instruction of the item being shipped.
   */
  @JsonAdapter(PackingInstructionEnum.Adapter.class)
  public enum PackingInstructionEnum {
    PI965_SECTION_IA("PI965_SECTION_IA"),
    
    PI965_SECTION_IB("PI965_SECTION_IB"),
    
    PI965_SECTION_II("PI965_SECTION_II"),
    
    PI966_SECTION_I("PI966_SECTION_I"),
    
    PI966_SECTION_II("PI966_SECTION_II"),
    
    PI967_SECTION_I("PI967_SECTION_I"),
    
    PI967_SECTION_II("PI967_SECTION_II"),
    
    PI968_SECTION_IA("PI968_SECTION_IA"),
    
    PI968_SECTION_IB("PI968_SECTION_IB"),
    
    PI969_SECTION_I("PI969_SECTION_I"),
    
    PI969_SECTION_II("PI969_SECTION_II"),
    
    PI970_SECTION_I("PI970_SECTION_I"),
    
    PI970_SECTION_II("PI970_SECTION_II");

    private String value;

    PackingInstructionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PackingInstructionEnum fromValue(String text) {
      for (PackingInstructionEnum b : PackingInstructionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PackingInstructionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PackingInstructionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PackingInstructionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PackingInstructionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PackingInstruction")
  private PackingInstructionEnum packingInstruction = null;

  public DangerousGoodsDetails unitedNationsRegulatoryId(String unitedNationsRegulatoryId) {
    this.unitedNationsRegulatoryId = unitedNationsRegulatoryId;
    return this;
  }

   /**
   * The specific UNID of the item being shipped.
   * @return unitedNationsRegulatoryId
  **/
  @ApiModelProperty(value = "The specific UNID of the item being shipped.")
  public String getUnitedNationsRegulatoryId() {
    return unitedNationsRegulatoryId;
  }

  public void setUnitedNationsRegulatoryId(String unitedNationsRegulatoryId) {
    this.unitedNationsRegulatoryId = unitedNationsRegulatoryId;
  }

  public DangerousGoodsDetails transportationRegulatoryClass(String transportationRegulatoryClass) {
    this.transportationRegulatoryClass = transportationRegulatoryClass;
    return this;
  }

   /**
   * The specific regulatory class  of the item being shipped.
   * @return transportationRegulatoryClass
  **/
  @ApiModelProperty(value = "The specific regulatory class  of the item being shipped.")
  public String getTransportationRegulatoryClass() {
    return transportationRegulatoryClass;
  }

  public void setTransportationRegulatoryClass(String transportationRegulatoryClass) {
    this.transportationRegulatoryClass = transportationRegulatoryClass;
  }

  public DangerousGoodsDetails packingGroup(PackingGroupEnum packingGroup) {
    this.packingGroup = packingGroup;
    return this;
  }

   /**
   * The specific packaging group of the item being shipped.
   * @return packingGroup
  **/
  @ApiModelProperty(value = "The specific packaging group of the item being shipped.")
  public PackingGroupEnum getPackingGroup() {
    return packingGroup;
  }

  public void setPackingGroup(PackingGroupEnum packingGroup) {
    this.packingGroup = packingGroup;
  }

  public DangerousGoodsDetails packingInstruction(PackingInstructionEnum packingInstruction) {
    this.packingInstruction = packingInstruction;
    return this;
  }

   /**
   * The specific packing instruction of the item being shipped.
   * @return packingInstruction
  **/
  @ApiModelProperty(value = "The specific packing instruction of the item being shipped.")
  public PackingInstructionEnum getPackingInstruction() {
    return packingInstruction;
  }

  public void setPackingInstruction(PackingInstructionEnum packingInstruction) {
    this.packingInstruction = packingInstruction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DangerousGoodsDetails dangerousGoodsDetails = (DangerousGoodsDetails) o;
    return Objects.equals(this.unitedNationsRegulatoryId, dangerousGoodsDetails.unitedNationsRegulatoryId) &&
        Objects.equals(this.transportationRegulatoryClass, dangerousGoodsDetails.transportationRegulatoryClass) &&
        Objects.equals(this.packingGroup, dangerousGoodsDetails.packingGroup) &&
        Objects.equals(this.packingInstruction, dangerousGoodsDetails.packingInstruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitedNationsRegulatoryId, transportationRegulatoryClass, packingGroup, packingInstruction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DangerousGoodsDetails {\n");
    
    sb.append("    unitedNationsRegulatoryId: ").append(toIndentedString(unitedNationsRegulatoryId)).append("\n");
    sb.append("    transportationRegulatoryClass: ").append(toIndentedString(transportationRegulatoryClass)).append("\n");
    sb.append("    packingGroup: ").append(toIndentedString(packingGroup)).append("\n");
    sb.append("    packingInstruction: ").append(toIndentedString(packingInstruction)).append("\n");
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

