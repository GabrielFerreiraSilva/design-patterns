package strategy.strategies;

public class PixPayment implements PaymentStrategy {
  private final String pixKey;
  private final String name;

  public PixPayment(String pixKey, String name) {
    this.pixKey = pixKey;
    this.name = name;
  }

  @Override
  public void processPayment(double amount) {
    System.out.println(
        "Payment of US$"
            + amount
            + " with Pix "
            + this.pixKey
            + " successfully done by "
            + this.name);
  }
}
