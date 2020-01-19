package strategy.control;

import strategy.boundary.DefenseInterface;

public class Hide implements DefenseInterface {
    public void defense() {
        System.out.println("--> The soldier disappeared!");
    }
}
