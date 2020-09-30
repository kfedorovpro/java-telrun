package kw4.day17.HomeWork3009;

import java.util.Scanner;

public class ScannerHA {
    public static void main(String[] args) {
        ideaScanner();

    }

    private static void ideaScanner() {
        Scanner input = new Scanner(System.in);
        String name, familyname, sex, age, email;
        System.out.println("Представьтесь пожалуйста!");
        System.out.println("Введите ваше имя");
        name = input.next();
        System.out.println("Введите вашу фамилию");
        familyname = input.next();
        System.out.println("Введите ваш пол");
        sex = input.next();
        System.out.println("Введите ваш возраст");
        age = input.next();
        System.out.println("Введите ваш e-mail");
        email = input.next();
        System.out.println();
        System.out.println("Спасибо за ваше доверие!");
        System.out.println("Вы ввели cледующие данные:");
        System.out.println("ФИО: " + name + familyname);
        System.out.println("пол: " + sex);
        System.out.println("возраст: " + age);
        System.out.println("email: " + email);
        input.close();
    }
}
