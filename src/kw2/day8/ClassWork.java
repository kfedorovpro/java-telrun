package kw2.day8;

public class ClassWork {
    public static void main(String[] args) {
        int schoolNote = 3;
        System.out.println("Что я получу за " + schoolNote + "? - " + bonus(schoolNote));
    }

    private static String bonus(int note) {
        String output = "";
        switch (note) {
            case 5:
                output = "Велосипед!";
                break;
            case 4:
                output = "За 4-ку ты получишь GoPro7";
                break;
            case 3:
                output = "Награды не будет! Иди учись дальше!";
                break;
            case 2:
                output = "Потерянный час времени и плохое настроение";
                break;
            case 1:
                output = "Лучше и не спрашивайте...";
                break;
            default:
                output = "Такой оценки не существует!";
                break;
        }

        return output;
    }
}
