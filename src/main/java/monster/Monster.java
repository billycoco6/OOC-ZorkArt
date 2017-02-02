package monster;

/**
 * Created by billy.witt on 1/31/2017 AD.
 */
public interface Monster {

    void getInfo();

    void Attack();

    void isAttacked(int damage);

    void setName(String name);

    String getName();

    void setHP(int HP);

    int getHP();
}
