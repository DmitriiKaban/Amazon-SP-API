/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.easyship;

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
 * An error code that identifies the type of error that occurred. The error codes listed below are specific to the Easy Ship section.
 */
@JsonAdapter(Code.Adapter.class)
public enum Code {
  
  INVALIDINPUT("InvalidInput"),
  
  INVALIDTIMESLOTID("InvalidTimeSlotId"),
  
  SCHEDULEDPACKAGEALREADYEXISTS("ScheduledPackageAlreadyExists"),
  
  SCHEDULEWINDOWEXPIRED("ScheduleWindowExpired"),
  
  RETRYABLEAFTERGETTINGNEWSLOTS("RetryableAfterGettingNewSlots"),
  
  TIMESLOTNOTAVAILABLE("TimeSlotNotAvailable"),
  
  RESOURCENOTFOUND("ResourceNotFound"),
  
  INVALIDORDERSTATE("InvalidOrderState"),
  
  REGIONNOTSUPPORTED("RegionNotSupported"),
  
  ORDERNOTELIGIBLEFORRESCHEDULING("OrderNotEligibleForRescheduling"),
  
  INTERNALSERVERERROR("InternalServerError");

  private String value;

  Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Code fromValue(String text) {
    for (Code b : Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Code.fromValue(String.valueOf(value));
    }
  }
}

