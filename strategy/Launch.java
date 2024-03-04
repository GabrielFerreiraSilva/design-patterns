package strategy;

import strategy.context.PaymentProcessor;
import strategy.strategies.CreditCardPayment;
import strategy.strategies.PaymentStrategy;
import strategy.strategies.PixPayment;

public class Launch {
  public static void main(String[] args) {
    // Criando diferentes estratégias de pagamento
    PaymentStrategy creditCardPayment = new CreditCardPayment(123456789101L, "Elvis Presley");
    PaymentStrategy pixPayment = new PixPayment("abcde-fghik-modsf", "Tom Hanks");

    // Criando o processador de pagamentos
    PaymentProcessor paymentProcessor = new PaymentProcessor();

    // Realizando pagamento com cartão de crédito
    paymentProcessor.setPaymentStrategy(creditCardPayment);
    paymentProcessor.processPayment(320.65);

    // Trocando a estratégia de pagamento
    paymentProcessor.setPaymentStrategy(pixPayment);
    paymentProcessor.processPayment(120.99);
  }
}
