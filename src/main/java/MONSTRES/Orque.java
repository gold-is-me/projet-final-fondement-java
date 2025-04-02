package MONSTRES;

import HERO.Hero;
import functions.UT;

public class Orque  extends Monstre {
    public Orque() {
        super();
        setOr(UT.dice6());
        super.setStatDAttaque(4);
    }

    public void recompense(Hero player) {
        player.addcharacteristicForce(1);
        player.addor(super.getOr());
    }

}
