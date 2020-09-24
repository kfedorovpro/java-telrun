package kw1.day4;

public class Calculator {
    public static void main(String[] args) {
        addition();
        int a = 100;
        int b = 200;
        addition2(a, b);
        int ergebniss = addition3(a, b);
        System.out.println(ergebniss);
    }

    public static int addition3(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void addition2(int a, int b) {
        int result = a + b;
        System.out.println("результат работы метода - " + result);
    }

    public static void addition() {
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("Результат сложения двух переменных - " + c);
    }
}
