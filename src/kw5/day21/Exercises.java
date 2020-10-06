package kw5.day21;

import kw5.day20.FillAndPrintIntArray;

public class Exercises {
    public static void main(String[] args) {
        // 1.даны два целых числа,
        // создайте массив с четными в этом диапазоне
        // простые числа в этом диапазоне

        int a = 30;
        int b = 50;
        int[] arr = createArray(a, b);
        FillAndPrintIntArray.myPrintIntArray(arr);
    }

    private static int[] createArray(int a, int b) {
        int size = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                size++;
            }
        }
        int[] output = new int[size];
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                output[count] = i;
                count++;
            }
        }
        return output;
    }
}

