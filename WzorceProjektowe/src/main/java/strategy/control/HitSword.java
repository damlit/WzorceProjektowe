package strategy.control;

import strategy.boundary.AttackInterface;

public class HitSword implements AttackInterface {
    public int attack() {
        System.out.println("--> The sword hit!");
        return 5;
    }
}
