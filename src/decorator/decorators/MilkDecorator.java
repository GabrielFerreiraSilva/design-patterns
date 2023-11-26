package src.decorator.decorators;

import src.decorator.abstract_decorator.CoffeeDecorator;
import src.decorator.component_interface.Coffee;

public class MilkDecorator extends CoffeeDecorator {
  // The decorators call the super method and add its decoration
  public MilkDecorator(Coffee decoratedCoffee) {
    super(decoratedCoffee);
  }

  @Override
  public String prepare() {
    return super.prepare() + ", with milk";
  }

  @Override
  public double cost() {
    return super.cost() + 1.0;
  }
}
