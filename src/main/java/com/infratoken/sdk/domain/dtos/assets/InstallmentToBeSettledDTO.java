package com.infratoken.sdk.domain.dtos.assets;

public class InstallmentToBeSettledDTO {
  private double amountPaid;
  private String paymentDate;
  private String installmentId;

  public InstallmentToBeSettledDTO(double amountPaid, String paymentDate, String installmentId) {
    this.amountPaid = amountPaid;
    this.paymentDate = paymentDate;
    this.installmentId = installmentId;
  }

  public double getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(double amountPaid) {
    this.amountPaid = amountPaid;
  }

  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public String getInstallmentId() {
    return installmentId;
  }

  public void setInstallmentId(String installmentId) {
    this.installmentId = installmentId;
  }
}