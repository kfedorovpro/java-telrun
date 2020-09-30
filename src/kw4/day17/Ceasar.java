package kw4.day17;

public class Ceasar {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));

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
        char output = 0;
        switch (inputChar) {
            case 'a':
                output = 'г';
                break;
            case 'б':
                output = 'д';
                break;
            case 'в':
                output = 'е';
                break;
            default:
                output = inputChar;
        }
        return output;
    }
}
