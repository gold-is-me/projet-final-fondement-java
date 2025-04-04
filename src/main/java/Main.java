import characterPackage.HERO.Humain;
import characterPackage.MONSTRES.Dragonnet;
import characterPackage.MONSTRES.Loup;
import characterPackage.character;
import combats.combat;
import functions.InterfaceDeChoix;
import mapPackage.mapClass;

public class Main {
    public static void main(String[] args) {

        InterfaceDeChoix playerEntree = new InterfaceDeChoix();
        combat c = new combat();
        mapClass map = new mapClass(7, 2, 2, 2);
        character player = playerEntree.getCharacter();
        playerEntree.print(player);
        while(player.isAlive()) {
            playerEntree.shift(map);
            c.checkIfFight(map.getMonster(), player, map);
        }

    }
}
