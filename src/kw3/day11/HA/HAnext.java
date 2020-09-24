package kw3.day11.HA;

public class HAnext {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4)); //→ 7
        System.out.println(sortaSum(9, 4)); //→ 20
        System.out.println(sortaSum(10, 11)); //→ 21

        //Given 2 ints, a and b, return their sum.
        //Дано 2 целых числа, a и b, верни их сумму.
        // However, sums in the range 10..19 inclusive,
        //Однако, если сумма a и b в диапазоне от 10 до 19
        // are forbidden, so in that case just return 20.
        //нужно вернуть 20.

        split();

        System.out.println(in1To10(5, false)); //→ true
        System.out.println(in1To10(11, false)); //→ false
        System.out.println(in1To10(11, true)); //→ true

        //Given a number n, return true if n is in the range 1..10,
        //Данно число, которое true, если оно в диапазоне от 1 до 10
        // inclusive. Unless outsideMode is true,
        //если в вне диапазона - false.
        // in which case return true if the number is less
        //но если вне диапазона и true - верни true.
        // or equal to 1, or greater or equal to 10.

        split();

        System.out.println(old35(3)); //→ true
        System.out.println(old35(10)); //→ true
        System.out.println(old35(15)); //→ false


        //Return true if the given non-negative number is
        // a multiple of 3 or 5, but not both.
        // Use the % "mod" operator -- see Introduction to Mod
    }

    private static boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        } else if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }


    private static void split() {
        System.out.println("-----------------");
    }

    private static boolean in1To10(int n, boolean c) {
        if (n >= 1 && n <= 10) {
            return true;
        } else if (n < 1 && n > 10 || c == true) {
            return false;
        }
        return false;
    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else return a + b;
    }

}
