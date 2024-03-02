package abstract_factory.products.concrete_products;

import abstract_factory.products.Car;

public class CombustionCar implements Car {
  @Override
  public void testAirConditioning() {
    System.out.println("Testing combustion car air conditioning");
  }

  @Override
  public void testLights() {
    System.out.println("Testing combustion car lights");
  }
}
