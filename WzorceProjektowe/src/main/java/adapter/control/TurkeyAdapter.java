package adapter.control;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public String quacking() {
        return turkey.gobbling();
    }

    public void eat() {
        turkey.eat();
    }
}
