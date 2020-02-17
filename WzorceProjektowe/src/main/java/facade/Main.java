package facade;

import facade.boundary.CinemaFacade;
import facade.control.CinemaFacadeImpl;
import facade.entity.Dvd;
import facade.entity.Lighting;
import facade.entity.Projector;
import facade.entity.Screen;

public class Main {

    public static void main() {
        System.out.println("====== FACADE ======");
        CinemaFacade cinemaMode = new CinemaFacadeImpl(new Dvd(), new Lighting(), new Projector(), new Screen());

        cinemaMode.playMovie();
        cinemaMode.turnOffMovie();

        System.out.println();
    }
}
