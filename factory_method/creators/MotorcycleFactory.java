package factory_method.creators;

import factory_method.products.Motorcycle;
import factory_method.products.Vehicle;

public class MotorcycleFactory implements VehicleCreator {
  @Override
  public Vehicle createVehicle() {
    return new Motorcycle();
  }
}
