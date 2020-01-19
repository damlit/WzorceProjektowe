package strategy.entity;

import strategy.control.Hide;
import strategy.control.StickKnife;

public class Assassin extends Soldier {

    public Assassin() {
        attackInterface = new StickKnife();
        defenseInterface = new Hide();
    }

    public void printSoldierType() {
        System.out.println("--> I'm Assassin!");
    }
}
