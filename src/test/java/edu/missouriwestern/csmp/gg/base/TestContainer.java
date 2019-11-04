package edu.missouriwestern.csmp.gg.base;

import edu.missouriwestern.csmp.gg.base.datastores.InMemoryDataStore;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class TestContainer {
    DummyGame game = new DummyGame();
    DummyEntity ent = new DummyEntity(game);


    @Test
    public void testGetGame(){

    }

    @Test
    public void testAddEntity(){
        game.addEntity(ent);
    }

    @Test
    public void removeEntity(){

        assertEquals(0, game.getEntities().count());
    }

    @Test
    public void getEntities(){

        assertEquals(0,game.getEntities().count());

    }

    @Test
    public void isEmpty(){
        //if we count game as an entity, this test is correct
        assertEquals(false,game.isEmpty());
    }

    @Test
    public void containsEntity(){

    }
}
