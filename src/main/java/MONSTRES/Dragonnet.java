package MONSTRES;

import functions.UT;

public class Dragonnet extends Monstre {
    public Dragonnet() {
        super();
        setOr(UT.dice6());
        setCuire(UT.dice4());
    }
}
