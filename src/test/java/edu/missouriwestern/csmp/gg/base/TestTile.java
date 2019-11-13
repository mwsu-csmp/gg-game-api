package edu.missouriwestern.csmp.gg.base;

import org.junit.Test;
import static junit.framework.TestCase.*;

public class TestTile {
    DummyTile tile1 = new DummyTile(0,0);
    DummyGame game1 = new DummyGame();




    @Test
    public void testGetRow(){
        assertEquals(0, tile1.getRow());
        assertEquals(1, new DummyTile(0,1).getRow());
    }

    @Test
    public void testGetColumn(){
        assertEquals(0, tile1.getColumn());
        assertEquals(1, new DummyTile(1,1).getColumn());
    }

    @Test
    public void testGetGame(){

    }

    @Test
    public void testGetType(){

    }

    @Test
    public void testGetCharacter(){

    }

    @Test
    public void testGetBoard(){

    }

    @Test
    public void testGetProperties(){

    }

    @Test
    public void testSetBoard(){

    }

    @Test
    public void testTileStatusUpdateEvent(){

    }

}
