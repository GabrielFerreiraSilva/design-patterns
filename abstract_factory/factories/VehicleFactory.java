package abstract_factory.factories;

import abstract_factory.products.Truck;
import abstract_factory.products.Car;

public interface VehicleFactory {
  Car createCar();

  Truck createTruck();
}
