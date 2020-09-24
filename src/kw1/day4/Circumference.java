package kw1.day4;

public class Circumference {
    public static void main(String[] args) {
        double radius = 10;
        int a = 5;
        int b = 6;
        System.out.println(findCF(radius)); //здесь берется данные с return и выводится на экране
        System.out.println(addition4(a, b));
    }

    public static int addition4(int a, int b) {
        return a + b;
    }
    private static double findCF(double myRadius) {
        return 2*Math.PI*myRadius; //тут происходит решение и метод возврата
    }
}
