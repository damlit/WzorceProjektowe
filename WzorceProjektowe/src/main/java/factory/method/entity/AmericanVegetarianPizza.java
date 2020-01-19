package factory.method.entity;

public class AmericanVegetarianPizza extends Pizza {

    public AmericanVegetarianPizza() {
        name = "American Vegetarian Pizza with garlic sauce";
        dough = "thick";
        sauce = "garlic";
        additives.add("vegetables");
    }

    @Override
    public void slice() {
        System.out.println("--> cut into square pieces");
    }
}
