package observer;

import observer.observers.CurrentConditionsObserver;
import observer.observers.Observer;
import observer.subjects.WeatherData;

public class Launch {
  public static void main(String[] args) {
    // Instanciando subject e observer
    WeatherData weatherData = new WeatherData();
    Observer currentConditionsObserver = new CurrentConditionsObserver();

    // Adicionando o observador
    weatherData.addObserver(currentConditionsObserver);

    weatherData.setMeasurements(29.1F, 35);
    weatherData.setMeasurements(30.4F, 40);
  }
}
