package kw3.day13;

public class ReviewFor {
    public static void main(String[] args) {
//        exampleOne();
//        exampleTwo();
//        exampleThree();
//        exampleFor();
        exampleFive();
    }

    private static int exampleFive() {
        for (int i = 0; i < 10; i++) System.out.println(i);
        if (true) return 0;
        else return 10;

    }

    private static void exampleFor() {
        int i = 0;
        for (; i < 10; ) {
            System.out.println(i);
            i++;
        }
    }

    private static void exampleThree() {
        for (int i = 1; i < 200; i = i * 2) {
            System.out.println(i);
        }
    }

    private static void exampleTwo() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);

        }
    }

    private static void exampleOne() {
        for (int i = 3; i <= 18; i++) {
            System.out.println(i);

        }
    }

}