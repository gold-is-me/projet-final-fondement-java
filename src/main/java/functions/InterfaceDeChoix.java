package functions;

import characterPackage.HERO.Hero;

public class InterfaceDeChoix {

    public static void print(Hero player) {
        System.out.println("Endurance: " + player.getEndurance());
        System.out.println("Force: " + player.getForce());
        System.out.println("PV: " + player.getPv());
        System.out.println("PVleft: " + player.getPvleft());
        System.out.println("CharacteristicForce: " + player.getCharacteristicForce());
        System.out.println("CharacteristicEndurance: " + player.getCharacteristicEndurance());
        System.out.println("or: " + player.getOr());
        System.out.println("cuire: " + player.getCuire());
    }

}
