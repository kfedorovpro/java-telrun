package kw2.day8.HW1609;

/**
 * @author Kostyantyn Fedorov
 */

public class AlkoholBuy {
    public static void main(String[] args) {
        int age = 10;
        System.out.println("Смогу ли я купить алкоголь, если мне " + age + " лет?");
        System.out.println("Ответ кассира:" + " " + salesAnswer(age));
    }

    private static String salesAnswer(int age) {
        String output = "";
        switch (age) {
            case 10:
                output = "Детка, гуляй вальсом!";
                break;
            case 17:
                output = "Вы еще не совершеннолетний! Пиписька не вырастит!";
                break;
            case 18:
                output = "Поздравляю, вы можете упиться в хлам!";
                break;
            case 20:
                output = "Конечно, только за такие деньги ты можешь приобрести \"Тройной Одеколон\":)";
                break;
            case 30:
                output = "Что за странный вопрос в 30 лет?";
                break;
            default:
                output = "Вы ввели неверный возраст. Введите 10, 17, 18, 20 или 30.";
                break;
        }

        return output;
    }
}
