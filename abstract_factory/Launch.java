package abstract_factory;

import abstract_factory.factories.concrete_factories.CombustionVehicleFactory;
import abstract_factory.factories.concrete_factories.ElectricVehicleFactory;
import abstract_factory.factories.VehicleFactory;
import abstract_factory.products.Car;
import abstract_factory.products.Truck;

public class Launch {
  public static void main(String[] args) {
    // Criando fábricas
    VehicleFactory electricFactory = new ElectricVehicleFactory();
    VehicleFactory combustionFactory = new CombustionVehicleFactory();

    buildVehicles(electricFactory);
    System.out.println();
    buildVehicles(combustionFactory);
  }

  public static void buildVehicles(VehicleFactory factory) {
    Car car = factory.createCar();
    Truck truck = factory.createTruck();

    System.out.println("Car operations: ");
    car.testAirConditioning();
    car.testLights();

    System.out.println();

    System.out.println("Truck operations: ");
    truck.testChassis();
    truck.installCab();
  }
}
