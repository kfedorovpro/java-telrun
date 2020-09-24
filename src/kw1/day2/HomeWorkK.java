package kw1.day2;

public class HomeWorkK {
    public static void main(String[] args) {
        System.out.println("Задача: Вычислить площадь и периметр прямоугольника");
        int a = 15;
        int b = 10;
        int ploshadPryamougolnika = a * b; //Формула вычисления площади прямоугольника
        int perimeterPryamougolnika = a + b * 2; //Формула вычисления периметра прямоугольника

        System.out.println("Площадь прямоугольника = " + ploshadPryamougolnika + " см2");
        System.out.println("Периметр прямоугольника = " + perimeterPryamougolnika + " см");

        System.out.println("\n");
        System.out.println("Задача: Вычислить площадь и периметр куба");
        int c = 10;
        int ploshadKuba = 6 * (c*c); //Формула вычисления площади куба
        int perimeterKuba = 12 * c; //Формула вычисления периметра куба

        System.out.println("Площадь прямоугольника = " + ploshadKuba + " см2");
        System.out.println("Периметр прямоугольника = " + perimeterKuba + " см");

        System.out.println("\n");
        System.out.println("Задача: Найти количество зёрен на шахматной доске, \nесли на первую клетку положить одно зёрнышко, \nна вторую клетку два зёрнышка, на третью в два раза больше, \nчем на предыдущей, то есть четыре и так далее.");
            // Возведение числа в степень 64
            long d = 2L;
            long e = 64L;
        System.out.printf("Количество зерен = %.0f \n",Math.pow(d, e), -1);
    }
}
