package strategy.entity;

import strategy.boundary.AttackInterface;
import strategy.boundary.DefenseInterface;

public abstract class Soldier {

    AttackInterface attackInterface;
    DefenseInterface defenseInterface;

    public Soldier() {}

    public abstract void printSoldierType();

    public int attack() {
        return attackInterface.attack();
    }

    public void defense() {
        defenseInterface.defense();
    }
}
