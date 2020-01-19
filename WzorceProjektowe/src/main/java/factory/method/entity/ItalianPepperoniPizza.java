package factory.method.entity;

public class ItalianPepperoniPizza extends Pizza {

    public ItalianPepperoniPizza() {
        name = "Italian Pepperoni Pizza with Marinara sauce";
        dough = "thin";
        sauce = "Marinara";
        additives.add("pepperoni");
    }

    @Override
    public void slice() {
        System.out.println("--> cut into 8 pieces");
    }
}
