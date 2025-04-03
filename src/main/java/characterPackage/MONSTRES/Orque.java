package characterPackage.MONSTRES;

import characterPackage.HERO.Hero;
import functions.UT;

public class Orque  extends Monstre {
    public Orque() {
        super();
        setOr(UT.dice6());
    }

    public void recompense(Hero player) {
        player.addcharacteristicForce(1);
        player.addor(super.getOr());
    }

}
