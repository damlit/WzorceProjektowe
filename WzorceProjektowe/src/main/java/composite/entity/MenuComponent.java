package composite.entity;

import java.util.Optional;

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public Optional<MenuComponent> getDescendant(String menuName) {
        throw new UnsupportedOperationException();
    }

    public int getPrice() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }
}
