package kw6.day28;

public class EcsrcisesAra18 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 3, 4, 5};
        int[] arr3 = new int[]{1, 1, 1};
        System.out.println(unlucky1(arr1)); //true
        System.out.println(unlucky1(arr2)); //true
        System.out.println(unlucky1(arr3)); //false
    }

    private static boolean unlucky1(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] == 1 && num[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }
}
