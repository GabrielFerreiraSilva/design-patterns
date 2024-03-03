package singleton;

public class Launch {
  public static void main(String[] args) {
    DatabaseConnection connection = DatabaseConnection.getInstance();
    DatabaseConnection connection1 = DatabaseConnection.getInstance();

    // Veja pela posição na memória que o objeto é o mesmo
    System.out.println(connection);
    System.out.println(connection1);
  }
}
