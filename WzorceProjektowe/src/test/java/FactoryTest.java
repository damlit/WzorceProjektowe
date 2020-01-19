import factory.abstractt.control.AmericanPizzaAdditivesFabric;
import factory.abstractt.control.ItalianPizzaAdditivesFabric;
import factory.abstractt.control.PizzaAdditivesFabric;
import factory.abstractt.entity.*;
import factory.method.control.AmericanPizzeria;
import factory.method.control.ItalianPizzeria;
import factory.method.control.Pizzeria;
import factory.method.entity.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class FactoryTest {

    @Test
    public void factoryMethodAmericanFabricTest() {
        Pizzeria americanPizzeria = new AmericanPizzeria();

        Optional<Pizza> americanPepperoniPizza = americanPizzeria.order("pepperoni");
        Optional<Pizza> americanCheesePizza = americanPizzeria.order("cheese");
        Optional<Pizza> americanVegetarianPizza = americanPizzeria.order("vegetarian");

        Assert.assertTrue(americanPepperoniPizza.isPresent());
        Assert.assertTrue(americanPepperoniPizza.get() instanceof AmericanPepperoniPizza);
        Assert.assertTrue(americanCheesePizza.isPresent());
        Assert.assertTrue(americanCheesePizza.get() instanceof AmericanCheesePizza);
        Assert.assertTrue(americanVegetarianPizza.isPresent());
        Assert.assertTrue(americanVegetarianPizza.get() instanceof AmericanVegetarianPizza);
    }

    @Test
    public void factoryMethodItalianFabricTest() {
        Pizzeria italianPizzeria = new ItalianPizzeria();

        Optional<Pizza> italianCheesePizza = italianPizzeria.order("cheese");
        Optional<Pizza> italianPepperoniPizza = italianPizzeria.order("pepperoni");
        Optional<Pizza> italianVegetarianPizza = italianPizzeria.order("vegetarian");

        Assert.assertTrue(italianCheesePizza.isPresent());
        Assert.assertTrue(italianCheesePizza.get() instanceof ItalianCheesePizza);
        Assert.assertTrue(italianPepperoniPizza.isPresent());
        Assert.assertTrue(italianPepperoniPizza.get() instanceof ItalianPepperoniPizza);
        Assert.assertTrue(italianVegetarianPizza.isPresent());
        Assert.assertTrue(italianVegetarianPizza.get() instanceof ItalianVegetarianPizza);
    }

    @Test
    public void factoryAbstractAmericanFabricTest() {
        PizzaAdditivesFabric americanPizzaAdditivesFabric = new AmericanPizzaAdditivesFabric();

        Sauce americanSauce = americanPizzaAdditivesFabric.createSauce();
        Dough americanDough = americanPizzaAdditivesFabric.createDough();

        Assert.assertTrue(americanDough instanceof ThickDough);
        Assert.assertTrue(americanSauce instanceof GarlicSauce);
    }

    @Test
    public void factoryAbstractItaliannFabricTest() {
        PizzaAdditivesFabric italianPizzaAdditivesFabric = new ItalianPizzaAdditivesFabric();

        Sauce italianSauce = italianPizzaAdditivesFabric.createSauce();
        Dough italianDough = italianPizzaAdditivesFabric.createDough();

        Assert.assertTrue(italianDough instanceof ThinDough);
        Assert.assertTrue(italianSauce instanceof MarinaraSauce);
    }
}
