package strategy.control;

import strategy.boundary.AttackInterface;

public class FireArrow implements AttackInterface {
    public int attack() {
        System.out.println("--> The arrow was fired!");
        return 4;
    }
}
