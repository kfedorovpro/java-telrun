package kw7.day32;

import kw7.day30.BubbleSortDouble;
import kw7.day30.BubbleSortIntro;

public class Logic02 {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6)); //→ true
        System.out.println(evenlySpaced(4, 6, 2)); //→ true
        System.out.println(evenlySpaced(4, 6, 3)); //→ false
    }

    private static boolean evenlySpaced(int a, int b, int c) {
        int small, medium, large;
        int [] arr = new int[] {a,b,c};
        BubbleSortIntro.bubbleSortRecursion(arr);
        small = arr[0];
        medium = arr[1];
        large = arr[2];
        if (medium-small == large - medium) {
            return true;
        }
        return false;
    }
}
