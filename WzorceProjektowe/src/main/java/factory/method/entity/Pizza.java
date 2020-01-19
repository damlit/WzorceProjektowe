package factory.method.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> additives = new ArrayList<>();

    public abstract void slice();

    public void bake() {
        System.out.println("--> bake " + name);
    }

    public void pack() {
        System.out.println("--> pack " + name);
    }

    public String getName() {
        return name;
    }
}
