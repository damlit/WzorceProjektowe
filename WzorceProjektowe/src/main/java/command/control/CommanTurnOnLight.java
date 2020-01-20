package command.control;

import command.entity.Light;

public class CommanTurnOnLight implements Command {

    Light light;

    public CommanTurnOnLight(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }

    public void undo() {
        light.turnOff();
    }
}
