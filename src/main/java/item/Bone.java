package item;

import factory.ItemFactory;
import map.MapFactory;
import map.Room;

import java.util.HashMap;

/**
 * Created by billy.witt on 1/31/2017 AD.
 */
public class Bone implements Item {
    private String name;
    ItemFactory itemFactory = new ItemFactory();
    Item key = itemFactory.createItem("Key");
    private MapFactory mapFactory = new MapFactory();
    public HashMap<String, Room> ZorkMap = mapFactory.getZorkMap();
    Room first = new Room();

    @Override
    public int isUsed() {
        first.setItem(key);
        first.setMonster(null);
        first.setExitMap("01","-1-1","-1-1","-1-1");
        ZorkMap.put("00", first);
        System.out.println("Tinker Bell: He dropped the 'Key'. Hurry up! take it before someone come in");
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
