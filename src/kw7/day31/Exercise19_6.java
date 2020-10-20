package kw7.day31;

public class Exercise19_6 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 3};
        int[] b1 = {2, 3, 10};
        int[] b2 = {2, 3, 5};
        int[] b3 = {2, 3, 3};
        System.out.println(matchUp(a1, b1)); //2
        System.out.println(matchUp(a2, b2)); //3
        System.out.println(matchUp(a3, b3)); //2
    }

    private static int matchUp(int[] num1, int[] num2) {
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            int diff = Math.abs(num1[i] - num2[i]);
            if (diff == 2 || diff == 1) {
                count++;
            }
        }
        return count;
    }
}
