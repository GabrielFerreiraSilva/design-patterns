package src.observer;

import src.observer.interfaces.Observer;
import src.observer.observable.ChatRoom;
import src.observer.observer.ChatUser;

public class Launch {
  public static void main(String[] args) {
    // Creating the chat room
    ChatRoom chatRoom = new ChatRoom();

    // Creating the observers
    Observer user1 = new ChatUser("Anna");
    Observer user2 = new ChatUser("John");
    Observer user3 = new ChatUser("Don");

    // Registering the observers
    chatRoom.registerObserver(user1);
    chatRoom.registerObserver(user2);
    chatRoom.registerObserver(user3);

    // Testing
    chatRoom.sendMessage("Hello everyone!");
    chatRoom.sendMessage("How are you today?");
  }
}
