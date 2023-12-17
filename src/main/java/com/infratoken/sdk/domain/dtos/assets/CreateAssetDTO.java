package com.infratoken.sdk.domain.dtos.assets;

public class CreateAssetDTO {
  private String tokenName;
  private String tokenCode;
  private String tokenType;
  private double totalValue;
  private double tokenUnitaryValue;
  private String installments;
  private String firstInstallmentDueDate;
  private long totalFractions;
  private String tokenData;
  private String attachments;
  private String guarantees;
  private String paymentRecurrence;
  private String blockchain;

  public CreateAssetDTO(String tokenName, String tokenCode, String tokenType, double totalValue,
      double tokenUnitaryValue, String installments, String firstInstallmentDueDate,
      long totalFractions,String tokenData, String attachments,
     String guarantees, String paymentRecurrence, String blockchain) {
    this.tokenName = tokenName;
    this.tokenCode = tokenCode;
    this.tokenType = tokenType;
    this.totalValue = totalValue;
    this.tokenUnitaryValue = tokenUnitaryValue;
    this.installments = installments;
    this.firstInstallmentDueDate = firstInstallmentDueDate;
    this.totalFractions = totalFractions;
    this.tokenData = tokenData;
    this.attachments = attachments;
    this.guarantees = guarantees;
    this.paymentRecurrence = paymentRecurrence;
    this.blockchain = blockchain;
  }

  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }

  public String getTokenCode() {
    return tokenCode;
  }

  public void setTokenCode(String tokenCode) {
    this.tokenCode = tokenCode;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(double totalValue) {
    this.totalValue = totalValue;
  }

  public double getTokenUnitaryValue() {
    return tokenUnitaryValue;
  }

  public void setTokenUnitaryValue(double tokenUnitaryValue) {
    this.tokenUnitaryValue = tokenUnitaryValue;
  }

  public String getInstallments() {
    return installments;
  }

  public void setInstallments(String installments) {
    this.installments = installments;
  }

  public String getFirstInstallmentDueDate() {
    return firstInstallmentDueDate;
  }

  public void setFirstInstallmentDueDate(String firstInstallmentDueDate) {
    this.firstInstallmentDueDate = firstInstallmentDueDate;
  }

  public long getTotalFractions() {
    return totalFractions;
  }

  public void setTotalFractions(long totalFractions) {
    this.totalFractions = totalFractions;
  }

  public String getTokenData() {
    return tokenData;
  }

  public void setTokenData(String tokenData) {
    this.tokenData = tokenData;
  }

  public String getAttachments() {
    return attachments;
  }

  public void setAttachments(String attachments) {
    this.attachments = attachments;
  }

  public String getGuarantees() {
    return guarantees;
  }

  public void setGuarantees(String guarantees) {
    this.guarantees = guarantees;
  }

  public String getPaymentRecurrence() {
    return paymentRecurrence;
  }

  public void setPaymentRecurrence(String paymentRecurrence) {
    this.paymentRecurrence = paymentRecurrence;
  }

  public String getBlockchain() {
    return blockchain;
  }

  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }

  public String toJson() {
    return "{" + "\"tokenName\":\"" + tokenName + "\"" + ", \"tokenCode\":\"" + tokenCode + "\""
        + ", \"tokenType\":\"" + tokenType + "\"" + ", \"totalValue\":" + totalValue
        + ", \"tokenUnitaryValue\":" + tokenUnitaryValue + ", \"installments\":" + installments
        + ", \"firstInstallmentDueDate\":\"" + firstInstallmentDueDate + "\"" + ", \"totalFractions\":"
        + totalFractions + ", \"tokenData\":" + tokenData + ", \"attachments\":" + attachments
        + ", \"guarantees\":" + guarantees + ", \"paymentRecurrence\":\"" + paymentRecurrence + "\""
        + ", \"blockchain\":\"" + blockchain + "\"" + "}";
  }
}