package adapter;

import adapter.adaptee.LegacyPaymentProvider;
import adapter.adaptee.LegacyPaymentProviderImpl;
import adapter.adapter.LegacyPaymentAdapter;
import adapter.target.NewPaymentProcessor;
import adapter.target.PaymentProcessor;

public class Launch {
  public static void main(String[] args) {
    LegacyPaymentProvider legacyProvider = new LegacyPaymentProviderImpl();
    PaymentProcessor newProcessor = new NewPaymentProcessor();

    // Processando o pagamento com o novo sistema
    processPayment(newProcessor, 350);

    // Processando com o sistema antigo usando o adapter
    processPayment(new LegacyPaymentAdapter(legacyProvider), 280.95);
  }

  private static void processPayment(PaymentProcessor paymentProcessor, double amount) {
    paymentProcessor.processPayment(amount);
  }
}
