/**
 * @author Kostyantyn Fedorov
 */
package kw2.day6;

public class HelloKeys {
    public static void main(String[] args) {
        helloHello();
        anotherHello();
        
    }

    private static void anotherHello() {
        String name = "andre";
        System.out.println("andre");
        String teacher = "Андрей";
        System.out.println(teacher.toUpperCase());
    }

    private static void helloHello() {
        String phrase1 = "london is the capital of UK";
        System.out.println(phrase1);
        String phrase2 = phrase1.toUpperCase(); //сделать большие буквы всей фразы
        System.out.println(phrase2);
        String phrase3 = phrase1.substring(0,1).toUpperCase() //делаем первую букву большой
                + phrase1.substring(1,25).toLowerCase() //делаем текст с 1 до 25 с маленькой буквы
                + phrase1.substring(25).toUpperCase(); //делаем с 25 буквы большие буквы
        System.out.println(phrase3);
    }


}
