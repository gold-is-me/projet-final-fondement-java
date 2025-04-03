package characterPackage.MONSTRES;

import characterPackage.HERO.Hero;
import characterPackage.character;
import functions.UT;

public class Loup extends Monstre {
    public Loup() {
        super();
        setCuire(UT.dice4());
    }

    @Override
    public void recompense(character player) {
        player.addcuire(super.getCuire());
    }
}
