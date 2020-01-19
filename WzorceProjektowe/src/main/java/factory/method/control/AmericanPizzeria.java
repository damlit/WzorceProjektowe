package factory.method.control;

import factory.method.entity.AmericanCheesePizza;
import factory.method.entity.AmericanPepperoniPizza;
import factory.method.entity.AmericanVegetarianPizza;
import factory.method.entity.Pizza;

import java.util.Optional;

public class AmericanPizzeria extends Pizzeria {

    private static final String CHEESE_TYPE = "cheese";
    private static final String PEPPERONI_TYPE = "pepperoni";
    private static final String VEGETARIAN_TYPE = "vegetarian";

    public Optional<Pizza> createPizza(String type) {
        if (CHEESE_TYPE.equals(type)) {
            return Optional.of(new AmericanCheesePizza());
        } else if (PEPPERONI_TYPE.equals(type)) {
            return Optional.of(new AmericanPepperoniPizza());
        } else if (VEGETARIAN_TYPE.equals(type)) {
            return Optional.of(new AmericanVegetarianPizza());
        }
        return Optional.empty();
    }
}
