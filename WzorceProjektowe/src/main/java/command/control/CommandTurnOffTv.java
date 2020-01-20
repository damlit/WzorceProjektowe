package command.control;

import command.entity.Tv;

public class CommandTurnOffTv implements Command {

    Tv tv;

    public CommandTurnOffTv(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }

    public void undo() {
        tv.turnOn();
    }
}
