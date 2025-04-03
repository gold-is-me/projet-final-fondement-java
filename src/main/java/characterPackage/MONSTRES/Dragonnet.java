package characterPackage.MONSTRES;

import characterPackage.HERO.Hero;
import characterPackage.character;
import functions.UT;

public class Dragonnet extends Monstre {
    public Dragonnet() {
        super();
        setOr(UT.dice6());
        setCuire(UT.dice4());
    }

    @Override
    public void recompense(character player) {
        player.addcharacteristicEndurance(1);
        player.addor(super.getOr());
        player.addcuire(super.getCuire());
    }

}
