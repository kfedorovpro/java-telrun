package kw1.day3.hw3;

public class TerritoryBelarusUkraine {
    public static void main(String[] args) {
        double territoryBelarus = 207600;
        double territoryUkraine = 603549;
        territoryBelarusUkraine(territoryBelarus,territoryUkraine);

    }

    public static void territoryBelarusUkraine(double territoryBelarus, double territoryUkraine) {
        double result = territoryUkraine / territoryBelarus;
        System.out.println("Территория Беларуси меньше территории Украины в - " + result + " раза");
        double result1 = (int)(result * 100) / 100d; //убираем знаки до десятичной
        System.out.println("Территория Беларуси меньше территории Украины в - " + result1 + " раз");
    }
}
