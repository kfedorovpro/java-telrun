package kw2.day8;

public class CoffeMachine {
    public static void latte() {
        System.out.println("----------------");
        System.out.println("We are created latte for you");
        milk(40);
        coffee(30);
        water(10);
        System.out.println("----------------");
    }

    public static void cappuccino() {
        System.out.println("----------------");
        System.out.println("We are created cappuccino for you");
        milk(30);
        coffee(40);
        water(20);
        System.out.println("----------------");
    }

    public static void americano() {
        System.out.println("----------------");
        System.out.println("We are created americano for you");
        milk(0);
        coffee(40);
        water(10);
        System.out.println("----------------");
    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    private static void coffee(int ml) {
        System.out.printf("Added %d ml of coffee \n", ml);
    }
}
