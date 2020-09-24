package kw2.day8.HW1609;

/**
 * @author Kostyantyn Fedorov
 */

public class Seasons {
    public static void main(String[] args) {
        int month = 13;
        System.out.println("Какое же время года нынче?");
        System.out.println(month + "-й месяц года... " + "Предполагаю, что -" + " " + seasonAnswer(month));
    }

    private static String seasonAnswer(int month) {
        String output = "";
        switch (month) {
            case 1:
                output = "Зима";
                break;
            case 2:
                output = "Зима";
                break;
            case 3:
                output = "Весна";
                break;
            case 4:
                output = "Весна";
                break;
            case 5:
                output = "Весна";
                break;
            case 6:
                output = "Лето";
                break;
            case 7:
                output = "Лето";
                break;
            case 8:
                output = "Лето";
                break;
            case 9:
                output = "Осень";
                break;
            case 10:
                output = "Осень";
                break;
            case 11:
                output = "Осень";
                break;
            case 12:
                output = "Зима";
                break;
            default:
                output = "Ошибка! Введите месяца от 1 до 12.";
                break;
        }

        return output;
    }
}
