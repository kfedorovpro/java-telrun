package kw2.day10;

public class NewOne {
    public static void main(String[] args) {
        multiplicationTable(6);
    }

    private static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + number * i);
        }
    }
}
