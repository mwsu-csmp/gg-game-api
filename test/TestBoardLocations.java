import org.junit.Test;
import static org.junit.Assert.*;


public class TestBoardLocations {
    @Test public void testGetTile() {
        var board = new TestMap1();
        var location = board.getTile(2, 2);
        assertNotNull(location);
    }
}
