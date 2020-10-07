package kw5.day22;

public class Exersice1801 {
    public static void main(String[] args) {
        int [] arr1 = new int [] {1, 2, 6};
        System.out.println(firstLast6(arr1)); // → true
        int [] arr2 = new int [] {6, 1, 2, 3};
        System.out.println(firstLast6(arr2)); // → true
        int [] arr3 = new int [] {13, 6, 1, 2, 3};
        System.out.println(firstLast6(arr3)); // → false
    }

    private static boolean firstLast6(int[] input) {
        if (input[0] == 6 || input[input.length-1] == 6) {
            return true;
        }
        return false;
    }
}
