package com.infratoken.sdk.domain.dtos.assets;

import java.time.LocalDate;

public class ReleaseDTO {
  private String assetId;
  private String offerName;
  private String anualRentability;
  private LocalDate launchDate;
  private LocalDate dueDate;
  private int gracePeriodInMonths;
  private LocalDate offerDeadline;
  private String earningTax_PF;
  private String earningTax_PJ;
  private int investorsLimit;
  private double minInvestment;
  private String tokenImageUrl;
  private TokenConfigDTO tokenConfig;
  private double minValueRelease;

  public ReleaseDTO(
      String assetId,
      String offerName,
      String anualRentability,
      LocalDate launchDate,
      LocalDate dueDate,
      int gracePeriodInMonths,
      LocalDate offerDeadline,
      String earningTax_PF,
      String earningTax_PJ,
      int investorsLimit,
      double minInvestment,
      String tokenImageUrl,
      TokenConfigDTO tokenConfig,
      double minValueRelease) {
    this.assetId = assetId;
    this.offerName = offerName;
    this.anualRentability = anualRentability;
    this.launchDate = launchDate;
    this.dueDate = dueDate;
    this.gracePeriodInMonths = gracePeriodInMonths;
    this.offerDeadline = offerDeadline;
    this.earningTax_PF = earningTax_PF;
    this.earningTax_PJ = earningTax_PJ;
    this.investorsLimit = investorsLimit;
    this.minInvestment = minInvestment;
    this.tokenImageUrl = tokenImageUrl;
    this.tokenConfig = tokenConfig;
    this.minValueRelease = minValueRelease;
  }

  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public String getOfferName() {
    return offerName;
  }

  public void setOfferName(String offerName) {
    this.offerName = offerName;
  }

  public String getAnualRentability() {
    return anualRentability;
  }

  public void setAnualRentability(String anualRentability) {
    this.anualRentability = anualRentability;
  }

  public LocalDate getLaunchDate() {
    return launchDate;
  }

  public void setLaunchDate(LocalDate launchDate) {
    this.launchDate = launchDate;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public int getGracePeriodInMonths() {
    return gracePeriodInMonths;
  }

  public void setGracePeriodInMonths(int gracePeriodInMonths) {
    this.gracePeriodInMonths = gracePeriodInMonths;
  }

  public LocalDate getOfferDeadline() {
    return offerDeadline;
  }

  public void setOfferDeadline(LocalDate offerDeadline) {
    this.offerDeadline = offerDeadline;
  }

  public String getEarningTax_PF() {
    return earningTax_PF;
  }

  public void setEarningTax_PF(String earningTax_PF) {
    this.earningTax_PF = earningTax_PF;
  }

  public String getEarningTax_PJ() {
    return earningTax_PJ;
  }

  public void setEarningTax_PJ(String earningTax_PJ) {
    this.earningTax_PJ = earningTax_PJ;
  }

  public int getInvestorsLimit() {
    return investorsLimit;
  }

  public void setInvestorsLimit(int investorsLimit) {
    this.investorsLimit = investorsLimit;
  }

  public double getMinInvestment() {
    return minInvestment;
  }

  public void setMinInvestment(double minInvestment) {
    this.minInvestment = minInvestment;
  }

  public String getTokenImageUrl() {
    return tokenImageUrl;
  }

  public void setTokenImageUrl(String tokenImageUrl) {
    this.tokenImageUrl = tokenImageUrl;
  }

  public TokenConfigDTO getTokenConfig() {
    return tokenConfig;
  }

  public void setTokenConfig(TokenConfigDTO tokenConfig) {
    this.tokenConfig = tokenConfig;
  }

  public double getMinValueRelease() {
    return minValueRelease;
  }

  public void setMinValueRelease(double minValueRelease) {
    this.minValueRelease = minValueRelease;
  }

  public String toJson() {
    return "{" +
        "\"assetId\":\"" + assetId + '\"' +
        ",\"offerName\":\"" + offerName + '\"' +
        ",\"anualRentability\":\"" + anualRentability + '\"' +
        ",\"launchDate\":\"" + launchDate + '\"' +
        ",\"dueDate\":\"" + dueDate + '\"' +
        ",\"gracePeriodInMonths\":" + gracePeriodInMonths +
        ",\"offerDeadline\":\"" + offerDeadline + '\"' +
        ",\"earningTax_PF\":\"" + earningTax_PF + '\"' +
        ",\"earningTax_PJ\":\"" + earningTax_PJ + '\"' +
        ",\"investorsLimit\":" + investorsLimit +
        ",\"minInvestment\":" + minInvestment +
        ",\"tokenImageUrl\":\"" + tokenImageUrl + '\"' +
        ",\"tokenConfig\":" + tokenConfig.toJson() +
        ",\"minValueRelease\":" + minValueRelease +
        '}';
  }
}
