package abstract_factory.products.concrete_products;

import abstract_factory.products.Car;

public class ElectricCar implements Car {
  @Override
  public void testAirConditioning() {
    System.out.println("Testing electric car air conditioning");
  }

  @Override
  public void testLights() {
    System.out.println("Testing electric car lights");
  }
}
