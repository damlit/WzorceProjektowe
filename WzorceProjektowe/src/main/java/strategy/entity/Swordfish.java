package strategy.entity;

import strategy.control.HitSword;
import strategy.control.UseShield;

public class Swordfish extends Soldier {

    public Swordfish() {
        attackInterface = new HitSword();
        defenseInterface = new UseShield();
    }

    public void printSoldierType() {
        System.out.println("--> I'm Swordfish!");
    }
}
