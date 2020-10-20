package kw7.day31;

public class Exercise19_8 {
    public static void main(String[] args) {
        int [] arr1 = new int []{5, 6, 45, 99, 13, 5, 6};
        int [] arr2 = new int []{5, 6, 45, 99, 13, 5, 6};
        int [] arr3 = new int []{5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(arr1, 1)); //→ false
        System.out.println(sameEnds(arr2, 2)); //→ true
        System.out.println(sameEnds(arr3, 3)); //→ false
    }

    private static boolean sameEnds(int[] arr, int nummer) {
        for(int i = 0; i < nummer; i++) {
            if(arr[i] != arr[arr.length - nummer + i])
                return false;
        }

        return true;
    }
}
