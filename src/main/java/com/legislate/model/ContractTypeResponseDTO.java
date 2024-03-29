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
import com.legislate.model.Links;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ContractTypeResponseDTO
 */


public class ContractTypeResponseDTO {
  @SerializedName("_links")
  private Links _links = null;

  @SerializedName("about_html")
  private String aboutHtml = null;

  @SerializedName("about_url")
  private String aboutUrl = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  public ContractTypeResponseDTO _links(Links _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public Links getLinks() {
    return _links;
  }

  public void setLinks(Links _links) {
    this._links = _links;
  }

  public ContractTypeResponseDTO aboutHtml(String aboutHtml) {
    this.aboutHtml = aboutHtml;
    return this;
  }

   /**
   * Get aboutHtml
   * @return aboutHtml
  **/
  @Schema(description = "")
  public String getAboutHtml() {
    return aboutHtml;
  }

  public void setAboutHtml(String aboutHtml) {
    this.aboutHtml = aboutHtml;
  }

  public ContractTypeResponseDTO aboutUrl(String aboutUrl) {
    this.aboutUrl = aboutUrl;
    return this;
  }

   /**
   * Get aboutUrl
   * @return aboutUrl
  **/
  @Schema(description = "")
  public String getAboutUrl() {
    return aboutUrl;
  }

  public void setAboutUrl(String aboutUrl) {
    this.aboutUrl = aboutUrl;
  }

  public ContractTypeResponseDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ContractTypeResponseDTO name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractTypeResponseDTO contractTypeResponseDTO = (ContractTypeResponseDTO) o;
    return Objects.equals(this._links, contractTypeResponseDTO._links) &&
        Objects.equals(this.aboutHtml, contractTypeResponseDTO.aboutHtml) &&
        Objects.equals(this.aboutUrl, contractTypeResponseDTO.aboutUrl) &&
        Objects.equals(this.id, contractTypeResponseDTO.id) &&
        Objects.equals(this.name, contractTypeResponseDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, aboutHtml, aboutUrl, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractTypeResponseDTO {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    aboutHtml: ").append(toIndentedString(aboutHtml)).append("\n");
    sb.append("    aboutUrl: ").append(toIndentedString(aboutUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
