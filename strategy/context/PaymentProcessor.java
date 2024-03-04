package strategy.context;

import strategy.strategies.PaymentStrategy;

public class PaymentProcessor {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void processPayment(double amount) {
    this.paymentStrategy.processPayment(amount);
  }
}
