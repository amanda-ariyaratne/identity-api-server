package org.wso2.carbon.identity.api.server.idp.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.idp.v1.model.Property;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class FederatedAuthenticator   {
  
  private String authenticatorId;

  private String name;

  private Boolean isEnabled = false;

  private List<Property> properties = null;


  /**
   **/
  public FederatedAuthenticator authenticatorId(String authenticatorId) {
    this.authenticatorId = authenticatorId;
    return this;
  }

  
  @ApiModelProperty(example = "U0FNTDJBdXRoZW50aWNhdG9y", required = true, value = "")
  @JsonProperty("authenticatorId")
  @Valid
  @NotNull(message = "Property authenticatorId cannot be null.")
  public String getAuthenticatorId() {
    return authenticatorId;
  }
  public void setAuthenticatorId(String authenticatorId) {
    this.authenticatorId = authenticatorId;
  }


  /**
   **/
  public FederatedAuthenticator name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "SAML2Authenticator", value = "")
  @JsonProperty("name")
  @Valid
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public FederatedAuthenticator isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty("isEnabled")
  @Valid
  public Boolean getIsEnabled() {
    return isEnabled;
  }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  /**
   **/
  public FederatedAuthenticator properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  @Valid
  public List<Property> getProperties() {
    return properties;
  }
  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  public FederatedAuthenticator addPropertiesItem(Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FederatedAuthenticator federatedAuthenticator = (FederatedAuthenticator) o;
    return Objects.equals(this.authenticatorId, federatedAuthenticator.authenticatorId) &&
        Objects.equals(this.name, federatedAuthenticator.name) &&
        Objects.equals(this.isEnabled, federatedAuthenticator.isEnabled) &&
        Objects.equals(this.properties, federatedAuthenticator.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticatorId, name, isEnabled, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FederatedAuthenticator {\n");
    
    sb.append("    authenticatorId: ").append(toIndentedString(authenticatorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

