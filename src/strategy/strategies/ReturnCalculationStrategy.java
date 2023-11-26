package src.strategy.strategies;

public interface ReturnCalculationStrategy {
  // This is the method that can be changed at runtime
  double calculateReturn(double initialInvestment, int investmentPeriod);
}
