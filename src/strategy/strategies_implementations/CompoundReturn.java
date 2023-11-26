package src.strategy.strategies_implementations;

import src.strategy.strategies.ReturnCalculationStrategy;

public class CompoundReturn implements ReturnCalculationStrategy {
  // Simulating an exponential growth of 4% per year
  @Override
  public double calculateReturn(double initialInvestment, int investmentPeriod) {
    return initialInvestment * Math.pow(1 + 0.04, investmentPeriod);
  }
}
