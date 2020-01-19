package strategy.control;

import strategy.boundary.AttackInterface;

public class StickKnife implements AttackInterface {
    public int attack() {
        System.out.println("--> The knife was stuck!");
        return 8;
    }
}
