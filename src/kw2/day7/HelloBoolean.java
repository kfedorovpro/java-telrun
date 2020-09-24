package kw2.day7;

public class HelloBoolean {
    public static void main(String[] args) {
        //introductionBooled();
        //introductionBooled2();
        introductionBooled3();

        boolean a = true;
        boolean b, c;
        b = false;
        c = a & b; //логическое и а и b
        System.out.println("a & b: " + c);
        c = a | b; //логическое или
        System.out.println("a | b: " + c);
        c = a ^ b; //исключительное или
        System.out.println("a ^ b: " + c);
        c = a != b; //не равно (отрицание)
        System.out.println("a != b: " + c);


    }

    private static void introductionBooled3() {
        boolean a = (7 + 9) * 5 > 7 + 8 * 5;
        System.out.println(a);
        boolean b = (7 + 8) + 4 != 7 + 4 * 5;
        System.out.println(b);
        boolean c = !(5==5); //
        System.out.println(c);
    }

/*    private static void introductionBoolean(a, b) {
        int a = 1;
        int b = 2;
        System.out.println(a > b);
        System.out.println(b > a);
        //&
        //|
        //^
        //!
        System.out.println(a != b); // а не равно b
        System.out.println(a == b); // a равно b
    }
 */
}
