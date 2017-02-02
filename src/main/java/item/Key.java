package item;

import factory.ItemFactory;
import map.MapFactory;
import map.Room;

import java.util.HashMap;

/**
 * Created by billy.witt on 1/31/2017 AD.
 */
public class Key implements Item {
    private String name;
    MapFactory mapFactory = new MapFactory();
    HashMap<String, Room> map = mapFactory.getZorkMap();

    @Override
    public int isUsed() {
        map.get("00").setLocked(false);
        return 0;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}