package abstract_factory.products.concrete_products;

import abstract_factory.products.Truck;

public class CombustionTruck implements Truck {
  @Override
  public void testChassis() {
    System.out.println("Testing combustion truck chassis");
  }

  @Override
  public void installCab() {
    System.out.println("Installing combustion truck cab");
  }
}
