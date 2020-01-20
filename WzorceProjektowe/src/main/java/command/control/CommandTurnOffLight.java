package command.control;

import command.entity.Light;

public class CommandTurnOffLight implements Command {

    Light light;

    public CommandTurnOffLight(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }

    public void undo() {
        light.turnOn();
    }
}
