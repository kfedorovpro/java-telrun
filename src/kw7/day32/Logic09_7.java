package kw7.day32;

public class Logic09_7 {
    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10)); //→ true
        System.out.println(closeFar(1, 2, 3)); //→ false
        System.out.println(closeFar(4, 1, 3)); //→ true
    }

    private static boolean closeFar(int a, int b, int c) {
        int diff1, diff2, diff3;
        diff1 = Math.abs(a-b);
        return false;
    }
}
