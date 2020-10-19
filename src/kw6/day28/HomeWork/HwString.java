package kw6.day28.HomeWork;

import static kw2.day6.ClassWork3.split;

public class HwString {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello")); //→ "ell"
        System.out.println(withoutEnd2("abc")); //→ "b"
        System.out.println(withoutEnd2("ab")); //→ ""
        split();
        System.out.println(nTwice("Hello", 2)); //→ "Helo"
        System.out.println(nTwice("Chocolate", 3)); //→ "Choate"
        System.out.println(nTwice("Chocolate", 1)); //→ "Ce"
        split();
        System.out.println(catDog("catdog")); //→ true
        System.out.println(catDog("catcat")); //→ false
        System.out.println(catDog("1cat1cadodog")); //→ true
        split();
        System.out.println(xyzThere("abcxyz")); //→ true
        System.out.println(xyzThere("abc.xyz")); //→ false
        System.out.println(xyzThere("xyz.abc")); //→ true
        split();
    }

    private static boolean xyzThere(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("xyz"))
            return true;

        for (int i = 1; i < str.length() - 2; i++) {
            if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz"))
                return true;
        }
        return false;
    }

    private static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String temp = str.substring(i, i + 3);
            if (temp.compareTo("cat") == 0) {
                cat++;
            }
            if (temp.compareTo("dog") == 0) {
                dog++;
            }
        }
        if (cat == dog) {
            return true;
        } else {
            return false;
        }
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
