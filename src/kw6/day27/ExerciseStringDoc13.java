package kw6.day27;

public class ExerciseStringDoc13 {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc")); //→ "bca"
        System.out.println(oneTwo("tca")); //→ "cat"
        System.out.println(oneTwo("tcagdo")); //→ "catdog"
    }

    private static String oneTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            result += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return result;
    }
}
