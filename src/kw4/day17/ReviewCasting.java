package kw4.day17;

public class ReviewCasting {
    public static void main(String[] args) {
        //intToChar();
        //charToInt();
//        stringToChar();
//        stringToInt();
//        intToString();
//        charToString();
        magicChar();
    }

    private static void magicChar() {
        char c1 = 'я';
        System.out.println(c1);
        System.out.println(c1 + "");
        System.out.println("" + c1);
        System.out.println(c1 + c1);
        System.out.println(c1 + 10);
    }

    private static void charToString() {
        char c1 = 125;
        String s1 = String.valueOf(c1);
        String s2 = "" + c1;
        String s3 = "";
        s3 += c1;
        s3 = s3 + c1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    private static void intToString() {
        int x = 25;
        String x25 = String.valueOf(x);
        System.out.println(x25);
    }

    private static void stringToInt() {
        String hm = "Василий";
        String database = "1975";
        int newDatabase = Integer.parseInt(database);
        System.out.println(newDatabase);
    }

    private static void stringToChar() {
        String hm = "Василий";
        char c1 = hm.charAt(0);
        System.out.println(c1);
    }

    private static void charToInt() {
        char b = 'Z';
        int k = b;
        double l = b;
        byte v = (byte) b;
        System.out.println(k);
        System.out.println(l);
        System.out.println(v);
    }

    private static void intToChar() {
        int x = 90;
        char c = (char) x;
        System.out.println(c);
    }

}
