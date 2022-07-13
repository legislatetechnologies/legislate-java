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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.IdentityPartyFieldTemplatev1DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * IdentityFieldOptionDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-07T16:18:08.349882+02:00[Europe/Madrid]")
public class IdentityFieldOptionDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("nested_fields")
  private List<IdentityPartyFieldTemplatev1DTO> nestedFields = null;

  public IdentityFieldOptionDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IdentityFieldOptionDTO nestedFields(List<IdentityPartyFieldTemplatev1DTO> nestedFields) {
    this.nestedFields = nestedFields;
    return this;
  }

  public IdentityFieldOptionDTO addNestedFieldsItem(IdentityPartyFieldTemplatev1DTO nestedFieldsItem) {
    if (this.nestedFields == null) {
      this.nestedFields = new ArrayList<IdentityPartyFieldTemplatev1DTO>();
    }
    this.nestedFields.add(nestedFieldsItem);
    return this;
  }

   /**
   * Get nestedFields
   * @return nestedFields
  **/
  @Schema(description = "")
  public List<IdentityPartyFieldTemplatev1DTO> getNestedFields() {
    return nestedFields;
  }

  public void setNestedFields(List<IdentityPartyFieldTemplatev1DTO> nestedFields) {
    this.nestedFields = nestedFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityFieldOptionDTO identityFieldOptionDTO = (IdentityFieldOptionDTO) o;
    return Objects.equals(this.name, identityFieldOptionDTO.name) &&
        Objects.equals(this.nestedFields, identityFieldOptionDTO.nestedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nestedFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityFieldOptionDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nestedFields: ").append(toIndentedString(nestedFields)).append("\n");
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
