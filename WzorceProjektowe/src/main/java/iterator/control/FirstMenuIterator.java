package iterator.control;

import java.util.List;

public class FirstMenuIterator implements Iterator {

    List<String> elements;
    int position = 0;

    public FirstMenuIterator(List<String> elements) {
        this.elements = elements;
    }

    public String next() {
        String element = elements.get(position);
        position++;
        return element;
    }

    public boolean hasNext() {
        return position < elements.size()
                && null != elements.get(position);
    }
}
