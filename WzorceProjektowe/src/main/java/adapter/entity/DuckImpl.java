package adapter.entity;

import adapter.control.Duck;

public class DuckImpl implements Duck {

    private static final String QUACKING = "--> QUA qua qua!";
    private static final String EATING = "--> I need seed!";

    public String quacking() {
        System.out.println(QUACKING);
        return QUACKING;
    }

    public void eat() {
        System.out.println(EATING);
    }
}
