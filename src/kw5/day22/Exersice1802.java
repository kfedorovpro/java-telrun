package kw5.day22;

public class Exersice1802 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{7, 3, 2};
        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{1, 3};
        System.out.println(commonEnd(a1, a2)); // → true
        System.out.println(commonEnd(b1, b2)); //→ false
        System.out.println(commonEnd(c1, c2)); //→ true
    }

    private static boolean commonEnd(int[] array1, int[] array2) {
        if (array1[0] == array2[0] ||
                array1[array1.length - 1] == array2[array2.length - 1]) {
            return true;
        }
        return false;
    }
}
