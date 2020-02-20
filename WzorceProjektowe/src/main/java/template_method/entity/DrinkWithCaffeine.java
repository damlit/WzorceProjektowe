package template_method.entity;

public abstract class DrinkWithCaffeine {

    public final String make() {
        String wasBrewed;

        boilingWater();
        wasBrewed = brew();
        pouringIntoCup();
        addingExtras();

        return wasBrewed;
    }

    private void boilingWater() {
        System.out.println("--> boiling water!");
    }

    private void pouringIntoCup() {
        System.out.println("--> puring into the cup!");
    }

    protected abstract String brew();

    protected abstract void addingExtras();
}
