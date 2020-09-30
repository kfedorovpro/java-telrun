package kw4.day17;

import java.util.Scanner;

public class NewThemaScanner2 {
    public static void main(String[] args) {
//        myPrint();
        myScanner();

    }

    private static void myScanner() {
        Scanner input = new Scanner (System.in);
        int old;
        System.out.println("А сколько тебе лет? ");
        old = input.nextInt();
        while (old < 18) {
            System.out.println("Не продаем алкоголь подросткам" + "\n Введите правильный возраст");
            old = input.nextInt();
        }
        System.out.println("Продажа алкоголя возможна");
        input.close();
    }

    private static void myPrint() {
        System.out.println();
        System.out.print("dfsd");
    }
}
