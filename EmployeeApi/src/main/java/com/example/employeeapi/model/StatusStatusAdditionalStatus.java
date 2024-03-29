/*
 * Employee
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.example.employeeapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StatusStatusAdditionalStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-13T23:10:04.450-05:00[America/New_York]")
public class StatusStatusAdditionalStatus implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("statusCode")
  private String statusCode = null;

  @SerializedName("serverStatusCode")
  private String serverStatusCode = null;

  /**
   * Gets or Sets severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    ERROR("ERROR"),
    INFO("INFO"),
    WARN("WARN");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("severity")
  private SeverityEnum severity = null;

  @SerializedName("statusDesc")
  private String statusDesc = null;

  public StatusStatusAdditionalStatus statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(description = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public StatusStatusAdditionalStatus serverStatusCode(String serverStatusCode) {
    this.serverStatusCode = serverStatusCode;
    return this;
  }

   /**
   * Get serverStatusCode
   * @return serverStatusCode
  **/
  @Schema(description = "")
  public String getServerStatusCode() {
    return serverStatusCode;
  }

  public void setServerStatusCode(String serverStatusCode) {
    this.serverStatusCode = serverStatusCode;
  }

  public StatusStatusAdditionalStatus severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @Schema(description = "")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public StatusStatusAdditionalStatus statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

   /**
   * Get statusDesc
   * @return statusDesc
  **/
  @Schema(description = "")
  public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusStatusAdditionalStatus statusStatusAdditionalStatus = (StatusStatusAdditionalStatus) o;
    return Objects.equals(this.statusCode, statusStatusAdditionalStatus.statusCode) &&
        Objects.equals(this.serverStatusCode, statusStatusAdditionalStatus.serverStatusCode) &&
        Objects.equals(this.severity, statusStatusAdditionalStatus.severity) &&
        Objects.equals(this.statusDesc, statusStatusAdditionalStatus.statusDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, serverStatusCode, severity, statusDesc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusStatusAdditionalStatus {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    serverStatusCode: ").append(toIndentedString(serverStatusCode)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
