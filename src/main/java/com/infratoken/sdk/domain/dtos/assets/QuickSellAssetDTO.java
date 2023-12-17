package com.infratoken.sdk.domain.dtos.assets;

public class QuickSellAssetDTO {
  private String assetId;
  private double purchaseValue;

  // Constructors
  public QuickSellAssetDTO() {
  }

  public QuickSellAssetDTO(String assetId, double purchaseValue) {
    this.assetId = assetId;
    this.purchaseValue = purchaseValue;
  }

  // Getters and Setters
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public double getPurchaseValue() {
    return purchaseValue;
  }

  public void setPurchaseValue(double purchaseValue) {
    this.purchaseValue = purchaseValue;
  }

  public String toJson() {
    return "{" + "\"assetId\":\"" + assetId + "\"," + "\"purchaseValue\":" + purchaseValue + "}";
  }
}
