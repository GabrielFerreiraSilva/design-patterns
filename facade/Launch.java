package facade;

import facade.facade.OrderFacade;

public class Launch {
  public static void main(String[] args) {
    // Instanciando a fachada
    OrderFacade orderFacade = new OrderFacade();

    // Utilizando os subsistemas de forma simplificada
    orderFacade.placeOrder("All Star shoes", 54.99, "Fort Lauderdale, FL");
  }
}
