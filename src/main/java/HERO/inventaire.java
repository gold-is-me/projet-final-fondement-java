package HERO;

public class inventaire {
    protected int cuire, or;
    public inventaire() {
        this.cuire = 0;
        this.or = 0;
    }

    public int getCuire() {
        return cuire;
    }

    public void setCuire(int cuire) {
        this.cuire = cuire;
    }

    public int getOr() {
        return or;
    }

    public void setOr(int or) {
        this.or = or;
    }

    public void addor(int or) {
        this.or += or;
    }

    public void subor(int or) {
        this.or -= or;
    }

    public void addcuire(int cuire) {
        this.cuire += cuire;
    }

    public void subcuire(int cuire) {
        this.cuire -= cuire;
    }

}
