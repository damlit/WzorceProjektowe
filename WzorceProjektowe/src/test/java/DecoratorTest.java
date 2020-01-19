import decorator.entity.abstractEntity.Coffee;
import decorator.entity.coffeeType.HeavilyRoasted;
import decorator.entity.componentType.Chocolate;
import decorator.entity.componentType.WhippedCream;
import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void decoratorTest() {
        Coffee coffee = new HeavilyRoasted();
        coffee = new Chocolate(coffee);
        coffee = new WhippedCream(coffee);

        Assert.assertEquals(4.23, coffee.cost(), 0.01);
    }
}
