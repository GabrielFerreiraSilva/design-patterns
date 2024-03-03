package factory_method.creators;

import factory_method.products.Car;
import factory_method.products.Vehicle;

public class CarFactory implements VehicleCreator {
  @Override
  public Vehicle createVehicle() {
    return new Car();
  }
}
