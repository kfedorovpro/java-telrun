package kw3.day11.HA;

public class LeapYear {
    public static void main(String[] args) {
        findLeapYear(1986);
        System.out.println(findLeapYear1(1986));
        //Високосный год
        // 1. год, номер которого кратен 400
        // 2. номер которых кратен 4
        // 3. номер которых не кратен 100
    }

    private static boolean findLeapYear1(int year) {
        if (year % 4 != 0 || year % 400 != 0 && year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void findLeapYear(int year) {
        if (year % 4 != 0 || year % 400 != 0 && year % 100 == 0) {
            System.out.println("НЕвисокосный год - " + year);
        } else {
            System.out.println("Високосный год - " + year);
        }
    }
}
