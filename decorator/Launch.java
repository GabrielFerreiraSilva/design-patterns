package decorator;

import decorator.basic_component.Coffee;
import decorator.basic_component.SimpleCoffee;
import decorator.decorators.CreamDecorator;
import decorator.decorators.MilkDecorator;

public class Launch {
  public static void main(String[] args) {
    // Criando um café simples
    Coffee coffee = new SimpleCoffee();
    printCoffeeDetails(coffee);

    // Decorando com leite
    coffee = new MilkDecorator(coffee);
    printCoffeeDetails(coffee);

    // Decorando com leite e creme
    coffee = new CreamDecorator(coffee);
    printCoffeeDetails(coffee);
  }

  private static void printCoffeeDetails(Coffee coffee) {
    System.out.println("------");
    System.out.println(coffee.ingredients());
    System.out.println(coffee.cost());
    System.out.println("------");
  }
}
