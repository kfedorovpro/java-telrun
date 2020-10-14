package kw6.day27;

public class ExerciseString14Dos {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); //→ "ad"
        System.out.println(starOut("ab**cd")); //→ "ad"
        System.out.println(starOut("sm*eilly")); //→ "silly"
        System.out.println(starOut("sm*eil*ly")); //→ "silly"
    }

    private static String starOut(String input) {
        String output = input;
        char star = '*';
        int x1 = input.indexOf(star);
        int x2 = input.lastIndexOf(star);
        output = input.substring(0, x1 - 1) + input.substring(x2 + 2);
        return output;
    }
}
