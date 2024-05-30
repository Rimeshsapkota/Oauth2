package org.example.outh2.auth.service;

import java.math.BigDecimal;

public class PricingService {
  private final ProductVerifier productVerifier;

  public PricingService(ProductVerifier productVerifier) {
    this.productVerifier = productVerifier;
  }

  public BigDecimal calculatePrice(String producName) {
    if (productVerifier.isCurrentlyInStockOfCompetitor(producName)) {
      return new BigDecimal("99.99");
    }
    return new BigDecimal("149.99");
  }
}
