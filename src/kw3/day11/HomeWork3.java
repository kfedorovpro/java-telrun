package kw3.day11;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(checkLeapYear(1999));
    }

    private static boolean checkLeapYear(int year) {
        if (year % 2 == 0) {
            return true;
        }
        return false;
    }
}
