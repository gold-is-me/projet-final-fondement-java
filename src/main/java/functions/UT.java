package functions;

import java.util.Arrays;
import java.util.Random;

// UT pour useful things
public class UT {
    static Random r = new Random();
    public static int dice6() {
        return r.nextInt(6) + 1;
    }
    public static int[] multipleDice6(int nLancee) {
        int[] dice = new int[nLancee];
        for (int i = 0; i < nLancee; i++) {
            dice[i] = r.nextInt(6) + 1;
//            System.out.println("lance de de: " + dice[i]);
        }
        return dice;
    }
    public static int sumDice6(int[] dice, int nMax) {
        Arrays.sort(dice);
        int sum = 0;
        for (int i = dice.length-nMax; i < dice.length; i++) {
            sum += dice[i];
        }
//        System.out.println("sum: " + sum);
        return sum;
    }
    public static int sumDice6Fois4() {
        return sumDice6(multipleDice6(4), 3);
    }
    public static int dice4() {
        return r.nextInt(4) + 1;
    }

    public static int modifier(int value) {
        if (value < 5) {
            return -1;
        }else if (value <10) {
            return 0;
        }else if (value <15) {
            return 1;
        }else {
            return 2;
        }
    }

}
