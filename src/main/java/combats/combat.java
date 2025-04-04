package combats;

import characterPackage.HERO.Hero;
import characterPackage.MONSTRES.Dragonnet;
import characterPackage.MONSTRES.Loup;
import characterPackage.MONSTRES.Monstre;
import characterPackage.MONSTRES.Orque;
import functions.InterfaceDeChoix;
import characterPackage.character;
import functions.UT;
import mapPackage.mapClass;

import java.util.ArrayList;

public class combat {
    InterfaceDeChoix display = new InterfaceDeChoix();
    public combat() {

    }

    public void attaquer(character attaquant, character defenseur) {
        defenseur.lostPv(UT.dice4() + UT.modifier(attaquant.getCharacteristicForce()));
        display.remainingPv(defenseur);
    }

    public void victory(character player, character monster, mapClass map) {
        System.out.println("monstre vaincu!\n");
        player.heal();
        map.setcleanaround();
        map.checkmap();
        monster.recompense(player);
    }

    public void victory(character player, character monster, character monster2, mapClass map) {
        victory(player, monster, map);
        monster2.recompense(player);

    }

    public void fight(character player, character monster, mapClass map) {
        while (player.isAlive() && monster.isAlive()) {
            display.choixInFight(player, monster);
            attaquer(monster, player);
        }
        if (monster.isAlive()) {
            System.out.println("fin du jeu tu as perdu\n");
        }else {
            victory(player, monster, map);
        }
    }
    public void fight(character player, character monster, character monster2, mapClass map) {
        while (player.isAlive() && (monster.isAlive() || monster2.isAlive())) {
            if (monster.isAlive()) {
                display.choixInFight(player, monster);
                attaquer(monster, player);
            }
            if (monster2.isAlive()) {
                display.choixInFight(player, monster2);
                attaquer(monster2, player);
            }

        }
        if (monster.isAlive() || monster2.isAlive()) {
            System.out.println("fin du jeu tu as perdu\n");
        }else {
            victory(player, monster, monster2, map);
        }
    }

    public character whatMonster(int monster) {
        if (monster == 2) {
            return new Loup();
        } else if (monster == 3) {
            return new Dragonnet();
        } else if (monster == 4) {
            return new Orque();
        } else {
            return null;
        }
    }

    public void checkIfFight(ArrayList<Integer> lesMonstres, character player, mapClass map) {
        if (lesMonstres.size() == 0) {

        } else if (lesMonstres.size() == 1) {
            fight(player, whatMonster(lesMonstres.get(0)), map);
        } else if (lesMonstres.size() == 2) {
            fight(player, whatMonster(lesMonstres.get(0)), whatMonster(lesMonstres.get(1)), map);
        } else {
            System.out.println("mec abandonne c'est pas pour toi ce jeu");
        }
    }

}
