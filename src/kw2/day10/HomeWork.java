package kw2.day10;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(moreOrLess(5, 6)); //6
        System.out.println(moreOrLess(5, 5)); //0
        System.out.println(moreOrLess(0, 100)); //100
        split();
        System.out.println(mySum(5, 6, 5));
        System.out.println(mySum(5, 6, 7));
        System.out.println(mySum(0, 0, 0));
        System.out.println(mySum(0, -5, 5));
        split();
//        forTimesAlphabet();
//        forTimesAlphabetTwo();
//        System.out.println(forTimesAlphabetThree());
    }

    private static String forTimesAlphabetThree() {
        String result = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            result = result + "\n" + c + c + c + c;
        }
        return result;

    }

    private static void forTimesAlphabetTwo() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("" + c + c + c + c);
        }
    }

    public static void forTimesAlphabet() {
        String alphabet = "AZ";
        System.out.println(0 + 'A');
        for (int i = 65; i < 90; i++) {
            char temp = (char) i;
            System.out.println(" " + temp + temp + temp + temp);

        }
    }


    private static int mySum(int a, int b, int c) {
        if (a == c) return b;
        else if (a + b + c == 0) return -1;
        else return a + b + c;
    }

    private static void split() {
        System.out.println("-----------------");
    }

    private static int moreOrLess(int a, int b) {
        if (a == b) {
            return 0;
        } else {
            return Math.max(a, b);
        }
    }
}
