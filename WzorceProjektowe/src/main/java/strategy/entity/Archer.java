package strategy.entity;

import strategy.control.FireArrow;
import strategy.control.RunAway;

public class Archer extends Soldier {

    public Archer() {
        attackInterface = new FireArrow();
        defenseInterface = new RunAway();
    }

    public void printSoldierType() {
        System.out.println("--> I'm Archer!");
    }
}
