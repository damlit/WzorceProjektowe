package facade.control;

import facade.boundary.CinemaFacade;
import facade.entity.Dvd;
import facade.entity.Lighting;
import facade.entity.Projector;
import facade.entity.Screen;

public class CinemaFacadeImpl implements CinemaFacade {

    private Dvd dvd;
    private Lighting lighting;
    private Projector projector;
    private Screen screen;

    public CinemaFacadeImpl(Dvd dvd, Lighting lighting, Projector projector, Screen screen) {
        this.dvd = dvd;
        this.lighting = lighting;
        this.projector = projector;
        this.screen = screen;
    }

    public void playMovie() {
        dvd.turnOn(true);
        lighting.setPower(2);
        projector.turnOn(true);
        screen.setDown(true);
    }

    public void turnOffMovie() {
        dvd.turnOn(false);
        lighting.setPower(8);
        projector.turnOn(false);
        screen.setDown(false);
    }
}
