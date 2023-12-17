package com.infratoken.sdk.domain.dtos.assets;

public class TokenConfigDTO {
  private String investorProfile;
  private boolean restrictBuySelectedProfiles;
  private boolean restrictBuyQualifiedInvestors;
  private boolean resctrictBuyProfessionalInvestors;
  private boolean releaseOffer;
  private String riskDegree;

  public TokenConfigDTO(
      String investorProfile,
      boolean restrictBuySelectedProfiles,
      boolean restrictBuyQualifiedInvestors,
      boolean resctrictBuyProfessionalInvestors,
      boolean releaseOffer,
      String riskDegree) {
    this.investorProfile = investorProfile;
    this.restrictBuySelectedProfiles = restrictBuySelectedProfiles;
    this.restrictBuyQualifiedInvestors = restrictBuyQualifiedInvestors;
    this.resctrictBuyProfessionalInvestors = resctrictBuyProfessionalInvestors;
    this.releaseOffer = releaseOffer;
    this.riskDegree = riskDegree;
  }

  public String getInvestorProfile() {
    return investorProfile;
  }

  public void setInvestorProfile(String investorProfile) {
    this.investorProfile = investorProfile;
  }

  public boolean isRestrictBuySelectedProfiles() {
    return restrictBuySelectedProfiles;
  }

  public void setRestrictBuySelectedProfiles(boolean restrictBuySelectedProfiles) {
    this.restrictBuySelectedProfiles = restrictBuySelectedProfiles;
  }

  public boolean isRestrictBuyQualifiedInvestors() {
    return restrictBuyQualifiedInvestors;
  }

  public void setRestrictBuyQualifiedInvestors(boolean restrictBuyQualifiedInvestors) {
    this.restrictBuyQualifiedInvestors = restrictBuyQualifiedInvestors;
  }

  public boolean isResctrictBuyProfessionalInvestors() {
    return resctrictBuyProfessionalInvestors;
  }

  public void setResctrictBuyProfessionalInvestors(boolean resctrictBuyProfessionalInvestors) {
    this.resctrictBuyProfessionalInvestors = resctrictBuyProfessionalInvestors;
  }

  public boolean isReleaseOffer() {
    return releaseOffer;
  }

  public void setReleaseOffer(boolean releaseOffer) {
    this.releaseOffer = releaseOffer;
  }

  public String getRiskDegree() {
    return riskDegree;
  }

  public void setRiskDegree(String riskDegree) {
    this.riskDegree = riskDegree;
  }

  public String toJson() {
    return "{" +
        "\"investorProfile\":\"" + investorProfile + '\"' +
        ",\"restrictBuySelectedProfiles\":" + restrictBuySelectedProfiles +
        ",\"restrictBuyQualifiedInvestors\":" + restrictBuyQualifiedInvestors +
        ",\"resctrictBuyProfessionalInvestors\":" + resctrictBuyProfessionalInvestors +
        ",\"releaseOffer\":" + releaseOffer +
        ",\"riskDegree\":\"" + riskDegree + '\"' +
        '}';
  }
}
