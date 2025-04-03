package combats;


import characterPackage.HERO.Hero;
import characterPackage.character;

public interface combattant {
    public int getPvleft();
    public boolean isAlive();
    public void lostPv(int pvToLost);
    public void recompense(character player);
    public void heal();
}
