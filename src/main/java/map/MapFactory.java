package map;

import factory.ItemFactory;
import factory.MonsterFactory;
import item.Item;
import monster.Monster;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by billy.witt on 1/28/2017 AD.
 */
public class MapFactory {

    private static HashMap<String, Room> ZorkMap = new HashMap<>();

    public HashMap<String, Room> getZorkMap() {
        return ZorkMap;
    }

    public void loadMap() throws IOException {

        String cLine;
        FileReader mapF = new FileReader("map.txt");
        BufferedReader br = new BufferedReader(mapF);

        while ((cLine = br.readLine()) != null) {
            Room cRoom = new Room();
            ItemFactory itemFactory = new ItemFactory();
            MonsterFactory monsterFactory = new MonsterFactory();
            List<String> mapFragment = Arrays.asList(cLine.split(","));

            String roomID = mapFragment.get(0).toString() + mapFragment.get(1).toString();
            Item item = itemFactory.createItem(mapFragment.get(2));
            Monster monster = MonsterFactory.createMonster(mapFragment.get(3));
            String north = mapFragment.get(4).toString() + mapFragment.get(5).toString();
            String east = mapFragment.get(6).toString() + mapFragment.get(7).toString();
            String south = mapFragment.get(8).toString() + mapFragment.get(9).toString();
            String west = mapFragment.get(10).toString() + mapFragment.get(11).toString();
            String name = mapFragment.get(12).toString();
            String description = mapFragment.get(13).toString();

            cRoom.setItem(item);
            cRoom.setMonster(monster);
            cRoom.setExitMap(north, east, south, west);
            cRoom.setRoomName(name);
            cRoom.setRoomDescription(description);
            ZorkMap.put(roomID, cRoom);
        }

//        Room test = ZorkMap.get("01");
//        System.out.println("test");
//        System.out.println(test.getItem().getName());
//        System.out.println(test.getExitMap("north"));
//        System.out.println(test.getExitMap("east"));
//        System.out.println(test.getExitMap("south"));
//        System.out.println(test.getExitMap("west"));
    }
}
