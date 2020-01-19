package factory.method.entity;

public class ItalianCheesePizza extends Pizza {

    public ItalianCheesePizza() {
        name = "Italian Cheese Pizza with Marinara sauce";
        dough = "thin";
        sauce = "Marinara";
        additives.add("cheese and cheese");
    }

    @Override
    public void slice() {
        System.out.println("--> cut into 8 pieces");
    }
}
