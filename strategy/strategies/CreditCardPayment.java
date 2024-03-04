package strategy.strategies;

public class CreditCardPayment implements PaymentStrategy {
  private final Long cardNumber;
  private final String name;

  public CreditCardPayment(Long cardNumber, String name) {
    this.cardNumber = cardNumber;
    this.name = name;
  }

  @Override
  public void processPayment(double amount) {
    System.out.println(
        "Payment of US$"
            + amount
            + " whit credit car "
            + this.cardNumber
            + " authorized to "
            + this.name);
  }
}
