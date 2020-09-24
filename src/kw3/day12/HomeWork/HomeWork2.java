package kw3.day12.HomeWork;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(old35(3)); //→ true
        System.out.println(old35(10)); //→ true
        System.out.println(old35(15)); //→ false
    }

    private static boolean old35(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return false;
        } else if (number % 5 == 0 || number % 3 == 0) {
            return true;
        }
        return false;
    }

}
