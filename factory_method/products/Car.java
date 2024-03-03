package factory_method.products;

public class Car implements Vehicle {
  @Override
  public void start() {
    System.out.println("Car starting...");
  }

  @Override
  public void accelerate() {
    System.out.println("Car accelerating...");
  }

  @Override
  public void brake() {
    System.out.println("Car stopping...");
  }
}
