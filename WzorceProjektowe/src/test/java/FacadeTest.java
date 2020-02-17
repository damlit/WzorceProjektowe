import facade.boundary.CinemaFacade;
import facade.control.CinemaFacadeImpl;
import facade.entity.Dvd;
import facade.entity.Lighting;
import facade.entity.Projector;
import facade.entity.Screen;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacadeTest {

    private CinemaFacade cinemaMode;
    private Dvd dvd;
    private Lighting lighting;
    private Projector projector;
    private Screen screen;

    @Before
    public void prepare() {
        dvd = new Dvd();
        lighting = new Lighting();
        projector = new Projector();
        screen = new Screen();
        cinemaMode = new CinemaFacadeImpl(dvd, lighting, projector, screen);
    }

    @Test
    public void shouldTurnOnCinemaMode() {
        cinemaMode.playMovie();

        Assert.assertEquals(2, lighting.getPower());
        Assert.assertTrue(dvd.isOn());
        Assert.assertTrue(screen.isDown());
        Assert.assertTrue(projector.isOn());
    }

    @Test
    public void shouldTurnOffCinemaMode() {
        cinemaMode.turnOffMovie();

        Assert.assertEquals(8, lighting.getPower());
        Assert.assertFalse(dvd.isOn());
        Assert.assertFalse(screen.isDown());
        Assert.assertFalse(projector.isOn());
    }
}
