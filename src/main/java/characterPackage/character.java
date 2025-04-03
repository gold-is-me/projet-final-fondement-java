package characterPackage;

import characterPackage.HERO.inventaire;
import combats.combattant;
import functions.UT;

public class character extends inventaire implements combattant {
    private int pvleft, characteristicForce, characteristicEndurance;
    final private int pv, endurance, force;

    public character() {
        this.endurance = UT.sumDice6Fois4();
        this.force = UT.sumDice6Fois4();
        this.pv = endurance + UT.modifier(endurance);
        this.pvleft = pv;
        this.characteristicForce = 0;
        this.characteristicEndurance = 0;
    }

    public boolean isAlive() {
        System.out.println("il vous reste " + this.pvleft + "hp");
        if (pvleft > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void lostPv(int pvToLost) {
        setPvleft(getPvleft() - pvToLost);
    }

    //Getter and Setter
    public int getEndurance() {
        return endurance;
    }

    public int getPv() {
        return pv;
    }

    public int getForce() {
        return force;
    }


    @Override
    public int getPvleft() {
        return pvleft;
    }

    public void setPvleft(int pvleft) {
        this.pvleft = pvleft;
    }

    public int getCharacteristicForce() {
        return characteristicForce;
    }

    public void setCharacteristicForce(int characteristicForce) {
        this.characteristicForce = characteristicForce;
    }

    public int getCharacteristicEndurance() {
        return characteristicEndurance;
    }

    public void setCharacteristicEndurance(int characteristicEndurance) {
        this.characteristicEndurance = characteristicEndurance;
    }

    public void addcharacteristicForce(int characteristicForce) {
        this.characteristicForce += characteristicForce;
    }

    public void addcharacteristicEndurance(int characteristicEndurance) {
        this.characteristicEndurance += characteristicEndurance;
    }

}
