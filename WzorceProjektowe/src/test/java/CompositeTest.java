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

        Optional<Integer> price = allMenu.getDescendant("first")
                .flatMap(second -> second.getDescendant("second"))
                .flatMap(third -> third.getDescendant("item"))
                .map(MenuComponent::getPrice);

        Assert.assertTrue(price.isPresent());
        Assert.assertEquals(Integer.valueOf(21), price.get());
    }
}
