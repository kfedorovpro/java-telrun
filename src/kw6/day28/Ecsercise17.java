package kw6.day28;

import kw5.day23.Exercise1804;

public class Ecsercise17 {
    public static void main(String[] args) {
        int [] arr1 = new int[] {1,2,3};
        int [] arr2 = new int[] {4,5,6};
        int [] arr3 = new int[] {1,2,3,4};
        int [] arr4 = new int[] {5,6};
        Exercise1804.myPrintIntArray(sumTwo(arr1, arr2));
        Exercise1804.myPrintIntArray(sumTwo(arr3,arr4));
    }

    private static int[] sumTwo(int[] array1, int[] array2) {
        int [] output = new int[array1.length];
        if(array1.length >= array2.length){
            for (int i = 0; i < array2.length; i++) {
                output[i] = array1[i] + array2[i];
            }
            for (int i = array2.length; i < array1.length; i++) {
                output[i] = array1[i];
            }
        }

        return output;
    }
}
