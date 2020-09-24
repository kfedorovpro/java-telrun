package kw2.day6;

public class ClassWork {
    public static void main(String[] args) {
        String name1 = "Bob";
        String name2 = "Alice";
        String name3 = "X";

        System.out.println(helloName(name1));
        System.out.println(helloName(name2));
        System.out.println(helloName(name3));

    }

    private static String helloName(String username) {
        return "Hello " + username + "!";
    }
}
