import org.junit.Assert;
import org.junit.Test;
import singleton.entity.Singleton;

public class SingletonTest {

    @Test
    public void singletonTest() {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        Assert.assertEquals(firstSingleton, secondSingleton);
    }
}