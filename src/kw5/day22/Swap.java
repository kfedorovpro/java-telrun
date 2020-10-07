package kw5.day22;

public class Swap {
    public static void main(String[] args) {
//        swapOne();
//        swapTwo();
//        swapThree();
        swapFour();
    }

    private static void swapFour() {
        int a = 5;
        int b = 7;
        a = a + b - (b = a);
        System.out.println(b);
    }

    private static void swapThree() {
        int a = 5;
        int b = 7;

        a = a ^ b;
        System.out.println(a);
        b = b ^ a;
        System.out.println(b);
        a = a ^ b;
        System.out.println(b);
    }

    private static void swapTwo() {
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(b);
    }

    private static void swapOne() {
        int a = 5;
        int b = 7;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(b);
    }
}
