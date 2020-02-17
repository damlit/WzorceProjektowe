package adapter.entity;

import adapter.control.Turkey;

public class TurkeyImpl implements Turkey {

    private static final String GOBBLING = "--> gul gul gul!";
    private static final String EATING = "--> I need seed!";

    public String gobbling() {
        System.out.println(GOBBLING);
        return GOBBLING;
    }

    public void eat() {
        System.out.println(EATING);
    }
}
