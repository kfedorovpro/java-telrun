package kw6.day25;

public class ExercisesArray1 {
    public static void main(String[] args) {
/*      int[] arr1 = new int[]{2, 1, 2, 3, 4};
        int[] arr2 = new int[]{2, 2, 0};
        int[] arr3 = new int[]{1, 3, 5};
        System.out.println(countEvens(arr1));
        System.out.println(countEvens(arr2));
        System.out.println(countEvens(arr3));*/
        int[] arr1 = new int[]{1, 2, 2, 1};
        int[] arr2 = new int[]{1, 1};
        int[] arr3 = new int[]{1, 2, 2, 1, 13};
        int[] arr4 = new int[]{1, 2, 2, 1, 13, 15, 15};
        System.out.println(sum13(arr1)); //6
        System.out.println(sum13(arr2)); //2
        System.out.println(sum13(arr3)); //6
        System.out.println(sum13(arr4)); //21
    }

    private static int sum13(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13 || (i > 0 && arr[i - 1] == 13)) {
                continue;
            } else {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    private static int countEvens(int[] number) {
        int count = 0;
        for (int j : number) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void myPrintIntArray(int[] input) {
        for (int element : input) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
