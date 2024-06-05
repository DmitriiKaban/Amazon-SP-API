/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, refer to the [Product Pricing v2022-05-01 Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.productpricing;

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
 * The HTTP method associated with an individual request within a batch.
 */
@JsonAdapter(HttpMethod.Adapter.class)
public enum HttpMethod {
  
  GET("GET"),
  
  PUT("PUT"),
  
  PATCH("PATCH"),
  
  DELETE("DELETE"),
  
  POST("POST");

  private String value;

  HttpMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HttpMethod fromValue(String text) {
    for (HttpMethod b : HttpMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<HttpMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final HttpMethod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HttpMethod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return HttpMethod.fromValue(String.valueOf(value));
    }
  }
}

