package src.decorator.abstract_decorator;

import src.decorator.component_interface.Coffee;

public class CoffeeDecorator implements Coffee {
  // The abstract decorator must have an attribute of the same type of the basic element's interface
  // and follows a defined structure
  protected Coffee decoratedCoffee;

  public CoffeeDecorator(Coffee decoratedCoffee) {
    this.decoratedCoffee = decoratedCoffee;
  }

  @Override
  public String prepare() {
    return decoratedCoffee.prepare();
  }

  @Override
  public double cost() {
    return decoratedCoffee.cost();
  }
}
