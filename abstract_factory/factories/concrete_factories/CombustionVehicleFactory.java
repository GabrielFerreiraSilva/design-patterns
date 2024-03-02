package abstract_factory.factories.concrete_factories;

import abstract_factory.factories.VehicleFactory;
import abstract_factory.products.Truck;
import abstract_factory.products.Car;
import abstract_factory.products.concrete_products.CombustionCar;
import abstract_factory.products.concrete_products.CombustionTruck;

public class CombustionVehicleFactory implements VehicleFactory {
  @Override
  public Car createCar() {
    return new CombustionCar();
  }

  @Override
  public Truck createTruck() {
    return new CombustionTruck();
  }
}
