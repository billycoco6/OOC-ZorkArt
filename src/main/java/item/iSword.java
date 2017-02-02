package item;

/**
 * Created by billy.witt on 1/31/2017 AD.
 */
public class iSword implements Item {

    private String name;
    private final int power = 40;

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