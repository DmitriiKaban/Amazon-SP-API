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
import java.math.BigDecimal;

/**
 * Liquid Volume.
 */
@ApiModel(description = "Liquid Volume.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:39.136+03:00")
public class LiquidVolume {
  /**
   * The unit of measurement.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    ML("ML"),
    
    L("L"),
    
    FL_OZ("FL_OZ"),
    
    GAL("GAL"),
    
    PT("PT"),
    
    QT("QT"),
    
    C("C");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String text) {
      for (UnitEnum b : UnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Unit")
  private UnitEnum unit = null;

  @SerializedName("Value")
  private BigDecimal value = null;

  public LiquidVolume unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of measurement.
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "The unit of measurement.")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public LiquidVolume value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The measurement value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The measurement value.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiquidVolume liquidVolume = (LiquidVolume) o;
    return Objects.equals(this.unit, liquidVolume.unit) &&
        Objects.equals(this.value, liquidVolume.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiquidVolume {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

