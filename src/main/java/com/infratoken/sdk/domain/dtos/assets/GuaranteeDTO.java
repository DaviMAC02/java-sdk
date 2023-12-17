package com.infratoken.sdk.domain.dtos.assets;

import java.util.List;

public class GuaranteeDTO {
  private String name;
  private String description;
  private String file;
  private List<GuarantorDTO> guarantors;

  public GuaranteeDTO(String name, String description, String file, List<GuarantorDTO> guarantors) {
    this.name = name;
    this.description = description;
    this.file = file;
    this.guarantors = guarantors;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public List<GuarantorDTO> getGuarantors() {
    return guarantors;
  }

  public void setGuarantors(List<GuarantorDTO> guarantors) {
    this.guarantors = guarantors;
  }

  // Getters and Setters
}
