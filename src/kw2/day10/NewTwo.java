package kw2.day10;

public class NewTwo {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); //→ false
        System.out.println(cigarParty(50, false)); //→ true
        System.out.println(cigarParty(70, true)); //→ true
        split();
        System.out.println(caughtSpeeding(60, false)); //→ 0
        System.out.println(caughtSpeeding(65, false)); //→ 1
        System.out.println(caughtSpeeding(65, true)); //→ 0
        split();
        System.out.println(more20(20)); //→ false
        System.out.println(more20(21)); //→ true
        System.out.println(more20(22)); //→ true

    }

    private static boolean more20(int number) {
        return (number % 20) == 1 || (number % 20 == 2);
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }

        if (speed <= 60) {
            return 0;
        } else if (speed >= 61 && speed <= 80) {
            return 1;
        } else return 2;
    }

    private static void split() {
        System.out.println("--------------");
    }

    private static boolean cigarParty(int numberOfCigars, boolean weekend) {
        if (numberOfCigars >= 40 && numberOfCigars <= 60) {
            return true;
        } else if (weekend && numberOfCigars >= 40) {
            return true;
        } else return false;
    }
}
