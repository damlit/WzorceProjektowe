package command.control;

import command.entity.Tv;

public class CommandTurnOnTv implements Command {

    Tv tv;

    public CommandTurnOnTv(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }

    public void undo() {
        tv.turnOff();
    }
}
