package command;

import command.control.*;
import command.entity.Light;
import command.entity.Tv;

public class Main {

    public static void main() {

        System.out.println("====== COMMAND ======");

        Pilot pilot = new Pilot();

        Light lightInBathroom = new Light();
        Tv tvInBedroom = new Tv();

        CommandTurnOffLight turnOffLight = new CommandTurnOffLight(lightInBathroom);
        CommanTurnOnLight turnOnLight = new CommanTurnOnLight(lightInBathroom);
        CommandTurnOffTv turnOffTv = new CommandTurnOffTv(tvInBedroom);
        CommandTurnOnTv turnOnTv = new CommandTurnOnTv(tvInBedroom);

        pilot.addCommand(0, turnOnLight, turnOffLight);
        pilot.addCommand(1, turnOnTv, turnOffTv);

        pilot.turnOn(0);
        pilot.turnOn(1);
        pilot.turnOff(0);
        pilot.turnOff(1);
        System.out.println();
    }
}
