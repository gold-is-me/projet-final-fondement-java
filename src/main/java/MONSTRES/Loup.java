package MONSTRES;

import functions.UT;

public class Loup extends Monstre {
    public Loup() {
        super();
        setCuire(UT.dice4());
    }
}
