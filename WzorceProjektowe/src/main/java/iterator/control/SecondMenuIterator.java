package iterator.control;

public class SecondMenuIterator implements Iterator {

    String[] elements;
    int position = 0;

    public SecondMenuIterator(String[] elements) {
        this.elements = elements;
    }

    public String next() {
        String element = elements[position];
        position++;
        return element;
    }

    public boolean hasNext() {
        return position < elements.length
                && null != elements[position];
    }
}
