package strategy.control;

import strategy.boundary.DefenseInterface;

public class RunAway implements DefenseInterface {
    public void defense() {
        System.out.println("--> The soldier escapes!");
    }
}
