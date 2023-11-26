package src.strategy.strategies_implementations;

import src.strategy.strategies.ReturnCalculationStrategy;

public class SimpleReturn implements ReturnCalculationStrategy {
  // Simulating a linear growth of 5% per year
  @Override
  public double calculateReturn(double initialInvestment, int investmentPeriod) {
    return initialInvestment * (1 + 0.05 * investmentPeriod);
  }
}
