package observer.subjects;

import observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
  private final List<Observer> observers;
  private float temperature;
  private float humidity;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void addObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this.temperature, this.humidity);
    }
  }

  public void setMeasurements(float newTemperature, float newHumidity) {
    this.temperature = newTemperature;
    this.humidity = newHumidity;
    notifyObservers();
  }
}
