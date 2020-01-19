package factory.method;

import factory.method.control.AmericanPizzeria;
import factory.method.control.ItalianPizzeria;
import factory.method.control.Pizzeria;

public class Main {

    public static void main() {
        System.out.println("====== FACTORY METHOD ======");

        Pizzeria italianPizzeria = new ItalianPizzeria();
        italianPizzeria.order("cheesee");

        System.out.println();

        Pizzeria americanPizzeria = new AmericanPizzeria();
        americanPizzeria.order("cheesee");

        System.out.println();
    }
}
