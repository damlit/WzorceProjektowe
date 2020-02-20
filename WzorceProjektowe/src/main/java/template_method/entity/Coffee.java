package template_method.entity;

public class Coffee extends DrinkWithCaffeine {

    protected String brew() {
        System.out.println("--> pour coffee!");

        return "coffee";
    }

    protected void addingExtras() {
        System.out.println("--> add milk");
    }
}
