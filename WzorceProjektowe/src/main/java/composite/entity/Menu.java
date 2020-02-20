package composite.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Menu extends MenuComponent {

    private List<MenuComponent> items = new ArrayList<>();
    private String menuName;

    public Menu(String menuName) {
        this.menuName = menuName;
    }

    public void add(MenuComponent menuComponent) {
        items.add(menuComponent);
    }

    public Optional<MenuComponent> getDescendant(String name) {
        return items.stream()
                .filter(item -> name.equals(item.getName()))
                .findFirst();
    }

    @Override
    public String getName() {
        return menuName;
    }
}
