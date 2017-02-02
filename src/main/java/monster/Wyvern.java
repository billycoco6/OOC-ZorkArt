package monster;

import character.Character;
import factory.MonsterFactory;

/**
 * Created by billy.witt on 1/29/2017 AD.
 */
public class Wyvern implements Monster {

    private int HP = 800;
    private int Attack = 100;
    private String name;
    private static int Heart;
    Character player = new Character();

    public int getHeart() {
        return Heart;
    }

    public void isFed() {
        this.Heart = this.Heart + 1;
    }

    @Override
    public void getInfo() {
        System.out.println("Wyvern\nHP: " + HP + "\nAttack: " + Attack + "\nHeart: " + Heart + "/5 \u2764");
    }

    @Override
    public void Attack() {
        player.setHP(player.getHP() - Attack);
    }

    @Override
    public void isAttacked(int damage) {
        HP = HP - damage;
        if (HP < 0) {
            System.out.println("Wyvern is dead.");
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public int getHP() {
        return HP;
    }
}
