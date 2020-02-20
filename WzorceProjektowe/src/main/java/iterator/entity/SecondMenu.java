package iterator.entity;

import iterator.control.FirstMenuIterator;
import iterator.control.Iterator;
import iterator.control.SecondMenuIterator;

public class SecondMenu implements Menu {

    private String[] menu;

    public SecondMenu() {
        menu = new String[]{"second1", "second2", "second3"};
    }

    public Iterator createIterator() {
        return new SecondMenuIterator(menu);
    }
}
