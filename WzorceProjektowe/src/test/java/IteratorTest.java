import iterator.control.Iterator;
import iterator.entity.FirstMenu;
import iterator.entity.Menu;
import iterator.entity.SecondMenu;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {

    @Test
    public void shouldCollectAllElementsFromAnothersMenu() {
        List<String> comparedList = new ArrayList<>();
        Menu firstMenu = new FirstMenu();
        Menu secondMenu = new SecondMenu();

        Iterator firstIterator = firstMenu.createIterator();
        Iterator secondIterator = secondMenu.createIterator();

        while (firstIterator.hasNext()) {
            comparedList.add(firstIterator.next());
        }
        while (secondIterator.hasNext()) {
            comparedList.add(secondIterator.next());
        }

        Assert.assertEquals(6, comparedList.size());
    }
}
