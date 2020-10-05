/*
package kw4.day17.HomeWork3009;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        game();
    }

    private static void game() {
        int computerNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Игра: Угадайте число от 0 до 100. У вас есть только 10 попыток!");

        computerNumber = (int) Math.floor(Math.random() * 101);
        System.out.println(computerNumber);

        int userNumber = input.nextInt();

       if (userNumber > computerNumber || userNumber < computerNumber) {
            for (int tryCount = 6; tryCount > 0; --tryCount) {
                if (userNumber > computerNumber) {
                    System.out.println("Ваше число больше загаданного Осталось попыток: " + tryCount);
                    break;
                } else if (userNumber < computerNumber) {
                    System.out.println("Ваше число Меньше загаданного. Осталось попыток " + tryCount);
                }
            }
            if (userNumber == computerNumber) {
                System.out.println("Победа!");
            }
        }
        if (userNumber > computerNumber || userNumber < computerNumber) {
            System.out.println("Поражение!");
        }
        input.close();
    }
}
*/
