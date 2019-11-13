package edu.missouriwestern.csmp.gg.base;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class TestBoard {
    DummyTile tile = new DummyTile(0,0);
    DummyBoard board = new DummyBoard("unsmart-board", new Map1().toString(), tile);
    DummyGame game = new DummyGame(board);

    @Test
    public void testGetGame(){
        assertEquals(game, board);
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

    }

    @Test
    public void testGetHeight(){

    }
    @Test
    public void testGetTileMap(){

    }

    @Test
    public void testLoadMap(){

    }

}
