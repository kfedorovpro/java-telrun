package kw6.day28;

public class Exsercise14 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 5, 6};
        int[] arr2 = new int[]{1, 2};
        int[] arr3 = new int[]{3};
        Exsercise12.PrintArray(makeLast(arr1)); //→ [0, 0, 0, 0, 0, 6]
        Exsercise12.PrintArray(makeLast(arr2)); //→ [0, 0, 0, 2]
        Exsercise12.PrintArray(makeLast(arr3)); //→ [0, 3]
    }

    private static int[] makeLast(int[] arr) {
        int[] output = new int[arr.length * 2];
/*        for (int i = 0; i < output.length; i++) {
            output[i] = 0;
        }*/
        output[output.length - 1] = arr[arr.length - 1];
        return output;
    }
}
