package edu.missouriwestern.csmp.gg.base;

import edu.missouriwestern.csmp.gg.base.Direction;
import org.junit.Test;

import static junit.framework.Assert.*;

public class TestDirections {


    @Test public void testOpposingDirection() {
        Direction d = Direction.EAST;
        assertEquals(Direction.WEST, d.getOpposingDirection());
    }



}
