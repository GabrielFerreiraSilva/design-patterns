package factory_method.products;

public class Motorcycle implements Vehicle {
  @Override
  public void start() {
    System.out.println("Motorcycle starting...");
  }

  @Override
  public void accelerate() {
    System.out.println("Motorcycle accelerating...");
  }

  @Override
  public void brake() {
    System.out.println("Motorcycle stopping...");
  }
}
