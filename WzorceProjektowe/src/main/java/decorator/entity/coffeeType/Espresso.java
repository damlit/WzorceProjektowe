package decorator.entity.coffeeType;

import decorator.entity.abstractEntity.Coffee;

public class Espresso extends Coffee {

    public Espresso() {
        name = "Espresso";
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
