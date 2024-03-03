package facade.facade;

import facade.subsystems.Delivery;
import facade.subsystems.Payment;
import facade.subsystems.Stock;

public class OrderFacade {
  private final Stock stock;
  private final Payment payment;
  private final Delivery delivery;

  public OrderFacade() {
    this.stock = new Stock();
    this.payment = new Payment();
    this.delivery = new Delivery();
  }

  public void placeOrder(String item, double amount, String address) {
    System.out.println("Processing order...");
    System.out.println();
    this.stock.checkAvailability(item);
    this.payment.processPayment(amount);
    this.delivery.scheduleDelivery(address);
    System.out.println();
    System.out.println("Order placed successfully");
  }
}
