package factory;

import monster.*;

/**
 * Created by billy.witt on 1/28/2017 AD.
 */
public class MonsterFactory {

    public static Monster createMonster(String monsterType) {
        switch (monsterType) {
            case "Wolf":
                Wolf wolf = new Wolf();
                wolf.setName("Wolf");
                return wolf;

            case "Bengal-Tiger":
                BengalTiger bengalTiger = new BengalTiger();
                bengalTiger.setName("Bengal-Tiger");
                return bengalTiger;

            case "Wyvern":
                Wyvern wyvern = new Wyvern();
                wyvern.setName("Wyvern");
                return wyvern;

            case "Pirate":
                Pirate pirate = new Pirate();
                pirate.setName("Pirate");
                return pirate;

            case "Captain-Gatewinson":
                CaptainGatewinson captainGatewinson = new CaptainGatewinson();
                captainGatewinson.setName("Captain-Gatewinson");
                return captainGatewinson;

            default:
                return null;
        }
    }
}
