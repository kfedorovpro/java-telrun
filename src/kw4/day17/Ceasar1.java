package kw4.day17;

public class Ceasar1 {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));
        System.out.println(enigmaCaesar("мама"));

        // "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
    }

    private static String enigmaCaesar(String input) {
        input = input.toLowerCase();
        String output = ""; // воздух в виде String
        for (int i = 0; i < input.length(); i++) {
            output += getMeLetter(input.charAt(i)); //буду вписывать букву из метода.
        }
        return output;
    }

    private static char getMeLetter(char inputChar) {
        char result = 0;
        String inputString = " .,абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String outputString = " .,гдеёжзийклмнопрстуфхцчшщъыьэюягде";
        int index = inputString.indexOf(inputChar);
        result = outputString.charAt(index);
        return result;
    }
}
