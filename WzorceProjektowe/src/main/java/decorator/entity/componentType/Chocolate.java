package decorator.entity.componentType;

import decorator.entity.abstractEntity.Coffee;
import decorator.entity.abstractEntity.Component;

public class Chocolate extends Component {

    Coffee coffee;

    public Chocolate(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getName() {
        return coffee.getName() + ", chocolate";
    }

    public double cost() {
        return coffee.cost() + 0.45;
    }
}
