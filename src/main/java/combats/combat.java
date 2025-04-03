package combats;

import characterPackage.HERO.Hero;
import characterPackage.MONSTRES.Monstre;
import characterPackage.character;
import functions.UT;

public class combat {
    public combat() {

    }
    public void combat() {}

    public void attaquer(character attaquant, character defenseur) {
        defenseur.lostPv(UT.dice4() + UT.modifier(attaquant.getCharacteristicForce()));
    }



}
