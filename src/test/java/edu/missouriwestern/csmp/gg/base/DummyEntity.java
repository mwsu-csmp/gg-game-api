package edu.missouriwestern.csmp.gg.base;

import edu.missouriwestern.csmp.gg.base.Entity;
import edu.missouriwestern.csmp.gg.base.Game;

import java.util.Map;

public class DummyEntity extends Entity {

    public DummyEntity(Game game) {
        super(game, Map.of());
    }

    public String getType() { return "dummy"; }
}
