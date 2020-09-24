package kw2.day9;

public class Classwork9 {
    public static void main(String[] args) {
        int speed = 180;
        System.out.println("Ваша скорость была " + speed + "km/h");

        if (speed > 50) {
            System.out.println("Вы превысили скорость на " + (speed - 50) + "km/h");
        }

        if (speed <= 50) {
            System.out.println("Narushenij net.");
        } else if (speed <= 65) {
            System.out.println("Ustnoe porecanie na 5 minut");
        } else if (speed <= 100) {
            System.out.println("Vam straf 40 €");
        } else if (speed <= 130) {
            System.out.println("Vam straf 500 €");
        } else {
            System.out.println("Vam straf 500€ i lishenie voditeljskih prav");
        }

    }
}