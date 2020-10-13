package kw6.day26;

public class Excercise6String {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz")); //→ true
        System.out.println(sameStarChar("xy*zzz")); //→ false
        System.out.println(sameStarChar("*xa*az")); //→ false
    }

    private static boolean sameStarChar(String input) {
        char star = '*';
        for (int i = 0; i < input.length() - 1; i++) {
            if ((i == 0 || i == input.length() - 1)
                    && input.charAt(i) == star) {
                return false;
            } else if (input.charAt(i) == star && input.charAt(i - 1) != input.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
