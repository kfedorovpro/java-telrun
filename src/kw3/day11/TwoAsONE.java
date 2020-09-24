package kw3.day11;

public class TwoAsONE {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3)); //→ true
        System.out.println(twoAsOne(3, 1, 2)); //→ true
        System.out.println(twoAsOne(3, 2, 2)); //→ false
    }

    private static boolean twoAsOne(int a, int b, int c) {
        return c == a + b || c + b == a || c + a == b;
    }
}
