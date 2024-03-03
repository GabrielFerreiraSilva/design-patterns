package factory_method;

import factory_method.creators.CarFactory;
import factory_method.creators.MotorcycleFactory;
import factory_method.creators.VehicleCreator;
import factory_method.products.Vehicle;

public class Launch {
  public static void main(String[] args) {
    // Instanciando as fábricas
    VehicleCreator carCreator = new CarFactory();
    VehicleCreator motorcycleCreator = new MotorcycleFactory();

    dirigirVeiculo(carCreator);
    System.out.println();
    dirigirVeiculo(motorcycleCreator);
  }

  public static void dirigirVeiculo(VehicleCreator creator) {
    Vehicle vehicle = creator.createVehicle();

    vehicle.start();
    vehicle.accelerate();
    vehicle.brake();
  }
}
