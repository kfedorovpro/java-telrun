package kw1.day3.hw3;

public class LengthCircle {
    public static void main(String[] args) {
        double radius = 30.3; //Радиус круга
        double pi = Math.PI;
        lengthCircle(radius, pi);
    }

    public static void lengthCircle(double radius, double pi) {
        double result = pi * radius * 2;
        System.out.println("Длина окружности равна - " + result);
    }
}
