package src.decorator;

import src.decorator.component_interface.Coffee;
import src.decorator.concrete_implementations.StandardCoffee;
import src.decorator.decorators.ChocolateDecorator;
import src.decorator.decorators.MilkDecorator;

public class Launch {
  public static void main(String[] args) {
    // Creating a standard coffee
    Coffee standardCoffee = new StandardCoffee();
    System.out.println(standardCoffee.prepare());
    System.out.println("Cost: US$" + standardCoffee.cost());
    System.out.println();

    // Decorating with milk
    Coffee withMilk = new MilkDecorator(standardCoffee);
    System.out.println(withMilk.prepare());
    System.out.println("Cost: US$" + withMilk.cost());
    System.out.println();

    // Also decorating with chocolate
    Coffee withChocolate = new ChocolateDecorator(withMilk);
    System.out.println(withChocolate.prepare());
    System.out.println("Cost: US$" + withChocolate.cost());
    System.out.println();
  }
}
