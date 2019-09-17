package edu.missouriwestern.csmp.gg.base.datastores;

import edu.missouriwestern.csmp.gg.base.DataStore;
import edu.missouriwestern.csmp.gg.base.Entity;
import edu.missouriwestern.csmp.gg.base.HasProperties;
import edu.missouriwestern.csmp.gg.base.Player;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDataStore implements DataStore {
    private Map<Integer,Map<String,String>> entities = new ConcurrentHashMap<>();
    private Map<String,Map<String,String>> players = new ConcurrentHashMap<>();

    public void save(HasProperties obj) {
        // implement multiple dispatch
        if(obj instanceof Player) {
            save((Player)obj);
        } else if(obj instanceof Entity) {
            save((Entity)obj);
        }
    }

    private void save(Player player) {
        players.put(player.getID(), player.getProperties());
    }

    private void save(Entity entity) {
        entities.put(entity.getID(), entity.getProperties());
    }

    public void load(HasProperties obj) {
        // implement multiple dispatch
        if(obj instanceof Player) {
            load((Player)obj);
        } else if(obj instanceof Entity) {
            load((Entity)obj);
        }
    }

    private void load(Player player) {
        assert players.containsKey(player.getID());

        var properties = players.get(player);
        if(properties != null) for(var key : properties.keySet())
            player.setProperty(key, properties.get(key));
    }

    private void load(Entity entity) {
        assert entities.containsKey(entity.getID());

        var properties = entities.get(entity);
        if(properties != null) for(var key : properties.keySet())
            entity.setProperty(key, properties.get(key));
    }

    public ArrayList<Integer> search(Map<String, String> query) {
        var setQuery = query.entrySet();
        var results = new ArrayList<Integer>();
        for(var id : entities.keySet()) {
            var entityProperties = entities.get(id).entrySet();
            if(entityProperties.containsAll(setQuery))
                results.add(id);
        }
        return results;
    }

    public int getMaxEntityId() {
        return entities.keySet().stream().mapToInt(x->x.intValue()).max().orElseGet(()->1);
    }
}
