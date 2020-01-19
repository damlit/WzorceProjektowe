package factory.method.entity;

public class AmericanCheesePizza extends Pizza {

    public AmericanCheesePizza() {
        name = "American Cheese Pizza with garlic sauce";
        dough = "thick";
        sauce = "garlic";
        additives.add("cheese and cheese");
    }

    @Override
    public void slice() {
        System.out.println("--> cut into square pieces");
    }
}
