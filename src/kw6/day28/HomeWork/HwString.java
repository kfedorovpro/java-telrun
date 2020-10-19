package kw6.day28.HomeWork;

public class HwString {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello")); //→ "ell"
        System.out.println(withoutEnd2("abc")); //→ "b"
        System.out.println(withoutEnd2("ab")); //→ ""

        System.out.println(nTwice("Hello", 2)); //→ "Helo"
        System.out.println(nTwice("Chocolate", 3)); //→ "Choate"
        System.out.println(nTwice("Chocolate", 1)); //→ "Ce"
    }

    private static String nTwice(String str, int n) {
        String output = "";
        output = str.substring(0, n) + str.substring(str.length() - n);
        return output;
    }

    private static String withoutEnd2(String input) {
        String output = "";
        if (input.length() - 1 <= 0) {
            return output;
        } else {
            return output = input.substring(1, input.length() - 1);
        }
    }
}
