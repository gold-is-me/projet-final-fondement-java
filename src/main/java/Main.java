import characterPackage.HERO.Humain;
import characterPackage.MONSTRES.Dragonnet;
import combats.combat;
import functions.InterfaceDeChoix;

public class Main {
    public static void main(String[] args) {
        InterfaceDeChoix display = new InterfaceDeChoix();
        Humain h = new Humain();
        Dragonnet d = new Dragonnet();
        combat c = new combat();
        d.recompense(h);
        d.recompense(h);
        c.attaquer(d, h);
        display.print(h);
    }
}
