package com.infratoken.sdk.domain.dtos.assets;

import java.util.List;

public class SettleInstallmentDTO {
  private String tokenCode;
  private List<InstallmentToBeSettledDTO> installmentsToBeSettled;

  public SettleInstallmentDTO(String tokenCode, List<InstallmentToBeSettledDTO> installmentsToBeSettled) {
    this.tokenCode = tokenCode;
    this.installmentsToBeSettled = installmentsToBeSettled;
  }

  public String getTokenCode() {
    return tokenCode;
  }

  public void setTokenCode(String tokenCode) {
    this.tokenCode = tokenCode;
  }

  public List<InstallmentToBeSettledDTO> getInstallmentsToBeSettled() {
    return installmentsToBeSettled;
  }

  public void setInstallmentsToBeSettled(List<InstallmentToBeSettledDTO> installmentsToBeSettled) {
    this.installmentsToBeSettled = installmentsToBeSettled;
  }

  public String toJson() {
    return "{" + "\"tokenCode\":\"" + tokenCode + "\"," + "\"installmentsToBeSettled\":" + installmentsToBeSettled
        + "}";
  }
}