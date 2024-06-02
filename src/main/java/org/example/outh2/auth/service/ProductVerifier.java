package org.example.outh2.auth.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
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
  public int add(int a, int b) {

    return a + b;
  }
}
