package factory;

import item.Item;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billy.witt on 2/2/2017 AD.
 */
public class ItemFactoryTest {
    @Test
    public void createItem() throws Exception {
        Item earlgrey = ItemFactory.createItem("Earlgrey");
        Item bone = ItemFactory.createItem("Bone");
        Item espresso = ItemFactory.createItem("Espresso");
        Item macchiato = ItemFactory.createItem("Macchiato");
        Item rum = ItemFactory.createItem("Rum");

        assertTrue(earlgrey.getName().equals("Earlgrey"));
        assertTrue(bone.getName().equals("Bone"));
        assertTrue(espresso.getName().equals("Espresso"));
        assertTrue(macchiato.getName().equals("Macchiato"));
        assertTrue(rum.getName().equals("Rum"));
    }

}