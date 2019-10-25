import edu.missouriwestern.csmp.gg.base.Board;
import edu.missouriwestern.csmp.gg.base.Game;

import java.util.Map;

public class TestGame extends Game {

    public static final String MAP1 =
                    "#####\n" +
                    "#   #\n" +
                    "#   #\n" +
                    "#   #\n" +
                    "#####\n";

    public static final Map<Character,String> TILE_TYPES =
            Map.of('#', "wall",
                    ' ', "floor");

    public TestGame() {
        Board b = new Board(TILE_TYPES, this, "map1", MAP1, Map.of(), Map.of());
        addBoard("map1", b);
    }
}
