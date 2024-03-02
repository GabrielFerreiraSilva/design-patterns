package abstract_factory.factories.concrete_factories;

import abstract_factory.factories.VehicleFactory;
import abstract_factory.products.Truck;
import abstract_factory.products.Car;
import abstract_factory.products.concrete_products.ElectricCar;
import abstract_factory.products.concrete_products.ElectricTruck;

public class ElectricVehicleFactory implements VehicleFactory {
  @Override
  public Car createCar() {
    return new ElectricCar();
  }

  @Override
  public Truck createTruck() {
    return new ElectricTruck();
  }
}
