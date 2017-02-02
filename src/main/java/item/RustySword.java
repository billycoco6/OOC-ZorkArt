package item;

/**
 * Created by billy.witt on 1/31/2017 AD.
 */
public class RustySword implements Item {

    private String name;
    private final int power = 10;

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