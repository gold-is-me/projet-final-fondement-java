package MONSTRES;

import combats.combattant;
import functions.UT;

public class Monstre implements combattant {
    private int pvLeft, cuire, Or, statDAttaque;
    final private int pv;
    public Monstre() {
        this.pv = 15;
        this.pvLeft = pv;
        this.cuire = 0;
        this.Or = 0;
    }

    public boolean isAlive() {
        if (getPvleft() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void lostPv(int pvToLost) {
        setPvLeft(getPvleft() - pvToLost);
    }

    @Override
    public int getPvleft() {
        return pvLeft;
    }

    public void setPvLeft(int pvLeft) {
        this.pvLeft = pvLeft;
    }

    public int getPv() {
        return pv;
    }

    public int getCuire() {
        return cuire;
    }

    public void setCuire(int cuire) {
        this.cuire = cuire;
    }

    public int getOr() {
        return Or;
    }

    public void setOr(int or) {
        Or = or;
    }

    public int getPvLeft() {
        return pvLeft;
    }

    public int getStatDAttaque() {
        return statDAttaque;
    }

    public void setStatDAttaque(int statDAttaque) {
        this.statDAttaque = statDAttaque;
    }
}
