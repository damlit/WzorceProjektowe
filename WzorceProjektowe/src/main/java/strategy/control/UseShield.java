package strategy.control;

import strategy.boundary.DefenseInterface;

public class UseShield implements DefenseInterface {
    public void defense() {
        System.out.println("--> The soldier shielded himself!");
    }
}
