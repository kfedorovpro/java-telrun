package kw4.day17;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        myNextInt();
    }

    private static void myNextInt() {
        int userAge;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        userAge = input.nextInt();
        System.out.println("Правильно, что ваш возраст " + userAge);
        boolean b = input.nextBoolean();
        System.out.println("Записано" + true);
        input.close();
    }
}
