package kw4.day17;

import java.util.Scanner;

public class MyPresident {
    public static void main(String[] args) {
        myPresident();
    }

    private static void myPresident() {
        int vote1;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите процент голосов отданных за кандидата 1");
        vote1 = input.nextInt();
        System.out.println("Введите процент голосов отданных за кандидата 2");
        int vote2;
        vote2 = input.nextInt();

        if (vote1 > vote2 && vote1 > 50) {
            System.out.println("победил кандидат 1");
        } else if (vote2 > vote1 && vote2 > 50) {
            System.out.println("победил кандидат 2");
        } else {
            System.out.println("Президент не определен");
        }
    }
}
