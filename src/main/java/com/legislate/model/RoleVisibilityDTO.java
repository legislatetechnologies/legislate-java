/*
 * Legislate API
 * The Legislate API is organized around REST. Our API has predictable resource-oriented URLs, accepts form-encoded request bodies, returns JSON-encoded responses, and uses standard HTTP response codes, authentication, and verbs.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.legislate.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * RoleVisibilityDTO
 */


public class RoleVisibilityDTO {
  /**
   * Gets or Sets role
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    COLLABORATOR("collaborator"),
    PARTY("party"),
    PARTY_WITH_SIGNATORY("party_with_signatory"),
    SIGNATORY("signatory"),
    SUPP_SIG("supp_sig"),
    WITNESS("witness");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RoleEnum fromValue(String input) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RoleEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("visibility")
  private Boolean visibility = null;

  public RoleVisibilityDTO role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @Schema(description = "")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public RoleVisibilityDTO visibility(Boolean visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @Schema(description = "")
  public Boolean isVisibility() {
    return visibility;
  }

  public void setVisibility(Boolean visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleVisibilityDTO roleVisibilityDTO = (RoleVisibilityDTO) o;
    return Objects.equals(this.role, roleVisibilityDTO.role) &&
        Objects.equals(this.visibility, roleVisibilityDTO.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleVisibilityDTO {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
