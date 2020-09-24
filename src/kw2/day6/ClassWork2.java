package kw2.day6;

public class ClassWork2 {
    public static void main(String[] args) {
        makeOutWord("<<>>", "Yay"); //"<<Yay>>"
        makeOutWord("<<>>", "WooHoo"); //<<WooHoo>>
        makeOutWord("[[]]", "word"); //[[word]]"
    }

    private static void makeOutWord(String s1, String s2) {
        String result = (s1.substring(0, 2) + s2 + s1.substring(2)); //берем 2 первых символов, полностью s2 и s1 от второго символа
        System.out.println(result);
    }
}
