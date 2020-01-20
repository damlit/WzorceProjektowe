package command.control;

public class Pilot {

    Command[] commandsOn;
    Command[] commandsOff;

    public Pilot() {
        commandsOn = new Command[2];
        commandsOff = new Command[2];
    }

    public void addCommand(int slot, Command commandOn, Command commandOff) {
        commandsOn[slot] = commandOn;
        commandsOff[slot] = commandOff;
    }

    public void turnOn(int slot) {
        commandsOn[slot].execute();
    }

    public void turnOff(int slot) {
        commandsOff[slot].execute();
    }
}
