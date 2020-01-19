package decorator.entity.componentType;

import decorator.entity.abstractEntity.Coffee;
import decorator.entity.abstractEntity.Component;

public class Milk extends Component {

    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getName() {
        return coffee.getName() + ", milk";
    }

    public double cost() {
        return coffee.cost() + 0.3;
    }
}
