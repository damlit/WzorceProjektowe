package strategy;

import strategy.entity.Archer;
import strategy.entity.Assassin;
import strategy.entity.Soldier;

public class Main {

    public static void main() {
        System.out.println("====== STRATEGY ======");
        Soldier soldier = new Archer();
        soldier.printSoldierType();
        soldier.attack();
        soldier = new Assassin();
        soldier.printSoldierType();
        soldier.defense();
        System.out.println();
    }
}
