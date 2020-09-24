package kw3.day13;

public class ClassWork {
    public static void main(String[] args) {
//        myCharAt();
//        myCodePoint();
//        myCodePointBevor();
//        myCodePointCount();
//        myCompareTo();
//        myContaince();
//        myEquals();
        myTrim();
    }

    private static void myTrim() {
        String test = "    Я памятник воздвиг себе нерукотворный.";
        System.out.println(test);
        System.out.println(test.trim());
    }

    private static void myEquals() {
        String test1 = "Василий";
        String test2 = "Vasilij";
        System.out.println(test1.equals(test2));
    }

    private static void myContaince() {
        String hm = "Василий";
        System.out.println(hm.contains("й"));
        System.out.println(hm.endsWith("лий"));
    }

    private static void myCompareTo() {
        String str1 = "МОСКВА";
        String str2 = "москва";
        String str3 = "Z";
        int result = str1.compareTo(str2);
        int result2 = str1.compareTo(str3);

        int result3 = str1.compareToIgnoreCase(str2);
        int result4 = str2.compareToIgnoreCase(str1);
        System.out.println(result); //A и B = -1
        System.out.println(result2); //A и Z = -25
    }

    private static void myCodePointCount() {
        String str = "I LOVE JAVA";
        int count = str.codePointCount(2,5);
        System.out.println(count);
    }

    private static void myCodePointBevor() {
        String str = "I LOVE JAVA";
        System.out.println(str);
        System.out.println(str.codePointBefore(1));

    }

    private static void myCodePoint() {
        String hm = "Василий";
        int test = hm.codePointAt(1);
        System.out.println(test);
    }

    private static void myCharAt() {
        String hausmaster = "Василий";
        System.out.println(hausmaster.charAt(hausmaster.length() - 1));
    }
}
