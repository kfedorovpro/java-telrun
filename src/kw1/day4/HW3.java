package kw1.day4;

public class HW3 {
    public static void main(String[] args) {
        int r = 5;
        findCircumference(r);
        findCircumference(7);
        findCircumference(10);
        int radiusFromKonstantin = 100;
        findCircumference(radiusFromKonstantin);
        double moneyInEuro = 1000;
        currencyConverter(moneyInEuro,1.1);

    }

    public static void findCircumference(int radius) {
        //L = 2pir
        double l = 2 *  Math.PI * radius;
        System.out.println("Длина окружности равна " + l);
    }

    public static void currencyConverter(double euro, double course) {
        System.out.println("Вы получите сумму в долларах = " + euro * course);
    }
}
