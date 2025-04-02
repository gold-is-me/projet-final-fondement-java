package combats;


public interface combattant {
    public int getPvleft();
    public boolean isAlive();
    public void lostPv(int pvToLost);
}
