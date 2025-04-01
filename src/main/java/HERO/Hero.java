package HERO;

import functions.UT;

public class Hero {
    public enum classes{ Humain, nain}
    private int endurance, force, pvleft, characteristicForce, characteristicEndurance;
    final private int pv;


    public Hero() {
        this.endurance = UT.sumDice6Fois4();
        this.force = UT.sumDice6Fois4();
        this.pv = endurance + UT.modifier(endurance);
        this.pvleft = pv;
        this.characteristicForce = 0;
        this.characteristicEndurance = 0;
    }



    public void print() {
        System.out.println("Endurance: " + this.endurance);
        System.out.println("Force: " + this.force);
        System.out.println("PV: " + this.pv);
        System.out.println("PVleft: " + this.pvleft);
        System.out.println("CharacteristicForce: " + this.characteristicForce);
        System.out.println("CharacteristicEndurance: " + this.characteristicEndurance);
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

}
