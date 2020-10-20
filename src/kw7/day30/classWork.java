package kw7.day30;

public class classWork {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx")); //→ 4
        System.out.println(countX("xhixhix")); //→ 3
        System.out.println(countX("hi")); //→ 0
    }

    private static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }
}
