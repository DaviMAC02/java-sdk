package com.infratoken.sdk.domain.dtos.assets;

public class GuarantorDTO {
  private String name;
  private String document;
  private String email;

  public GuarantorDTO(String name, String document, String email) {
    this.name = name;
    this.document = document;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}