package functions;

import characterPackage.HERO.Hero;
import characterPackage.HERO.Humain;
import characterPackage.HERO.Nain;
import characterPackage.character;
import combats.combat;
import mapPackage.mapClass;

import java.util.Scanner;

public class InterfaceDeChoix {
    static Scanner scanner = new Scanner(System.in);
    static combat combat = new combat();

    public static final String RED_UNDERLINED = "\033[4;31m";
    public static final String RESET = "\033[0m";  // Text Reset

    public static void print(character character) {
        System.out.println("\n" + RED_UNDERLINED + character.getName() + ":" + RESET);
        System.out.println("Endurance: " + character.getEndurance());
        System.out.println("Force: " + character.getForce());
        System.out.println("PV: " + character.getPv());
        System.out.println("PVleft: " + character.getPvleft());
        System.out.println("CharacteristicForce: " + character.getCharacteristicForce());
        System.out.println("CharacteristicEndurance: " + character.getCharacteristicEndurance());
        System.out.println("or: " + character.getOr());
        System.out.println("cuire: " + character.getCuire());
    }

    public static void recompenseEarned(character character) {}

    public static void remainingPv(character character) {
        System.out.println("il reste " + character.getPvleft()+ " PV à " + character.getName() );
    }

    public static void shift(mapClass map) {
        boolean shift = false;
        while (!shift) {
            map.printMapWithEmoji();
            System.out.print("vers où shifte? ");
            String where = scanner.nextLine();
            if (where.equalsIgnoreCase("right") || where.equalsIgnoreCase("d")) {
                shift = map.movePosPlayer(1, 0);
            } else if (where.equalsIgnoreCase("left") || where.equalsIgnoreCase("q")) {
                shift = map.movePosPlayer(-1, 0);
            } else if (where.equalsIgnoreCase("up") || where.equalsIgnoreCase("z")) {
                shift = map.movePosPlayer(0, -1);
            } else if (where.equalsIgnoreCase("down") || where.equalsIgnoreCase("s")) {
                shift = map.movePosPlayer(0, 1);
            } else {
                System.out.println("pas compris la directive\n");
            }
        }
    }

    public character getCharacter() {
        System.out.print("choisir un character (h pour l'humain et n pour le nain) ");
        String character = scanner.nextLine();
        while (true) {
            if (character.equalsIgnoreCase("h")) {
                return new Humain();
            } else if (character.equalsIgnoreCase("n")) {
                return new Nain();
            } else {
                System.out.print("pas compris la directive\nRefais.(h pour l'humain et n pour le nain) ");
                character = scanner.next();
            }
        }
    }
    public void choixInFight(character player, character monster) {
        System.out.print("attaquer ou se heal?");
        String choix = scanner.nextLine();
        boolean choixAFaire =true;
        while (choixAFaire) {
            if (choix.equalsIgnoreCase("a") || choix.equalsIgnoreCase("attaquer")) {
                combat.attaquer(player, monster);
                choixAFaire = false;
            } else if (choix.equalsIgnoreCase("h") || choix.equalsIgnoreCase("heal")) {
                player.setPvleft(player.getPvleft() + UT.dice4());
                choixAFaire = false;
            } else {
                System.out.print("attaquer ou se heal?");
                choix = scanner.nextLine();
            }
        }
    }

}
