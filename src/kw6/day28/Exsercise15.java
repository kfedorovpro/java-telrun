package kw6.day28;

public class Exsercise15 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 3};

        int[] arr3 = new int[]{7, 2, 3};
        int[] arr4 = new int[]{1};

        int[] arr5 = new int[]{1, 2};
        int[] arr6 = new int[]{};


        System.out.println(start1(arr1, arr2)); //2
        System.out.println(start1(arr3, arr4)); //1
        System.out.println(start1(arr5, arr6)); //1
    }

    private static int start1(int[] array1, int[] array2) {
        int num = 0;
        if (array1[0] == 1) {
            num = 1;
        }
        if (array2.length >= 1) {
            if (array2[0] == 1) {
                num++;
            }
        }
        return num;
    }
}
