package adapter.target;

public class NewPaymentProcessor implements PaymentProcessor {
  @Override
  public void processPayment(double amount) {
    System.out.println("Payment processed successfully: US$" + amount);
  }
}
