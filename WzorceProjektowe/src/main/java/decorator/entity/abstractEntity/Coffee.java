package decorator.entity.abstractEntity;

public abstract class Coffee {

    protected String name = "Unknown";

    public String getName() {
        return name;
    }

    public abstract double cost();
}
