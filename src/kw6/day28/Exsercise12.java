package kw6.day28;

public class Exsercise12 {
    public static void main(String[] args) {
        int [] arr1 = new int [] {1, 2, 3};
        int [] arr2 = new int [] {1, 2, 3, 4};
        int [] arr3 = new int [] {7, 4, 6, 2};
        PrintArray(makeEnds(arr1)); //→ [1, 3]
        PrintArray(makeEnds(arr2)); //→ [1, 4]
        PrintArray(makeEnds(arr3)); //→ [7, 2]
    }

    private static int [] makeEnds(int[] arr) {
        int[] output = new int[] {arr[0], arr[arr.length-1]};
        return output;
    }

    public static void PrintArray(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
