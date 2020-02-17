import adapter.control.Duck;
import adapter.control.TurkeyAdapter;
import adapter.entity.DuckImpl;
import adapter.entity.TurkeyImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    private static final String QUACKING = "--> QUA qua qua!";
    private static final String GOBBLING = "--> gul gul gul!";

    Duck duck = new DuckImpl();

    @Test
    public void shouldMakeSoundsWell() {

        assertEquals(QUACKING, duck.quacking());

        duck = new TurkeyAdapter(new TurkeyImpl());
        assertEquals(GOBBLING, duck.quacking());
    }
}
