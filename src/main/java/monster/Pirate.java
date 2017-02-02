package monster;

import character.Character;

/**
 * Created by billy.witt on 2/1/2017 AD.
 */
public class Pirate implements Monster {
    private int HP = 120;
    private int Attack = 40;
    private String name;
    Character player = new Character();


    @Override
    public void getInfo() {
        System.out.println("Pirate\nHP: " + HP + "\nAttack: " + Attack);
    }

    @Override
    public void Attack() {
        player.setHP(player.getHP() - Attack);
    }

    @Override
    public void isAttacked(int damage) {
        HP = HP - damage;
        if (HP < 0) {
            System.out.println("Pirate is dead.");
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
