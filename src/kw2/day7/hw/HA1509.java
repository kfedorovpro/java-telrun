package kw2.day7.hw;

import java.sql.SQLOutput;

public class HA1509 {
    public static void main(String[] args) {
        split();
        /* Задача №1
        Родители сделали в итоге самостоятельно всё программирование
        вокруг двери не дожидаясь нас. Попробуйте угадать как же
        работает метод, которрый позволяет Василию открыть
        дверь телефоном, отпечатком пальца или введённым
        с клавиатуры паролем.
         */
        System.out.println("Задача №1");
        boolean a, b, c;
        System.out.println(verySmartDoor(false, true, false)); //true
        System.out.println(verySmartDoor(false, false, true)); //true
        System.out.println(verySmartDoor(true, false, false)); //true
        System.out.println(verySmartDoor(false, false, false)); //false

        split();

        /*
        В девятом классе Вася ездил со своим и параллельным
        классом в Париж. Известно, что на двоих учителей нельзя
        брать в поездку больше 25 детей. Напишите проверочный метод
         */
        System.out.println("Задача №2");
        System.out.println(paris(11, 15)); // false
        System.out.println(paris(11, 5)); // true

    }

    private static boolean paris(int pa1, int pa2) {
        return pa1 + pa2 <= 25;
    }

    private static void split() {
        System.out.println("----------------------");
    }

    private static boolean verySmartDoor(boolean a, boolean b, boolean c) {
        return a || b || c;
        //должно функционировать кое-то, чтобы открыть
        //иначе можно ночевать на улице
        //поэтому здесь подходит ||
    }
}
