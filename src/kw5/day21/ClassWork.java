package kw5.day21;

import kw5.day20.FillAndPrintIntArray;

public class ClassWork {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        myPrint(arr);
    }

    private static void myPrint(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]-1);
            System.out.print(", ");
            if (i == input.length-1) {
                System.out.print(input[i]);
            }
        }
    }
}
