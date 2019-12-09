package edu.missouriwestern.csmp.gg.base;

import org.junit.Test;


import static org.junit.Assert.*;

//TODO: getHeight,getWidth do not seem correct.


public class TestBoard {
    DummyTile tile1 = new DummyTile(0,0);
    DummyTile tile2 = new DummyTile(0,1);
    DummyTile tile3 = new DummyTile(1,0);
    DummyTile tile4 = new DummyTile(1,1);

    DummyBoard board = new DummyBoard("unsmart-board", new Map1().toString(), new DummyTile[]{tile1,tile2, tile3, tile4});

    DummyGame game = new DummyGame(board);

    @Test
    public void testGetGame(){
        assertEquals(game, board.getGame());
    }

    @Test
    public void testSetGame(){
        DummyGame tempGame = new DummyGame();
        board.setGame(tempGame);
        assertEquals(tempGame, board.getGame());
    }

    @Test
    public void testGetAdjacentTile(){

    }

    @Test
    public void testGetAdjacentTileDirection(){

    }

    @Test
    public void testGetTiles(){
        System.out.println(board.getTiles());
    }

    @Test
    public void testGetTileStream(){

    }

    @Test
    public void TestGetTile(){

    }

    @Test
    public void TestGetName(){

    }

    @Test
    public void testGetWidth(){
        DummyBoard widthBoard = new DummyBoard("get-width-board", "1");
        assertEquals(112, board.getWidth());
        assertEquals(1, widthBoard.getWidth());
    }

    @Test
    public void testGetHeight(){
        //height never exceeds with tile generator in constructor.
        //the only thing that effects height are the specific tiles added.
        assertEquals(2, board.getHeight());

        DummyBoard heightBoard = new DummyBoard("get-height-board", "123455555555");
        assertEquals(1, heightBoard.getHeight());

    }
    @Test
    public void testGetTileMap(){}

    @Test
    public void testLoadMap()  throws Exception{



            /*try {
            String map = board.loadMap("/test/java/edu.missouriwestern.csmp.gg.base/Map1.txt");

            System.out.println(map);
        }catch(Exception e){
            assertTrue(false);
        }*/

    }

}
