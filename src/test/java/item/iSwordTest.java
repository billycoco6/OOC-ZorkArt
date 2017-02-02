package item;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billy.witt on 2/2/2017 AD.
 */
public class iSwordTest {
    iSword iSword = new iSword();

    @Test
    public void isUsed() throws Exception {
        assertTrue(iSword.isUsed() == 40);
    }

    @Test
    public void setName() throws Exception {
        iSword.setName("Test");
        assertTrue(iSword.getName().equals("Test"));
    }
}