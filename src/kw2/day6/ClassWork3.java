package kw2.day6;

public class ClassWork3 {
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
        System.out.println(firstHalf("abcdefddsdsdsdsds"));
        split();
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
        split();
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
        split();

    }

    private static String middleThree(String t1) {
        String result = t1.substring(t1.length() / 2 - 1, t1.length() / 2 + 2);
        return result;
    }

    public static void split() {
        System.out.println("-----------");
    }

    private static String nonStart(String s1, String s2) {
        String result = s1.substring(1) + s2.substring(1);
        return result;
    }

    private static String firstHalf(String input) {
        return input.substring(0, input.length() / 2); //чтобы разделить длину текста на половину

    }

}
