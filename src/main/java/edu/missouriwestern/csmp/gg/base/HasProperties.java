package edu.missouriwestern.csmp.gg.base;

import java.util.Map;
import java.util.Optional;

/** interface for all game objects that can have properties associated with them */
public interface HasProperties {
    public Map<String,String> getProperties();
    public void setProperty(String key, String value);

    public default void setProperties(Map<String,String> properties) {
        for(var entry : properties.entrySet())
            setProperty(entry.getKey(), entry.getValue());
    }

    public default boolean hasProperty(String key) {
        return getProperties().containsKey(key);
    }

    public default String getProperty(String key) {
        var m = getProperties();
        if(!m.containsKey(key))
            throw new IllegalArgumentException("no such property " +
                key + " in " +this);
        return m.get(key);
    }

    public Game getGame();

    public default Optional<Entity> getEntity(String property) {
        var properties = getProperties();
        if(properties.containsKey(property)) {
            try {
                var entity = getGame().getEntity(Integer.parseInt(getProperty(property)));
                return Optional.of(entity);
            } catch(Exception e) {

            }
        }
        return Optional.empty();
    }
    public default Optional<Entity> getEntity() { return getEntity("entity"); }

    public default Optional<Direction> getDirection(String property) {
        var properties = getProperties();
        if(properties.containsKey(property)) {
            try {
                var direction = Direction.valueOf(properties.get(property));
                return Optional.of(direction);
            } catch(Exception e) {

            }
        }
        return Optional.empty();
    }
    public default Optional<Direction> getDirection() { return getDirection("direction"); }

    public default Optional<Tile> getTile(String prefix) {
        var properties = getProperties();
        if(properties.containsKey(prefix+"board") &&
                properties.containsKey(prefix+"row") &&
                properties.containsKey(prefix + "column")) {
            var board = getGame().getBoard(properties.get(prefix+"board"));
            if(board != null) {
                try {
                    var row = Integer.parseInt(properties.get(prefix+"row"));
                    var column = Integer.parseInt(properties.get(prefix+"column"));
                    var tile = board.getTile(column, row);
                    if(tile != null) return Optional.of(tile);
                } catch(NumberFormatException e) {
                }
            }
        }
        return Optional.empty();
    }
    public default Optional<Tile> getTile() { return getTile(""); }

    /** Creates a JSON representation of the properties */
    // TODO: use GSON library
    public default String serializeProperties() {
        return "{" + getProperties().entrySet().stream()
                .map(e -> "\"" + e.getKey() + "\": " + e.getValue())
                .reduce((s1, s2) -> s1 + ","+ s2).orElse("") + "}";
    }
}
