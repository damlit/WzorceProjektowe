package factory.method.entity;

public class ItalianVegetarianPizza extends Pizza {

    public ItalianVegetarianPizza() {
        name = "Italian Vegetarian Pizza with Marinara sauce";
        dough = "thin";
        sauce = "Marinara";
        additives.add("vegetables");
    }

    @Override
    public void slice() {
        System.out.println("--> cut into 8 pieces");
    }
}
