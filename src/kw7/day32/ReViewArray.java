package kw7.day32;

import java.util.Arrays;

public class ReViewArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5,6};
        addToElementDigit(arr1,5);
        System.out.println(Arrays.toString(arr1));
    }

    private static void addToElementDigit(int[] arr1, int digit) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += digit;
        }
    }

}
