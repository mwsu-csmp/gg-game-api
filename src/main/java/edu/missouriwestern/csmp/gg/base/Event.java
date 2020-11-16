package edu.missouriwestern.csmp.gg.base;

import com.google.gson.GsonBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


// TODO: create annotation indicating required and optional properties

/** Indicates when something happens during the game that other game components may react to.
 * Also used to record important events in the processing of the game.
 */
public class Event implements HasProperties {

    private final Map<String,Object> properties;
    private final int id;
    private final Game game;
    private final long eventTime;
    private final String type;

    public Event(Game game, String type) {
        this(game, type, game.getNextEventId(), new HashMap<>());
    }

    private Event(Game game, String type, int id) {
        this(game, type, id, new HashMap<>());
    }

    public Event(Game game, String type, Map<String,Object> properties) {
        this(game, type, game.getNextEventId(), properties);
    }

    private Event(Game game, String type, int id, Map<String,Object> properties) {
        this.id = id;
        this.game = game;
        this.type = type;
        this.eventTime = game.getGameTime();
        properties = new HashMap<>(properties); // add id to properties
        properties.put("id", ""+id);
        this.properties = Collections.unmodifiableMap(properties);
    }

    @Override
    public Map<String, Object> getProperties() {
        return properties;
    }

    @Override
    public void setProperty(String key, Object value) {
        throw new UnsupportedOperationException("Event properties are immutable");
    }

    /** time elapsed since start of game when this event occurred */
    public long getEventTime() {
        return eventTime;
    }

    public Game getGame() {
        return game;
    }

    public String getType() { return type; }

    public String toString() {
            var gsonBuilder = new GsonBuilder();
            var gson = gsonBuilder.create();
            var m = new HashMap<String,Object>();
            m.put("id", id);
            m.put("time", getEventTime());
            m.put("type", type);
            m.put("properties", getProperties());
            return gson.toJson(m);
    }

}
