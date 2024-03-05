package decorator.basic_component;

public class SimpleCoffee implements Coffee {
  @Override
  public double cost() {
    return 2.0;
  }

  @Override
  public String ingredients() {
    return "Coffee";
  }
}
