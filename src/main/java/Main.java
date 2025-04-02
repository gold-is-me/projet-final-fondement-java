import HERO.Hero;
import HERO.Humain;
import HERO.Nain;
import MONSTRES.Dragonnet;
import functions.InterfaceDeChoix;

public class Main {
    public static void main(String[] args) {
        InterfaceDeChoix display = new InterfaceDeChoix();
        Humain h = new Humain();
        Dragonnet d = new Dragonnet();
        d.recompense(h);
        d.recompense(h);
        d.recompense(h);
        d.recompense(h);
        display.print(h);
    }
}
