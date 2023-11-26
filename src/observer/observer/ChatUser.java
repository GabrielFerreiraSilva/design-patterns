package src.observer.observer;

import src.observer.interfaces.Observer;

public class ChatUser implements Observer {
  private final String username;

  public ChatUser(String username) {
    this.username = username;
  }

  // When the state of chat room be modified, this method will execute
  @Override
  public void update(String message) {
    System.out.println("User " + this.username + " received a message: " + message);
  }
}
