package combats;

import characterPackage.HERO.Hero;
import characterPackage.MONSTRES.Monstre;
import functions.InterfaceDeChoix;
import characterPackage.character;
import functions.UT;

public class combat {
    InterfaceDeChoix display = new InterfaceDeChoix();
    public combat() {

    }

    public void attaquer(character attaquant, character defenseur) {
        defenseur.lostPv(UT.dice4() + UT.modifier(attaquant.getCharacteristicForce()));
        display.remainingPv(defenseur);
    }


    public void fight(character player, character monster) {
        while (player.isAlive() && monster.isAlive()) {
            attaquer(player, monster);
            attaquer(monster, player);
        }
        if (monster.isAlive()) {
            System.out.println("fin du jeu tu as perdu\n");
        }else {
            System.out.println("monstre vaincu!\n");
            monster.recompense(player);
        }
    }
    public void fight(character player, character monster, character monster2) {
        while (player.isAlive() && (monster.isAlive() || monster2.isAlive())) {
            if (monster.isAlive()) {
            attaquer(player, monster);
            attaquer(monster, player);
            }
            if (monster2.isAlive()) {
            attaquer(player, monster2);
            attaquer(monster2, player);
            }

        }
        if (monster.isAlive() || monster2.isAlive()) {
            System.out.println("fin du jeu tu as perdu\n");
        }else {
            System.out.println("monstre vaincu!\n");
            monster.recompense(player);
        }
    }

}
