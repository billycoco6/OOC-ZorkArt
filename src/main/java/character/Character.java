package character;

import item.Item;

import java.util.ArrayList;

/**
 * Created by billy.witt on 1/28/2017 AD.
 */
public class Character {

    private static int HP = 150;
    private static int Attack = 10;
    public static ArrayList<Item> Utility = new ArrayList<>();
    public static ArrayList<Item> Inventories = new ArrayList<>();

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
        if (this.HP > 150) {
            this.HP = 150;
        }
    }
}
