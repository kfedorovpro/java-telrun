package kw5.day21;

import kw5.day20.FillAndPrintIntArray;

public class ExercisesReverce {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[]{4, 2, 8, 4, 15, 6, 57};
        int[] arr3 = new int[]{4, 2, 8, 4, 15, 1000};
        myPrint(arrayReverse(arr1));
        myPrint(arrayReverse(arr2));
        myPrint(arrayReverse(arr3));

    }

    private static int[] arrayReverse(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - 1 - i] = input[i];
        }
        return output;
    }

    private static void myPrint(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (i != input.length-1) {
                System.out.print(input[i]);
                System.out.print(", ");
            } else {
                System.out.print(input[i]);
            }
        }
        System.out.println();
    }
}
