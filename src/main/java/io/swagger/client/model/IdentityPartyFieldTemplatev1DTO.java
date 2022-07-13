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
import io.swagger.client.model.IdentityFieldOptionDTO;
import io.swagger.client.model.RoleVisibilityDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * IdentityPartyFieldTemplatev1DTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-07T16:18:08.349882+02:00[Europe/Madrid]")
public class IdentityPartyFieldTemplatev1DTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("identity_field_id")
  private Long identityFieldId = null;

  @SerializedName("index")
  private Long index = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("options")
  private List<IdentityFieldOptionDTO> options = null;

  @SerializedName("parentOption")
  private String parentOption = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("rolesVisibilityList")
  private List<RoleVisibilityDTO> rolesVisibilityList = null;

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

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ADDRESS("address"),
    CURRENCY("currency"),
    DATE("date"),
    DISTANCE("distance"),
    DURATION("duration"),
    DURATION_PLAIN("duration_plain"),
    INPUT("input"),
    RADIO("radio"),
    SELECT("select"),
    UPLOAD("upload");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  @SerializedName("validation_type")
  private String validationType = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("value_type")
  private String valueType = null;

  public IdentityPartyFieldTemplatev1DTO id(Long id) {
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

  public IdentityPartyFieldTemplatev1DTO identityFieldId(Long identityFieldId) {
    this.identityFieldId = identityFieldId;
    return this;
  }

   /**
   * Get identityFieldId
   * @return identityFieldId
  **/
  @Schema(description = "")
  public Long getIdentityFieldId() {
    return identityFieldId;
  }

  public void setIdentityFieldId(Long identityFieldId) {
    this.identityFieldId = identityFieldId;
  }

  public IdentityPartyFieldTemplatev1DTO index(Long index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(description = "")
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public IdentityPartyFieldTemplatev1DTO label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public IdentityPartyFieldTemplatev1DTO name(String name) {
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

  public IdentityPartyFieldTemplatev1DTO options(List<IdentityFieldOptionDTO> options) {
    this.options = options;
    return this;
  }

  public IdentityPartyFieldTemplatev1DTO addOptionsItem(IdentityFieldOptionDTO optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<IdentityFieldOptionDTO>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public List<IdentityFieldOptionDTO> getOptions() {
    return options;
  }

  public void setOptions(List<IdentityFieldOptionDTO> options) {
    this.options = options;
  }

  public IdentityPartyFieldTemplatev1DTO parentOption(String parentOption) {
    this.parentOption = parentOption;
    return this;
  }

   /**
   * Get parentOption
   * @return parentOption
  **/
  @Schema(description = "")
  public String getParentOption() {
    return parentOption;
  }

  public void setParentOption(String parentOption) {
    this.parentOption = parentOption;
  }

  public IdentityPartyFieldTemplatev1DTO required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @Schema(description = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public IdentityPartyFieldTemplatev1DTO rolesVisibilityList(List<RoleVisibilityDTO> rolesVisibilityList) {
    this.rolesVisibilityList = rolesVisibilityList;
    return this;
  }

  public IdentityPartyFieldTemplatev1DTO addRolesVisibilityListItem(RoleVisibilityDTO rolesVisibilityListItem) {
    if (this.rolesVisibilityList == null) {
      this.rolesVisibilityList = new ArrayList<RoleVisibilityDTO>();
    }
    this.rolesVisibilityList.add(rolesVisibilityListItem);
    return this;
  }

   /**
   * Get rolesVisibilityList
   * @return rolesVisibilityList
  **/
  @Schema(description = "")
  public List<RoleVisibilityDTO> getRolesVisibilityList() {
    return rolesVisibilityList;
  }

  public void setRolesVisibilityList(List<RoleVisibilityDTO> rolesVisibilityList) {
    this.rolesVisibilityList = rolesVisibilityList;
  }

  public IdentityPartyFieldTemplatev1DTO side(SideEnum side) {
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

  public IdentityPartyFieldTemplatev1DTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public IdentityPartyFieldTemplatev1DTO updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public IdentityPartyFieldTemplatev1DTO validationType(String validationType) {
    this.validationType = validationType;
    return this;
  }

   /**
   * Get validationType
   * @return validationType
  **/
  @Schema(description = "")
  public String getValidationType() {
    return validationType;
  }

  public void setValidationType(String validationType) {
    this.validationType = validationType;
  }

  public IdentityPartyFieldTemplatev1DTO value(String value) {
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

  public IdentityPartyFieldTemplatev1DTO valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @Schema(description = "")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityPartyFieldTemplatev1DTO identityPartyFieldTemplatev1DTO = (IdentityPartyFieldTemplatev1DTO) o;
    return Objects.equals(this.id, identityPartyFieldTemplatev1DTO.id) &&
        Objects.equals(this.identityFieldId, identityPartyFieldTemplatev1DTO.identityFieldId) &&
        Objects.equals(this.index, identityPartyFieldTemplatev1DTO.index) &&
        Objects.equals(this.label, identityPartyFieldTemplatev1DTO.label) &&
        Objects.equals(this.name, identityPartyFieldTemplatev1DTO.name) &&
        Objects.equals(this.options, identityPartyFieldTemplatev1DTO.options) &&
        Objects.equals(this.parentOption, identityPartyFieldTemplatev1DTO.parentOption) &&
        Objects.equals(this.required, identityPartyFieldTemplatev1DTO.required) &&
        Objects.equals(this.rolesVisibilityList, identityPartyFieldTemplatev1DTO.rolesVisibilityList) &&
        Objects.equals(this.side, identityPartyFieldTemplatev1DTO.side) &&
        Objects.equals(this.type, identityPartyFieldTemplatev1DTO.type) &&
        Objects.equals(this.updated, identityPartyFieldTemplatev1DTO.updated) &&
        Objects.equals(this.validationType, identityPartyFieldTemplatev1DTO.validationType) &&
        Objects.equals(this.value, identityPartyFieldTemplatev1DTO.value) &&
        Objects.equals(this.valueType, identityPartyFieldTemplatev1DTO.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identityFieldId, index, label, name, options, parentOption, required, rolesVisibilityList, side, type, updated, validationType, value, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityPartyFieldTemplatev1DTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identityFieldId: ").append(toIndentedString(identityFieldId)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    parentOption: ").append(toIndentedString(parentOption)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    rolesVisibilityList: ").append(toIndentedString(rolesVisibilityList)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
