package decorator.decorators;

import decorator.basic_component.Coffee;

public abstract class CoffeeDecorator implements Coffee {
  private final Coffee decoratedCoffee;

  public CoffeeDecorator(Coffee coffee) {
    this.decoratedCoffee = coffee;
  }

  @Override
  public double cost() {
    return this.decoratedCoffee.cost();
  }

  @Override
  public String ingredients() {
    return this.decoratedCoffee.ingredients();
  }
}
