package adapter.adaptee;

public class LegacyPaymentProviderImpl implements LegacyPaymentProvider {
  @Override
  public void charge(double amount) {
    System.out.println("Legacy payment processed: US$" + amount);
  }
}
