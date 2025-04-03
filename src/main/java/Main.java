import characterPackage.HERO.Humain;
import characterPackage.MONSTRES.Dragonnet;
import characterPackage.MONSTRES.Loup;
import combats.combat;
import functions.InterfaceDeChoix;

public class Main {
    public static void main(String[] args) {
        InterfaceDeChoix display = new InterfaceDeChoix();
        Humain h = new Humain();
        Dragonnet d = new Dragonnet();
        Loup l = new Loup();
        combat c = new combat();

        c.fight(h,d,l);
        display.print(d);
        display.print(h);
    }
}
