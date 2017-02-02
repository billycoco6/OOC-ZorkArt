package factory;

import monster.Monster;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by billy.witt on 2/2/2017 AD.
 */
public class MonsterFactoryTest {
    @Test
    public void createMonster() throws Exception {
        Monster tiger = MonsterFactory.createMonster("Bengal-Tiger");
        Monster wyvern = MonsterFactory.createMonster("Wyvern");
        Monster captain = MonsterFactory.createMonster("Captain-Gatewinson");
        Monster wolf = MonsterFactory.createMonster("Wolf");

        assertTrue(tiger.getName().equals("Bengal-Tiger"));
        assertTrue(wyvern.getName().equals("Wyvern"));
        assertTrue(captain.getName().equals("Captain-Gatewinson"));
        assertTrue(wolf.getName().equals("Wolf"));

        assertTrue(tiger.getHP() == 80);
    }

}