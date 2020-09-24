package kw1.day3.hw3;

public class SquareMoscowBerlin {
    public static void main(String[] args) {
        double squareMoscow = 2_511; //км2
        double squareBerlin = 891.8; //км2
        squareMoscowBerlin(squareMoscow, squareBerlin);

    }

    public static void squareMoscowBerlin(double squareMoscow, double squareBerlin) {
        double result = squareMoscow / squareBerlin;
        System.out.println("Площадь Москвы больше территории Берлина в - " + result + " раза");
        //double result1 = (int) (result * 100) / 100d; //убираем знаки до десятичной
        double result1 = Math.round(result * 100) / 100d;
        System.out.println("Площадь Москвы больше территории Берлина в - " + result1 + " раз");
    }
}