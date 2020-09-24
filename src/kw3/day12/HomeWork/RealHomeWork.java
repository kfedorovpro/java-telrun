package kw3.day12.HomeWork;

public class RealHomeWork {
    public static void main(String[] args) {
        System.out.println(citiWeather("Берлин", 20)); //- 26
        System.out.println(citiWeather("Лондон", 17)); //- 23
        System.out.println(citiWeather("Лиссабон", 25)); //- 31
        System.out.println(citiWeather("Париж", 23)); //29
        System.out.println(citiWeather("Москва", 19)); //25
        System.out.println(citiWeather("Минск", 18)); //24
        System.out.println(citiWeather("Саратов", 15)); //21
    }

    private static int citiWeather(String city, int t) {
        if (city == city && t == t) {
            return (t + 6);
        } else {
            return 0;
        }
    }
}
