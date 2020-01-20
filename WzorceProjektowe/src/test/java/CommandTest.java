import command.control.*;
import command.entity.Light;
import command.entity.Tv;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommandTest {

    Pilot pilot;
    Light lightInBathroom;
    Tv tvInBedroom;

    @Before
    public void init() {
        pilot = new Pilot();
        lightInBathroom = new Light();
        tvInBedroom = new Tv();
    }

    @Test
    public void commandTest() {
        CommandTurnOffLight turnOffLight = new CommandTurnOffLight(lightInBathroom);
        CommanTurnOnLight turnOnLight = new CommanTurnOnLight(lightInBathroom);
        CommandTurnOffTv turnOffTv = new CommandTurnOffTv(tvInBedroom);
        CommandTurnOnTv turnOnTv = new CommandTurnOnTv(tvInBedroom);

        pilot.addCommand(0, turnOnLight, turnOffLight);
        pilot.addCommand(1, turnOnTv, turnOffTv);

        pilot.turnOn(0);
        pilot.turnOn(1);
        Assert.assertTrue(lightInBathroom.isOn());
        Assert.assertTrue(tvInBedroom.isOn());

        pilot.turnOff(0);
        pilot.turnOff(1);
        Assert.assertFalse(lightInBathroom.isOn());
        Assert.assertFalse(tvInBedroom.isOn());
    }
}
