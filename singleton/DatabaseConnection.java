package singleton;

public class DatabaseConnection {
  private static volatile DatabaseConnection databaseConnection;

  private final String username;
  private final String password;
  private final String url;

  private DatabaseConnection() {
    this.username = "user";
    this.password = "12345";
    this.url = "jdbc:mysql://localhost:3306/database";
  }

  public static DatabaseConnection getInstance() {
    if (databaseConnection == null) {
      synchronized (DatabaseConnection.class) {
        if (databaseConnection == null) {
          databaseConnection = new DatabaseConnection();
        }
      }
    }

    return databaseConnection;
  }

  public void getDetails() {
    System.out.println(
        "Username: "
            + this.username
            + "\n"
            + "Password: "
            + this.password
            + "\n"
            + "Url: "
            + this.url);
  }
}
