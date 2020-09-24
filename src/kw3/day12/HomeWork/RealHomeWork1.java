package kw3.day12.HomeWork;

public class RealHomeWork1 {
    public static void main(String[] args) {
        System.out.println(citiWeather("Минск", "Пятница"));
        System.out.println(citiWeather("Минск", "Суббота"));
        System.out.println(citiWeather("Минск", "Воскресенье"));
        System.out.println(citiWeather("Минск", "Понедельник"));
        System.out.println(citiWeather("Минск", "Вторник"));
        System.out.println(citiWeather("Минск", "Среда"));
        System.out.println(citiWeather("Минск", "Четверг"));
    }

    private static int citiWeather(String city, String day) {
        if (city.startsWith("Ми") && day.startsWith("Пя")) {
            return 22;
        } else if (city.startsWith("Ми") && day.startsWith("Суб")) {
            return 23;
        } else if (city.startsWith("Ми") && day.startsWith("Вос")) {
            return 24;
        } else if (city.startsWith("Ми") && day.startsWith("Пон")) {
            return 25;
        } else if (city.startsWith("Ми") && day.startsWith("Втор")) {
            return 26;
        } else if (city.startsWith("Ми") && day.startsWith("Сред")) {
            return 27;
        } else if (city.startsWith("Ми") && day.startsWith("Чет")) {
            return 28;
        } else return 0;
    }
}
