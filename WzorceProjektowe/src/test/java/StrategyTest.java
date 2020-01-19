import org.junit.Assert;
import org.junit.Test;
import strategy.entity.Archer;
import strategy.entity.Assassin;
import strategy.entity.Soldier;
import strategy.entity.Swordfish;

public class StrategyTest {

    @Test
    public void strategyTest() {
        Soldier soldierArcher = new Archer();
        Soldier soldierSwordfish = new Swordfish();
        Soldier soldierAssassin = new Assassin();

        Assert.assertTrue((soldierArcher.attack() < soldierSwordfish.attack()));
        Assert.assertTrue((soldierArcher.attack() < soldierAssassin.attack()));
        Assert.assertTrue((soldierAssassin.attack() > soldierSwordfish.attack()));
    }
}
