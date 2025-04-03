package characterPackage.MONSTRES;

import characterPackage.HERO.Hero;
import functions.UT;

public class Loup extends Monstre {
    public Loup() {
        super();
        setCuire(UT.dice4());
    }

    public void recompense(Hero player) {
        player.addcuire(super.getCuire());
    }
}
