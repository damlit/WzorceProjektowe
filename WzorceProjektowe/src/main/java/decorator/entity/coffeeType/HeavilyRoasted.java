package decorator.entity.coffeeType;

import decorator.entity.abstractEntity.Coffee;

public class HeavilyRoasted extends Coffee {

    public HeavilyRoasted() {
        name = "Heavily roasted coffee";
    }

    @Override
    public double cost() {
        return 2.89;
    }
}
