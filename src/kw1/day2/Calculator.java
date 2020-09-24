package kw1.day2;

public class Calculator {
    public static void main(String[] args) {
        // System.out.println (2 + 6)
        int a = 2;
        int b = 6;
        int c = a + b;
        System.out.println("Распечатай мне значение c - " + c);
        int money = 900;
        int iPhoneCost = 1000;
        System.out.println("Колличество iPhone, которые я могу купить " + money / iPhoneCost);

        addition();
        multiplication();
    }

    public static void addition () {
        int a = 5;
        int b = 10;
        System.out.println("Сложение чисел " + a + b);
    }
    public static void multiplication () {
        int a = 5;
        int b = 10;
        System.out.println("Умножение чисел " + a * b);
    }
}
