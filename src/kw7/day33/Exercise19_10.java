package kw7.day33;

import java.util.Arrays;

public class Exercise19_10 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4, 1, 2};
        int[] arr2 = new int[]{4, 1, 4, 2};
        int[] arr3 = new int[]{4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(post4(arr1)));
        System.out.println(Arrays.toString(post4(arr2)));
        System.out.println(Arrays.toString(post4(arr3)));
    }

    private static int[] post4(int[] input) {
        int indexFour = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == 4) {
                indexFour = i;
                break;
            }
        }
        int size = input.length - indexFour - 1;
        int[] output = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            output[i] = input[input.length + i - size];
        }
        return output;
    }
}
