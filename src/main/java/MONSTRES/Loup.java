package MONSTRES;

import HERO.Hero;
import combats.combattant;
import functions.UT;

public class Loup extends Monstre {
    public Loup() {
        super();
        setCuire(UT.dice4());
        super.setStatDAttaque(3);
    }

    public void recompense(Hero player) {
        player.addcuire(super.getCuire());
    }
}
