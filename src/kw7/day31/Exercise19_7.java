package kw7.day31;

public class Exercise19_7 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1, 3, 5};
        int[] arr2 = new int[]{2, 1, 2, 5};
        int[] arr3 = new int[]{2, 4, 2, 5};
        System.out.println(modThree(arr1)); //→ true
        System.out.println(modThree(arr2)); //→ false
        System.out.println(modThree(arr3)); //→ true
    }

    private static boolean modThree(int[] arr) {
        if (arr.length < 3)
            return false;

        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] % 2 == arr[i + 1] % 2 && arr[i] % 2 == arr[i + 2] % 2)
                return true;
        }
        return false;
    }
}
