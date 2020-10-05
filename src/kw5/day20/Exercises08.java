package kw5.day20;

public class Exercises08 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int maxArr;
        int max = getMax(arr);
        System.out.println(max);
        int min = getMin(arr);
        System.out.println(min);
        int middle = getMiddle(arr);
        System.out.println(middle);
        int sum = getSum(arr);
        System.out.println(sum);
    }

    private static int getSum(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum;
    }

    public static int getMiddle(int[] input) {
        double middle = 0;
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        middle = sum / input.length;
        return (int) middle;
    }

    public static int getMin(int[] input) {
        int minValue = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < minValue) {
                minValue = input[i];
            }
        }
        return minValue;
    }

    public static int getMax(int[] input) {
        int maxValue = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > maxValue) {
                maxValue = input[i];
            }
        }
        return maxValue;
    }
}
