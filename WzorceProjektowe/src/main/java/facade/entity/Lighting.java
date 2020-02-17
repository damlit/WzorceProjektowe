package facade.entity;

public class Lighting {

    private int power;

    public Lighting() {
        power = 0;
    }

    public void setPower(int power) {
        System.out.println("--> power is " + power);
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
