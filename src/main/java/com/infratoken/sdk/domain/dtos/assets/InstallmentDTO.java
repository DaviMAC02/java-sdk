package com.infratoken.sdk.domain.dtos.assets;

public class InstallmentDTO {
    private double value;

    public InstallmentDTO(double value) {
      this.value = value;
    }

    public double getValue() {
      return value;
    }

    public void setValue(double value) {
      this.value = value;
    }
}