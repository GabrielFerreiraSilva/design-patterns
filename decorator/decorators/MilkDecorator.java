package decorator.decorators;

import decorator.basic_component.Coffee;

public class MilkDecorator extends CoffeeDecorator {
  public MilkDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double cost() {
    return super.cost() + 0.5;
  }

  @Override
  public String ingredients() {
    return super.ingredients() + ", Milk";
  }
}
