package factory.method.entity;

public class AmericanPepperoniPizza extends Pizza {

    public AmericanPepperoniPizza() {
        name = "American Pepperoni Pizza with garlic sauce";
        dough = "thick";
        sauce = "garlic";
        additives.add("pepperoni");
    }

    @Override
    public void slice() {
        System.out.println("--> cut into square pieces");
    }
}
