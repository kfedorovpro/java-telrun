package kw6.day28;

public class Exercise5 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2 = new int[] {1, 2, 3, 4};
        int[] arr3 = new int[] {2, 3, 4};
        System.out.println(no14(arr1)); //→ true
        System.out.println(no14(arr2)); //→ false
        System.out.println(no14(arr3)); //→ true
    }

    private static boolean no14(int[] array) {
        int countOne = 0;
        int countFour = 0;
        //boolean isOne = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1) {
                countOne++;
            }
            if (array[i] == 4) {
                countFour++;
            }
        }
        return (countOne == 0 || countFour == 0);
    }
}
