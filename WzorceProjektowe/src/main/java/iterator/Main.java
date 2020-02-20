package iterator;

import iterator.control.FirstMenuIterator;
import iterator.control.Iterator;
import iterator.entity.FirstMenu;
import iterator.entity.Menu;
import iterator.entity.SecondMenu;

public class Main {

    public static void main() {
        System.out.println("====== ITERATOR ======");
        Menu firstMenu = new FirstMenu();
        Menu secondMenu = new SecondMenu();

        Iterator firstIterator = firstMenu.createIterator();
        Iterator secondIterator = secondMenu.createIterator();

        printMenu(firstIterator);
        printMenu(secondIterator);

        System.out.println();

    }

    public static void printMenu (Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
