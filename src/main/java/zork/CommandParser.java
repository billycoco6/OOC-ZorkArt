package zork;

import character.Character;
import item.Item;
import map.MapFactory;
import map.Room;
import monster.CaptainGatewinson;
import monster.Wyvern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by billy.witt on 1/28/2017 AD.
 */
public class CommandParser {

    List<String> weaponList = new ArrayList<>(Arrays.asList("Rusty-Sword","iSword","iSword-Pro"));
    private MapFactory mapFactory = new MapFactory();
    public HashMap<String, Room> ZorkMap = mapFactory.getZorkMap();
    private Character player = new Character();
    static String cRoomID = "00";
    private static boolean gameOver = false;
    Wyvern wyvern = new Wyvern();
    CaptainGatewinson captainGatewinson = new CaptainGatewinson();
    Room lastRoom = new Room();

    public static boolean isGameOver() {
        return gameOver;
    }

    public void mapDetail() {
        Room cRoom = ZorkMap.get(cRoomID);
        if (cRoom != lastRoom & cRoom.getRoomName() != null) {
            System.out.println("\n" + cRoom.getRoomName());
            System.out.println(cRoom.getRoomDescription());
        }
        lastRoom = cRoom;
    }

    public void parse(String command, String object) {
        Room cRoom = ZorkMap.get(cRoomID);

        if (command.equals("go")) {
            try {
                if (cRoom.isLocked()) {
                    System.out.println("Tinker Bell: The room is locked, you need the key to unlock it first");
                } else {
                    if (cRoom.getExitMap(object).equals("-1-1")) {
                        System.out.println("Tinker Bell: You cannot go that way, there is a wall.");
                    }
                    else {
                        cRoom.setRoomDescription("");
                        cRoomID = cRoom.getExitMap(object);
                        cRoom = ZorkMap.get(cRoomID);
                        if (cRoom.getMonster() != null) {
                            System.out.println("Tinker Bell: Watch out! There is a " + cRoom.getMonster().getName() + " in this room\n");
                            cRoom.getMonster().getInfo();
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Tinker Bell: I don't think we can go that way");
        }




        } else if (command.equals("take")) {
            if (cRoom.getItem() == null) {
                System.out.println("Tinker Bell: The room is empty");
            }
            else {
                if (object.equals(cRoom.getItem().getName())) {
                    cRoom.takeItem();
                    System.out.println("You picked up " + object);
                    System.out.println("My Bag:");
                    for (Item i : player.Inventories) {
                        System.out.println("  - " + i.getName());
                    }
                    for (Item i : player.Utility) {
                        System.out.println("  - " + i.getName());
                    }
                    cRoom.setItem(null);
                } else {
                    System.out.println("Tinker Bell: Excuse me, I don't see that item in the room");
                }
            }



        } else if (command.equals("drop")) {
            boolean match = false;
            try {
                for (Item i : player.Inventories) {
                    System.out.println(i.getName());
                    if (i.getName().equals(object)) {
                        player.Inventories.remove(i);
                        System.out.println("Tinker Bell: You just dropped your " + object);
                        match = true;
                        break;
                    }
                }
                for (Item i : player.Utility) {
                    System.out.println(i.getName());
                    if (i.getName().equals(object)) {
                        System.out.println("Tinker Bell: I don't think you should drop that item");
                        match = true;
                        break;
                    }
                }
                if (!match) {
                    System.out.println("Tinker Bell: I don't see the item what you want to drop");
                }
            } catch (Exception e) {
                System.out.println("Tinker Bell: I don't see the item what you want to drop");
            }



        } else if (command.equals("use")) {
            try {
                boolean match = false;
                for (Item i : player.Inventories) {
                    if (i.getName().equals(object)) {
                        int itemPower = i.isUsed();
                        if (object.equals("Rum")) {
                            player.setAttack(player.getAttack() + itemPower);
                            System.out.println("Tinker Bell: " + object + " is used\nYour Attack: " + player.getAttack());
                        } else {
                            player.setHP(player.getHP() + itemPower);
                            System.out.println("Tinker Bell: " + object + " is used\nYour HP: " + player.getHP());
                        }
                        player.Inventories.remove(i);
                        match = true;
                        break;
                    }
                }
                for (Item i : player.Utility) {
                    if (weaponList.contains(object)) {
                        System.out.println("Tinker Bell: This is a weapon, you should use 'attack-with' instead");
                        match = true;
                        break;
                    }
                    if (i.getName().equals(object)) {
                        if (object.equals("Raw-Meat")) {
                            if (!cRoom.getMonster().getName().equals("Wyvern")) {
                                System.out.println("Tinker Bell: There is nothing to feed in this room");
                                break;
                            }
                            Wyvern wyvern = new Wyvern();
                            System.out.println("Tinker Bell: " + object + " is used");
                            i.isUsed();
                            System.out.println("Wyvern: " + wyvern.getHeart() + "/5 \u2764");
                            player.Utility.remove(i);
                            match = true;
                            if (wyvern.getHeart() == 5) {
                                System.out.println("Wyvern: Thank you Captain, I will bring you out of here");
                                gameOver = true;
                            }
                            break;
                        }
                        else {
                            i.isUsed();
                            player.Utility.remove(i);
                            System.out.println(object + " is used");
                            match = true;
                            break;
                        }
                    }
            }
            if (!match) {
                System.out.println("Tinker Bell: I don't think we have " + object + " yet");
            }
            } catch (Exception e) {
                System.out.println("");
            }




        } else if (command.equals("attack-with")) {
            try {
                boolean match = false;
                int monsterHP = cRoom.getMonster().getHP();
                if (weaponList.contains(object)) {
                    for (Item i : player.Utility) {
                        if (i.getName().equals(object)) {
                            int AttackPower = player.getAttack() + i.isUsed();
                            match = true;
                            System.out.println("You deal '" + AttackPower + "' to " + cRoom.getMonster().getName());
                            cRoom.getMonster().setHP(monsterHP - AttackPower);
                            monsterHP = cRoom.getMonster().getHP();
                            if (monsterHP <= 0) {
                                System.out.println(cRoom.getMonster().getName() + " is dead");
                                if (cRoom.getMonster().getName().equals("Captain-Gatewinson")) {
                                    System.out.println("Crews: Welcome back Captain!! We have waited for you");
                                    gameOver = true;
                                    break;
                                }
                                cRoom.setMonster(null);
                            } else {
                                System.out.println(cRoom.getMonster().getName() + " HP: " + cRoom.getMonster().getHP());
                            }
                            cRoom.getMonster().Attack();
                            if (player.getHP() <= 0) {
                                System.out.println("You were killed by " + cRoom.getMonster().getName());
                                gameOver = true;
                            }
                            else {
                                System.out.println("Your HP: " + player.getHP());
                            }
                            break;
                        }
                    }
                    if (!match) {
                        System.out.println("Tinker Bell: You do not have " + object);
                    }
                } else {
                    System.out.println("Tinker Bell: You cannot attack with " + object);
                }
            } catch (Exception e) {
                System.out.println("Tinker Bell: There is no monster in this room");
            }
        }
    }
}
