package kw6.day28;

public class HomeWork27 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); //→ "++xy++"
        System.out.println(plusOut("12xy34", "1")); //→ "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); //→ "++xy++xy+++xy"
    }

    public static String plusOut(String str, String word) {
        String result = "";
        int i = 0;
        int end = 0;
        int l = str.length();
        while (i < str.length()) {
            end = i + word.length();
            if (end > l) {
                end = l;
            }
            if (str.substring(i, end).equals(word)) {
                result = result + word;
                i = i + word.length();
            } else {
                result = result + "+";
                i++;
            }
        }
        return result;
    }
}
