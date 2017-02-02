package character;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billy.witt on 2/2/2017 AD.
 */
public class CharacterTest {
    Character character = new Character();

    @Test
    public void setAttack() throws Exception {
        character.setAttack(15);
        assertTrue(character.getAttack() == 15);
    }

    @Test
    public void getDefaultHP() throws Exception {
        assertTrue(character.getHP() == 150);
    }

    @Test
    public void setHP() throws Exception {
        character.setHP(100);
        assertTrue(character.getHP() == 100);
    }

    @Test
    public void getDefaultAttack(){
        assertTrue(character.getAttack() == 10);
    }

}