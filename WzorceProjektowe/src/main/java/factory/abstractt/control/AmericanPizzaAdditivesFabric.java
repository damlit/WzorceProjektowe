package factory.abstractt.control;

import factory.abstractt.entity.*;

public class AmericanPizzaAdditivesFabric  implements PizzaAdditivesFabric {

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new GarlicSauce();
    }
}
