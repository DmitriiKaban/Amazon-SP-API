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
import java.math.BigDecimal;

/**
 * Measurement information for an order item.
 */
@ApiModel(description = "Measurement information for an order item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:45.401+03:00")
public class Measurement {
  /**
   * The unit of measure for this measurement.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    OUNCES("OUNCES"),
    
    POUNDS("POUNDS"),
    
    KILOGRAMS("KILOGRAMS"),
    
    GRAMS("GRAMS"),
    
    MILLIGRAMS("MILLIGRAMS"),
    
    INCHES("INCHES"),
    
    FEET("FEET"),
    
    METERS("METERS"),
    
    CENTIMETERS("CENTIMETERS"),
    
    MILLIMETERS("MILLIMETERS"),
    
    SQUARE_METERS("SQUARE_METERS"),
    
    SQUARE_CENTIMETERS("SQUARE_CENTIMETERS"),
    
    SQUARE_FEET("SQUARE_FEET"),
    
    SQUARE_INCHES("SQUARE_INCHES"),
    
    GALLONS("GALLONS"),
    
    PINTS("PINTS"),
    
    QUARTS("QUARTS"),
    
    FLUID_OUNCES("FLUID_OUNCES"),
    
    LITERS("LITERS"),
    
    CUBIC_METERS("CUBIC_METERS"),
    
    CUBIC_FEET("CUBIC_FEET"),
    
    CUBIC_INCHES("CUBIC_INCHES"),
    
    CUBIC_CENTIMETERS("CUBIC_CENTIMETERS"),
    
    COUNT("COUNT");

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

  public Measurement unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of measure for this measurement.
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "The unit of measure for this measurement.")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public Measurement value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the measurement.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the measurement.")
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
    Measurement measurement = (Measurement) o;
    return Objects.equals(this.unit, measurement.unit) &&
        Objects.equals(this.value, measurement.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Measurement {\n");
    
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

