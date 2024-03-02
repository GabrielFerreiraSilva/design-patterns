package abstract_factory.products.concrete_products;

import abstract_factory.products.Truck;

public class ElectricTruck implements Truck {
  @Override
  public void testChassis() {
    System.out.println("Testing electric truck chassis");
  }

  @Override
  public void installCab() {
    System.out.println("Installing electric truck cab");
  }
}
