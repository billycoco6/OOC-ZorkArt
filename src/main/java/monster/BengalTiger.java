package monster;

import character.Character;
import factory.MonsterFactory;

/**
 * Created by billy.witt on 1/29/2017 AD.
 */
public class BengalTiger implements Monster {

    private int HP = 80;
    private int Attack = 30;
    private String name;
    Character player = new Character();


    @Override
    public void getInfo() {
        System.out.println("Bengal-Tiger\nHP: " + HP + "\nAttack: " + Attack);
    }

    @Override
    public void Attack() {
        player.setHP(player.getHP() - Attack);
    }

    @Override
    public void isAttacked(int damage) {
        HP = HP - damage;
        if (HP < 0) {
            System.out.println("Bengal Tiger is dead.");
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
