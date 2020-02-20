package template_method.entity;

public class Tee extends DrinkWithCaffeine {

    protected String brew() {
        System.out.println("--> put in a tea bag!");

        return "tee";
    }

    protected void addingExtras() {
        System.out.println("--> add lemon");
    }
}
