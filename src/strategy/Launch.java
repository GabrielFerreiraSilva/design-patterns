package src.strategy;

import src.strategy.model.Investment;
import src.strategy.strategies.ReturnCalculationStrategy;
import src.strategy.strategies_implementations.CompoundReturn;
import src.strategy.strategies_implementations.SimpleReturn;

public class Launch {
  public static void main(String[] args) {
    ReturnCalculationStrategy simpleStrategy = new SimpleReturn();
    ReturnCalculationStrategy compoundStrategy = new CompoundReturn();

    Investment investment = new Investment(10000, 5, simpleStrategy);
    investment.calculateInvestmentReturn();

    // Changing the strategy
    investment.setReturnCalculationStrategy(compoundStrategy);
    investment.calculateInvestmentReturn();
  }
}
