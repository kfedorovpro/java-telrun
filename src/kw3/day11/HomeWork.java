package kw3.day11;

public class HomeWork {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        findEvenNumber(a, b);
        findEvenNumberTwo(a, b);
        findNoEvenNumber(a, b);
    }

    private static String findEvenNumberTwo(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result = result + " " + i;
            }
        }
        return result;
    }

    private static void findEvenNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }

        }
    }

    private static void findNoEvenNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }

        }
    }
}