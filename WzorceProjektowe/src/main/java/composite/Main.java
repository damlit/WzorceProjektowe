package composite;

import composite.entity.Menu;
import composite.entity.MenuComponent;
import composite.entity.MenuItem;

public class Main {

    public static void main() {
        System.out.println("====== COMPOSITE ======");
        Menu firstMenu = new Menu("first");
        Menu secondMenu = new Menu("second");
        Menu thirdMenu = new Menu("third");

        MenuItem exampleCarrot = new MenuItem("Carrot", 1);
        thirdMenu.add(exampleCarrot);

        Menu allMenu = new Menu("All in one");

        allMenu.add(firstMenu);
        allMenu.add(secondMenu);

        secondMenu.add(thirdMenu);

        allMenu.getDescendant("second")
                .flatMap(second -> second.getDescendant("third"))
                .flatMap(third -> third.getDescendant("Carrot"))
                .ifPresent(carrot -> System.out.println("Carrot price -> " + carrot.getPrice()));

        System.out.println();
    }
}
