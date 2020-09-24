package kw1.day3.hw3;

public class EuroValue {
    public static void main(String[] args) {
        double coefficientDollarEuro = 1.1;
        euroValue(coefficientDollarEuro);

    }

    public static void euroValue(double coefficientDollarEuro) {
        double result = 125.6 / coefficientDollarEuro;
        /*вводим нужное количество
        долларов и получим количество евро
         */
        System.out.println("Итого в Евро - " + result + "€");
    }
}
