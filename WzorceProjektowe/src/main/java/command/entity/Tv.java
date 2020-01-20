package command.entity;

public class Tv {

    private boolean isOn;

    public Tv() {
        isOn = false;
    }

    public void turnOn() {
        System.out.println("--> turn ON the TV");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("--> turn OFF the TV");
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
