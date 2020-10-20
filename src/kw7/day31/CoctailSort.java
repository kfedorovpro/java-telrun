package kw7.day31;

import java.util.Arrays;

public class CoctailSort {
    public static void main(String[] args) {
        int[] arr = createIntArray(10);
        System.out.println(Arrays.toString(arr));
        int[] myCopy = new int[arr.length];
        System.arraycopy(arr, 0, myCopy, 0, arr.length);
        System.out.println(Arrays.toString(myCopy));
        cocktailSort(myCopy);
        System.out.println(Arrays.toString(myCopy));
    }

    public static void swapTwoElementsInIntArray(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void cocktailSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int count = 0;
            for (int i = start; i < end; i++) {
                //идем туда
                if (arr[i] > arr[i + 1]) {
                    swapTwoElementsInIntArray(arr, i, i + 1);
                    count++;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                //идем назад
                if (arr[i] < arr[i - 1]) {
                    swapTwoElementsInIntArray(arr, i, i - 1);
                    count++;
                }
            }
            start++;
            if (count == 0) {
                break;
            }
        }
    }

    public static int[] createIntArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
