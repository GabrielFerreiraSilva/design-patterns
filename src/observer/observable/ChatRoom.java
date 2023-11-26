package src.observer.observable;

import src.observer.interfaces.Observable;
import src.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Observable {
  // When a new message be sent in the chat room, all users in this list will be notified
  private final List<Observer> observers = new ArrayList<>();

  public void sendMessage(String message) {
    System.out.println("New message: " + message);
    notifyObservers(message);
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(String message) {
    for (Observer observer : observers) {
      observer.update(message);
    }
  }
}
