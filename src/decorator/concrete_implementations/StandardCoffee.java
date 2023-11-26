package src.decorator.concrete_implementations;

import src.decorator.component_interface.Coffee;

public class StandardCoffee implements Coffee {
  // This class represents the standard element
  @Override
  public String prepare() {
    return "Standard Coffee";
  }

  @Override
  public double cost() {
    return 2.0;
  }
}
