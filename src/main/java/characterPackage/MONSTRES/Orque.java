package characterPackage.MONSTRES;

import characterPackage.HERO.Hero;
import characterPackage.character;
import functions.UT;

public class Orque  extends Monstre {
    public Orque() {
        super();
        setOr(UT.dice6());
    }

    @Override
    public void recompense(character player) {
        player.addcharacteristicForce(1);
        player.addor(super.getOr());
    }

}
