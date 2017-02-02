package monster;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billy.witt on 2/2/2017 AD.
 */
public class WyvernTest {
    Wyvern wyvern = new Wyvern();

    @Test
    public void getHeart() throws Exception {
        assertTrue(wyvern.getHeart() == 0);
    }

    @Test
    public void getHP() throws Exception {
        assertTrue(wyvern.getHP() == 800);
    }

}