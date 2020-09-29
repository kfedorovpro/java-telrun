package kw4.day16;

public class LogicalTask {
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 11));
        System.out.println(lessBy10(1, 7, 10));
        System.out.println(lessBy10(11, 1, 7));
    }

    private static boolean lessBy10(int a, int b, int c) {
        int ab = Math.abs(a-b);
        int bc = Math.abs(b-c);
        int ca = Math.abs(c-a);
        if (ab >= 10 || bc >= 10 || ca >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
