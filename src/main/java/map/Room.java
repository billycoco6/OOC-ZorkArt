package map;

import character.Character;
import item.Item;
import monster.Monster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by billy.witt on 1/28/2017 AD.
 */
public class Room {

    List<String> itemsList = new ArrayList<>(Arrays.asList("Earlgrey", "Espresso", "Macchiato", "Rum"));
    private Item item;
    private Monster monster;
    private static boolean isLocked = true;
    private String north;
    private String east;
    private String south;
    private String west;
    private String roomName;
    private String roomDescription;

    Character player = new Character();

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public void setExitMap(String north, String east, String south, String west) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public String getExitMap(String direction) {
        switch (direction) {
            case "north":
                return north;
            case "east":
                return east;
            case "south":
                return south;
            case "west":
                return west;
        }
        return null;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        System.out.println("Tinker Belle: Good job!! The room is now unlocked there is an exit to the north");
        isLocked = locked;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public void takeItem() {
        if (itemsList.contains(item.getName())) {
            if (player.Inventories.size() < 3) {
                player.Inventories.add(item);
                System.out.println("Tinker Bell: " + "I just took " + item.getName() + " for you");
            } else {
                System.out.println("Tinker Bell: I think your bag is fulled, you can drop an item to get the new one");
            }
        } else {
            player.Utility.add(item);
        }
    }
}
