package kw3.day11;

public class HomeWork6 {
    public static void main(String[] args) {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i + " ");
            }
        }
    }
}
