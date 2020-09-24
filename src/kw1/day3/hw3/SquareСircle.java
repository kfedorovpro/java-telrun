package kw1.day3.hw3;

public class SquareСircle {
    public static void main(String[] args) {
        double radius = 30.3; //Радиус круга
        double pi = Math.PI;
        squareCircle(radius, pi);
    }

    public static void squareCircle(double radius, double pi) {
        double result = pi * radius * radius;
        System.out.println("Площадь круга равна - " + result);
    }
}
