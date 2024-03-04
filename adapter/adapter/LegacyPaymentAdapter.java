package adapter.adapter;

import adapter.adaptee.LegacyPaymentProvider;
import adapter.target.PaymentProcessor;

public class LegacyPaymentAdapter implements PaymentProcessor {
  private final LegacyPaymentProvider legacyPaymentProvider;

  public LegacyPaymentAdapter(LegacyPaymentProvider legacyPaymentProvider) {
    this.legacyPaymentProvider = legacyPaymentProvider;
  }

  @Override
  public void processPayment(double amount) {
    this.legacyPaymentProvider.charge(amount);
  }
}
