package org.example.outh2.auth.service;

import java.util.HashSet;
import java.util.Set;

public class ProductVerifier {
  private final Set<String> competitorStock;

  public ProductVerifier() {
    competitorStock = new HashSet<>();
    competitorStock.add("AirPods");
    competitorStock.add("iPhone");
    competitorStock.add("MacBook");
  }
  public boolean isCurrentlyInStockOfCompetitor(String productName) {
    return competitorStock.contains(productName);
  }
}
