import edu.missouriwestern.csmp.gg.base.Direction;
import org.junit.Test;

import static junit.framework.Assert.*;
public class TestEntity {
    @Test public void testUpdateEntityLocation() {
        var game = new TestGame();
        var dummy = new TestDummy(game);
        var board = game.getBoard("map1");
        var startLocation = board.getTile(2, 2);
        var endLocation = board.getTile(2, 3);
        startLocation.addEntity(dummy);

        endLocation.addEntity(dummy);
        assertEquals(0, startLocation.getEntities().count());
        assertEquals(1, endLocation.getEntities().count()); // end location should hold one entity
    }
}
