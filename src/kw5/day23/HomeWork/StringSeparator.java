package kw5.day23.HomeWork;

public class StringSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3)); // → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2)); // → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1)); // → "This"
    }

    private static String repeatSeparator(String word, String separator, int manyTimes) {
        String output = word;
        for (int i = 1; i < manyTimes; i++) {
            output = output + separator + word;
        }
        return output;
    }
}
