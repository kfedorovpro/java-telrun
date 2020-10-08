package kw5.day23.HomeWork;

public class Zip {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap")); //→ "zpXzp"
        System.out.println(zipZap("zopzop")); //→ "zpzp"
        System.out.println(zipZap("zzzopzop")); //→ "zzzpzp"
    }

    private static String zipZap(String str) {
        String output = str.substring(0, 1);
        for (int i = 1; i < str.length() - 1; i++) {
            if (!(str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p')) {
                output = output + str.charAt(i);
            }
        }
        return output + str.substring(str.length() - 1);
    }
}
