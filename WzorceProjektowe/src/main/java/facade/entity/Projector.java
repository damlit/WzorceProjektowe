package facade.entity;

public class Projector {

    private boolean isOn;

    public Projector() {
        isOn = false;
    }

    public void turnOn(boolean on) {
        if (on) {
            System.out.println("--> Projector is turning on");
        } else {
            System.out.println("--> Projector is turning off");
        }
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }
}
