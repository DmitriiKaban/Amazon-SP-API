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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The delivery confirmation level.
 */
@JsonAdapter(DeliveryExperienceOption.Adapter.class)
public enum DeliveryExperienceOption {
  
  DELIVERYCONFIRMATIONWITHADULTSIGNATURE("DeliveryConfirmationWithAdultSignature"),
  
  DELIVERYCONFIRMATIONWITHSIGNATURE("DeliveryConfirmationWithSignature"),
  
  DELIVERYCONFIRMATIONWITHOUTSIGNATURE("DeliveryConfirmationWithoutSignature"),
  
  NOTRACKING("NoTracking"),
  
  NOPREFERENCE("NoPreference");

  private String value;

  DeliveryExperienceOption(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeliveryExperienceOption fromValue(String text) {
    for (DeliveryExperienceOption b : DeliveryExperienceOption.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DeliveryExperienceOption> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeliveryExperienceOption enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeliveryExperienceOption read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeliveryExperienceOption.fromValue(String.valueOf(value));
    }
  }
}

