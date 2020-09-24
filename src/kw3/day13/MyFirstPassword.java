package kw3.day13;

public class MyFirstPassword {
    public static void main(String[] args) {
        String myLittlePassword = "osidfasodifuwoe";
        generatePassword(20);
        generatePassword(18);
        generatePassword(24);
    }

    private static void generatePassword(int userInput) {
        String result = "";
        for (int i = 0; i < userInput; i++) {
            int min = 65;
            int max = 90;
            char c = (char) ((Math.random() * (max - min) + 1) + min);
            result += c;
        }
        System.out.println(result.toLowerCase());
    }
}
