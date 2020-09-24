package kw2.day8;

public class HW {
    public static void main(String[] args) {
        System.out.println(love6(6, 4)); // true
        System.out.println(love6(4, 5)); // false
        System.out.println(love6(1, 5)); // true
    }

    private static boolean love6(int a, int b) {
        return (a == 6) || (b == 6) || (a + b == 6) || (Math.abs(a - b) == 6);
    }
//сравнивает a с 6, затем b сравнивается с 6,
// затем сумма a и b и разница a и b в модуле
}
