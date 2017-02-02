package factory;

import item.*;

import java.util.HashMap;

/**
 * Created by billy.witt on 1/28/2017 AD.
 */
public class ItemFactory {

    public static Item createItem(String itemType) {
        switch (itemType) {
            case "Earlgrey":
                Earlgrey earlgrey = new Earlgrey();
                earlgrey.setName("Earlgrey");
                return earlgrey;

            case "Espresso":
                Espresso espresso = new Espresso();
                espresso.setName("Espresso");
                return espresso;

            case "Macchiato":
                Macchiato macchiato = new Macchiato();
                macchiato.setName("Macchiato");
                return macchiato;

            case "Rum":
                Rum rum = new Rum();
                rum.setName("Rum");
                return rum;

            case "Bone":
                Bone bone = new Bone();
                bone.setName("Bone");
                return bone;

            case "Key":
                Key key = new Key();
                key.setName("Key");
                return key;

            case "Raw-Meat":
                RawMeat rawMeat = new RawMeat();
                rawMeat.setName("Raw-Meat");
                return rawMeat;

            case "Rusty-Sword":
                RustySword rustySword = new RustySword();
                rustySword.setName("Rusty-Sword");
                return rustySword;

            case "iSword":
                iSword iSword = new iSword();
                iSword.setName("iSword");
                return iSword;

            case "iSword-Pro":
                iSwordPro iSwordPro = new iSwordPro();
                iSwordPro.setName("iSword-Pro");
                return iSwordPro;

            default:
                return null;
        }
    }
}
