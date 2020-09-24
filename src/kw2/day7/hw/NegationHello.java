package kw2.day7.hw;

public class NegationHello {
    public static void main(String[] args) {
        boolean redButton = false;
        System.out.println(deAktivationMachine(redButton));
        System.out.println(deAktivationMachine(true));
    }

    private static boolean deAktivationMachine(boolean stopSignal) {
        return !stopSignal;
    }
}
