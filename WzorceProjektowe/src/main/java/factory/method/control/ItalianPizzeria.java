package factory.method.control;

import factory.method.entity.*;

import java.util.Optional;

public class ItalianPizzeria extends Pizzeria {

    private static final String CHEESE_TYPE = "cheese";
    private static final String PEPPERONI_TYPE = "pepperoni";
    private static final String VEGETARIAN_TYPE = "vegetarian";

    public Optional<Pizza> createPizza(String type) {
        if (CHEESE_TYPE.equals(type)) {
            return Optional.of(new ItalianCheesePizza());
        } else if (PEPPERONI_TYPE.equals(type)) {
            return Optional.of(new ItalianPepperoniPizza());
        } else if (VEGETARIAN_TYPE.equals(type)) {
            return Optional.of(new ItalianVegetarianPizza());
        }
        return Optional.empty();
    }
}
