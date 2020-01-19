package factory.abstractt;

import factory.abstractt.control.AmericanPizzaAdditivesFabric;
import factory.abstractt.control.ItalianPizzaAdditivesFabric;
import factory.abstractt.control.PizzaAdditivesFabric;

public class Main {

    public static void main() {
        System.out.println("====== FACTORY ABSTRACT ======");

        PizzaAdditivesFabric italianFabric = new ItalianPizzaAdditivesFabric();
        italianFabric.display();

        PizzaAdditivesFabric americanFabric = new AmericanPizzaAdditivesFabric();
        americanFabric.display();

        System.out.println();
    }
}
