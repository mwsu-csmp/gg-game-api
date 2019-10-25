import edu.missouriwestern.csmp.gg.base.Board;

import java.util.Map;

public class TestMap1 extends Board {

    public static final String MAP1 =
                    "#####\n" +
                    "#   #\n" +
                    "#   #\n" +
                    "#   #\n" +
                    "#####\n";


    public TestMap1() {
        super("map1", MAP1, Map.of());
    }
}
