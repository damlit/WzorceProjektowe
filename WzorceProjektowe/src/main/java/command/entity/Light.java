package command.entity;

public class Light {

    private boolean isOn;

    public Light() {
        isOn = false;
    }

    public void turnOn() {
        System.out.println("--> turn ON the light");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("--> turn OFF the light");
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
