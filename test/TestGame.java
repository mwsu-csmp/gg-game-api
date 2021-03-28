import edu.missouriwestern.csmp.gg.base.Agent;
import edu.missouriwestern.csmp.gg.base.Game;
import edu.missouriwestern.csmp.gg.base.datastores.InMemoryDataStore;

import java.util.Map;

public class TestGame extends Game {

    public static final Map<Character,String> TILE_TYPES =
            Map.of('#', "wall",
                    ' ', "floor");

    public Agent getAgent(String id, String role) {
        return null;
    }

    public TestGame() {
        super("game1", new InMemoryDataStore(),
                event -> {},
                event -> {},
                new TestMap1());
    }
}
