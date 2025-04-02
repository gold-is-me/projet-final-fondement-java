package HERO;

import combats.combattant;
import functions.UT;

public class Hero extends inventaire implements combattant {
    public enum classes{ Humain, nain}
    private int endurance, force, pvleft, characteristicForce, characteristicEndurance;
    final private int pv;


    public Hero() {
        super();
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

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getPv() {
        return pv;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
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
