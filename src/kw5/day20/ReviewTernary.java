package kw5.day20;

public class ReviewTernary {
    public static void main(String[] args) {
        System.out.println(myFirstCompareTo("Berlin", "Moscow")); //→ "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow")); //→ "Minsk"
        System.out.println(myFirstCompareTo("Киев", "Paris")); //→ "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам")); //→ "Могилёв"
        System.out.println(myFirstCompareToSecond("Berlin", "Moscow"));
    }

    private static String myFirstCompareToSecond(String firstWord, String secondWord) {
        return (firstWord.compareTo(secondWord) < 0) ? firstWord : secondWord;
    }


    private static String myFirstCompareTo(String firstWord, String secondWord) {
        if (firstWord.compareTo(secondWord) < 0) {
            return firstWord;
        } else {
            return secondWord;
        }
    }
}
