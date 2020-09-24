package kw1.day5;

public class ClassWork {
    public static void main(String[] args) {
        String s1 = "Vasya";
        System.out.println(helloName(s1));
        System.out.println(helloName("Sergey"));
        System.out.println(helloName("Kolya"));
        System.out.println("Deutsch");
    }

    private static String helloName(String userName) {
        return "Hello " + userName;
    }
}
