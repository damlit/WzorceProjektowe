package iterator.entity;

import iterator.control.FirstMenuIterator;
import iterator.control.Iterator;

import java.util.ArrayList;
import java.util.List;

public class FirstMenu implements Menu {

    private List<String> menu = new ArrayList<>();

    public FirstMenu() {
        menu.add("first1");
        menu.add("first2");
        menu.add("first3");
    }

    public Iterator createIterator() {
        return new FirstMenuIterator(menu);
    }
}
