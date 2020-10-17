package kw6.day28;

public class ExerciseArray3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{5, 11, 2};
        int[] arr3 = new int[]{7, 0, 0};
        System.out.println(sum3(arr1)); //→ 6
        System.out.println(sum3(arr2)); //→ 18
        System.out.println(sum3(arr3)); //→ 7
    }

    private static int sum3(int[] num) {
        int result = 0;
        for (int element : num) {
            result = result + element;
        }
        return result;
    }
}
