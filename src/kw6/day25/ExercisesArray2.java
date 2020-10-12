package kw6.day25;

public class ExercisesArray2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 4};
        System.out.println(lucky13(arr1)); //→ true
        System.out.println(lucky13(arr2)); //→ false
        System.out.println(lucky13(arr3)); //→ false
    }

    private static boolean lucky13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
