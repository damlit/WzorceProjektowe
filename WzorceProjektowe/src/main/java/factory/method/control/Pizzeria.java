package factory.method.control;

import factory.method.entity.Pizza;

import java.util.Optional;

public abstract class Pizzeria {

    public Optional<Pizza> order(String type) {
        Optional<Pizza> pizza = createPizza(type);

        if (pizza.isPresent()) {
            Pizza pizza1 = pizza.get();
            pizza1.bake();
            pizza1.slice();
            pizza1.pack();
            return Optional.of(pizza1);
        }
        return Optional.empty();
    }

    protected abstract Optional<Pizza> createPizza(String type);
}
