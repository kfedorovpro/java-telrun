package kw1.day3.hw3;

public class HomeWork {
    public static void main(String[] args) {
        int customerYear = 15;
        bankAccount(1000, customerYear, 3.5);
        /*последовательность соблюдается,
        где 1000 - это money, customerYear - 15 и затем year, 3.5 - interest
        */
    }

    public static void bankAccount(double money, int year, double interest) {
        double result = interest * year * money / 100 + money;
        System.out.println("Сумма в конце вклада " + result);

    }
}
