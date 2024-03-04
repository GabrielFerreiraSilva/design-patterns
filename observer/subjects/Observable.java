package observer.subjects;

import observer.observers.Observer;

public interface Observable {
  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();
}
