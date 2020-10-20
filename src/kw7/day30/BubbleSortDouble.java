package kw7.day30;

import kw5.day20.FillAndPrintIntArray;

import java.util.Arrays;

public class BubbleSortDouble {
    public static void main(String[] args) {
        double[] myLovelyDoubleArray = new double[]{3.14, 6.16, 1.0, 0.5, 100.0, 1.3};
        System.out.println(Arrays.toString(myLovelyDoubleArray));
        double[] newArray = copyArray(myLovelyDoubleArray);
        bubbleSortDouble(newArray);
        System.out.println(Arrays.toString(newArray));
    }

    private static void bubbleSortDouble(double[] arrUnsorted) {
        int count = 0;
        for (int i = 0; i < arrUnsorted.length - 1; i++) {
            if (arrUnsorted[i] <= arrUnsorted[i + 1]) {
                continue;
            }
            double temp = arrUnsorted[i];
            arrUnsorted[i] = arrUnsorted[i+1];
            arrUnsorted[i+1] = temp;
            count++;
        }
        if (count>0) {
            bubbleSortDouble(arrUnsorted);
        }
    }

    private static double[] copyArray(double[] input) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }
}
