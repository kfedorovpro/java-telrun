package kw6.day28;

import kw5.day23.Exercise1804;

public class EcserciseFizeBuzz {
    public static void main(String[] args) {
        Exercise1804.myPrintIntArray(fizzArray(4)); //→ [0, 1, 2, 3]
        Exercise1804.myPrintIntArray(fizzArray(1)); //→ [0]
        Exercise1804.myPrintIntArray(fizzArray(10)); //→ [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    private static int[] fizzArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = i;
        }
        return output;
    }
}
