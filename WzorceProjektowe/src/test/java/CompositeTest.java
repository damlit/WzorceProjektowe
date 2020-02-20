import composite.entity.Menu;
import composite.entity.MenuComponent;
import composite.entity.MenuItem;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class CompositeTest {

    @Test
    public void shouldFindPriceItemInMenuFromAnotherMenu() {
        Menu firstMenu = new Menu("first");
        Menu secondMenu = new Menu("second");

        MenuItem exampleCarrot = new MenuItem("item", 21);
        secondMenu.add(exampleCarrot);

        Menu allMenu = new Menu("All in one");

        allMenu.add(firstMenu);
        firstMenu.add(secondMenu);

        Optional<MenuComponent> menu = allMenu.getDescendant("first");
        Assert.assertTrue(menu.isPresent());
        menu = menu.get().getDescendant("second");
        Assert.assertTrue(menu.isPresent());
        Optional<MenuComponent> item = menu.get().getDescendant("item");
        Assert.assertTrue(item.isPresent());
        Assert.assertEquals(21, item.get().getPrice());
    }
}
