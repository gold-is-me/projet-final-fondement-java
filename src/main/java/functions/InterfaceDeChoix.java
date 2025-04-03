package functions;

import characterPackage.HERO.Hero;
import characterPackage.character;

public class InterfaceDeChoix {

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

}
