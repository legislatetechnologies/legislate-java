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
import com.legislate.model.ContractFieldResponseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ContractFieldOptionDTO
 */


public class ContractFieldOptionDTO {
  @SerializedName("nested_fields")
  private List<ContractFieldResponseDTO> nestedFields = null;

  @SerializedName("value")
  private String value = null;

  public ContractFieldOptionDTO nestedFields(List<ContractFieldResponseDTO> nestedFields) {
    this.nestedFields = nestedFields;
    return this;
  }

  public ContractFieldOptionDTO addNestedFieldsItem(ContractFieldResponseDTO nestedFieldsItem) {
    if (this.nestedFields == null) {
      this.nestedFields = new ArrayList<ContractFieldResponseDTO>();
    }
    this.nestedFields.add(nestedFieldsItem);
    return this;
  }

   /**
   * Get nestedFields
   * @return nestedFields
  **/
  @Schema(description = "")
  public List<ContractFieldResponseDTO> getNestedFields() {
    return nestedFields;
  }

  public void setNestedFields(List<ContractFieldResponseDTO> nestedFields) {
    this.nestedFields = nestedFields;
  }

  public ContractFieldOptionDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    ContractFieldOptionDTO contractFieldOptionDTO = (ContractFieldOptionDTO) o;
    return Objects.equals(this.nestedFields, contractFieldOptionDTO.nestedFields) &&
        Objects.equals(this.value, contractFieldOptionDTO.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nestedFields, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractFieldOptionDTO {\n");
    
    sb.append("    nestedFields: ").append(toIndentedString(nestedFields)).append("\n");
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
