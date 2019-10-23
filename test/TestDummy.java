import edu.missouriwestern.csmp.gg.base.Entity;
import edu.missouriwestern.csmp.gg.base.Game;

import java.util.Map;

public class TestDummy extends Entity {

    public TestDummy(Game game) {
        super(game, Map.of());
    }

    public String getType() { return "dummy"; }
}
