package kw6.day28;

public class SumSumSum {
    public static void main(String[] args) {
        //System.out.println(sumSimple(3, 6));
        //System.out.println(sumNotSimple(1, 2, 3));
        System.out.println(myNewSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static int myNewSum(int ... args) {
        int result = 0;
        int size = args.length;
        for (int argumentik: args) {
            result = result + argumentik;
        }
        return result;
    }

    private static int sumNotSimple(int a, int b, int c) {
        return a + b + c;
    }

    private static int sumSimple(int a, int b) {
        return a + b;
    }
}
