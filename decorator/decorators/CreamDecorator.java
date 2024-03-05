package decorator.decorators;

import decorator.basic_component.Coffee;

public class CreamDecorator extends CoffeeDecorator {
  public CreamDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double cost() {
    return super.cost() + 0.75;
  }

  @Override
  public String ingredients() {
    return super.ingredients() + ", Cream";
  }
}
