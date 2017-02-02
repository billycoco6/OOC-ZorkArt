package item;

import factory.ItemFactory;

/**
 * Created by billy.witt on 1/29/2017 AD.
 */
public class Rum implements Item {

    private String name;
    private final int power = 20;

    @Override
    public int isUsed() {
        return power;
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