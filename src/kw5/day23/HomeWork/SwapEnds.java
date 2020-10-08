package kw5.day23.HomeWork;

import kw5.day23.Exercise1804;

public class SwapEnds {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{8, 6, 7, 9, 5};

        Exercise1804.myPrintIntArray(swapEnds(arr1));// → [4, 2, 3, 1]
        Exercise1804.myPrintIntArray(swapEnds(arr2));// → [3, 2, 1]
        Exercise1804.myPrintIntArray(swapEnds(arr3));// → [5, 6, 7, 9, 8]
    }

    private static int[] swapEnds(int[] input) {
        int[] output = new int[input.length];
        output[0] = input[input.length - 1];
        for (int i = 1; i < input.length - 1; i++) {
            output[i] = input[i];
        }
        output[input.length - 1] = input[0];
        return output;
    }
}
