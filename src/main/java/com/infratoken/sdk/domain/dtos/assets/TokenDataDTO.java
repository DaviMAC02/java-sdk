package com.infratoken.sdk.domain.dtos.assets;

public class TokenDataDTO {
  private String label;
  private Object value;
  private String description;
  private String icon;

  public TokenDataDTO(String label, Object value, String description, String icon) {
    this.label = label;
    this.value = value;
    this.description = description;
    this.icon = icon;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }
}