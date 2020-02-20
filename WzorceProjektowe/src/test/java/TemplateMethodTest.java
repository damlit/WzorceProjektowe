import org.junit.Assert;
import org.junit.Test;
import template_method.entity.Coffee;
import template_method.entity.Tee;

public class TemplateMethodTest {

    private static final String TEE = "tee";
    private static final String COFFEE = "coffee";

    @Test
    public void shouldReturnWhatWasBrewed() {
        Tee tee = new Tee();
        Coffee coffee = new Coffee();

        Assert.assertEquals(TEE, tee.make());
        Assert.assertEquals(COFFEE, coffee.make());
    }
}
