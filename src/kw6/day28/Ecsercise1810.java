package kw6.day28;

public class Ecsercise1810 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3, 1};
        int[] arr3 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(arr1)); //→ false
        System.out.println(sameFirstLast(arr2)); //→ true
        System.out.println(sameFirstLast(arr3)); //→ true
    }

    private static boolean sameFirstLast(int[] num) {
        return num[0] == num[num.length - 1] && num.length >= 1;
    }
}
