package kw7.day32;

public class NestedLoop {
    public static void main(String[] args) {
        firstTriangle(10);

    }

    private static void firstTriangle(int number) {
        String line = "";
        String star = "*";
        for (int i = 0; i < number; i++) {
            line+=star;
            System.out.println(line);
        }
    }
}
