package decorator.entity.componentType;

import decorator.entity.abstractEntity.Coffee;
import decorator.entity.abstractEntity.Component;

public class WhippedCream extends Component {

    Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getName() {
        return coffee.getName() + ", whipped cream";
    }

    public double cost() {
        return coffee.cost() + 0.89;
    }
}
