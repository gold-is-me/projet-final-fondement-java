package MONSTRES;

import HERO.Hero;
import functions.UT;

public class Dragonnet extends Monstre {
    public Dragonnet() {
        super();
        setOr(UT.dice6());
        setCuire(UT.dice4());
        super.setStatDAttaque(5);
    }

    public void recompense(Hero player) {
        player.addcharacteristicEndurance(1);
        player.addor(super.getOr());
        player.addcuire(super.getCuire());
    }

}
