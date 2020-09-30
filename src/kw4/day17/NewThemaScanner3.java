package kw4.day17;

import java.util.Scanner;

public class NewThemaScanner3 {
    public static void main(String[] args) {
        myScanner();

    }

    private static void myScanner() {
        Scanner input = new Scanner (System.in);
        int x;
        String s;
        System.out.println("Введите цифру");
        x = input.nextInt();
        System.out.println("Введите строковый литерал");
        s = input.next();
        System.out.println("Вы ввели");
        System.out.println(x);
        System.out.println(s);
        input.close();
    }
}
