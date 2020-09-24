package kw2.day7.hw;

public class Logic01Two {
    public static void main(String[] args) {
        System.out.println(doorBell(true, true)); //false
        System.out.println(doorBell(false, false)); //false
        System.out.println(doorBell(true, false)); //true

        split();

        boolean electro = true;
        boolean internet = true;
        System.out.println(smartDoorCheckKey(true, true));
        System.out.println(smartDoorCheckKey(true, false));
        System.out.println(smartDoorCheckKey(false, true));
        System.out.println(smartDoorCheckKey(false, false));
    }

    private static boolean smartDoorCheckKey(boolean electro, boolean internet) {
        return !(electro || internet);
    }

    private static void split() {
        System.out.println("--------------------");
    }

    private static boolean doorBell(boolean belOne, boolean belTwo) {

        return belOne ^ belTwo;
    }
}
