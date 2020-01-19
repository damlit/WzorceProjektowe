package factory.abstractt.control;

import factory.abstractt.entity.Dough;
import factory.abstractt.entity.MarinaraSauce;
import factory.abstractt.entity.Sauce;
import factory.abstractt.entity.ThinDough;

public class ItalianPizzaAdditivesFabric implements PizzaAdditivesFabric {

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
