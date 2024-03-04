package observer.observers;

public class CurrentConditionsObserver implements Observer {
  private float temperature = 0;
  private float humidity = 0;

  @Override
  public void update(float temperature, float humidity) {
    this.temperature = temperature;
    this.humidity = humidity;
    displayConditions();
  }

  public void displayConditions() {
    System.out.println(
        "Current conditions: " + this.temperature + "°C and " + this.humidity + "% of humidity");
  }
}
