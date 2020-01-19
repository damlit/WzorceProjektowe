package decorator.entity.coffeeType;

import decorator.entity.abstractEntity.Coffee;

public class Weak extends Coffee {

    public Weak() {
        name = "Weak coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
