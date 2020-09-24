package kw3.day11;

public class Aufgabe8910 {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13)); //→ true
        System.out.println(lastDigit(23, 19, 12)); //→ false
        System.out.println(lastDigit(23, 19, 3)); //→ true
        System.out.println(lastDigit(47, 27, 17)); //→ true

        split();

        System.out.println(maxMod5(2, 3)); //→ 3
        System.out.println(maxMod5(6, 2)); //→ 6
        System.out.println(maxMod5(3, 2)); //→ 3

        split();

/*        System.out.println(blueTicket(9, 1, 0));
        System.out.println(blueTicket(9, 2, 0));
        System.out.println(blueTicket(6, 1, 4));

 */
        split();

        System.out.println(dateFashion(5, 10)); //→2
        System.out.println(dateFashion(5, 2)); //→0
        System.out.println(dateFashion(5, 5)); //→1

    }

    private static int dateFashion(int you, int day) {
        if (you <= 2 || day <= 2) {
            return 0;
        } else if (you >= 8 || day >= 8) {
            return 2;
        }
        return 1;
    }


  /*  private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab==10 || bc ==10 || ac ==10) {
            return 10;
        } else if ()
        return 0;
    }

   */

    private static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == 0 && b % 5 == 0) {
            return Math.min(a, b);
        } else return Math.max(a, b);
    }

    private static void split() {
        System.out.println("-----------------");
    }

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }
}
