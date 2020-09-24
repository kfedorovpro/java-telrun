package kw1.day4;

public class GoodMorning {
    public static void main(String[] args) {
        double belarus = 207_595;
        double ukraine = 603_628;
        rate(belarus,ukraine);
        double moscow = 2_511;
        double berlin = 891;
        rate(moscow,berlin);
    }

    public static void rate(double s1, double s2) {
        System.out.println("Соотношение площадей " + s1 / s2);

    }
}
