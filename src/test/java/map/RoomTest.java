package map;

import item.Earlgrey;
import item.Item;
import monster.Wyvern;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billy.witt on 2/2/2017 AD.
 */
public class RoomTest {
    Room room = new Room();

    @Test
    public void getRoomName() throws Exception {
        room.setRoomName("Name");
        assertTrue(room.getRoomName().equals("Name"));
    }

    @Test
    public void getRoomDescription() throws Exception {
        room.setRoomDescription("Description");
        assertTrue(room.getRoomDescription().equals("Description"));
    }

    @Test
    public void getExitMap() throws Exception {
        room.setExitMap("0","1","2","3");
        assertTrue(room.getExitMap("north").equals("0"));
        assertTrue(room.getExitMap("east").equals("1"));
        assertTrue(room.getExitMap("south").equals("2"));
        assertTrue(room.getExitMap("west").equals("3"));
    }

    @Test
    public void getItem() throws Exception {
        Earlgrey earlgrey = new Earlgrey();
        earlgrey.setName("Earlgrey");
        room.setItem(earlgrey);
        assertTrue(room.getItem().getName().equals("Earlgrey"));
    }

    @Test
    public void getMonster() throws Exception {
        Wyvern wyvern = new Wyvern();
        wyvern.setName("Wyvern");
        room.setMonster(wyvern);
        assertTrue(room.getMonster().getName().equals("Wyvern"));
    }

}