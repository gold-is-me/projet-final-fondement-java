package MONSTRES;

import functions.UT;

public class Monstre {
    private int pvLeft, cuire, Or;
    final private int pv;
    public Monstre() {
        this.pv = 15;
        this.pvLeft = pv;
        this.cuire = 0;
        this.Or = 0;
    }

    public int getPvLeft() {
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
}
