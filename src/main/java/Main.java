import characterPackage.HERO.Humain;
import characterPackage.MONSTRES.Dragonnet;
import characterPackage.MONSTRES.Loup;
import combats.combat;
import functions.InterfaceDeChoix;
import mapPackage.mapClass;

public class Main {
    public static void main(String[] args) {
        InterfaceDeChoix playerEntree = new InterfaceDeChoix();
        Humain h = new Humain();
        Dragonnet d = new Dragonnet();
        Loup l = new Loup();
        combat c = new combat();
        mapClass map = new mapClass(7, 2, 2, 2);

        while(h.isAlive()) {
            playerEntree.shift(map);
            c.checkIfFight(map.getMonster(), h, map);
        }
    }
}
