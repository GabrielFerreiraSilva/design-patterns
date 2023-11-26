package src.decorator.decorators;

import src.decorator.abstract_decorator.CoffeeDecorator;
import src.decorator.component_interface.Coffee;

public class ChocolateDecorator extends CoffeeDecorator {
  // The decorators call the super method and add its decoration
  public ChocolateDecorator(Coffee decoratedCoffee) {
    super(decoratedCoffee);
  }

  @Override
  public String prepare() {
    return super.prepare() + ", with chocolate";
  }

  @Override
  public double cost() {
    return super.cost() + 1.5;
  }
}
