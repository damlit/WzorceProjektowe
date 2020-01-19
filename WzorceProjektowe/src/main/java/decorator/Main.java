package decorator;

import decorator.entity.abstractEntity.Coffee;
import decorator.entity.coffeeType.Espresso;
import decorator.entity.coffeeType.HeavilyRoasted;
import decorator.entity.coffeeType.Weak;
import decorator.entity.componentType.Chocolate;
import decorator.entity.componentType.Milk;
import decorator.entity.componentType.WhippedCream;

public class Main {

    public static void main() {
        System.out.println("====== DECORATOR ======");

        Coffee coffee = new Espresso();
        printCost(coffee);

        Coffee coffee1 = new HeavilyRoasted();
        coffee1 = new Chocolate(coffee1);
        coffee1 = new WhippedCream(coffee1);
        printCost(coffee1);

        Coffee coffee2 = new Weak();
        coffee2 = new Milk(coffee2);
        printCost(coffee2);

        System.out.println();
    }

    private static void printCost(Coffee coffee) {
        System.out.println("--> " + coffee.getName() + " = " + coffee.cost() + " zl");
    }
}
