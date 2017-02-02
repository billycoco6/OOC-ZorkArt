package item;

import factory.ItemFactory;
import monster.Wyvern;

/**
 * Created by billy.witt on 1/31/2017 AD.
 */
public class RawMeat implements Item {

    private String name;
    Wyvern wyvern = new Wyvern();

    @Override
    public int isUsed() {
        wyvern.isFed();
        return 0;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}