package src.strategy.model;

import src.strategy.strategies.ReturnCalculationStrategy;

public class Investment {
  private final double initialInvestment;
  private final int investmentPeriod;
  // The model class must have an attribute of the same type as the strategy interface
  private ReturnCalculationStrategy returnCalculationStrategy;

  public Investment(
      double initialInvestment,
      int investmentPeriod,
      ReturnCalculationStrategy returnCalculationStrategy) {
    this.initialInvestment = initialInvestment;
    this.investmentPeriod = investmentPeriod;
    this.returnCalculationStrategy = returnCalculationStrategy;
  }

  // The model class must have a setter method for the strategy
  public void setReturnCalculationStrategy(ReturnCalculationStrategy returnCalculationStrategy) {
    this.returnCalculationStrategy = returnCalculationStrategy;
  }

  public void calculateInvestmentReturn() {
    double finalAmount =
        returnCalculationStrategy.calculateReturn(initialInvestment, investmentPeriod);
    System.out.println("The final amount is: US$" + finalAmount);
  }
}
