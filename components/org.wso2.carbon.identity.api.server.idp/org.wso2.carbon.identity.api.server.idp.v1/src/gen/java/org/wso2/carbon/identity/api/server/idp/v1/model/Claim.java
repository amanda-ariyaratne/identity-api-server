package org.wso2.carbon.identity.api.server.idp.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;


public class Claim   {
  
  private String id;

  private String uri;

  private String displayName;


  /**
   **/
  public Claim id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "aHR0cDovL3dzbzIub3JnL2NsYWltcy91c2VybmFtZQ==", required = true, value = "")
  @JsonProperty("id")
  @Valid
  @NotNull(message = "Property id cannot be null.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public Claim uri(String uri) {
    this.uri = uri;
    return this;
  }

  
  @ApiModelProperty(example = "http://wso2.org/claims/username", value = "")
  @JsonProperty("uri")
  @Valid
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   **/
  public Claim displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(example = "Username", value = "")
  @JsonProperty("displayName")
  @Valid
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Claim claim = (Claim) o;
    return Objects.equals(this.id, claim.id) &&
        Objects.equals(this.uri, claim.uri) &&
        Objects.equals(this.displayName, claim.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Claim {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

