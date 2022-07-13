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
import io.swagger.client.model.FieldDTO;
import io.swagger.client.model.Links;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ContractCollaboratorResponseDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-07T16:18:08.349882+02:00[Europe/Madrid]")
public class ContractCollaboratorResponseDTO {
  @SerializedName("_links")
  private Links _links = null;

  @SerializedName("collaborator_name")
  private String collaboratorName = null;

  @SerializedName("contract_id")
  private Long contractId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("fields")
  private List<FieldDTO> fields = null;

  @SerializedName("id")
  private Long id = null;

  /**
   * Gets or Sets roles
   */
  @JsonAdapter(RolesEnum.Adapter.class)
  public enum RolesEnum {
    COLLABORATOR("collaborator"),
    PARTY("party"),
    SIGNATORY("signatory"),
    SUPP_SIG("supp_sig"),
    WITNESS("witness");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RolesEnum fromValue(String input) {
      for (RolesEnum b : RolesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RolesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RolesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("roles")
  private List<RolesEnum> roles = null;

  /**
   * Gets or Sets side
   */
  @JsonAdapter(SideEnum.Adapter.class)
  public enum SideEnum {
    BOTH("both"),
    FIRST("first"),
    SECOND("second");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SideEnum fromValue(String input) {
      for (SideEnum b : SideEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SideEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SideEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("side")
  private SideEnum side = null;

  @SerializedName("user_id")
  private Long userId = null;

  public ContractCollaboratorResponseDTO _links(Links _links) {
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

  public ContractCollaboratorResponseDTO collaboratorName(String collaboratorName) {
    this.collaboratorName = collaboratorName;
    return this;
  }

   /**
   * Get collaboratorName
   * @return collaboratorName
  **/
  @Schema(description = "")
  public String getCollaboratorName() {
    return collaboratorName;
  }

  public void setCollaboratorName(String collaboratorName) {
    this.collaboratorName = collaboratorName;
  }

  public ContractCollaboratorResponseDTO contractId(Long contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Get contractId
   * @return contractId
  **/
  @Schema(description = "")
  public Long getContractId() {
    return contractId;
  }

  public void setContractId(Long contractId) {
    this.contractId = contractId;
  }

  public ContractCollaboratorResponseDTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContractCollaboratorResponseDTO fields(List<FieldDTO> fields) {
    this.fields = fields;
    return this;
  }

  public ContractCollaboratorResponseDTO addFieldsItem(FieldDTO fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldDTO>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @Schema(description = "")
  public List<FieldDTO> getFields() {
    return fields;
  }

  public void setFields(List<FieldDTO> fields) {
    this.fields = fields;
  }

  public ContractCollaboratorResponseDTO id(Long id) {
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

  public ContractCollaboratorResponseDTO roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public ContractCollaboratorResponseDTO addRolesItem(RolesEnum rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RolesEnum>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  public ContractCollaboratorResponseDTO side(SideEnum side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @Schema(description = "")
  public SideEnum getSide() {
    return side;
  }

  public void setSide(SideEnum side) {
    this.side = side;
  }

  public ContractCollaboratorResponseDTO userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractCollaboratorResponseDTO contractCollaboratorResponseDTO = (ContractCollaboratorResponseDTO) o;
    return Objects.equals(this._links, contractCollaboratorResponseDTO._links) &&
        Objects.equals(this.collaboratorName, contractCollaboratorResponseDTO.collaboratorName) &&
        Objects.equals(this.contractId, contractCollaboratorResponseDTO.contractId) &&
        Objects.equals(this.email, contractCollaboratorResponseDTO.email) &&
        Objects.equals(this.fields, contractCollaboratorResponseDTO.fields) &&
        Objects.equals(this.id, contractCollaboratorResponseDTO.id) &&
        Objects.equals(this.roles, contractCollaboratorResponseDTO.roles) &&
        Objects.equals(this.side, contractCollaboratorResponseDTO.side) &&
        Objects.equals(this.userId, contractCollaboratorResponseDTO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, collaboratorName, contractId, email, fields, id, roles, side, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractCollaboratorResponseDTO {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    collaboratorName: ").append(toIndentedString(collaboratorName)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
