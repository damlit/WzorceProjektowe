package factory.abstractt.control;

import factory.abstractt.entity.Dough;
import factory.abstractt.entity.Sauce;

public interface PizzaAdditivesFabric {

    Dough createDough();
    Sauce createSauce();

    default void display() {
        System.out.println("--> Fabric produce " + createDough().getName() + " dough, and "
                + createSauce().getName() + " sauce");
    }
}
