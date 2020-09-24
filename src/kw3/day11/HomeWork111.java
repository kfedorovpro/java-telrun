package kw3.day11;

public class HomeWork111 {
    public static void main(String[] args) {
        System.out.println(exercise(3000));
    }

    private static String exercise(int range) {
        String result = "";
        for (int i = 0; i < range; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                result += " " + i;
            }

        }
        return result;
    }

}
