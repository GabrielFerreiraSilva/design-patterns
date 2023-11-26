package src.observer.interfaces;

public interface Observable {
  // The observable class must implement this interface
  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers(String message);
}
