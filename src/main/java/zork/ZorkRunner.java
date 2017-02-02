package zork;

import factory.ItemFactory;
import item.RawMeat;
import map.MapFactory;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by billy.witt on 1/28/2017 AD.
 */
public class ZorkRunner {

    public static void main(String[] args) throws IOException {
        Command zork = new Command();
        MapFactory GameMap = new MapFactory();
        GameMap.loadMap();
        zork.start();
    }
}
