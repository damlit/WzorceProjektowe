package facade.entity;

public class Dvd {

    private boolean isOn;

    public Dvd() {
        isOn = false;
    }

    public void turnOn(boolean on) {
        if (on) {
            System.out.println("--> DVD is turning on");
        } else {
            System.out.println("--> DVD is turning off");
        }
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }
}
